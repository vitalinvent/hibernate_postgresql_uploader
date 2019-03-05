import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="pokazateli_rascheta_zarplati")
public class pokazateli_rascheta_zarplati implements Serializable {

public pokazateli_rascheta_zarplati(){}

public pokazateli_rascheta_zarplati(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="znachenie_rasschitivaetsja_avtomaticheski")

private Boolean znachenie_rasschitivaetsja_avtomaticheski;
public void setZnachenie_rasschitivaetsja_avtomaticheski(Boolean _znachenie_rasschitivaetsja_avtomaticheski){ this.znachenie_rasschitivaetsja_avtomaticheski=_znachenie_rasschitivaetsja_avtomaticheski; }

public Boolean getZnachenie_rasschitivaetsja_avtomaticheski(){ return this.znachenie_rasschitivaetsja_avtomaticheski; }


@Column(name="ne_ispolzuetsja")

private Boolean ne_ispolzuetsja;
public void setNe_ispolzuetsja(Boolean _ne_ispolzuetsja){ this.ne_ispolzuetsja=_ne_ispolzuetsja; }

public Boolean getNe_ispolzuetsja(){ return this.ne_ispolzuetsja; }



@Column(name="periodicheskiy_pokazatel_sotrudnika")

private Boolean periodicheskiy_pokazatel_sotrudnika;
public void setPeriodicheskiy_pokazatel_sotrudnika(Boolean _periodicheskiy_pokazatel_sotrudnika){ this.periodicheskiy_pokazatel_sotrudnika=_periodicheskiy_pokazatel_sotrudnika; }

public Boolean getPeriodicheskiy_pokazatel_sotrudnika(){ return this.periodicheskiy_pokazatel_sotrudnika; }


@Column(name="tochnost")

private Float tochnost;
public void setTochnost(Float _tochnost){ this.tochnost=_tochnost; }

public Float getTochnost(){ return this.tochnost; }



@Column(name="razoviy_pokazatel_organizatsii")

private Boolean razoviy_pokazatel_organizatsii;
public void setRazoviy_pokazatel_organizatsii(Boolean _razoviy_pokazatel_organizatsii){ this.razoviy_pokazatel_organizatsii=_razoviy_pokazatel_organizatsii; }

public Boolean getRazoviy_pokazatel_organizatsii(){ return this.razoviy_pokazatel_organizatsii; }


@Column(name="kratkoe_naimenovanie", columnDefinition="text")
private String kratkoe_naimenovanie;

public void setKratkoe_naimenovanie(String _kratkoe_naimenovanie){ this.kratkoe_naimenovanie=_kratkoe_naimenovanie; }

public String getKratkoe_naimenovanie(){ return this.kratkoe_naimenovanie; }


@Column(name="identifikator_sluzhebniy", columnDefinition="text")
private String identifikator_sluzhebniy;

public void setIdentifikator_sluzhebniy(String _identifikator_sluzhebniy){ this.identifikator_sluzhebniy=_identifikator_sluzhebniy; }

public String getIdentifikator_sluzhebniy(){ return this.identifikator_sluzhebniy; }


@Column(name="identifikator", columnDefinition="text")
private String identifikator;

public void setIdentifikator(String _identifikator){ this.identifikator=_identifikator; }

public String getIdentifikator(){ return this.identifikator; }


@ManyToOne
@JoinColumn(name="vid_stazha", insertable = true, updatable = true)
private vidi_stazha vid_stazha;

public vidi_stazha getVid_stazha(){ try{return this.vid_stazha;}catch(Exception ex){ return null;} }

public void setVid_stazha( Object _vid_stazha){if (_vid_stazha instanceof String){this.vid_stazha= new vidi_stazha (_vid_stazha.toString());}else{try{this.vid_stazha= (vidi_stazha) _vid_stazha;}catch(Exception ex){Variables.logger.error(ex);this.vid_stazha= new vidi_stazha (_vid_stazha.toString());}}}

public UUID getVid_stazha_uuid(){ try{return this.vid_stazha.getGuid();}catch(Exception ex){return null;} }

public String getVid_stazha_type(){ try{return this.vid_stazha.getClass().getName();}catch(Exception ex){return null;} }

public vidi_stazha getVid_stazha_obj(){ return this.vid_stazha; }

public void setVid_stazha_obj( Object _vid_stazha){ this.vid_stazha=(vidi_stazha) _vid_stazha; }


@Column(name="otobrazhat_v_dokumentah_nachislenija")

private Boolean otobrazhat_v_dokumentah_nachislenija;
public void setOtobrazhat_v_dokumentah_nachislenija(Boolean _otobrazhat_v_dokumentah_nachislenija){ this.otobrazhat_v_dokumentah_nachislenija=_otobrazhat_v_dokumentah_nachislenija; }

public Boolean getOtobrazhat_v_dokumentah_nachislenija(){ return this.otobrazhat_v_dokumentah_nachislenija; }


@ManyToOne
@JoinColumn(name="bazoviy_pokazatel", insertable = true, updatable = true)
private pokazateli_rascheta_zarplati bazoviy_pokazatel;

public pokazateli_rascheta_zarplati getBazoviy_pokazatel(){ try{return this.bazoviy_pokazatel;}catch(Exception ex){ return null;} }

public void setBazoviy_pokazatel( Object _bazoviy_pokazatel){if (_bazoviy_pokazatel instanceof String){this.bazoviy_pokazatel= new pokazateli_rascheta_zarplati (_bazoviy_pokazatel.toString());}else{try{this.bazoviy_pokazatel= (pokazateli_rascheta_zarplati) _bazoviy_pokazatel;}catch(Exception ex){Variables.logger.error(ex);this.bazoviy_pokazatel= new pokazateli_rascheta_zarplati (_bazoviy_pokazatel.toString());}}}

public UUID getBazoviy_pokazatel_uuid(){ try{return this.bazoviy_pokazatel.getGuid();}catch(Exception ex){return null;} }

public String getBazoviy_pokazatel_type(){ try{return this.bazoviy_pokazatel.getClass().getName();}catch(Exception ex){return null;} }

public pokazateli_rascheta_zarplati getBazoviy_pokazatel_obj(){ return this.bazoviy_pokazatel; }

public void setBazoviy_pokazatel_obj( Object _bazoviy_pokazatel){ this.bazoviy_pokazatel=(pokazateli_rascheta_zarplati) _bazoviy_pokazatel; }


@Column(name="periodicheskiy_pokazatel_podrazdelenija")

private Boolean periodicheskiy_pokazatel_podrazdelenija;
public void setPeriodicheskiy_pokazatel_podrazdelenija(Boolean _periodicheskiy_pokazatel_podrazdelenija){ this.periodicheskiy_pokazatel_podrazdelenija=_periodicheskiy_pokazatel_podrazdelenija; }

public Boolean getPeriodicheskiy_pokazatel_podrazdelenija(){ return this.periodicheskiy_pokazatel_podrazdelenija; }


@Column(name="udalit_identifikator_obyekta", columnDefinition="text")
private String udalit_identifikator_obyekta;

public void setUdalit_identifikator_obyekta(String _udalit_identifikator_obyekta){ this.udalit_identifikator_obyekta=_udalit_identifikator_obyekta; }

public String getUdalit_identifikator_obyekta(){ return this.udalit_identifikator_obyekta; }


@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }


@Column(name="dopuskaetsja_nulevoe_znachenie")

private Boolean dopuskaetsja_nulevoe_znachenie;
public void setDopuskaetsja_nulevoe_znachenie(Boolean _dopuskaetsja_nulevoe_znachenie){ this.dopuskaetsja_nulevoe_znachenie=_dopuskaetsja_nulevoe_znachenie; }

public Boolean getDopuskaetsja_nulevoe_znachenie(){ return this.dopuskaetsja_nulevoe_znachenie; }


@Column(name="periodicheskiy_pokazatel_organizatsii")

private Boolean periodicheskiy_pokazatel_organizatsii;
public void setPeriodicheskiy_pokazatel_organizatsii(Boolean _periodicheskiy_pokazatel_organizatsii){ this.periodicheskiy_pokazatel_organizatsii=_periodicheskiy_pokazatel_organizatsii; }

public Boolean getPeriodicheskiy_pokazatel_organizatsii(){ return this.periodicheskiy_pokazatel_organizatsii; }


@Column(name="razoviy_pokazatel_sotrudnika")

private Boolean razoviy_pokazatel_sotrudnika;
public void setRazoviy_pokazatel_sotrudnika(Boolean _razoviy_pokazatel_sotrudnika){ this.razoviy_pokazatel_sotrudnika=_razoviy_pokazatel_sotrudnika; }

public Boolean getRazoviy_pokazatel_sotrudnika(){ return this.razoviy_pokazatel_sotrudnika; }


@Column(name="razoviy_pokazatel_podrazdelenija")

private Boolean razoviy_pokazatel_podrazdelenija;
public void setRazoviy_pokazatel_podrazdelenija(Boolean _razoviy_pokazatel_podrazdelenija){ this.razoviy_pokazatel_podrazdelenija=_razoviy_pokazatel_podrazdelenija; }

public Boolean getRazoviy_pokazatel_podrazdelenija(){ return this.razoviy_pokazatel_podrazdelenija; }


@Column(name="operativniy_pokazatel_sotrudnika")

private Boolean operativniy_pokazatel_sotrudnika;
public void setOperativniy_pokazatel_sotrudnika(Boolean _operativniy_pokazatel_sotrudnika){ this.operativniy_pokazatel_sotrudnika=_operativniy_pokazatel_sotrudnika; }

public Boolean getOperativniy_pokazatel_sotrudnika(){ return this.operativniy_pokazatel_sotrudnika; }


@Column(name="operativniy_pokazatel_organizatsii")

private Boolean operativniy_pokazatel_organizatsii;
public void setOperativniy_pokazatel_organizatsii(Boolean _operativniy_pokazatel_organizatsii){ this.operativniy_pokazatel_organizatsii=_operativniy_pokazatel_organizatsii; }

public Boolean getOperativniy_pokazatel_organizatsii(){ return this.operativniy_pokazatel_organizatsii; }


@Column(name="operativniy_pokazatel_podrazdelenija")

private Boolean operativniy_pokazatel_podrazdelenija;
public void setOperativniy_pokazatel_podrazdelenija(Boolean _operativniy_pokazatel_podrazdelenija){ this.operativniy_pokazatel_podrazdelenija=_operativniy_pokazatel_podrazdelenija; }

public Boolean getOperativniy_pokazatel_podrazdelenija(){ return this.operativniy_pokazatel_podrazdelenija; }


}
