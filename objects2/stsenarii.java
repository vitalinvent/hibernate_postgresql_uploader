import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="stsenarii")
public class stsenarii implements Serializable {

public stsenarii(){}

public stsenarii(String _guid){ this.guid=UUID.fromString(_guid); }

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
@JoinColumn(name="stsenariy_kursov", insertable = true, updatable = true)
private stsenarii stsenariy_kursov;

public stsenarii getStsenariy_kursov(){ try{return this.stsenariy_kursov;}catch(Exception ex){ return null;} }

public void setStsenariy_kursov( Object _stsenariy_kursov){if (_stsenariy_kursov instanceof String){this.stsenariy_kursov= new stsenarii (_stsenariy_kursov.toString());}else{try{this.stsenariy_kursov= (stsenarii) _stsenariy_kursov;}catch(Exception ex){Variables.logger.error(ex);this.stsenariy_kursov= new stsenarii (_stsenariy_kursov.toString());}}}

public UUID getStsenariy_kursov_uuid(){ try{return this.stsenariy_kursov.getGuid();}catch(Exception ex){return null;} }

public String getStsenariy_kursov_type(){ try{return this.stsenariy_kursov.getClass().getName();}catch(Exception ex){return null;} }

public stsenarii getStsenariy_kursov_obj(){ return this.stsenariy_kursov; }

public void setStsenariy_kursov_obj( Object _stsenariy_kursov){ this.stsenariy_kursov=(stsenarii) _stsenariy_kursov; }


@ManyToOne
@JoinColumn(name="valyuta", insertable = true, updatable = true)
private valyuti valyuta;

public valyuti getValyuta(){ try{return this.valyuta;}catch(Exception ex){ return null;} }

public void setValyuta( Object _valyuta){if (_valyuta instanceof String){this.valyuta= new valyuti (_valyuta.toString());}else{try{this.valyuta= (valyuti) _valyuta;}catch(Exception ex){Variables.logger.error(ex);this.valyuta= new valyuti (_valyuta.toString());}}}

public UUID getValyuta_uuid(){ try{return this.valyuta.getGuid();}catch(Exception ex){return null;} }

public String getValyuta_type(){ try{return this.valyuta.getClass().getName();}catch(Exception ex){return null;} }

public valyuti getValyuta_obj(){ return this.valyuta; }

public void setValyuta_obj( Object _valyuta){ this.valyuta=(valyuti) _valyuta; }



@Column(name="ispolzovat_kursi_drugogo_stsenarija")

private Boolean ispolzovat_kursi_drugogo_stsenarija;
public void setIspolzovat_kursi_drugogo_stsenarija(Boolean _ispolzovat_kursi_drugogo_stsenarija){ this.ispolzovat_kursi_drugogo_stsenarija=_ispolzovat_kursi_drugogo_stsenarija; }

public Boolean getIspolzovat_kursi_drugogo_stsenarija(){ return this.ispolzovat_kursi_drugogo_stsenarija; }


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="trebovat_ukazanija_kursov_dlja_kazhdogo_perioda")

private Boolean trebovat_ukazanija_kursov_dlja_kazhdogo_perioda;
public void setTrebovat_ukazanija_kursov_dlja_kazhdogo_perioda(Boolean _trebovat_ukazanija_kursov_dlja_kazhdogo_perioda){ this.trebovat_ukazanija_kursov_dlja_kazhdogo_perioda=_trebovat_ukazanija_kursov_dlja_kazhdogo_perioda; }

public Boolean getTrebovat_ukazanija_kursov_dlja_kazhdogo_perioda(){ return this.trebovat_ukazanija_kursov_dlja_kazhdogo_perioda; }


}
