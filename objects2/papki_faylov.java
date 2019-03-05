import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="papki_faylov")
public class papki_faylov implements Serializable {

public papki_faylov(){}

public papki_faylov(String _guid){ this.guid=UUID.fromString(_guid); }

@Id
@Column(name = "guid")
private UUID guid;

public UUID getGuid(){ return this.guid; }
public void setGuid(String _guid){ this.guid=UUID.fromString(_guid); }

@Column(name = "naimenovanie", columnDefinition="text")
private String naimenovanie;

public String getNaimenovanie(){ return this.naimenovanie; }
public void setNaimenovanie(String _naimenovanie){ this.naimenovanie=_naimenovanie; }

@Override
public String toString(){ return this.naimenovanie+";"+this.guid; }

@Column(name="opisanie", columnDefinition="text")
private String opisanie;

public void setOpisanie(String _opisanie){ this.opisanie=_opisanie; }

public String getOpisanie(){ return this.opisanie; }


@ManyToOne
@JoinColumn(name="otvetstvenniy", insertable = true, updatable = true)
private polzovateli otvetstvenniy;

public polzovateli getOtvetstvenniy(){ try{return this.otvetstvenniy;}catch(Exception ex){ return null;} }

public void setOtvetstvenniy( Object _otvetstvenniy){if (_otvetstvenniy instanceof String){this.otvetstvenniy= new polzovateli (_otvetstvenniy.toString());}else{try{this.otvetstvenniy= (polzovateli) _otvetstvenniy;}catch(Exception ex){Variables.logger.error(ex);this.otvetstvenniy= new polzovateli (_otvetstvenniy.toString());}}}

public UUID getOtvetstvenniy_uuid(){ try{return this.otvetstvenniy.getGuid();}catch(Exception ex){return null;} }

public String getOtvetstvenniy_type(){ try{return this.otvetstvenniy.getClass().getName();}catch(Exception ex){return null;} }

public polzovateli getOtvetstvenniy_obj(){ return this.otvetstvenniy; }

public void setOtvetstvenniy_obj( Object _otvetstvenniy){ this.otvetstvenniy=(polzovateli) _otvetstvenniy; }



@Column(name="data_sozdanija", columnDefinition="text")
private String data_sozdanija;

public void setData_sozdanija(String _data_sozdanija){ this.data_sozdanija=_data_sozdanija; }

public String getData_sozdanija(){ return this.data_sozdanija; }


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }



}
