import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="stati_dvizhenija_denezhnih_sredstv")
public class stati_dvizhenija_denezhnih_sredstv implements Serializable {

public stati_dvizhenija_denezhnih_sredstv(){}

public stati_dvizhenija_denezhnih_sredstv(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="korrespondiruyushchiy_schet", columnDefinition="text")
private String korrespondiruyushchiy_schet;

public void setKorrespondiruyushchiy_schet(String _korrespondiruyushchiy_schet){ this.korrespondiruyushchiy_schet=_korrespondiruyushchiy_schet; }

public String getKorrespondiruyushchiy_schet(){ return this.korrespondiruyushchiy_schet; }


@ManyToOne
@JoinColumn(name="prioritet_oplati", insertable = true, updatable = true)
private prioriteti_oplati prioritet_oplati;

public prioriteti_oplati getPrioritet_oplati(){ try{return this.prioritet_oplati;}catch(Exception ex){ return null;} }

public void setPrioritet_oplati( Object _prioritet_oplati){if (_prioritet_oplati instanceof String){this.prioritet_oplati= new prioriteti_oplati (_prioritet_oplati.toString());}else{try{this.prioritet_oplati= (prioriteti_oplati) _prioritet_oplati;}catch(Exception ex){Variables.logger.error(ex);this.prioritet_oplati= new prioriteti_oplati (_prioritet_oplati.toString());}}}

public UUID getPrioritet_oplati_uuid(){ try{return this.prioritet_oplati.getGuid();}catch(Exception ex){return null;} }

public String getPrioritet_oplati_type(){ try{return this.prioritet_oplati.getClass().getName();}catch(Exception ex){return null;} }

public prioriteti_oplati getPrioritet_oplati_obj(){ return this.prioritet_oplati; }

public void setPrioritet_oplati_obj( Object _prioritet_oplati){ this.prioritet_oplati=(prioriteti_oplati) _prioritet_oplati; }


}
