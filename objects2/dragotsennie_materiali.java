import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="dragotsennie_materiali")
public class dragotsennie_materiali implements Serializable {

public dragotsennie_materiali(){}

public dragotsennie_materiali(String _guid){ this.guid=UUID.fromString(_guid); }

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
@JoinColumn(name="edinitsa_izmerenija", insertable = true, updatable = true)
private upakovki_edinitsi_izmerenija edinitsa_izmerenija;

public upakovki_edinitsi_izmerenija getEdinitsa_izmerenija(){ try{return this.edinitsa_izmerenija;}catch(Exception ex){ return null;} }

public void setEdinitsa_izmerenija( Object _edinitsa_izmerenija){if (_edinitsa_izmerenija instanceof String){this.edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_edinitsa_izmerenija.toString());}else{try{this.edinitsa_izmerenija= (upakovki_edinitsi_izmerenija) _edinitsa_izmerenija;}catch(Exception ex){Variables.logger.error(ex);this.edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_edinitsa_izmerenija.toString());}}}

public UUID getEdinitsa_izmerenija_uuid(){ try{return this.edinitsa_izmerenija.getGuid();}catch(Exception ex){return null;} }

public String getEdinitsa_izmerenija_type(){ try{return this.edinitsa_izmerenija.getClass().getName();}catch(Exception ex){return null;} }

public upakovki_edinitsi_izmerenija getEdinitsa_izmerenija_obj(){ return this.edinitsa_izmerenija; }

public void setEdinitsa_izmerenija_obj( Object _edinitsa_izmerenija){ this.edinitsa_izmerenija=(upakovki_edinitsi_izmerenija) _edinitsa_izmerenija; }



}
