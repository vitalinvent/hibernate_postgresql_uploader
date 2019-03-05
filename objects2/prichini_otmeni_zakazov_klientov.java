import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="prichini_otmeni_zakazov_klientov")
public class prichini_otmeni_zakazov_klientov implements Serializable {

public prichini_otmeni_zakazov_klientov(){}

public prichini_otmeni_zakazov_klientov(String _guid){ this.guid=UUID.fromString(_guid); }

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



@Column(name="dostupna_dlja_ukazanija_klientom")

private Boolean dostupna_dlja_ukazanija_klientom;
public void setDostupna_dlja_ukazanija_klientom(Boolean _dostupna_dlja_ukazanija_klientom){ this.dostupna_dlja_ukazanija_klientom=_dostupna_dlja_ukazanija_klientom; }

public Boolean getDostupna_dlja_ukazanija_klientom(){ return this.dostupna_dlja_ukazanija_klientom; }



}
