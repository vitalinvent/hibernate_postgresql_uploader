import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="marshruti_podpisanija")
public class marshruti_podpisanija implements Serializable {

public marshruti_podpisanija(){}

public marshruti_podpisanija(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="klyuch_avtomaticheskoy_nastroyki", columnDefinition="text")
private String klyuch_avtomaticheskoy_nastroyki;

public void setKlyuch_avtomaticheskoy_nastroyki(String _klyuch_avtomaticheskoy_nastroyki){ this.klyuch_avtomaticheskoy_nastroyki=_klyuch_avtomaticheskoy_nastroyki; }

public String getKlyuch_avtomaticheskoy_nastroyki(){ return this.klyuch_avtomaticheskoy_nastroyki; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@ManyToOne
@JoinColumn(name="organizatsija", insertable = true, updatable = true)
private organizatsii organizatsija;

public organizatsii getOrganizatsija(){ try{return this.organizatsija;}catch(Exception ex){ return null;} }

public void setOrganizatsija( Object _organizatsija){if (_organizatsija instanceof String){this.organizatsija= new organizatsii (_organizatsija.toString());}else{try{this.organizatsija= (organizatsii) _organizatsija;}catch(Exception ex){Variables.logger.error(ex);this.organizatsija= new organizatsii (_organizatsija.toString());}}}

public UUID getOrganizatsija_uuid(){ try{return this.organizatsija.getGuid();}catch(Exception ex){return null;} }

public String getOrganizatsija_type(){ try{return this.organizatsija.getClass().getName();}catch(Exception ex){return null;} }

public organizatsii getOrganizatsija_obj(){ return this.organizatsija; }

public void setOrganizatsija_obj( Object _organizatsija){ this.organizatsija=(organizatsii) _organizatsija; }


}
