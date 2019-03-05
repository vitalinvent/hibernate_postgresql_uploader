import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="osnovanija_zaklyuchenija_srochnih_trudovih_dogovorov")
public class osnovanija_zaklyuchenija_srochnih_trudovih_dogovorov implements Serializable {

public osnovanija_zaklyuchenija_srochnih_trudovih_dogovorov(){}

public osnovanija_zaklyuchenija_srochnih_trudovih_dogovorov(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="tekst_osnovanija", columnDefinition="text")
private String tekst_osnovanija;

public void setTekst_osnovanija(String _tekst_osnovanija){ this.tekst_osnovanija=_tekst_osnovanija; }

public String getTekst_osnovanija(){ return this.tekst_osnovanija; }




}
