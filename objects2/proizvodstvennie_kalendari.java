import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="proizvodstvennie_kalendari")
public class proizvodstvennie_kalendari implements Serializable {

public proizvodstvennie_kalendari(){}

public proizvodstvennie_kalendari(String _guid){ this.guid=UUID.fromString(_guid); }

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
@JoinColumn(name="bazoviy_kalendar", insertable = true, updatable = true)
private proizvodstvennie_kalendari bazoviy_kalendar;

public proizvodstvennie_kalendari getBazoviy_kalendar(){ try{return this.bazoviy_kalendar;}catch(Exception ex){ return null;} }

public void setBazoviy_kalendar( Object _bazoviy_kalendar){if (_bazoviy_kalendar instanceof String){this.bazoviy_kalendar= new proizvodstvennie_kalendari (_bazoviy_kalendar.toString());}else{try{this.bazoviy_kalendar= (proizvodstvennie_kalendari) _bazoviy_kalendar;}catch(Exception ex){Variables.logger.error(ex);this.bazoviy_kalendar= new proizvodstvennie_kalendari (_bazoviy_kalendar.toString());}}}

public UUID getBazoviy_kalendar_uuid(){ try{return this.bazoviy_kalendar.getGuid();}catch(Exception ex){return null;} }

public String getBazoviy_kalendar_type(){ try{return this.bazoviy_kalendar.getClass().getName();}catch(Exception ex){return null;} }

public proizvodstvennie_kalendari getBazoviy_kalendar_obj(){ return this.bazoviy_kalendar; }

public void setBazoviy_kalendar_obj( Object _bazoviy_kalendar){ this.bazoviy_kalendar=(proizvodstvennie_kalendari) _bazoviy_kalendar; }


}
