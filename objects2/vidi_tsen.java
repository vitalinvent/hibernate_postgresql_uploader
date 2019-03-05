import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="vidi_tsen")
public class vidi_tsen implements Serializable {

public vidi_tsen(){}

public vidi_tsen(String _guid){ this.guid=UUID.fromString(_guid); }

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
@JoinColumn(name="valyuta_tseni", insertable = true, updatable = true)
private valyuti valyuta_tseni;

public valyuti getValyuta_tseni(){ try{return this.valyuta_tseni;}catch(Exception ex){ return null;} }

public void setValyuta_tseni( Object _valyuta_tseni){if (_valyuta_tseni instanceof String){this.valyuta_tseni= new valyuti (_valyuta_tseni.toString());}else{try{this.valyuta_tseni= (valyuti) _valyuta_tseni;}catch(Exception ex){Variables.logger.error(ex);this.valyuta_tseni= new valyuti (_valyuta_tseni.toString());}}}

public UUID getValyuta_tseni_uuid(){ try{return this.valyuta_tseni.getGuid();}catch(Exception ex){return null;} }

public String getValyuta_tseni_type(){ try{return this.valyuta_tseni.getClass().getName();}catch(Exception ex){return null;} }

public valyuti getValyuta_tseni_obj(){ return this.valyuta_tseni; }

public void setValyuta_tseni_obj( Object _valyuta_tseni){ this.valyuta_tseni=(valyuti) _valyuta_tseni; }



@Column(name="tsena_vklyuchaet_n_d_s")

private Boolean tsena_vklyuchaet_n_d_s;
public void setTsena_vklyuchaet_n_d_s(Boolean _tsena_vklyuchaet_n_d_s){ this.tsena_vklyuchaet_n_d_s=_tsena_vklyuchaet_n_d_s; }

public Boolean getTsena_vklyuchaet_n_d_s(){ return this.tsena_vklyuchaet_n_d_s; }


@Column(name="ispolzovat_pri_prodazhe")

private Boolean ispolzovat_pri_prodazhe;
public void setIspolzovat_pri_prodazhe(Boolean _ispolzovat_pri_prodazhe){ this.ispolzovat_pri_prodazhe=_ispolzovat_pri_prodazhe; }

public Boolean getIspolzovat_pri_prodazhe(){ return this.ispolzovat_pri_prodazhe; }


@ManyToOne
@JoinColumn(name="bazoviy_vid_tseni", insertable = true, updatable = true)
private vidi_tsen bazoviy_vid_tseni;

public vidi_tsen getBazoviy_vid_tseni(){ try{return this.bazoviy_vid_tseni;}catch(Exception ex){ return null;} }

public void setBazoviy_vid_tseni( Object _bazoviy_vid_tseni){if (_bazoviy_vid_tseni instanceof String){this.bazoviy_vid_tseni= new vidi_tsen (_bazoviy_vid_tseni.toString());}else{try{this.bazoviy_vid_tseni= (vidi_tsen) _bazoviy_vid_tseni;}catch(Exception ex){Variables.logger.error(ex);this.bazoviy_vid_tseni= new vidi_tsen (_bazoviy_vid_tseni.toString());}}}

public UUID getBazoviy_vid_tseni_uuid(){ try{return this.bazoviy_vid_tseni.getGuid();}catch(Exception ex){return null;} }

public String getBazoviy_vid_tseni_type(){ try{return this.bazoviy_vid_tseni.getClass().getName();}catch(Exception ex){return null;} }

public vidi_tsen getBazoviy_vid_tseni_obj(){ return this.bazoviy_vid_tseni; }

public void setBazoviy_vid_tseni_obj( Object _bazoviy_vid_tseni){ this.bazoviy_vid_tseni=(vidi_tsen) _bazoviy_vid_tseni; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="ispolzovat_pri_peredache_mezhdu_organizatsijami")

private Boolean ispolzovat_pri_peredache_mezhdu_organizatsijami;
public void setIspolzovat_pri_peredache_mezhdu_organizatsijami(Boolean _ispolzovat_pri_peredache_mezhdu_organizatsijami){ this.ispolzovat_pri_peredache_mezhdu_organizatsijami=_ispolzovat_pri_peredache_mezhdu_organizatsijami; }

public Boolean getIspolzovat_pri_peredache_mezhdu_organizatsijami(){ return this.ispolzovat_pri_peredache_mezhdu_organizatsijami; }


@Column(name="ispolzovat_pri_vipuske_produktsii")

private Boolean ispolzovat_pri_vipuske_produktsii;
public void setIspolzovat_pri_vipuske_produktsii(Boolean _ispolzovat_pri_vipuske_produktsii){ this.ispolzovat_pri_vipuske_produktsii=_ispolzovat_pri_vipuske_produktsii; }

public Boolean getIspolzovat_pri_vipuske_produktsii(){ return this.ispolzovat_pri_vipuske_produktsii; }


@Column(name="formula", columnDefinition="text")
private String formula;

public void setFormula(String _formula){ this.formula=_formula; }

public String getFormula(){ return this.formula; }


@Column(name="okrugljat_v_bolshuyu_storonu")

private Boolean okrugljat_v_bolshuyu_storonu;
public void setOkrugljat_v_bolshuyu_storonu(Boolean _okrugljat_v_bolshuyu_storonu){ this.okrugljat_v_bolshuyu_storonu=_okrugljat_v_bolshuyu_storonu; }

public Boolean getOkrugljat_v_bolshuyu_storonu(){ return this.okrugljat_v_bolshuyu_storonu; }


@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }


@Column(name="identifikator", columnDefinition="text")
private String identifikator;

public void setIdentifikator(String _identifikator){ this.identifikator=_identifikator; }

public String getIdentifikator(){ return this.identifikator; }


@Column(name="natsenka")

private Float natsenka;
public void setNatsenka(Float _natsenka){ this.natsenka=_natsenka; }

public Float getNatsenka(){ return this.natsenka; }


@Column(name="porog_srabativanija")

private Float porog_srabativanija;
public void setPorog_srabativanija(Float _porog_srabativanija){ this.porog_srabativanija=_porog_srabativanija; }

public Float getPorog_srabativanija(){ return this.porog_srabativanija; }


@Column(name="shema_komponovki_dannih", columnDefinition="text")
private String shema_komponovki_dannih;

public void setShema_komponovki_dannih(String _shema_komponovki_dannih){ this.shema_komponovki_dannih=_shema_komponovki_dannih; }

public String getShema_komponovki_dannih(){ return this.shema_komponovki_dannih; }


@Column(name="hranilishche_shemi_komponovki_dannih", columnDefinition="text")
private String hranilishche_shemi_komponovki_dannih;

public void setHranilishche_shemi_komponovki_dannih(String _hranilishche_shemi_komponovki_dannih){ this.hranilishche_shemi_komponovki_dannih=_hranilishche_shemi_komponovki_dannih; }

public String getHranilishche_shemi_komponovki_dannih(){ return this.hranilishche_shemi_komponovki_dannih; }


@Column(name="hranilishche_nastroek_komponovki_dannih", columnDefinition="text")
private String hranilishche_nastroek_komponovki_dannih;

public void setHranilishche_nastroek_komponovki_dannih(String _hranilishche_nastroek_komponovki_dannih){ this.hranilishche_nastroek_komponovki_dannih=_hranilishche_nastroek_komponovki_dannih; }

public String getHranilishche_nastroek_komponovki_dannih(){ return this.hranilishche_nastroek_komponovki_dannih; }


@Column(name="tochnost_okruglenija")

private Float tochnost_okruglenija;
public void setTochnost_okruglenija(Float _tochnost_okruglenija){ this.tochnost_okruglenija=_tochnost_okruglenija; }

public Float getTochnost_okruglenija(){ return this.tochnost_okruglenija; }


@Column(name="okrugljat")

private Boolean okrugljat;
public void setOkrugljat(Boolean _okrugljat){ this.okrugljat=_okrugljat; }

public Boolean getOkrugljat(){ return this.okrugljat; }


@Column(name="ustanavlivat_tsenu_pri_vvode_na_osnovanii")

private Boolean ustanavlivat_tsenu_pri_vvode_na_osnovanii;
public void setUstanavlivat_tsenu_pri_vvode_na_osnovanii(Boolean _ustanavlivat_tsenu_pri_vvode_na_osnovanii){ this.ustanavlivat_tsenu_pri_vvode_na_osnovanii=_ustanavlivat_tsenu_pri_vvode_na_osnovanii; }

public Boolean getUstanavlivat_tsenu_pri_vvode_na_osnovanii(){ return this.ustanavlivat_tsenu_pri_vvode_na_osnovanii; }


@Column(name="ispolzovat_pri_peredache_produktsii_davaltsu")

private Boolean ispolzovat_pri_peredache_produktsii_davaltsu;
public void setIspolzovat_pri_peredache_produktsii_davaltsu(Boolean _ispolzovat_pri_peredache_produktsii_davaltsu){ this.ispolzovat_pri_peredache_produktsii_davaltsu=_ispolzovat_pri_peredache_produktsii_davaltsu; }

public Boolean getIspolzovat_pri_peredache_produktsii_davaltsu(){ return this.ispolzovat_pri_peredache_produktsii_davaltsu; }


}
