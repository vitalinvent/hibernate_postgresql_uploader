import classesHibernate.Analytics;
import com.google.devtools.common.options.OptionsParser;
import org.hibernate.cfg.Configuration;
import classesTree.Item;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static Variables variables;
    public static void main (String[] args){
        //magical - do not touch
        @SuppressWarnings("unused")
        org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("org.hibernate");
        double totalMemory = Runtime.getRuntime().totalMemory();
        double maxMemory = Runtime.getRuntime().maxMemory();
        double freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println(" totalMemory = " + Functions.ByteSizeHumanReadable(totalMemory,1)
                +" maxMemory = " + Functions.ByteSizeHumanReadable(maxMemory,1)
                +" freeMemory = " + Functions.ByteSizeHumanReadable(freeMemory,1));
        String FILE_NAME="tree1c";
//        java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.WARNING); //or whatever level you need
        //****************initialise global variables*******************
        variables = new Variables();
        //****************initialise global variables*******************

        ArrayList<Item> listCsv22  = ParsingCSVEngine.ParseCSVFacts("C:\\dev\\1c\\biplane24\\xml\\test\\test\\");//не убирать с начального процесса парсит список
        ClassGenerator classGenerator =  new ClassGenerator();
        classGenerator.GenerateFactsClasses(listCsv22);
        DynamicCompilerLoader dynamicLoader = new DynamicCompilerLoader();
        dynamicLoader.CompileClassesCommandLine();

//        System.exit(0);

        OptionsParser parser = OptionsParser.newOptionsParser(CommandLineOptions.class);
        parser.parseAndExitUponError(args);
        CommandLineOptions options = parser.getOptions(CommandLineOptions.class);
        if (options.help.isEmpty()) {
            printUsage(parser);
            return;
        } else if (!options.hibernate_config.isEmpty()){
            File f = new File(options.hibernate_config);
            Variables.configuration = new Configuration().configure(f);
        } else if (args.length==0){
        } else if (!options.compile_file.isEmpty()){
            dynamicLoader.CompileClassCommandLine(options.compile_file);
        } else if (!options.facts_cvs_file.isEmpty()){
            ArrayList<Item> listCsv  = ParsingCSVEngine.ParseCSVFacts(options.facts_cvs_file);//не убирать с начального процесса парсит список
            classGenerator.GenerateFactsClasses(listCsv);
        } else if (!options.analytics_xml_file.isEmpty()){
            //****************load exist classes (dictionary and other structure objects)*******************
            ParsingXmlEngine.ParseXmlDictionariesAnalytics(FILE_NAME);//не убирать с начального процесса парсит список
            ParsingXmlEngine.CleanLoadedClassesDeadLinks();//не убирать чистит пыстые ссылки
            classGenerator.GenerateAnalyticsClasses(Variables.LoadedClassesAllArrayListItems);
            dynamicLoader.CompileClassesCommandLine();
            HibernateEngine hibernateEngine = new HibernateEngine();
            hibernateEngine.ConfigureHibernate();//ЗАГРУЗКА КЛАССОВ
            try {
                Variables.LoadedObjectsArrayListDataForDb = ParsingXmlEngine.deserializeFromXML(FILE_NAME);
            } catch (Exception e) {
                e.printStackTrace();
            }
            ParsingXmlEngine.SetLoadedLinksObjects();

            hibernateEngine.UpdateDatabase(Variables.LoadedObjectsArrayListDataForDb);
            int idx=0;
            //********************analytic*********************************
            ArrayList<Analytics> analytics = new ArrayList<>();
            for (String analytic:Variables.LoadedClassesNames) {
                analytics.add(new Analytics(analytic,analytic,idx));
                idx++;
            }
            hibernateEngine.UpdateAnalytics(analytics);
        }








//        GenerateAnalyticsClasses classGenerator =  new GenerateAnalyticsClasses();


//        Object obj =null;
//        String sdsd= obj.

//        Object objOrg = null;
//        for (Object obj:Variables.LoadedObjectsArrayListDataForDb) {
//                Method methodGetGuid = null;
//                try {
//                    methodGetGuid = obj.getClass().getMethod("getGuid");
//                } catch (NoSuchMethodException e) {
//                    e.printStackTrace();
//                }
//                UUID guid = null;
//            try {
//                guid= (UUID) methodGetGuid.invoke(obj);
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            }
//            if (guid.equals(UUID.fromString("8113342e-1667-11e8-bf56-6c71d9a36bc0"))) {
//                objOrg=obj;
//            }
//        }

//        Class classOrg = null;
//        //*****************************SET LINK ISSEARCH ****************************************
//        for (Class objClass:Variables.classes) {
//            if (objClass.getName().equals("organizatsii")){
//                classOrg = objClass;
//            }
//        }
//        Method methodSetOrg = null;
//        try {
//            methodSetOrg = Variables.LoadedObjectsArrayListDataForDb.get(0).getClass().getMethod("setOrganizatsija",Object.class);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//        try {
//            methodSetOrg.invoke(Variables.LoadedObjectsArrayListDataForDb.get(0),objOrg);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }

//        for (int idx=0;idx<20;idx++) {
//            String analyticaR = Settings.Get("analyticr"+String.valueOf(idx),"");
//            String analytica = Settings.Get("analytic"+String.valueOf(idx),"");
//            if (analytica != null)
//                analytics.add(new Analytics(analyticaR,analytica,idx));
//        }

        //********************analytic*********************************
        //HibernateEngine.SelectFromDatabase();
        //****************load exist classes (dictionary and other structure objects)*******************
//        //*****************************SET LINK ISSEARCH ****************************************
//        for (Item item:Variables.LoadedClassesAllArrayListItems) {
//            for (Object obj:Variables.LoadedObjectsArrayListDataForDb) {
//                //****************LINK*************************************
//                if (!item.getIsLink().contains("false")) {
//                    Method methodGetGuid = null;
//                    try {
//                        methodGetGuid = obj.getClass().getMethod("getGuid");
//                    } catch (NoSuchMethodException e) {
//                        e.printStackTrace();
//                    }
//                    try {
//                        if (item.getGuid() == methodGetGuid.invoke(obj)) {
//                            Method methodsetLinktype = null;
//                            Method methodSetLink = null;
//                            boolean islink = false;
//                            String link = "";
//                            boolean issearch = false;
//                            try {
//                                methodsetLinktype = obj.getClass().getMethod("setLinktype", Boolean.class);
//                                methodSetLink = obj.getClass().getMethod("setLink", String.class);
//                            } catch (NoSuchMethodException e) {
//                                e.printStackTrace();
//                            }
//                            methodsetLinktype.invoke(obj, true);
//                            methodSetLink.invoke(obj, item.getLink());
//                        }
//                    } catch (IllegalAccessException e) {
//                        e.printStackTrace();
//                    } catch (InvocationTargetException e) {
//                        e.printStackTrace();
//                    }
//                }
//                //****************LINK*************************************
//                //****************SEARCH*************************************
//                if (item.getIsSearch()) {
//                    Method methodGetGuid = null;
//                    try {
//                        methodGetGuid = obj.getClass().getMethod("getGuid");
//                    } catch (NoSuchMethodException e) {
//                        e.printStackTrace();
//                    }
//                    try {
//                        if (item.getGuid() == methodGetGuid.invoke(obj)) {
//                            Method methodSetIssearch = null;
//                            boolean issearch = false;
//                            try {
//                                methodSetIssearch = obj.getClass().getMethod("setIssearch", Boolean.class);
//                            } catch (NoSuchMethodException e) {
//                                e.printStackTrace();
//                            }
//                            methodSetIssearch.invoke(obj,true);
//                        }
//                    } catch (IllegalAccessException e) {
//                        e.printStackTrace();
//                    } catch (InvocationTargetException e) {
//                        e.printStackTrace();
//                    }
//                }
//                //****************SEARCH*************************************
//            }
//        }
//        //*****************************SET LINK ISSEARCH ****************************************


        //
        //HibernateEngine.SelectFromDatabase();

        long estimatedTime = System.currentTimeMillis() - Variables.startTime;
        //System.out.println("Time "+estimatedTime+" milliseconds");
        System.out.println("Worked time "+Functions.MillisecondsHumanReadable(estimatedTime)+"");
    }
    private static void printUsage(OptionsParser parser) {
        System.out.println("Usage: java -jar exchange.jar -h for detail help");
        System.out.println(parser.describeOptions(Collections.<String, String>emptyMap(),
                OptionsParser.HelpVerbosity.LONG));
    }
    static boolean  ExistArrayListItem(ArrayList<Item> items, String str){
        boolean exist=false;
        for (Item item:items) {
            if (item.getName().trim().toLowerCase().contains(str.toLowerCase())) {
                exist=true;
            }
        }
        return exist;
    }
}


