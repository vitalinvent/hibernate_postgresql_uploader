package DataBase;

public class BasePostgresql {
//    public  BasePostgresql(ArrayList<dic_nomenclatures> nomenclature) {
//        String url = "jdbc:postgresql://localhost:5432/biplane";//jdbc:postgresql://localhost/test";
//        Properties props = new Properties();
//        props.setProperty("username", "multiuser");
//        props.setProperty("password", "655350");
//        //props.setProperty("ssl","true");
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(url, props);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
////        Statement st = null;
////        try {
////            st = conn.createStatement();
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////        try {
////            ResultSet rs = st.executeQuery("select * from main.dic_nomenclatures");
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
//        for (dic_nomenclatures nomenclatureItem : nomenclature) {
//            String statement = "INSERT INTO main.dic_nomenclatures (code,guid,name,this_group) VALUES ('" + nomenclatureItem.code + "'" + ",'" + nomenclatureItem.guid + "'" + ",'" + nomenclatureItem.name + "'" + ",'" + nomenclatureItem.this_group + "')";
//            PreparedStatement st = null;
//            try {
//                st = conn.prepareStatement(statement.replace("\n", "").replace("\t", ""));
//        } catch(SQLException e){
//            e.printStackTrace();
//        }
//        //st.setInt(1, foovalue);
//        try {
//            ResultSet rs = st.executeQuery();
//        } catch (SQLException e) {
//            //e.printStackTrace();
//        }
//    }
//    }
}
