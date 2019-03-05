import org.apache.log4j.Logger;
import org.hibernate.cfg.Configuration;
import classesTree.Item;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class Variables {
    public static Configuration configuration;
//    public static SessionFactory sessionFactory;
//    public static ServiceRegistry serviceRegistry;
//    public static Session session;
//    public static Transaction transaction=null;
    public static ArrayList<String> LoadedClassesNames = null;
    public static ArrayList<Item> LoadedClassesArrayListLinksInClasses = null;
    public static ArrayList<Item> LoadedClassesAllArrayListItems;
    public static HashMap<String,Object> LoadedObjectsAllHashMap;
    public static ArrayList<Object> LoadedObjectsArrayListDataForDb;
    public static long startTime = 0;
    public static ArrayList<String> CONTROL_WORDS_IN_FIELD_NAMES = new ArrayList<String>();
    public static ArrayList<String> SYSTEM_FIELDS = new ArrayList<String>();
    public static String SEARCH_CONTROL_WORD ="#SEARSH#";
    public static String APP_FOLDER ="";
    public static String APP_PATH_FULL_JAR ="";
    public static String CLASSES_ENTITIES_OBJECTS_FOLDER_NAME ="objects";
    public static String CLASSES_ENTITIES_OBJECTS_FULL_PATH;
    public static String SETTINGS_FILE="settings.txt";
    public static String SETTINGS_COMMENT ="Main settigs for biplane postgresql uploader.";
    public static Logger logger = null;
    public static String hibernate_connection_username = "multiuser";
    public static String hibernate_connection_password = "123456";
    public static String hibernate_connection_url = "jdbc:postgresql://localhost:5432/biplane";
    public static String hibernate_connection_driver_class = "org.postgresql.Driver";
    public static String hbm2ddl_auto = "update";
    public static String hibernate_show_sql = "false";
    public static String connection_autocommit = "false";
    public static String SEPARATOR_CSV = "|";
    public static String SEPARATOR_CSV_FIELD_TYPE = "#TYPEOF#";
    public static String BAD_SYMBOLS_REPLACE_OLDNEW = " ";

    public Variables(){
        logger = Logger.getLogger(Variables.class);
        BAD_SYMBOLS_REPLACE_OLDNEW = Settings.Get("bad_symbols_replace_oldnew"," _");
        SEPARATOR_CSV = Settings.Get("separator_csv","|");
        SEPARATOR_CSV_FIELD_TYPE = Settings.Get("separator_csv_field_type","#TYPEOF#");
        hibernate_connection_url = Settings.Get("hibernate.connection.url","jdbc:postgresql://localhost:5432/biplane");
        hibernate_connection_username = Settings.Get("hibernate.connection.username","multiuser");
        hibernate_connection_password = Settings.Get("hibernate.connection.password","123456");
        hibernate_connection_driver_class = Settings.Get("hibernate.connection.driver_class","org.postgresql.Driver");
        hbm2ddl_auto = Settings.Get("hbm2ddl_auto","update");
        hibernate_show_sql = Settings.Get("hibernate.show_sql","false");
        connection_autocommit = Settings.Get("connection.autocommit","true");
        //*******HIBERNATE
        configuration = new Configuration();

//        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//        session = sessionFactory.openSession();
        //*******LISTS FOR LOADING AND CREATE CLASSES ENTITITES
        LoadedClassesNames = new ArrayList<>();
        LoadedClassesArrayListLinksInClasses = new ArrayList<>();
        LoadedObjectsArrayListDataForDb =new ArrayList<>();
        LoadedClassesAllArrayListItems =new ArrayList<>();
        LoadedObjectsAllHashMap =new HashMap<String,Object>();
        startTime = System.currentTimeMillis();
        //**********CONTROL_WORDS******************************
        CONTROL_WORDS_IN_FIELD_NAMES.add("#LINKDIC#");//справочник ссылка
        CONTROL_WORDS_IN_FIELD_NAMES.add("#LINKDOC#");//документ ссылка
        CONTROL_WORDS_IN_FIELD_NAMES.add("#LINKENUM#");//перечисление ссылка
        CONTROL_WORDS_IN_FIELD_NAMES.add("#LINKPLHAR#");//план характеристик ссылка
        CONTROL_WORDS_IN_FIELD_NAMES.add("#LINKPLSCH#");//план счетов ссылка
        CONTROL_WORDS_IN_FIELD_NAMES.add("#LINKPLVIDR#");//план видов расчета ссылка
        CONTROL_WORDS_IN_FIELD_NAMES.add("#LINKBIZPR#");//бизенс процессы ссылка
        CONTROL_WORDS_IN_FIELD_NAMES.add("#LINKBIZPRTM#");//бизн. проц. точек маршрута ссылка
        CONTROL_WORDS_IN_FIELD_NAMES.add("#LINKTASK#");//задачи ссылка
        CONTROL_WORDS_IN_FIELD_NAMES.add("#LINKPLEX#");//планы обмена ссылка
        CONTROL_WORDS_IN_FIELD_NAMES.add(SEARCH_CONTROL_WORD);//планы обмена ссылка
        //**********CONTROL_WORDS******************************
        //**********SYSTEM_FIELDS******************************
        SYSTEM_FIELDS.add("id");
        SYSTEM_FIELDS.add("guid");
        SYSTEM_FIELDS.add("naimenovanie");
        //**********SYSTEM_FIELDS******************************
        try {
            APP_FOLDER =new File(".").getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }

            APP_PATH_FULL_JAR=APP_FOLDER+"\\"+new java.io.File(Main.class.getProtectionDomain()
                    .getCodeSource()
                    .getLocation()
                    .getPath())
                    .getName();

        CLASSES_ENTITIES_OBJECTS_FULL_PATH = APP_FOLDER +"\\"+CLASSES_ENTITIES_OBJECTS_FOLDER_NAME+"\\";
        try {
            Files.createDirectories(Paths.get(CLASSES_ENTITIES_OBJECTS_FULL_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
