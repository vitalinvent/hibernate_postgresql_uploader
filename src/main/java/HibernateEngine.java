import classesHibernate.Analytics;
import org.apache.log4j.Logger;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceException;

public class HibernateEngine {
//    public Configuration configuration;
    public SessionFactory sessionFactory;
//    public ServiceRegistry serviceRegistry;
    public Session session;
    //public Transaction transaction=null;

    public void ConfigureHibernate(){

        Variables.configuration.configure("hibernate.cfg.xml"); //hibernate config xml file name
        Variables.configuration.getProperties().setProperty("hibernate.connection.url",Variables.hibernate_connection_url);
        Variables.configuration.getProperties().setProperty("hibernate.connection.username",Variables.hibernate_connection_username);
        Variables.configuration.getProperties().setProperty("hibernate.connection.password",Variables.hibernate_connection_password);
        Variables.configuration.getProperties().setProperty("hibernate.connection.driver_class",Variables.hibernate_connection_driver_class);
        Variables.configuration.getProperties().setProperty("hbm2ddl.auto",Variables.hbm2ddl_auto);
        Variables.configuration.getProperties().setProperty("hibernate.show_sql",Variables.hibernate_show_sql);
        Variables.configuration.getProperties().setProperty("connection.autocommit",Variables.connection_autocommit);

        System.out.println("hibernate.connection.url="+Variables.hibernate_connection_url);
        System.out.println("hibernate.connection.username="+Variables.hibernate_connection_username);
        System.out.println("hibernate.connection.password=******");//+Variables.hibernate_connection_password.toString()
        System.out.println("hibernate.connection.driver_class="+Variables.hibernate_connection_driver_class);
        System.out.println("hbm2ddl.auto="+Variables.hbm2ddl_auto);
        System.out.println("hibernate_show_sql.auto="+Variables.hibernate_show_sql);
        System.out.println("connection.autocommit="+Variables.connection_autocommit);

        logger.info("hibernate.connection.url="+Variables.hibernate_connection_url);
        logger.info("hibernate.connection.username="+Variables.hibernate_connection_username);
        logger.info("hibernate.connection.password=******");//+Variables.hibernate_connection_password.toString()
        logger.info("hibernate.connection.driver_class="+Variables.hibernate_connection_driver_class);
        logger.info("hbm2ddl.auto="+Variables.hbm2ddl_auto);
        logger.info("hibernate_show_sql.auto="+Variables.hibernate_show_sql);
        logger.info("connection.autocommit="+Variables.connection_autocommit);

        Variables.configuration.configure();
        DynamicCompilerLoader.LoadClasses();

    }

    public void HibernateEngine(){
        //*******HIBERNATE
        ConfigureHibernate();

//        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(Variables.configuration.getProperties()).build();
//        sessionFactory = Variables.configuration.buildSessionFactory(serviceRegistry);
//        sessionFactory = Variables.configuration.buildSessionFactory();
//        session = sessionFactory.openSession();
    }

    public final static Logger logger = Logger.getLogger(HibernateEngine.class);

    //    public void UpdateDatabase(){
//        UpdateDatabase(Variables.LoadedObjectsArrayListDataForDb);
//    }
    public void UpdateDatabase(java.util.List<Object> arrayListObjectsForDb){
//        sessionFactory = Variables.configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        sessionFactory = Variables.configuration.buildSessionFactory();
//                    Query query = session.createQuery("FROM DicNomenclaturesEntity ");
//            List nomenclatures = query.list();
//            try {
//                ParsingEngine.serializeToXML(nomenclatures);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        sessionFactory = Variables.configuration.buildSessionFactory();
        session = sessionFactory.openSession();

        Transaction transaction = null;
        int items=0;
        Object objOnError=null;
        try {
            transaction = session.beginTransaction();
            for (Object obj:arrayListObjectsForDb) {
                //session.save(obj);
                try {
                    objOnError=obj;
//                    replicate(Object, ReplicationMode) — преобразует объект из detached в persistent, при этом у объекта обязательно должен быть заранее установлен Id. Данный метод предназначен для сохранения в БД объекта с заданным Id, чего не позволяют сделать persist() и merge(). Если объект с данным Id уже существует в БД, то поведение определяется согласно правилу из перечисления org.hibernate.ReplicationMode:
//                    ReplicationMode.IGNORE — ничего не меняется в базе.
//                    ReplicationMode.OVERWRITE — объект сохраняется в базу вместо существующего.
//                    ReplicationMode.LATEST_VERSION — в базе сохраняется объект с последней версией.
//                    ReplicationMode.EXCEPTION — генерирует исключение.
                    //session.replicate(obj,ReplicationMode.OVERWRITE);
                    //merge(Object) — преобразует объект из transient или detached в persistent. Если из transient, то работает аналогично persist() (генерирует для объекта новый Id, даже если он задан), если из detached — загружает объект из БД, присоединяет к сессии, а при сохранении выполняет запрос update
                    //session.merge(obj);
                    session.saveOrUpdate(obj);
                } catch (EntityNotFoundException ex){
                    logger.error(ex);
                } catch (IllegalArgumentException ex){
                    logger.error(ex);
                } catch (Exception ex){
                    logger.error(ex);
                }
            }
            session.flush();
            session.getTransaction().commit();
            session.clear();
        } catch (HibernateException e){
            logger.error(e);
            //if (transaction!=null) transaction.rollback();
            e.printStackTrace();
        } catch (PersistenceException ex){
            logger.error(ex);
        }
        finally {
//            session.close();// сессия для всех действий не закрываем т.к. для аналитик ошибка вылетает что уже закрыта
//            sessionFactory.close();// сессия для всех действий не закрываем т.к. для аналитик ошибка вылетает что уже закрыта
        }
    }
    public void UpdateAnalytics(java.util.List<Analytics> arrayListObjectsForDb){
//        sessionFactory = Variables.configuration.buildSessionFactory();
//        session = sessionFactory.openSession();
        Transaction transaction = null;
        int items=0;
        Object objOnError=null;
        try {
            transaction = session.beginTransaction();
            for (Object obj:arrayListObjectsForDb) {
                try {
                    session.saveOrUpdate(obj);
                } catch (EntityNotFoundException ex){
                    logger.error(ex);
                } catch (IllegalArgumentException ex){
                    logger.error(ex);
                } catch (Exception ex){
                    logger.error(ex);
                }
            }
            session.flush();
            session.getTransaction().commit();
            session.clear();
        } catch (HibernateException e){
            logger.error(e);
            //if (transaction!=null) transaction.rollback();
            e.printStackTrace();
        } catch (PersistenceException ex){
            logger.error(ex);
        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }

    public static void SelectFromDatabase(){
//        SessionFactory svessionFactory = Variables.configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
        try {
//            session = sessionFactory.openSession();
//            Query query = Variables.session.createQuery("FROM brigadi");
//            List nomenclatures = query.list();
//            try {
//                ParsingXmlEngine.serializeToXML(nomenclatures,"brigadi");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

        } catch (HibernateException e){
        } finally {
//            session.close();
//            sessionFactory.close();
        }
    }
}
