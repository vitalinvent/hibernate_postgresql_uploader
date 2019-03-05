import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="uchenie_stepeni")
public class uchenie_stepeni implements Serializable {

public uchenie_stepeni(){}

public uchenie_stepeni(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }



@ManyToOne
@JoinColumn(name="otrasl_nauki", insertable = true, updatable = true)
private otrasli_nauki otrasl_nauki;

public otrasli_nauki getOtrasl_nauki(){ try{return this.otrasl_nauki;}catch(Exception ex){ return null;} }

public void setOtrasl_nauki( Object _otrasl_nauki){if (_otrasl_nauki instanceof String){this.otrasl_nauki= new otrasli_nauki (_otrasl_nauki.toString());}else{try{this.otrasl_nauki= (otrasli_nauki) _otrasl_nauki;}catch(Exception ex){Variables.logger.error(ex);this.otrasl_nauki= new otrasli_nauki (_otrasl_nauki.toString());}}}

public UUID getOtrasl_nauki_uuid(){ try{return this.otrasl_nauki.getGuid();}catch(Exception ex){return null;} }

public String getOtrasl_nauki_type(){ try{return this.otrasl_nauki.getClass().getName();}catch(Exception ex){return null;} }

public otrasli_nauki getOtrasl_nauki_obj(){ return this.otrasl_nauki; }

public void setOtrasl_nauki_obj( Object _otrasl_nauki){ this.otrasl_nauki=(otrasli_nauki) _otrasl_nauki; }


}
