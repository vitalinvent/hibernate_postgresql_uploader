import me.tongfei.progressbar.ProgressBar;
import nu.xom.*;
import org.apache.log4j.Logger;
import org.xml.sax.helpers.DefaultHandler;
import classesTree.Item;
import java.beans.*;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ParsingXmlEngine extends DefaultHandler {
    private static String  fileName="";
    ArrayList<HashMap<String,String>> listItemsByAttributeName = new ArrayList<HashMap<String,String>>();
    ArrayList<String> excludeItemsByString = new ArrayList<String>();
    public final static Logger logger = Logger.getLogger(ParsingXmlEngine.class);

    public static void ParseXmlDictionariesAnalytics(String _fileName) {
        fileName = _fileName;
        ParsingXmlEngine parsingEngine = new ParsingXmlEngine();
        ArrayList<String> exclude = new ArrayList<>();
        exclude.add("java.util.ArrayList");
        ArrayList<HashMap<String, String>> properties = parsingEngine.getItemsByAttributeName("property", exclude);
        Variables.LoadedClassesAllArrayListItems.clear();
        for (HashMap<String, String> itemClass : properties) {
            Item item = new Item(itemClass.get("class").toLowerCase(), null, "", "Object", itemClass.get("islink"), itemClass.get("link").toLowerCase(), itemClass.get("issearch"));
            if (!ExistArrayListItem(Variables.LoadedClassesAllArrayListItems, item)) {
                Variables.LoadedClassesAllArrayListItems.add(item);
                Variables.LoadedClassesNames.add(item.getName());
            }
        }
        try (ProgressBar progressBar = new ProgressBar("Load properties in dictionaries ", properties.size())) {
            for (HashMap<String, String> itemProperty : properties) {
                progressBar.step();
                for (Item item : Variables.LoadedClassesAllArrayListItems) {
                    Item item1New = new Item(itemProperty.get("name").toLowerCase(), item, itemProperty.get("class").toLowerCase() + "/" + itemProperty.get("name").toLowerCase(), itemProperty.get("type").toLowerCase(), itemProperty.get("islink"), itemProperty.get("link").toLowerCase(), itemProperty.get("issearch"));
                    if (itemProperty.get("class").contains(item.getName()))
                        if (!ExistArrayListItem(item.getChilds(), item1New)) {
                            item.addChildren(item1New);
                            //progressBar.setExtraMessage(item1New.getName());
                            if (!item1New.getIsLink().contains("false")) {
                                Variables.LoadedClassesArrayListLinksInClasses.add(item1New);
                            }
                        }
                }
            }
        }
    }
    public static void CleanLoadedClassesDeadLinks(){
        Iterator listClass = Variables.LoadedClassesAllArrayListItems.iterator();
        while (listClass.hasNext()) {
            Item itemClass = (Item) listClass.next();
            ArrayList<Item> items = itemClass.getChilds();
            Iterator iterator = items.iterator();
            while (iterator.hasNext()) {
                Item item = (Item) iterator.next();
                Boolean exist = false;
                for (String className : Variables.LoadedClassesNames) {
                    if (item.getLink().length() > 0) {
//                        if (item.getLink().equals("gosudarstvennie_kontrakti")){
//                            System.out.println("qqq");
//                        }
                        if (item.getLink().equals(className)) {
                            exist = true;
                        }
                    }
                }
                if ((item.getLink().length() > 0) && (!exist)) {
                    logger.trace("Remove from LoadedClassesAllArrayListItems "+itemClass.getLink());
                    iterator.remove();
                }
            }
        }
        Iterator listClassesIterator = Variables.LoadedClassesArrayListLinksInClasses.iterator();
        while (listClassesIterator.hasNext()) {
            Item itemClass = (Item) listClassesIterator.next();
                Boolean exist = false;
                for (String className : Variables.LoadedClassesNames) {
                    if (itemClass.getLink().length() > 0) {
//                        if (itemClass.getLink().equals("gosudarstvennie_kontrakti")){
//                            System.out.println("qqq");
//                        }
                        if (itemClass.getLink().equals(className)) {
                            exist = true;
                        }
                    }
                }
                if ((itemClass.getLink().length() > 0) && (!exist)) {
                    logger.trace("Remove from LoadedClassesArrayListLinksInClasses "+itemClass.getLink());
                    listClassesIterator.remove();
                }
            }
        }
    public static void SetLoadedLinksObjects(){
        //****************ЗАПОЛНЕНИЕ СПИСКА ОБЬЕКТОВ С ГУИДАМИ ДЛЯ ПОИСКА ПО ГУИДУ*************************
        try (ProgressBar progressBar = new ProgressBar("Load items for set links", Variables.LoadedObjectsArrayListDataForDb.size())) {
            for(int idx = 0; idx<Variables.LoadedObjectsArrayListDataForDb.size(); idx++){
                Object obj=Variables.LoadedObjectsArrayListDataForDb.get(idx);
                Variables.LoadedObjectsAllHashMap.put(Functions.GetMethodFromObject(obj,"getGuid",UUID.class).toString(),obj);
            }
        }

        //****************ЗАПОЛНЕНИЕ СПИСКА ОБЬЕКТОВ С ГУИДАМИ ДЛЯ ПОИСКА ПО ГУИДУ*************************
        try (ProgressBar progressBar = new ProgressBar("Set items links", Variables.LoadedObjectsArrayListDataForDb.size())) {
            for (Item item:Variables.LoadedClassesArrayListLinksInClasses) {
                for (Object obj : Variables.LoadedObjectsArrayListDataForDb) {
                    if (obj.getClass().getName().equals(((Item) item.getParent()).getName())) {
//                        if (Functions.ToUpperFirstLetter(item.getName()).equals("gosudarstvennie_kontrakti")){
//                            logger.trace("");
//                        }
                        String guid = Functions.GetMethodFromObject(obj,"get"+Functions.ToUpperFirstLetter(item.getName())+"_uuid",UUID.class);
                        String type = Functions.GetMethodFromObject(obj,"get"+Functions.ToUpperFirstLetter(item.getName())+"_type",String.class);
                        Object findedLinkObject = Variables.LoadedObjectsAllHashMap.get(guid);
                        //*****************очистка различающихся ссылок для составных реквизитов****************
                        if ((findedLinkObject != null) && (type != null))
                        if (!findedLinkObject.getClass().getName().equals(type)) {
                            Functions.SetMethodObject(obj, "set" + Functions.ToUpperFirstLetter(item.getName()) + "_obj", Object.class,null );
                        }
                        //*****************очистка различающихся ссылок для составных реквизитов****************
                        //*************утановка сразу ссылки*****************
                        //Functions.SetMethodObject(obj, "set" + Functions.ToUpperFirstLetter(item.getName()) + "_obj", Object.class,Variables.LoadedObjectsAllHashMap.get(guid) );
                        //*************утановка сразу ссылки*****************
                        //String guid = Functions.GetMethodFromObject(obj,"get"+Functions.ToUpperFirstLetter(item.getName())+"_UUID",UUID.class);
                        //Functions.SetMethodObject(obj,"set" + Functions.ToUpperFirstLetter(item.getName())+"_type_obj",Object.class,Variables.LoadedObjectsAllHashMap.get(guid));
//                        Method methodGetGuid = null;
//                        Method methodSetLink = null;
//                        try {
//                            methodGetGuid = obj.getClass().getMethod("get"+Functions.ToUpperFirstLetter(item.getName()));
//                        } catch (NoSuchMethodException e) {
//                            e.printStackTrace();
//                        }
//                        UUID guid = null;
//                        try {
//                            guid = (UUID) methodGetGuid.invoke(obj);
//                        } catch (IllegalAccessException e) {
//                            e.printStackTrace();
//                        } catch (InvocationTargetException e) {
//                            e.printStackTrace();
//                        }
//                        try {
//                            methodSetLink = obj.getClass().getMethod("set" + Functions.ToUpperFirstLetter(item.getName())+"_obj", Object.class);
//                        } catch (NoSuchMethodException e) {
//                            e.printStackTrace();
//                        }
//                        String link = null;
//                        try {
//                            methodSetLink.invoke(obj, Variables.LoadedObjectsAllHashMap.get(guid.toString()));
//                        } catch (IllegalAccessException e) {
//                            e.printStackTrace();
//                        } catch (InvocationTargetException e) {
//                            e.printStackTrace();
//                        }
                        progressBar.step();
                    }
                }
            }
        }


//        for (Map.Entry<String,Object> entry:loadedObjectFieldObject.entrySet()) {
//            HashMap<String,Object> linkSet = (HashMap<String, Object>) entry.getValue();
//
//            Object obj = linkSet.get("obj");
//            Field field = (Field) linkSet.get("field");
//
//            Method methodSetFieldGuidString = null;
//            try {
//                methodSetFieldGuidString = obj.getClass().getMethod("set"+Functions.ToUpperFirstLetter(field.getName())+"_obj",Object.class);
//            } catch (NoSuchMethodException e) {
//                e.printStackTrace();
//            }
//            try {
//                methodSetFieldGuidString.invoke(obj,loadedObjects.get(entry.getKey()));
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            }
//        }


//        try (ProgressBar progressBar = new ProgressBar("Load items for set links", Variables.LoadedObjectsArrayListDataForDb.size())) {
//            for(int idx = 0; idx<Variables.LoadedObjectsArrayListDataForDb.size(); idx++){
//            //for (Object obj : Variables.LoadedObjectsArrayListDataForDb) {
//                Object obj = Variables.LoadedObjectsArrayListDataForDb.get(idx);
//                Field[] fields =obj.getClass().getFields();
//                Method methodGetGuid = null;
//                try {
//                    methodGetGuid = obj.getClass().getMethod("getGuid");
//                } catch (NoSuchMethodException e) {
//                    e.printStackTrace();
//                }
//                UUID guid = null;
//                try {
//                    guid = (UUID) methodGetGuid.invoke(obj);
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                } catch (InvocationTargetException e) {
//                    e.printStackTrace();
//                }
//                for (Field field:fields) {
//                    Method methodGetFieldGuidString = null;
//                    try {
//                        methodGetFieldGuidString = obj.getClass().getMethod("get"+Functions.ToUpperFirstLetter(field.getName()));
//                    } catch (NoSuchMethodException e) {
//                        e.printStackTrace();
//                    }
//                    String guidFieldObj = null;
//                    try {
//                        guidFieldObj = (String) methodGetFieldGuidString.invoke(obj);
//                    } catch (IllegalAccessException e) {
//                        e.printStackTrace();
//                    } catch (InvocationTargetException e) {
//                        e.printStackTrace();
//                    }
//                    //loadedObjectFieldObject.put(guidFieldObj, field);
//                    HashMap<String,Object> linkSet = new HashMap<>();
//                    linkSet.put("obj", Variables.LoadedObjectsArrayListDataForDb.get(idx));
//                    linkSet.put("field",field);
//                    loadedObjectFieldObject.put(guidFieldObj, linkSet);
//                }
//                progressBar.step();
//                loadedObjects.put(guid.toString(),obj);
//            }
//        }
//        for (Map.Entry<String,Object> entry:loadedObjectFieldObject.entrySet()) {
//            HashMap<String,Object> linkSet = (HashMap<String, Object>) entry.getValue();
//
//            Object obj = linkSet.get("obj");
//            Field field = (Field) linkSet.get("field");
//
//            Method methodSetFieldGuidString = null;
//            try {
//                methodSetFieldGuidString = obj.getClass().getMethod("set"+Functions.ToUpperFirstLetter(field.getName())+"_obj",Object.class);
//            } catch (NoSuchMethodException e) {
//                e.printStackTrace();
//            }
//            try {
//                methodSetFieldGuidString.invoke(obj,loadedObjects.get(entry.getKey()));
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            }
//        }

        //****************ЗАПОЛНЕНИЕ СПИСКА ОБЬЕКТОВ С ГУИДАМИ ДЛЯ ПОИСКА ПО ГУИДУ*************************
//        try (ProgressBar progressBar = new ProgressBar("Search items for set links", Variables.LoadedObjectsArrayListDataForDb.size())) {
//            //for (Item item:Variables.LoadedClassesArrayListLinksInClasses) {
//                for (Object obj : Variables.LoadedObjectsArrayListDataForDb) {
//                    if (obj.getClass().getName().equals(((Item) item.getParent()).getName())) {
//                        Method methodGetGuid = null;
//                        Method methodSetLink = null;
//                        try {
//                            methodGetGuid = obj.getClass().getMethod("get"+Functions.ToUpperFirstLetter(item.getName()));
//                        } catch (NoSuchMethodException e) {
//                            e.printStackTrace();
//                        }
//                        UUID guid = null;
//                        try {
//                            guid = (UUID) methodGetGuid.invoke(obj);
//                        } catch (IllegalAccessException e) {
//                            e.printStackTrace();
//                        } catch (InvocationTargetException e) {
//                            e.printStackTrace();
//                        }
//                        try {
//                            methodSetLink = obj.getClass().getMethod("set" + Functions.ToUpperFirstLetter(item.getName())+"_obj", Object.class);
//                        } catch (NoSuchMethodException e) {
//                            e.printStackTrace();
//                        }
//                        String link = null;
//                        try {
//                            methodSetLink.invoke(obj, loadedItems.get(guid.toString()));
//                        } catch (IllegalAccessException e) {
//                            e.printStackTrace();
//                        } catch (InvocationTargetException e) {
//                            e.printStackTrace();
//                        }
//                        progressBar.step();
//                    }
//                }
//            //}
//        }
        System.out.println("Complete");
    }
    public ArrayList<HashMap<String,String>> getItemsByAttributeName(String attributeName,ArrayList<String> _excludeItemsByValue) {
        excludeItemsByString=_excludeItemsByValue;
        return getItemsByAttributeName(attributeName);
    }
    public  ArrayList<HashMap<String,String>> getItemsByAttributeName(String attributeName){
            File file=new File(fileName+".xml");
            Builder builder = new Builder();
            Document document = null;
            try {
                document = builder.build(file);
            } catch (ParsingException e) {
                logger.error(e);
            } catch (IOException e) {
                logger.error(e);
            };
            Element element =  document.getRootElement();
            EnumChilds(element,attributeName);
            return listItemsByAttributeName;
    }
    private void EnumChilds(Element element,String attributeName){
        Elements elements = element.getChildElements();
        for (int idxEl = 0; idxEl < elements.size(); idxEl++) {
            Element elementItem = elements.get(idxEl);
            if (elementItem.getAttributeCount()>0) EnumAttributes(elementItem,attributeName);
            if (elementItem.getChildCount()>0) EnumChilds(elementItem,attributeName);
        }
    }
    private void EnumAttributes(Element element,String attributeName){
        for (int idxEl = 0; idxEl < element.getAttributeCount(); idxEl++) {
            Attribute attribute = element.getAttribute(idxEl);
            if (attribute.getLocalName().trim().contains(attributeName)) {
                boolean exclude = false;
                HashMap<String, String> value= new HashMap<String, String>();
                String valueStr = attribute.getValue();
                for (String itemEx : excludeItemsByString) {
                    if (valueStr.trim().contains(itemEx.trim())) {
                        exclude = true;
                    }
                }
                if (!exclude) {
                    value.put("name",attribute.getValue());
                    value.put("islink","false");
                    value.put("link","");
                    value.put("issearch","false");
                    for (int idx=0;idx<element.getAttributeCount();idx++) {
                        switch (element.getAttribute(idx).getLocalName()){
                            case "islink":
                                value.put("islink",element.getAttribute(idx).getValue());
                                break;
                            case "link":
                                value.put("link",element.getAttribute(idx).getValue());
                                break;
                            case "issearch":
                                value.put("issearch",element.getAttribute(idx).getValue());
                                break;
                            case "type":
                                value.put("type",element.getAttribute(idx).getValue());
                                break;
                        }
                    }
                    }
                Elements elementsForProperty = element.getChildElements();
                for (int idx = 0; idx < elementsForProperty.size(); idx++) {
                    Element elementItemForProperty = elementsForProperty.get(idx);
                        if (elementItemForProperty.getChildCount()>1) {
                            Element elementP = elementItemForProperty.getChildElements().get(1);
                            if (value.get("type") == null)
                                value.put("type", elementP.getLocalName());
                        } else {
                            if (value.get("type") == null)
                                value.put("type", elementItemForProperty.getLocalName());
                        }
                        if (element.getAttributeCount()>0) {
                            Node classElement = element.getParent();
                            value.put("class",((Element)classElement).getAttribute(0).getValue());
                        }
                }
                if (!exclude) listItemsByAttributeName.add(value);
            }
        }
    }
    public  static  void GenerateXMLTestingFile() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ArrayList<Class> classes = new ArrayList<>();
        final File folder = new File(Variables.APP_FOLDER);
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
            } else {
                if (fileEntry.getName().endsWith(".class")) {
                    URLClassLoader classLoader = null;
                    try {
                        classLoader = new URLClassLoader(new URL[]{new File("./").toURI().toURL()});
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    //classTOCreate = classLoader.loadClass("classes."+className);
                    Class<?> classTOCreate = null;
                    try {
                        classTOCreate = classLoader.loadClass(fileEntry.getName().replaceFirst("[.][^.]+$", ""));
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    Thread.currentThread().setContextClassLoader(classTOCreate.getClassLoader());
                    classes.add(classTOCreate);
                    System.out.println("Loaded class " + fileEntry);
                }
            }
        }
        ArrayList<Object> tree =new ArrayList<>();
        //HashSet<Object> tree =new HashSet<>();
        try (ProgressBar pb = new ProgressBar("Creating tree ... ", 100)) {
            for (int i = 0; i < 100; i++) {
                int idxCls = ThreadLocalRandom.current().nextInt(0, 51);
                Object obj = classes.get(idxCls).newInstance();
                tree.add(obj);
                Method methodsetCode = (Method) obj.getClass().getMethod("setCode", String.class);
                methodsetCode.invoke(obj, randomString());
                Method methodsetName = (Method) obj.getClass().getMethod("setName", String.class);
                methodsetName.invoke(obj, randomString());
                Method methodgetThisGroup = (Method) obj.getClass().getMethod("setThisGroup", Boolean.class);
                methodgetThisGroup.invoke(obj, getRandomBoolean());
                pb.step();
            }
        }
        try {
            ParsingXmlEngine.serializeToXML(tree,"tree");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static String randomString(){
        int len = ThreadLocalRandom.current().nextInt(50, 100 + 1);
        final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }
    static boolean getRandomBoolean() {
        return Math.random() < 0.5;
        //I tried another approaches here, still the same result
    }
    public static void serializeToXML (Object obj,String fileName) throws IOException{
        FileOutputStream fos = new FileOutputStream(fileName+".xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.setExceptionListener(new ExceptionListener() {
            public void exceptionThrown(Exception e) {
                System.out.println("Exception! :"+e.toString());
            }
        });
        encoder.writeObject(obj);
        encoder.close();
        fos.close();
    }
    public static ArrayList<Object> deserializeFromXML(String fileName) throws IOException {
        //FileInputStream fis = new FileInputStream("./"+fileName+".xml");
        String path = fileName+".xml";
        FileInputStream fis = new FileInputStream(path);
        File f = new File(path);
        long l = f.length();
        XMLDecoder decoder = new XMLDecoder(fis);
        decoder.setExceptionListener(new ExceptionListener() {
            @Override
            public void exceptionThrown(Exception e) {
                if (e.getClass().getName().equals("java.lang.IllegalArgumentException")){
                    logger.trace(e);
                } else if (e.getClass().getName().equals("java.lang.NoSuchMethodException")) {
                    //logger.error("Method not found "+e.getMessage());
                    logger.trace("Method not found "+e.getMessage());
                } else  {
                    logger.trace(e);
                    //e.printStackTrace();
                }
            }
        });
        //ArrayList<Object> decodedSettings = new ArrayList<>();
        //ArrayList<Object> decodedSettings = (ArrayList<Object>)document.getRootElement().getChildElements();
        Object readVal= decoder.readObject();
        ArrayList<Object> decodedSettings = (ArrayList<Object>)readVal;
        decoder.close();
        fis.close();
        return decodedSettings;
    }
    static boolean  ExistArrayListItem(ArrayList<Item> items,Item _item){
        boolean exist=false;
        for (Item item:items) {
            if (item.getName().trim().equals(_item.getName().trim())) exist=true;
            if (item.getGuid()==_item.getGuid()) exist=true;
        }
        return exist;
    }
    static boolean  ExistArrayListString(ArrayList<String> items,String  _item){
        boolean exist=false;
        for (String item:items) {
            if (item.trim().equals(_item.trim())) exist=true;
            if (item==_item) exist=true;
        }
        return exist;
    }


//        ///ADDITION CLASSES GENERATOR WARNING EXPLOSIVE! **********************************************
//        for (int i=1;i<50;i++) {
//            Item newItem= new Item();
//            newItem.setName(tree.get(0).getName()+String.valueOf(i));
//            newItem.setGuid(tree.get(0).getGuid());
//            newItem.setType(tree.get(0).getType());
//            for (Object item:tree.get(0).getChilds()) {
//                Item newChild= new Item();
//                newChild.setName(((Item)item).getName());
//                newChild.setGuid(((Item)item).getGuid());
//                newChild.setType(((Item)item).getType());
//                newItem.addChildren(newChild);
//            }
//            tree.add(newItem);
//        }
//        ///ADDITION CLASSES GENERATOR WARNING EXPLOSIVE! **********************************************
//        for(String classItem: classGenerator.classes){
//        }
}
