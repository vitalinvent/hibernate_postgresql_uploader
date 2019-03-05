import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="zvanija_grazhdanskogo_voinskogo_ucheta")
public class zvanija_grazhdanskogo_voinskogo_ucheta implements Serializable {

public zvanija_grazhdanskogo_voinskogo_ucheta(){}

public zvanija_grazhdanskogo_voinskogo_ucheta(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }




@ManyToOne
@JoinColumn(name="sostav", insertable = true, updatable = true)
private sostavi_voennosluzhashchih sostav;

public sostavi_voennosluzhashchih getSostav(){ try{return this.sostav;}catch(Exception ex){ return null;} }

public void setSostav( Object _sostav){if (_sostav instanceof String){this.sostav= new sostavi_voennosluzhashchih (_sostav.toString());}else{try{this.sostav= (sostavi_voennosluzhashchih) _sostav;}catch(Exception ex){Variables.logger.error(ex);this.sostav= new sostavi_voennosluzhashchih (_sostav.toString());}}}

public UUID getSostav_uuid(){ try{return this.sostav.getGuid();}catch(Exception ex){return null;} }

public String getSostav_type(){ try{return this.sostav.getClass().getName();}catch(Exception ex){return null;} }

public sostavi_voennosluzhashchih getSostav_obj(){ return this.sostav; }

public void setSostav_obj( Object _sostav){ this.sostav=(sostavi_voennosluzhashchih) _sostav; }


}
