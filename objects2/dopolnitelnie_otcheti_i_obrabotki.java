import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="dopolnitelnie_otcheti_i_obrabotki")
public class dopolnitelnie_otcheti_i_obrabotki implements Serializable {

public dopolnitelnie_otcheti_i_obrabotki(){}

public dopolnitelnie_otcheti_i_obrabotki(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="imja_obyekta", columnDefinition="text")
private String imja_obyekta;

public void setImja_obyekta(String _imja_obyekta){ this.imja_obyekta=_imja_obyekta; }

public String getImja_obyekta(){ return this.imja_obyekta; }



@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="imja_fayla", columnDefinition="text")
private String imja_fayla;

public void setImja_fayla(String _imja_fayla){ this.imja_fayla=_imja_fayla; }

public String getImja_fayla(){ return this.imja_fayla; }


@Column(name="bezopasniy_rezhim")

private Boolean bezopasniy_rezhim;
public void setBezopasniy_rezhim(Boolean _bezopasniy_rezhim){ this.bezopasniy_rezhim=_bezopasniy_rezhim; }

public Boolean getBezopasniy_rezhim(){ return this.bezopasniy_rezhim; }


@Column(name="versija", columnDefinition="text")
private String versija;

public void setVersija(String _versija){ this.versija=_versija; }

public String getVersija(){ return this.versija; }


@Column(name="informatsija", columnDefinition="text")
private String informatsija;

public void setInformatsija(String _informatsija){ this.informatsija=_informatsija; }

public String getInformatsija(){ return this.informatsija; }


@Column(name="ispolzovat_dlja_formi_obyekta")

private Boolean ispolzovat_dlja_formi_obyekta;
public void setIspolzovat_dlja_formi_obyekta(Boolean _ispolzovat_dlja_formi_obyekta){ this.ispolzovat_dlja_formi_obyekta=_ispolzovat_dlja_formi_obyekta; }

public Boolean getIspolzovat_dlja_formi_obyekta(){ return this.ispolzovat_dlja_formi_obyekta; }


@Column(name="ispolzovat_dlja_formi_spiska")

private Boolean ispolzovat_dlja_formi_spiska;
public void setIspolzovat_dlja_formi_spiska(Boolean _ispolzovat_dlja_formi_spiska){ this.ispolzovat_dlja_formi_spiska=_ispolzovat_dlja_formi_spiska; }

public Boolean getIspolzovat_dlja_formi_spiska(){ return this.ispolzovat_dlja_formi_spiska; }


@Column(name="kommentariy", columnDefinition="text")
private String kommentariy;

public void setKommentariy(String _kommentariy){ this.kommentariy=_kommentariy; }

public String getKommentariy(){ return this.kommentariy; }


@Column(name="hranilishche_obrabotki", columnDefinition="text")
private String hranilishche_obrabotki;

public void setHranilishche_obrabotki(String _hranilishche_obrabotki){ this.hranilishche_obrabotki=_hranilishche_obrabotki; }

public String getHranilishche_obrabotki(){ return this.hranilishche_obrabotki; }


@ManyToOne
@JoinColumn(name="otvetstvenniy", insertable = true, updatable = true)
private polzovateli otvetstvenniy;

public polzovateli getOtvetstvenniy(){ try{return this.otvetstvenniy;}catch(Exception ex){ return null;} }

public void setOtvetstvenniy( Object _otvetstvenniy){if (_otvetstvenniy instanceof String){this.otvetstvenniy= new polzovateli (_otvetstvenniy.toString());}else{try{this.otvetstvenniy= (polzovateli) _otvetstvenniy;}catch(Exception ex){Variables.logger.error(ex);this.otvetstvenniy= new polzovateli (_otvetstvenniy.toString());}}}

public UUID getOtvetstvenniy_uuid(){ try{return this.otvetstvenniy.getGuid();}catch(Exception ex){return null;} }

public String getOtvetstvenniy_type(){ try{return this.otvetstvenniy.getClass().getName();}catch(Exception ex){return null;} }

public polzovateli getOtvetstvenniy_obj(){ return this.otvetstvenniy; }

public void setOtvetstvenniy_obj( Object _otvetstvenniy){ this.otvetstvenniy=(polzovateli) _otvetstvenniy; }


@Column(name="tesnaja_integratsija_s_formoy_otcheta")

private Boolean tesnaja_integratsija_s_formoy_otcheta;
public void setTesnaja_integratsija_s_formoy_otcheta(Boolean _tesnaja_integratsija_s_formoy_otcheta){ this.tesnaja_integratsija_s_formoy_otcheta=_tesnaja_integratsija_s_formoy_otcheta; }

public Boolean getTesnaja_integratsija_s_formoy_otcheta(){ return this.tesnaja_integratsija_s_formoy_otcheta; }


@Column(name="hranilishche_nastroek", columnDefinition="text")
private String hranilishche_nastroek;

public void setHranilishche_nastroek(String _hranilishche_nastroek){ this.hranilishche_nastroek=_hranilishche_nastroek; }

public String getHranilishche_nastroek(){ return this.hranilishche_nastroek; }


@Column(name="ispolzuet_hranilishche_variantov")

private Boolean ispolzuet_hranilishche_variantov;
public void setIspolzuet_hranilishche_variantov(Boolean _ispolzuet_hranilishche_variantov){ this.ispolzuet_hranilishche_variantov=_ispolzuet_hranilishche_variantov; }

public Boolean getIspolzuet_hranilishche_variantov(){ return this.ispolzuet_hranilishche_variantov; }


}
