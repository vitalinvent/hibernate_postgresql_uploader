import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="vidi_ispolzovanija_rabochego_vremeni")
public class vidi_ispolzovanija_rabochego_vremeni implements Serializable {

public vidi_ispolzovanija_rabochego_vremeni(){}

public vidi_ispolzovanija_rabochego_vremeni(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="bukvenniy_kod_byudzhetniy", columnDefinition="text")
private String bukvenniy_kod_byudzhetniy;

public void setBukvenniy_kod_byudzhetniy(String _bukvenniy_kod_byudzhetniy){ this.bukvenniy_kod_byudzhetniy=_bukvenniy_kod_byudzhetniy; }

public String getBukvenniy_kod_byudzhetniy(){ return this.bukvenniy_kod_byudzhetniy; }


@Column(name="udalit_identifikator_obyekta", columnDefinition="text")
private String udalit_identifikator_obyekta;

public void setUdalit_identifikator_obyekta(String _udalit_identifikator_obyekta){ this.udalit_identifikator_obyekta=_udalit_identifikator_obyekta; }

public String getUdalit_identifikator_obyekta(){ return this.udalit_identifikator_obyekta; }


@Column(name="ne_ispolzuetsja")

private Boolean ne_ispolzuetsja;
public void setNe_ispolzuetsja(Boolean _ne_ispolzuetsja){ this.ne_ispolzuetsja=_ne_ispolzuetsja; }

public Boolean getNe_ispolzuetsja(){ return this.ne_ispolzuetsja; }


@Column(name="tsifrovoy_kod", columnDefinition="text")
private String tsifrovoy_kod;

public void setTsifrovoy_kod(String _tsifrovoy_kod){ this.tsifrovoy_kod=_tsifrovoy_kod; }

public String getTsifrovoy_kod(){ return this.tsifrovoy_kod; }



@Column(name="polnoe_naimenovanie", columnDefinition="text")
private String polnoe_naimenovanie;

public void setPolnoe_naimenovanie(String _polnoe_naimenovanie){ this.polnoe_naimenovanie=_polnoe_naimenovanie; }

public String getPolnoe_naimenovanie(){ return this.polnoe_naimenovanie; }



@Column(name="bukvenniy_kod", columnDefinition="text")
private String bukvenniy_kod;

public void setBukvenniy_kod(String _bukvenniy_kod){ this.bukvenniy_kod=_bukvenniy_kod; }

public String getBukvenniy_kod(){ return this.bukvenniy_kod; }


@Column(name="bukvenniy_kod_byudzhetniy2009", columnDefinition="text")
private String bukvenniy_kod_byudzhetniy2009;

public void setBukvenniy_kod_byudzhetniy2009(String _bukvenniy_kod_byudzhetniy2009){ this.bukvenniy_kod_byudzhetniy2009=_bukvenniy_kod_byudzhetniy2009; }

public String getBukvenniy_kod_byudzhetniy2009(){ return this.bukvenniy_kod_byudzhetniy2009; }


@Column(name="rabochee_vremja")

private Boolean rabochee_vremja;
public void setRabochee_vremja(Boolean _rabochee_vremja){ this.rabochee_vremja=_rabochee_vremja; }

public Boolean getRabochee_vremja(){ return this.rabochee_vremja; }


@ManyToOne
@JoinColumn(name="osnovnoe_vremja", insertable = true, updatable = true)
private vidi_ispolzovanija_rabochego_vremeni osnovnoe_vremja;

public vidi_ispolzovanija_rabochego_vremeni getOsnovnoe_vremja(){ try{return this.osnovnoe_vremja;}catch(Exception ex){ return null;} }

public void setOsnovnoe_vremja( Object _osnovnoe_vremja){if (_osnovnoe_vremja instanceof String){this.osnovnoe_vremja= new vidi_ispolzovanija_rabochego_vremeni (_osnovnoe_vremja.toString());}else{try{this.osnovnoe_vremja= (vidi_ispolzovanija_rabochego_vremeni) _osnovnoe_vremja;}catch(Exception ex){Variables.logger.error(ex);this.osnovnoe_vremja= new vidi_ispolzovanija_rabochego_vremeni (_osnovnoe_vremja.toString());}}}

public UUID getOsnovnoe_vremja_uuid(){ try{return this.osnovnoe_vremja.getGuid();}catch(Exception ex){return null;} }

public String getOsnovnoe_vremja_type(){ try{return this.osnovnoe_vremja.getClass().getName();}catch(Exception ex){return null;} }

public vidi_ispolzovanija_rabochego_vremeni getOsnovnoe_vremja_obj(){ return this.osnovnoe_vremja; }

public void setOsnovnoe_vremja_obj( Object _osnovnoe_vremja){ this.osnovnoe_vremja=(vidi_ispolzovanija_rabochego_vremeni) _osnovnoe_vremja; }


@Column(name="tselosmennoe")

private Boolean tselosmennoe;
public void setTselosmennoe(Boolean _tselosmennoe){ this.tselosmennoe=_tselosmennoe; }

public Boolean getTselosmennoe(){ return this.tselosmennoe; }


}
