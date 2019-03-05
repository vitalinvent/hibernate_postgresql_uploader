import classesTree.Item;
import org.apache.log4j.Logger;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class ParsingCSVEngine {
    public final static Logger logger = Logger.getLogger(ParsingXmlEngine.class);
    public static ArrayList<Object> LoadCSVFacts(String directoryPath) {
        ArrayList<Object> retList = new ArrayList<>();
        ArrayList<File> filesToLoad =  new ArrayList<>();
        Functions.GetFilesSubdirsRecursivelly(directoryPath,filesToLoad);
        for (File file:filesToLoad) {
            String className = file.getName().replaceFirst("[.][^.]+$", "");
            JFileChooser filechooser = new JFileChooser();
            String extension = filechooser.getTypeDescription(file);
            String path = file.getPath().replace(className,"").replace(extension,"");

            Class<?> clazz = null;
            try {
                clazz = Class.forName(className);
            } catch (ClassNotFoundException e) {
                logger.error(e);
            }
            Constructor<?> ctor = null;
            try {
                ctor = clazz.getConstructor(String.class);
            } catch (NoSuchMethodException e) {
                logger.error(e);
            }
//            Object object = ctor.newInstance(new Object[] {  });
        }
        return retList;
    }
    public static ArrayList<Item> ParseCSVFacts(String directoryPath){
    ArrayList<File> filesToLoadHelper =  new ArrayList<>();
    ArrayList<File> filesToLoad =  new ArrayList<>();
    ArrayList<Item> retList = new ArrayList<>();
    Functions.GetFilesSubdirsRecursivelly(directoryPath,filesToLoadHelper);
    Item item = null;
    for (File fileToAddForJob:filesToLoadHelper)
//            if (!filesToLoad.contains(fileToAddForJob)) {
        if (!ExistArrayListFileName(filesToLoad,fileToAddForJob)){
            filesToLoad.add(fileToAddForJob);
        }
    for (File file:filesToLoad) {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = Variables.SEPARATOR_CSV;//РАЗДЕЛИТЕЛЬ
        try {
            br = new BufferedReader(new FileReader(file));
            //            while ((line = br.readLine()) != null) {
            line = br.readLine();
            // use comma as separator
            String[] fields = line.replace(Variables.SEPARATOR_CSV,"#DELIMITER#").split("#DELIMITER#");
//                Item item = new Item(itemClass.get("class").toLowerCase(), null, "", "Object", itemClass.get("islink"), itemClass.get("link").toLowerCase(), itemClass.get("issearch"));
            item = new Item(Functions.ReplaceBadSymbols(file.getName().replaceFirst("[.][^.]+$", "")), null, "", "Object", "false", "false", "false");
            for (String field:fields) {
                try {
                    String[] fieldNameType = field.split(Variables.SEPARATOR_CSV_FIELD_TYPE);
                    Item item1New = new Item(fieldNameType[0], item, file.getName().replaceFirst("[.][^.]+$", "") + "/" + fieldNameType[0], fieldNameType[1], IsLinkType(fieldNameType[1]), fieldNameType[1], "false");
                    //                                                                                                                                                                                                   islink                                  link                                issearch
                    item.addChildren(item1New);
                } catch (Exception ex){
                    logger.error(field+"\n"+ex);
                }
            }
        } catch (FileNotFoundException e) {
            logger.error(e);
        } catch (IOException e) {
            logger.error(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    logger.error(e);
                }
            }
        }
        retList.add(item);
    }
    return retList;
    }
    static boolean  ExistArrayListFileName(ArrayList<File> items,File  _item){
        boolean exist=false;
        for (File item:items) {
            if (item.getName().equals(_item.getName())) exist=true;
            if (item==_item) exist=true;
        }
        return exist;
    }
    static String IsLinkType(String type){
        switch (type.toLowerCase()){
            case "boolean":
                return "false";
            case "float":
                return "false";
            case "date":
                return "false";
            case "string":
                return "false";
            default:
                return "true";
        }
    }
}
