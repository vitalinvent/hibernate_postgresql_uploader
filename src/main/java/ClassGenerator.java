import me.tongfei.progressbar.ProgressBar;
import org.apache.log4j.Logger;
import classesTree.Item;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class ClassGenerator {
    public final static Logger logger = Logger.getLogger(ClassGenerator.class);
    public ClassGenerator(){}
    public void GenerateFactsClasses(ArrayList<Item> tree){
        String className="";
        String ctorVars="";
        try (ProgressBar progressBar = new ProgressBar("Create classes ", tree.size())) {
            for (Item item : tree) {
                progressBar.step();
                StringBuilder classText = new StringBuilder();
                classText.append("import classesHibernate.*;\n");
                classText.append("import javax.persistence.*;\n");
                classText.append("import java.io.Serializable;\n");
                classText.append("import java.util.UUID;\n");
                classText.append("import java.util.Date;\n");
                classText.append("import java.text.SimpleDateFormat;\n");
                classText.append("\n");
                classText.append("@Entity\n");
                classText.append("@Table(name=\"" + item.getName() + "\")\n");
                className = item.getName();
                classText.append("public class " + item.getName() + " implements Serializable {\n");
                ArrayList<Item> properties = item.getChilds();
                classText.append("\n");
                classText.append("public " + item.getName() + "(){}\n");
                classText.append("\n");
                classText.append("public " + item.getName() + "(String _guid){ this.guid=UUID.fromString(_guid); }\n");
                //********************GUID*************************
                classText.append("\n");
                classText.append("@Id\n");
                classText.append("@Column(name = \"guid\")\n");
                classText.append("private UUID guid;\n");
                classText.append("\n");
                classText.append("public UUID getGuid(){ return this.guid; }\n");
                classText.append("public void setGuid(String _guid){ this.guid=UUID.fromString(_guid); }\n");
                //********************GUID*************************
                //********************NAIMENOVANIE*************************
//                classText.append("\n");
//                classText.append("@Column(name = \"naimenovanie\", columnDefinition=\"text\")\n");
//                classText.append("private String naimenovanie;\n");
//                classText.append("\n");
//                classText.append("public String getNaimenovanie(){ return this.naimenovanie; }\n");
//                classText.append("public void setNaimenovanie(String _naimenovanie){ this.naimenovanie=_naimenovanie; }\n");
//                //********************NAIMENOVANIE*************************
                //********************TO_STRING*************************
//                classText.append("\n");
//                classText.append("@Override\n");
//                classText.append("public String toString(){ return this.naimenovanie+\";\"+this.guid; }\n");
//                //******************TO_STRING*************************
                ArrayList<String> arrayListAddedProperties = new ArrayList<>();
                int propComma=0;
                for (Object propertyObject : properties) {
                    Item property = (Item) propertyObject;
                    progressBar.setExtraMessage(property.getName());
                    if (!CheckIsSystemFieldName(property.getName())) {
                        if (!Functions.ExistArrayListString(arrayListAddedProperties, Functions.ToUpperFirstLetter(property.getName()))) {
                            classText.append("\n");
                            if (!property.getIsLink().equals("false")) { //ЭТО ССЫЛКА*******************************************
                                ctorVars+=" UUID " + property.getName()+" ";
                                propComma++;
                                if (propComma>=properties.size()){}else{ctorVars+=",";}
                                classText.append("@ManyToOne\n");//~~~~~~ССЫЛКА НА СПРАВОЧНИК ~~~~~~~~
                                classText.append("@JoinColumn(name=\"" + property.getName() + "\", insertable = true, updatable = true)\n");//~~~~~~ССЫЛКА НА СПРАВОЧНИК ~~~~~~~~
                                classText.append("private "+ property.getLink().toLowerCase() +" " + property.getName() + ";\n");
                                //***********ГЕТТЕР СЕТТЕР ДЛЯ СТАНДАРТНОЙ ОПЕРАЦИИ STRING ДЛЯ XML GUID ОБЪЕКТА*********************
                                classText.append("\n");//GETTER
                                classText.append("public "+property.getLink()+" get" + Functions.ToUpperFirstLetter(property.getName()) + "(){ try{return this." + property.getName() + ";}catch(Exception ex){ return null;} }\n");
                                classText.append("\n");//SETTER
                                //classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "( String " + "_" + property.getName() + "){ this." + property.getName() + "= new "+property.getLink()+" (" + "_" + property.getName() + ".toString()); }\n");
                                classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "( Object " + "_" + property.getName() + "){" +
                                        "if (_" + property.getName()+" instanceof String){" +
                                        "this." + property.getName() + "= new "+property.getLink()+" (" + "_" + property.getName() + ".toString());" +
                                        "}else{" +
                                        "try{this." + property.getName() + "= (" + property.getLink() + ") _" + property.getName() + ";}catch(Exception ex){" +
                                        "Variables.logger.error(ex);"+
                                        "this." + property.getName() + "= new "+property.getLink()+" (" + "_" + property.getName() + ".toString());" +"}" +
                                        "}" +
                                        "}\n");
                                //***********ГЕТТЕР СЕТТЕР ДЛЯ СТАНДАРТНОЙ ОПЕРАЦИИ STRING ДЛЯ XML GUID ОБЪЕКТА*********************
//                            //***********ГЕТТЕР СЕТТЕР ДЛЯ УСТАНОВКИ МАНУАЛЬНО OBJECT*********************
                                classText.append("\n");//GETTER
                                classText.append("public UUID get" + Functions.ToUpperFirstLetter(property.getName()) + "_uuid(){ try{return this." + property.getName() + ".getGuid();}catch(Exception ex){return null;} }\n");
                                classText.append("\n");//GETTER
                                classText.append("public String get" + Functions.ToUpperFirstLetter(property.getName()) + "_type(){ try{return this." + property.getName() + ".getClass().getName();}catch(Exception ex){return null;} }\n");
                                classText.append("\n");//GETTER
                                classText.append("public "+property.getLink()+" get" + Functions.ToUpperFirstLetter(property.getName()) + "_obj(){ return this." + property.getName() + "; }\n");
                                classText.append("\n");//SETTER
                                classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "_obj( Object " + "_" + property.getName() + "){ this." + property.getName() + "=" + "("+property.getLink()+") _" + property.getName() + "; }\n");
                                arrayListAddedProperties.add(Functions.ToUpperFirstLetter(property.getName()));
                            } else {
                                if (property.getType().toLowerCase().equals("float")){
                                    ctorVars+=" "+Functions.ToUpperFirstLetter(property.getType()) + " " + property.getName()+" ";
                                    propComma++;
                                    if (propComma>=properties.size()){}else{ctorVars+=",";}
                                    classText.append("@Column(name=\"" + property.getName() + "\")\n");
                                    classText.append("\n");//SETTER
                                    classText.append("private " + Functions.ToUpperFirstLetter(property.getType()) + " " + property.getName() + ";\n");
                                    classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "(" + Functions.ToUpperFirstLetter(property.getType()) + " " + "_" + property.getName() + "){ this." + property.getName() + "=" + "_" + property.getName() + "; }\n");
                                    classText.append("\n");//GETTER
                                    classText.append("public " + Functions.ToUpperFirstLetter(property.getType()) + " get" + Functions.ToUpperFirstLetter(property.getName()) + "(){ return this." + property.getName() + "; }\n");
                                    arrayListAddedProperties.add(Functions.ToUpperFirstLetter(property.getName()));
                                }
                                else if (property.getType().toLowerCase().equals("boolean")){
                                    ctorVars+=" "+Functions.ToUpperFirstLetter(property.getType()) + " " + property.getName()+" ";
                                    propComma++;
                                    if (propComma>=properties.size()){}else{ctorVars+=",";}
                                    classText.append("@Column(name=\"" + property.getName() + "\")\n");
                                    classText.append("\n");//SETTER
                                    classText.append("private " + Functions.ToUpperFirstLetter(property.getType()) + " " + property.getName() + ";\n");
                                    classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "(" + Functions.ToUpperFirstLetter(property.getType()) + " " + "_" + property.getName() + "){ this." + property.getName() + "=" + "_" + property.getName() + "; }\n");
                                    classText.append("\n");//GETTER
                                    classText.append("public " + Functions.ToUpperFirstLetter(property.getType()) + " get" + Functions.ToUpperFirstLetter(property.getName()) + "(){ return this." + property.getName() + "; }\n");
                                    arrayListAddedProperties.add(Functions.ToUpperFirstLetter(property.getName()));
                                } else if (property.getType().toLowerCase().equals("date")){
                                    ctorVars+=" "+Functions.ToUpperFirstLetter(property.getType()) + " " + property.getName()+" ";
                                    propComma++;
                                    if (propComma>=properties.size()){}else{ctorVars+=",";}
                                    classText.append("@Column(name=\"" + property.getName() + "\")\n");
                                    classText.append("\n");//SETTER
                                    classText.append("private " + Functions.ToUpperFirstLetter(property.getType()) + " " + property.getName() + ";\n");
                                    classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "( String " + "_" + property.getName() + "){ try{this." + property.getName() + "=" + "new SimpleDateFormat(\"yyyy-MM-dd\").parse(_"+property.getName()+");}catch(Exception ex){Variables.logger.error(ex);} }\n");
                                    classText.append("\n");//GETTER
                                    classText.append("public " + Functions.ToUpperFirstLetter(property.getType()) + " get" + Functions.ToUpperFirstLetter(property.getName()) + "(){ return this." + property.getName() + "; }\n");
                                    arrayListAddedProperties.add(Functions.ToUpperFirstLetter(property.getName()));
                                } else {
                                    ctorVars+=" "+Functions.ToUpperFirstLetter(property.getType()) + " " + property.getName()+" ";
                                    propComma++;
                                    if (propComma>=properties.size()){}else{ctorVars+=",";}
                                    classText.append("@Column(name=\"" + property.getName() + "\", columnDefinition=\"text\")\n");
                                    classText.append("private " + Functions.ToUpperFirstLetter(property.getType()) + " " + property.getName() + ";\n");
                                    classText.append("\n");//SETTER
                                    classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "(" + Functions.ToUpperFirstLetter(property.getType()) + " " + "_" + property.getName() + "){ this." + property.getName() + "=" + "_" + property.getName() + "; }\n");
                                    classText.append("\n");//GETTER
                                    classText.append("public " + Functions.ToUpperFirstLetter(property.getType()) + " get" + Functions.ToUpperFirstLetter(property.getName()) + "(){ return this." + property.getName() + "; }\n");
                                    arrayListAddedProperties.add(Functions.ToUpperFirstLetter(property.getName()));
                                }
                            }

                        }
                    }
                    classText.append("\n");
                }

                classText.append("\n");
                classText.append("public " + item.getName() + "("+ctorVars+"){}\n");


                classText.append("\n");
                classText.append("}\n");
                File file = new File(Variables.CLASSES_ENTITIES_OBJECTS_FULL_PATH +className+".java");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    writer.write(classText.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void GenerateAnalyticsClasses(ArrayList<Item> tree){
        String className="";
        try (ProgressBar progressBar = new ProgressBar("Create classes ", tree.size())) {
            for (Item item : tree) {
                progressBar.step();
                StringBuilder classText = new StringBuilder();
                classText.append("import classesHibernate.*;\n");
                classText.append("import javax.persistence.*;\n");
                classText.append("import java.io.Serializable;\n");
                classText.append("import java.util.UUID;\n");
                classText.append("import java.util.Date;\n");
                classText.append("import java.text.SimpleDateFormat;\n");
//                classText.append("import org.codehaus.jackson.annotate.JsonManagedReference;\n");
                classText.append("\n");
                classText.append("@Entity\n");
                classText.append("@Table(name=\"" + item.getName() + "\")\n");
//                classText.append("@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property=\"id\")\n");
                className = item.getName();
                //classText.append("public class " + item.getName() + " extends BasicEntity implements Serializable {\n");
                classText.append("public class " + item.getName() + " implements Serializable {\n");
                ArrayList<Item> properties = item.getChilds();
                classText.append("\n");
                classText.append("public " + item.getName() + "(){}\n");
                classText.append("\n");
                classText.append("public " + item.getName() + "(String _guid){ this.guid=UUID.fromString(_guid); }\n");
                //********************GUID*************************
                classText.append("\n");
                classText.append("@Id\n");
                //classText.append("@GeneratedValue(strategy = GenerationType.IDENTITY)\n");
                classText.append("@Column(name = \"guid\")\n");
                classText.append("private UUID guid;\n");
                classText.append("\n");
                classText.append("public UUID getGuid(){ return this.guid; }\n");
                classText.append("public void setGuid(String _guid){ this.guid=UUID.fromString(_guid); }\n");
                //********************GUID*************************
                //********************NAIMENOVANIE*************************
                classText.append("\n");
                classText.append("@Column(name = \"naimenovanie\", columnDefinition=\"text\")\n");
                classText.append("private String naimenovanie;\n");
                classText.append("\n");
                classText.append("public String getNaimenovanie(){ return this.naimenovanie; }\n");
                classText.append("public void setNaimenovanie(String _naimenovanie){ this.naimenovanie=_naimenovanie; }\n");
//                //********************NAIMENOVANIE*************************
                //********************TO_STRING*************************
                classText.append("\n");
                classText.append("@Override\n");
                classText.append("public String toString(){ return this.naimenovanie+\";\"+this.guid; }\n");
//                //******************TO_STRING*************************
//            classText.append("\n");
//            classText.append("@Column(name = \"islink\")\n");
//            classText.append("private String islink;\n");
//            classText.append("\n");
//            classText.append("public String getIslink(){ return this.islink; }\n");
//            classText.append("public void setIslink(String _islink){ this.islink=_islink; }\n");
//            classText.append("\n");
//            classText.append("@Column(name = \"link\")\n");
//            classText.append("private String link;\n");
//            classText.append("\n");
//            classText.append("public String getLink(){ return this.link; }\n");
//            classText.append("public void setLink(String _link){ this.link=_link; }\n");
//            classText.append("\n");
//            classText.append("@Column(name = \"issearch\")\n");
//            classText.append("private Boolean issearch;\n");
//            classText.append("\n");
//            classText.append("public Boolean getIssearch(){ return this.issearch; }\n");
//            classText.append("public void setIssearch(Boolean _issearch){ this.issearch=_issearch; }\n");
                ArrayList<String> arrayListAddedProperties = new ArrayList<>();
                for (Object propertyObject : properties) {
                    Item property = (Item) propertyObject;
                    progressBar.setExtraMessage(property.getName());
                    if (!CheckIsSystemFieldName(property.getName())) {
//                        if (property.getName().toLowerCase().equals("kodpodchinennostifss")) {
//                            System.out.println("");
//                        }
//                        if (property.getName().toLowerCase().equals("ipkodpodchinennostifss")) {
//                            System.out.println("");
//                        }
                        if (!Functions.ExistArrayListString(arrayListAddedProperties, Functions.ToUpperFirstLetter(property.getName()))) {
                            classText.append("\n");
                            //classText.append("@Index(name=\"index_"+ CleanStringFromControlWords(property.getName()).toLowerCase()+"\")\n");
                            if (!property.getIsLink().equals("false")) { //ЭТО ССЫЛКА*******************************************

//                                classText.append("@JsonManagedReference(\"question-answers\")\n");
                                //classText.append("@OneToMany(mappedBy=\"" + item.getName() + "\")\n");//~~~~~~ССЫЛКА НА СПРАВОЧНИК ~~~~~~~~
                                classText.append("@ManyToOne\n");//~~~~~~ССЫЛКА НА СПРАВОЧНИК ~~~~~~~~
                                classText.append("@JoinColumn(name=\"" + property.getName() + "\", insertable = true, updatable = true)\n");//~~~~~~ССЫЛКА НА СПРАВОЧНИК ~~~~~~~~
                                classText.append("private "+ property.getLink() +" " + property.getName() + ";\n");
                                //***********ГЕТТЕР СЕТТЕР ДЛЯ СТАНДАРТНОЙ ОПЕРАЦИИ STRING ДЛЯ XML GUID ОБЪЕКТА*********************
                                classText.append("\n");//GETTER
                                classText.append("public "+property.getLink()+" get" + Functions.ToUpperFirstLetter(property.getName()) + "(){ try{return this." + property.getName() + ";}catch(Exception ex){ return null;} }\n");
                                classText.append("\n");//SETTER
                                //classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "( String " + "_" + property.getName() + "){ this." + property.getName() + "= new "+property.getLink()+" (" + "_" + property.getName() + ".toString()); }\n");
                                classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "( Object " + "_" + property.getName() + "){" +
                                        "if (_" + property.getName()+" instanceof String){" +
                                        "this." + property.getName() + "= new "+property.getLink()+" (" + "_" + property.getName() + ".toString());" +
                                        "}else{" +
                                        "try{this." + property.getName() + "= (" + property.getLink() + ") _" + property.getName() + ";}catch(Exception ex){" +
                                        "Variables.logger.error(ex);"+
                                        "this." + property.getName() + "= new "+property.getLink()+" (" + "_" + property.getName() + ".toString());" +"}" +
                                        "}" +
                                        "}\n");
                                //***********ГЕТТЕР СЕТТЕР ДЛЯ СТАНДАРТНОЙ ОПЕРАЦИИ STRING ДЛЯ XML GUID ОБЪЕКТА*********************
//                            //***********ГЕТТЕР СЕТТЕР ДЛЯ УСТАНОВКИ МАНУАЛЬНО OBJECT*********************
//                                classText.append("\n");//GETTER
//                                classText.append("public BasicEntity get" + Functions.ToUpperFirstLetter(property.getName()) + "_obj(){ return this." + property.getName() + "; }\n");
                                classText.append("\n");//GETTER
                                classText.append("public UUID get" + Functions.ToUpperFirstLetter(property.getName()) + "_uuid(){ try{return this." + property.getName() + ".getGuid();}catch(Exception ex){return null;} }\n");
                                classText.append("\n");//GETTER
                                //public String getBank_type(){ try{return this.bank.getClass().getName();}catch(Exception ex){return null;} }
                                classText.append("public String get" + Functions.ToUpperFirstLetter(property.getName()) + "_type(){ try{return this." + property.getName() + ".getClass().getName();}catch(Exception ex){return null;} }\n");
                                classText.append("\n");//GETTER
                                classText.append("public "+property.getLink()+" get" + Functions.ToUpperFirstLetter(property.getName()) + "_obj(){ return this." + property.getName() + "; }\n");
//                                classText.append("public BasicEntity get" + Functions.ToUpperFirstLetter(property.getName()) + "_obj(){\n");
//                                classText.append("Variables.session.get(Class.forName(" + property.getName() + "_type)," + property.getName() + ");\n");
////                                classText.append("return new BasicEntity("+property.getName()+");\n");
//                                classText.append("}\n");
                                classText.append("\n");//SETTER
                                classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "_obj( Object " + "_" + property.getName() + "){ this." + property.getName() + "=" + "("+property.getLink()+") _" + property.getName() + "; }\n");
//////**************************FOR BASIC ENTITY MULTI LINKS ****************************************
//                                //classText.append("@OneToMany(mappedBy=\"" + item.getName() + "\")\n");//~~~~~~ССЫЛКА НА СПРАВОЧНИК ~~~~~~~~
//                                classText.append("@ManyToOne\n");//~~~~~~ССЫЛКА НА СПРАВОЧНИК ~~~~~~~~
//                                classText.append("@JoinColumn(name=\"" + property.getName() + "\", insertable = true, updatable = true)\n");//~~~~~~ССЫЛКА НА СПРАВОЧНИК ~~~~~~~~
//                                classText.append("public BasicEntity " + property.getName() + ";\n");
//                                //***********ГЕТТЕР СЕТТЕР ДЛЯ СТАНДАРТНОЙ ОПЕРАЦИИ STRING ДЛЯ XML GUID ОБЪЕКТА*********************
//                                classText.append("\n");//GETTER
//                                classText.append("public String get" + Functions.ToUpperFirstLetter(property.getName()) + "(){ try{return this." + property.getName() + ".getGuid().toString();}catch(Exception ex){ return \"\";} }\n");
//                                classText.append("\n");//SETTER
//                                classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "( String " + "_" + property.getName() + "){ this." + property.getName() + "= new BasicEntity (" + "_" + property.getName() + ".toString()); }\n");
//                                //***********ГЕТТЕР СЕТТЕР ДЛЯ СТАНДАРТНОЙ ОПЕРАЦИИ STRING ДЛЯ XML GUID ОБЪЕКТА*********************
////                            //***********ГЕТТЕР СЕТТЕР ДЛЯ УСТАНОВКИ МАНУАЛЬНО OBJECT*********************
////                                classText.append("\n");//GETTER
////                                classText.append("public BasicEntity get" + Functions.ToUpperFirstLetter(property.getName()) + "_obj(){ return this." + property.getName() + "; }\n");
//                                classText.append("\n");//GETTER
//                                classText.append("public BasicEntity get" + Functions.ToUpperFirstLetter(property.getName()) + "_obj(){ return this." + property.getName() + "; }\n");
////                                classText.append("public BasicEntity get" + Functions.ToUpperFirstLetter(property.getName()) + "_obj(){\n");
////                                classText.append("Variables.session.get(Class.forName(" + property.getName() + "_type)," + property.getName() + ");\n");
//////                                classText.append("return new BasicEntity("+property.getName()+");\n");
////                                classText.append("}\n");
//                                classText.append("\n");//SETTER
//                                classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "_obj( Object " + "_" + property.getName() + "){ this." + property.getName() + "=" + "(BasicEntity) _" + property.getName() + "; }\n");

//                                //******************ТИП ССЫЛКИ************************
//                                classText.append("\n");
//                                classText.append("@Column(name=\"" + property.getName() + "_type\", columnDefinition=\"TEXT\")\n");
//                                classText.append("public String " + property.getName() + "_type;\n");
//                                classText.append("\n");
//                                classText.append("public String get" + Functions.ToUpperFirstLetter(property.getName()) + "_type(){ try{return this." + property.getName() + "_type;}catch(Exception ex){ return \"\";} }\n");
//                                classText.append("\n");
//                                classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "_type( String _" + property.getName() + "_type){ this." + property.getName() + "_type= _" + property.getName() + "_type; }\n");
////                                classText.append("\n");
////                                classText.append("public Object get" + Functions.ToUpperFirstLetter(property.getName()) + "_type_obj( Object " + property.getName() + "_type_obj){ this." + property.getName() + "_type= " + property.getName() + "_type_obj.getClass().getName(); }\n");
//                                classText.append("\n");
//                                classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "_type_obj( Object " + property.getName() + "_type_obj){ if ("+property.getName() + "_type_obj==null){this."+property.getName()+"_type=\"\";}else{this." + property.getName() + "_type= " + property.getName() + "_type_obj.getClass().getName();} }\n");
//////**************************FOR BASIC ENTITY MULTI LINKS ****************************************



                                //******************ТИП ССЫЛКИ************************
                                //                            //***********ГЕТТЕР СЕТТЕР ДЛЯ УСТАНОВКИ МАНУАЛЬНО OBJECT*********************
//                                //classText.append("@OneToMany(mappedBy=\"" + item.getName() + "\")\n");//~~~~~~ССЫЛКА НА СПРАВОЧНИК ~~~~~~~~
//                                classText.append("@ManyToOne\n");//~~~~~~ССЫЛКА НА СПРАВОЧНИК ~~~~~~~~
//                                classText.append("@JoinColumn(name=\"" + property.getName() + "\", insertable = true, updatable = true)\n");//~~~~~~ССЫЛКА НА СПРАВОЧНИК ~~~~~~~~
//                                classText.append("public " + property.getLink() + " " + property.getName() + ";\n");
//                                //***********ГЕТТЕР СЕТТЕР ДЛЯ СТАНДАРТНОЙ ОПЕРАЦИИ STRING ДЛЯ XML GUID ОБЪЕКТА*********************
//                                classText.append("\n");//GETTER
//                                classText.append("public String get" + Functions.ToUpperFirstLetter(property.getName()) + "(){ try{return this." + property.getName() + ".getGuid().toString();}catch(Exception ex){ return \"\";} }\n");
//                                classText.append("\n");//SETTER
//                                classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "( String " + "_" + property.getName() + "){ this." + property.getName() + "= new " + property.getLink() + "(" + "_" + property.getName() + "); }\n");
//                                //***********ГЕТТЕР СЕТТЕР ДЛЯ СТАНДАРТНОЙ ОПЕРАЦИИ STRING ДЛЯ XML GUID ОБЪЕКТА*********************
////                            //***********ГЕТТЕР СЕТТЕР ДЛЯ УСТАНОВКИ МАНУАЛЬНО OBJECT*********************
//                                classText.append("\n");//GETTER
//                                classText.append("public " + property.getLink() + " get" + Functions.ToUpperFirstLetter(property.getName()) + "_obj(){ return this." + property.getName() + "; }\n");
//                                classText.append("\n");//SETTER
//                                classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "_obj( Object " + "_" + property.getName() + "){ this." + property.getName() + "=" + "(" + property.getLink() + ") _" + property.getName() + "; }\n");
////                            //***********ГЕТТЕР СЕТТЕР ДЛЯ УСТАНОВКИ МАНУАЛЬНО OBJECT*********************
//                            classText.append("\n");//SETTER
//                            classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "(" + property.getLink() + " " + "_" + property.getName() + "){ this." + property.getName() + "=" + "_" + property.getName() + "; }\n");
                                arrayListAddedProperties.add(Functions.ToUpperFirstLetter(property.getName()));
                            } else {
                                if (property.getType().toLowerCase().equals("float")){
                                    classText.append("@Column(name=\"" + property.getName() + "\")\n");
//                                    classText.append("@Column(name=\"" + property.getName() + "\", precision=10, scale=2,columnDefinition=\"numeric\")\n");
                                    classText.append("\n");//SETTER
                                    classText.append("private " + Functions.ToUpperFirstLetter(property.getType()) + " " + property.getName() + ";\n");
                                    classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "(" + Functions.ToUpperFirstLetter(property.getType()) + " " + "_" + property.getName() + "){ this." + property.getName() + "=" + "_" + property.getName() + "; }\n");
                                    classText.append("\n");//GETTER
                                    classText.append("public " + Functions.ToUpperFirstLetter(property.getType()) + " get" + Functions.ToUpperFirstLetter(property.getName()) + "(){ return this." + property.getName() + "; }\n");
                                    arrayListAddedProperties.add(Functions.ToUpperFirstLetter(property.getName()));
                                }
                                else if (property.getType().toLowerCase().equals("boolean")){
                                    classText.append("@Column(name=\"" + property.getName() + "\")\n");
//                                    classText.append("@Column(name=\"" + property.getName() + "\", columnDefinition = \"boolean default false\", nullable = false)\n");
                                    classText.append("\n");//SETTER
                                    classText.append("private " + Functions.ToUpperFirstLetter(property.getType()) + " " + property.getName() + ";\n");
                                    classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "(" + Functions.ToUpperFirstLetter(property.getType()) + " " + "_" + property.getName() + "){ this." + property.getName() + "=" + "_" + property.getName() + "; }\n");
                                    classText.append("\n");//GETTER
                                    classText.append("public " + Functions.ToUpperFirstLetter(property.getType()) + " get" + Functions.ToUpperFirstLetter(property.getName()) + "(){ return this." + property.getName() + "; }\n");
                                    arrayListAddedProperties.add(Functions.ToUpperFirstLetter(property.getName()));
                                } else if (property.getType().toLowerCase().equals("date")){
                                    classText.append("@Column(name=\"" + property.getName() + "\")\n");
//                                    classText.append("@Column(name=\"" + property.getName() + "\", columnDefinition = \"boolean default false\", nullable = false)\n");
                                    classText.append("\n");//SETTER
                                    classText.append("private " + Functions.ToUpperFirstLetter(property.getType()) + " " + property.getName() + ";\n");
                                    classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "( String " + "_" + property.getName() + "){ try{this." + property.getName() + "=" + "new SimpleDateFormat(\"yyyy-MM-dd\").parse(_"+property.getName()+");}catch(Exception ex){Variables.logger.error(ex);} }\n");
                                    classText.append("\n");//GETTER
                                    classText.append("public " + Functions.ToUpperFirstLetter(property.getType()) + " get" + Functions.ToUpperFirstLetter(property.getName()) + "(){ return this." + property.getName() + "; }\n");
                                    arrayListAddedProperties.add(Functions.ToUpperFirstLetter(property.getName()));
                                } else {
                                    //classText.append("@Column(name=\"" + property.getName() + "\", columnDefinition=\"text\")\n");
                                    classText.append("@Column(name=\"" + property.getName() + "\", columnDefinition=\"text\")\n");
                                    classText.append("private " + Functions.ToUpperFirstLetter(property.getType()) + " " + property.getName() + ";\n");
                                    classText.append("\n");//SETTER
                                    classText.append("public void set" + Functions.ToUpperFirstLetter(property.getName()) + "(" + Functions.ToUpperFirstLetter(property.getType()) + " " + "_" + property.getName() + "){ this." + property.getName() + "=" + "_" + property.getName() + "; }\n");
                                    classText.append("\n");//GETTER
                                    classText.append("public " + Functions.ToUpperFirstLetter(property.getType()) + " get" + Functions.ToUpperFirstLetter(property.getName()) + "(){ return this." + property.getName() + "; }\n");
                                    arrayListAddedProperties.add(Functions.ToUpperFirstLetter(property.getName()));
                                }
//                                Date date1;
//                                try { date1=new SimpleDateFormat("yyyy-MM-dd").parse("2019-02-07t00:00:00");
//                                } catch (ParseException e) {
//                                    e.printStackTrace();
//                                }

//                                classText.append("private " + Functions.ToUpperFirstLetter(property.getType()) + " " + property.getName() + ";\n");
//                                classText.append("\n");//GETTER
//                                classText.append("public " + Functions.ToUpperFirstLetter(property.getType()) + " get" + Functions.ToUpperFirstLetter(property.getName()) + "(){ return this." + property.getName() + "; }\n");
//                                arrayListAddedProperties.add(Functions.ToUpperFirstLetter(property.getName()));
                            }

                        }
                    }
                    classText.append("\n");
                }
                classText.append("\n");
                classText.append("}\n");
                File file = new File(Variables.CLASSES_ENTITIES_OBJECTS_FULL_PATH +className+".java");
//                File file = new File(className + ".java");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    writer.write(classText.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
//            Variables.LoadedClassesNames.add(className);
            }
        }
    }
    private boolean CheckIsSystemFieldName(String string){
        boolean retVal=false;
        for (String systemField: Variables.SYSTEM_FIELDS) {
            if (string.trim().toLowerCase().equals(systemField.toLowerCase())){
                retVal=true;
            }
        }
        return retVal;
    }

}
