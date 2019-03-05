import classesTree.Item;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Functions {
    public static String ToUpperFirstLetter(String string){
        try {
            return string.substring(0, 1).toUpperCase() + string.substring(1);
        } catch (Exception ex){
            ex.printStackTrace();
            return string;
        }
    }
    public static boolean  ExistArrayListItem(ArrayList<Item> items, Item _item){
        boolean exist=false;
        for (Item item:items) {
            if (item.getName().trim().contains(_item.getName().trim())) exist=true;
            if (item.getGuid()==_item.getGuid()) exist=true;
        }
        return exist;
    }
    public static boolean  ExistArrayListString(ArrayList<String> items, String _item){
        boolean exist=false;
        for (String item:items) {
            if (item.trim().equals(_item.trim())) exist=true;
        }
        return exist;
    }
    public static <T> String GetMethodFromObject(Object obj, String methodName, Class<T> variableType){
        Method methodGetGuid = null;
        try {
            methodGetGuid = obj.getClass().getMethod(methodName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        T guid = null;
        try {
            guid = (T) methodGetGuid.invoke(obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        if (guid==null){
            return null;
        }else{
            return guid.toString();
        }
    }
    public static <T> void SetMethodObject(Object obj, String methodName, Class<T> variableType,Object objectToSet){
        Method methodGetGuid = null;
        try {
            methodGetGuid = obj.getClass().getMethod(methodName,variableType);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            methodGetGuid.invoke(obj,objectToSet);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public static String ByteSizeHumanReadable (double bytes, int digits) {
        /**
         * Method to format bytes in human readable format
         *
         * @param bytes  - the value in bytes
         * @param digits - number of decimals to be displayed
         * @return human readable format string
         */
        String[] dictionary = {"bytes", "KB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB"};
        int index = 0;
        for (index = 0; index < dictionary.length; index++) {
            if (bytes < 1024) {
                break;
            }
            bytes = bytes / 1024;
        }
        return String.format("%." + digits + "f", bytes) + "" + dictionary[index];
    }
    public static String MillisecondsHumanReadable (long milliseconds) {
        long second = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
        long minute = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
        long hour = TimeUnit.MILLISECONDS.toHours(milliseconds);
        milliseconds -= TimeUnit.SECONDS.toMillis(second);
        return String.format("%02d:%02d:%02d:%d", hour, minute, second, milliseconds);
    }
    public static String transliterateRuEn(String message){
        char[] abcCyr =   {' ','а','б','в','г','д','е','ё', 'ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х', 'ц','ч', 'ш','щ','ъ','ы','ь','э', 'ю','я','А','Б','В','Г','Д','Е','Ё', 'Ж','З','И','Й','К','Л','М','Н','О','П','Р','С','Т','У','Ф','Х', 'Ц', 'Ч','Ш', 'Щ','Ъ','Ы','Ь','Э','Ю','Я','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String[] abcLat = {" ","a","b","v","g","d","e","e","zh","z","i","y","k","l","m","n","o","p","r","s","t","u","f","h","ts","ch","sh","sch", "","i", "","e","ju","ja","A","B","V","G","D","E","E","Zh","Z","I","Y","K","L","M","N","O","P","R","S","T","U","F","H","Ts","Ch","Sh","Sch", "","I", "","E","Ju","Ja","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            for (int x = 0; x < abcCyr.length; x++ ) {
                if (message.charAt(i) == abcCyr[x]) {
                    builder.append(abcLat[x]);
                }
            }
        }
        return builder.toString();
    }
    public static void GetFilesSubdirsRecursivelly(String directoryName, List<File> files) {
        File directory = new File(directoryName);

        // Get all files from a directory.
        File[] fList = directory.listFiles();
        if(fList != null)
            for (File file : fList) {
                if (file.isFile()) {
                    files.add(file);
                } else if (file.isDirectory()) {
                    GetFilesSubdirsRecursivelly(file.getAbsolutePath(), files);
                }
            }
    }
    public static String ReplaceBadSymbols(String str){
        String repSymb = Variables.BAD_SYMBOLS_REPLACE_OLDNEW;
        for (int idx=0;idx<repSymb.length();idx=idx+2) {
            str=str.replace(repSymb.charAt(idx),repSymb.charAt(idx+1));
        }
        return str;
    }

//    public static String transliterateEnRu(String message){
//        String[] abcLat = {" ","а","б","в","г","д","е","ё", "ж","з","и","й","к","л","м","н","о","п","р","с","т","у","ф","х", "ц","ч", "ш","щ","ъ","ы","ь","э", "ю","я","А","Б","В","Г","Д","Е","Ё", "Ж","З","И","Й","К","Л","М","Н","О","П","Р","С","Т","У","Ф","Х", "Ц", "Ч","Ш", "Щ","Ъ","Ы","Ь","Э","Ю","Я","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//        String[] abcCyr = {" ","a","b","v","g","d","e","e","zh","z","i","y","k","l","m","n","o","p","r","s","t","u","f","h","ts","ch","sh","sch", "","i", "","e","ju","ja","A","B","V","G","D","E","E","Zh","Z","I","Y","K","L","M","N","O","P","R","S","T","U","F","H","Ts","Ch","Sh","Sch", "","I", "","E","Ju","Ja","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < message.length(); i++) {
//            for (int x = 0; x < abcCyr.length; x++ ) {
//                if (message.charAt(i) == abcCyr[x]) {
//                    builder.append(abcLat[x]);
//                }
//            }
//        }
//        return builder.toString();
//    }
}
