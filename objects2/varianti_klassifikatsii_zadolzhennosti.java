import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="varianti_klassifikatsii_zadolzhennosti")
public class varianti_klassifikatsii_zadolzhennosti implements Serializable {

public varianti_klassifikatsii_zadolzhennosti(){}

public varianti_klassifikatsii_zadolzhennosti(String _guid){ this.guid=UUID.fromString(_guid); }

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



@ManyToOne
@JoinColumn(name="kalendar", insertable = true, updatable = true)
private proizvodstvennie_kalendari kalendar;

public proizvodstvennie_kalendari getKalendar(){ try{return this.kalendar;}catch(Exception ex){ return null;} }

public void setKalendar( Object _kalendar){if (_kalendar instanceof String){this.kalendar= new proizvodstvennie_kalendari (_kalendar.toString());}else{try{this.kalendar= (proizvodstvennie_kalendari) _kalendar;}catch(Exception ex){Variables.logger.error(ex);this.kalendar= new proizvodstvennie_kalendari (_kalendar.toString());}}}

public UUID getKalendar_uuid(){ try{return this.kalendar.getGuid();}catch(Exception ex){return null;} }

public String getKalendar_type(){ try{return this.kalendar.getClass().getName();}catch(Exception ex){return null;} }

public proizvodstvennie_kalendari getKalendar_obj(){ return this.kalendar; }

public void setKalendar_obj( Object _kalendar){ this.kalendar=(proizvodstvennie_kalendari) _kalendar; }


}
