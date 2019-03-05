import classesHibernate.Analytics;
import classesHibernate.BasicEntity;
import org.apache.log4j.Logger;

import javax.tools.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import static java.beans.Introspector.getBeanInfo;

public class DynamicCompilerLoader {
    public final static Logger logger = Logger.getLogger(DynamicCompilerLoader.class);
    private Class<?> classTOCreate=null;
    public void CompileLoadClasses(){
        File dir = new File(Variables.CLASSES_ENTITIES_OBJECTS_FULL_PATH);
        File [] javaFilesEntitties = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });
//        for (File file:files) {
//            Variables.LoadedClassesNames.add(file.getName());
//        }
//        try {
            List<String> optionList = new ArrayList<String>();
            optionList.add("-classpath");
//          optionList.add(System.getProperty("java.class.path") + ";dist/InlineCompiler.jar");
            optionList.add(System.getProperty("java.class.path") + ";dist/InlineCompiler.jar"+ ";"+Variables.APP_PATH_FULL_JAR);
            DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnostics, null, null);
            Iterable<? extends JavaFileObject> compilationUnit=null;
            ArrayList<File> files = new ArrayList<>();
            logger.trace("Compile classes ...");
            for (File classFile: javaFilesEntitties) {
            /** Compilation Requirements *********************************************************************************************/
            // This sets up the class path that the compiler will use.
            // I've added the .jar file that contains the DoStuff interface within in it..
            //files.add(new File(Variables.CLASSES_ENTITIES_OBJECTS_FULL_PATH +className.getName()+".java"));
                files.add(classFile);
            //logger.trace(className.getName()+".java");
            }
            compilationUnit = fileManager.getJavaFileObjectsFromFiles(files);
            JavaCompiler.CompilationTask task = compiler.getTask(
                    null,
                    fileManager,
                    diagnostics,
                    optionList,
                    null,
                    compilationUnit);
            /********************************************************************************************* Compilation Requirements **/
            ///try {
                if (task.call()) {
                    /** Load and execute *************************************************************************************************/
                    // Create a new custom class loader, pointing to the directory that contains the compiled
                    // classes, this should point to the top of the package structure!
                    //URLClassLoader classLoader = new URLClassLoader(new URL[]{new File("./").toURI().toURL()});
                    try {
                        URLClassLoader classLoader = new URLClassLoader(new URL[]{new File(Variables.CLASSES_ENTITIES_OBJECTS_FULL_PATH).toURI().toURL()});
                    } catch (MalformedURLException e) {
                        logger.error(e);
                        e.printStackTrace();
                    }
                    //classTOCreate = classLoader.loadClass("classes."+className);
                    //classTOCreate = classLoader.loadClass(className);
                    //System.out.println("Loaded class "+className);
                    /************************************************************************************************* Load and execute **/
                } else {
                    for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics()) {
                        logger.error(String.format("Error on line %d in %s%n %s", diagnostic.getLineNumber(), diagnostic.getSource().toUri(), diagnostic.toString()));
                    }
                }
//            } catch (Exception ex){
//                logger.error(ex.getStackTrace()+"\n\n\n"+ex.getCause());
//            }
        try {
            fileManager.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        } catch (IOException exp) {
//            logger.error(exp);
//        } catch (Exception ex){
//            logger.error(ex.getStackTrace());
//            logger.error(ex.getCause());
//        }
//        Thread.currentThread().setContextClassLoader(classTOCreate.getClassLoader());
//        //Variables.configuration = new Configuration().configure();
//        Variables.configuration.addAnnotatedClass(classTOCreate);
    }
    public void CompileClass(String fileName){
        File fileToCompile = new File(fileName);
        List<String> optionList = new ArrayList<String>();
        optionList.add("-classpath");
//        optionList.add(System.getProperty("java.class.path") + ";dist/InlineCompiler.jar");
        optionList.add(System.getProperty("java.class.path") + ";.\\lib");
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnostics, null, null);
        Iterable<? extends JavaFileObject> compilationUnit=null;
        ArrayList<File> files = new ArrayList<>();
        logger.trace("Compile classes ...");
            /** Compilation Requirements *********************************************************************************************/
            // This sets up the class path that the compiler will use.
            // I've added the .jar file that contains the DoStuff interface within in it..
            //files.add(new File(Variables.CLASSES_ENTITIES_OBJECTS_FULL_PATH +className.getName()+".java"));
        files.add(fileToCompile);
            //logger.trace(className.getName()+".java");
        compilationUnit = fileManager.getJavaFileObjectsFromFiles(files);
        JavaCompiler.CompilationTask task = compiler.getTask(
                null,
                fileManager,
                diagnostics,
                optionList,
                null,
                compilationUnit);
        /********************************************************************************************* Compilation Requirements **/
        ///try {
        if (task.call()) {
            /** Load and execute *************************************************************************************************/
            // Create a new custom class loader, pointing to the directory that contains the compiled
            // classes, this should point to the top of the package structure!
            //URLClassLoader classLoader = new URLClassLoader(new URL[]{new File("./").toURI().toURL()});
            try {
                URLClassLoader classLoader = new URLClassLoader(new URL[]{new File(Variables.CLASSES_ENTITIES_OBJECTS_FULL_PATH).toURI().toURL()});
            } catch (MalformedURLException e) {
                logger.error(e);
                e.printStackTrace();
            }
            //classTOCreate = classLoader.loadClass("classes."+className);
            //classTOCreate = classLoader.loadClass(className);
            //System.out.println("Loaded class "+className);
            /************************************************************************************************* Load and execute **/
        } else {
            for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics()) {
                logger.error(String.format("Error on line %d in %s%n %s", diagnostic.getLineNumber(), diagnostic.getSource().toUri(), diagnostic.toString()));
            }
        }
//            } catch (Exception ex){
//                logger.error(ex.getStackTrace()+"\n\n\n"+ex.getCause());
//            }
        try {
            fileManager.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        } catch (IOException exp) {
//            logger.error(exp);
//        } catch (Exception ex){
//            logger.error(ex.getStackTrace());
//            logger.error(ex.getCause());
//        }
//        Thread.currentThread().setContextClassLoader(classTOCreate.getClassLoader());
//        //Variables.configuration = new Configuration().configure();
//        Variables.configuration.addAnnotatedClass(classTOCreate);
    }
    public void CompileClassesCommandLine() {
        File dir = new File(Variables.CLASSES_ENTITIES_OBJECTS_FULL_PATH);
        File[] javaFilesEntitties = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {return name.endsWith(".java");}
        });
        ArrayList<File> files = new ArrayList<>();
        logger.trace("Compile classes ...");
        for (File classFile : javaFilesEntitties) {
            CompileClassCommandLine(classFile.getName());
        }
    }
    public void CompileClassCommandLine(String fileName){
//        Process pro = null;
//        try {
//            pro=Runtime.getRuntime().exec("javac -classpath "+Variables.APP_PATH_FULL_JAR+" .\\objects\\"+fileName, null, new File("."));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String cmd = " javac -classpath \""+System.getProperty("java.class.path")+";"+Variables.APP_PATH_FULL_JAR+";"+Variables.APP_FOLDER+"\\objects\" .\\objects\\"+fileName;
        System.out.println(cmd);
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", cmd);
        builder.redirectErrorStream(true);
        Process p = null;
        try {
            p = builder.start();
        } catch (IOException e) {
            logger.error(e);
        }
        try {
            p.waitFor(); // Wait for the process to finish.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line="";
        while (true) {
            try {
                line = r.readLine();
            } catch (IOException e) {
                logger.error(e);
            }
            if (line == null) { break; }
            System.out.println(line);
        }

    }
    public  static  void LoadClasses(){
        final File folder = new File(Variables.CLASSES_ENTITIES_OBJECTS_FULL_PATH);
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
            } else {
                if (fileEntry.getName().endsWith(".class")) {
                    URLClassLoader classLoader = null;
                    try {
                        //classLoader = new URLClassLoader(new URL[]{new File("./").toURI().toURL()});
                        //classLoader = new URLClassLoader(new URL[]{new File("./classes").toURI().toURL()});
                        //classLoader = new URLClassLoader(new URL[]{new File(Variables.CLASSES_ENTITIES_OBJECTS_FULL_PATH).toURI().toURL()});
                        classLoader = new URLClassLoader(new URL[]{new File("./"+Variables.CLASSES_ENTITIES_OBJECTS_FOLDER_NAME+"/").toURI().toURL()});
                    } catch (MalformedURLException e) {
                        logger.error(e);
                    }
                    //classTOCreate = classLoader.loadClass("classes."+className);
                    Class<?> classTOCreate = null;
                    try {
                        classTOCreate = classLoader.loadClass(fileEntry.getName().replaceFirst("[.][^.]+$", ""));
                    } catch (ClassNotFoundException e) {
                        logger.error(e);
                    }
//
//                    BeanInfo beanInfo = null;
//                    try {
//                        beanInfo = getBeanInfo(classTOCreate);
//                    } catch (IntrospectionException e) {
//                        e.printStackTrace();
//                    }
//                    BeanDescriptor beanDescriptor = beanInfo.getBeanDescriptor();
//
//                    /*
//                     * Before using the BeanInfo, check to see if our custom
//                     * property has been initialized.  (Even if we initialized
//                     * it before, if the BeanInfo has been garbage collected,
//                     * then we need to initialize it again.)  Since our custom
//                     * property's value could be null, we define another property
//                     * to tell us if the custom property is initialized.
//                     */
//                    if (beanDescriptor.getValue("islink_init") == null) {
//                        beanDescriptor.setValue("islink", false);
//                        beanDescriptor.setValue("islink_init", Boolean.FALSE);
//                    }
                    Thread.currentThread().setContextClassLoader(classTOCreate.getClassLoader());
                    Variables.configuration.addAnnotatedClass(classTOCreate);
                    logger.trace("Loaded class " + fileEntry);
                }
            }
        }
        //Thread.currentThread().setContextClassLoader(Analytics.);
        Variables.configuration.addAnnotatedClass(Analytics.class);
        Variables.configuration.addAnnotatedClass(BasicEntity.class);
        //Variables.configuration.addAnnotatedClass(ArrayList.class);
    }
}
