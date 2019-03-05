import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="skidki_natsenki")
public class skidki_natsenki implements Serializable {

public skidki_natsenki(){}

public skidki_natsenki(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }



@Column(name="vid_tseni", columnDefinition="text")
private String vid_tseni;

public void setVid_tseni(String _vid_tseni){ this.vid_tseni=_vid_tseni; }

public String getVid_tseni(){ return this.vid_tseni; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }


@Column(name="sposob_predostavlenija", columnDefinition="text")
private String sposob_predostavlenija;

public void setSposob_predostavlenija(String _sposob_predostavlenija){ this.sposob_predostavlenija=_sposob_predostavlenija; }

public String getSposob_predostavlenija(){ return this.sposob_predostavlenija; }



@Column(name="valyuta_predostavlenija", columnDefinition="text")
private String valyuta_predostavlenija;

public void setValyuta_predostavlenija(String _valyuta_predostavlenija){ this.valyuta_predostavlenija=_valyuta_predostavlenija; }

public String getValyuta_predostavlenija(){ return this.valyuta_predostavlenija; }


@Column(name="primenjat_umnozhenie_v_ramkah_vishestojashchey_gruppi")

private Boolean primenjat_umnozhenie_v_ramkah_vishestojashchey_gruppi;
public void setPrimenjat_umnozhenie_v_ramkah_vishestojashchey_gruppi(Boolean _primenjat_umnozhenie_v_ramkah_vishestojashchey_gruppi){ this.primenjat_umnozhenie_v_ramkah_vishestojashchey_gruppi=_primenjat_umnozhenie_v_ramkah_vishestojashchey_gruppi; }

public Boolean getPrimenjat_umnozhenie_v_ramkah_vishestojashchey_gruppi(){ return this.primenjat_umnozhenie_v_ramkah_vishestojashchey_gruppi; }


@Column(name="hranilishche_nastroek_komponovki_dannih", columnDefinition="text")
private String hranilishche_nastroek_komponovki_dannih;

public void setHranilishche_nastroek_komponovki_dannih(String _hranilishche_nastroek_komponovki_dannih){ this.hranilishche_nastroek_komponovki_dannih=_hranilishche_nastroek_komponovki_dannih; }

public String getHranilishche_nastroek_komponovki_dannih(){ return this.hranilishche_nastroek_komponovki_dannih; }


@Column(name="znachenie_skidki_natsenki")

private Float znachenie_skidki_natsenki;
public void setZnachenie_skidki_natsenki(Float _znachenie_skidki_natsenki){ this.znachenie_skidki_natsenki=_znachenie_skidki_natsenki; }

public Float getZnachenie_skidki_natsenki(){ return this.znachenie_skidki_natsenki; }


@Column(name="okrugljat_v_bolshuyu_storonu")

private Boolean okrugljat_v_bolshuyu_storonu;
public void setOkrugljat_v_bolshuyu_storonu(Boolean _okrugljat_v_bolshuyu_storonu){ this.okrugljat_v_bolshuyu_storonu=_okrugljat_v_bolshuyu_storonu; }

public Boolean getOkrugljat_v_bolshuyu_storonu(){ return this.okrugljat_v_bolshuyu_storonu; }


@Column(name="upravljaemaja")

private Boolean upravljaemaja;
public void setUpravljaemaja(Boolean _upravljaemaja){ this.upravljaemaja=_upravljaemaja; }

public Boolean getUpravljaemaja(){ return this.upravljaemaja; }


@Column(name="period_deystvija", columnDefinition="text")
private String period_deystvija;

public void setPeriod_deystvija(String _period_deystvija){ this.period_deystvija=_period_deystvija; }

public String getPeriod_deystvija(){ return this.period_deystvija; }


@Column(name="ispolzovat_kratnost")

private Boolean ispolzovat_kratnost;
public void setIspolzovat_kratnost(Boolean _ispolzovat_kratnost){ this.ispolzovat_kratnost=_ispolzovat_kratnost; }

public Boolean getIspolzovat_kratnost(){ return this.ispolzovat_kratnost; }


@Column(name="tekst_soobshchenija", columnDefinition="text")
private String tekst_soobshchenija;

public void setTekst_soobshchenija(String _tekst_soobshchenija){ this.tekst_soobshchenija=_tekst_soobshchenija; }

public String getTekst_soobshchenija(){ return this.tekst_soobshchenija; }


@Column(name="kolichestvo_periodov_deystvija")

private Float kolichestvo_periodov_deystvija;
public void setKolichestvo_periodov_deystvija(Float _kolichestvo_periodov_deystvija){ this.kolichestvo_periodov_deystvija=_kolichestvo_periodov_deystvija; }

public Float getKolichestvo_periodov_deystvija(){ return this.kolichestvo_periodov_deystvija; }


@Column(name="vid_karti_lojalnosti", columnDefinition="text")
private String vid_karti_lojalnosti;

public void setVid_karti_lojalnosti(String _vid_karti_lojalnosti){ this.vid_karti_lojalnosti=_vid_karti_lojalnosti; }

public String getVid_karti_lojalnosti(){ return this.vid_karti_lojalnosti; }


@Column(name="segment_podarkov", columnDefinition="text")
private String segment_podarkov;

public void setSegment_podarkov(String _segment_podarkov){ this.segment_podarkov=_segment_podarkov; }

public String getSegment_podarkov(){ return this.segment_podarkov; }


@Column(name="uslovie_dlja_skidki_kolichestvom")

private Float uslovie_dlja_skidki_kolichestvom;
public void setUslovie_dlja_skidki_kolichestvom(Float _uslovie_dlja_skidki_kolichestvom){ this.uslovie_dlja_skidki_kolichestvom=_uslovie_dlja_skidki_kolichestvom; }

public Float getUslovie_dlja_skidki_kolichestvom(){ return this.uslovie_dlja_skidki_kolichestvom; }


@Column(name="tochnost_okruglenija")

private Float tochnost_okruglenija;
public void setTochnost_okruglenija(Float _tochnost_okruglenija){ this.tochnost_okruglenija=_tochnost_okruglenija; }

public Float getTochnost_okruglenija(){ return this.tochnost_okruglenija; }


@Column(name="kolichestvo_periodov_otsrochki_nachala_deystvija")

private Float kolichestvo_periodov_otsrochki_nachala_deystvija;
public void setKolichestvo_periodov_otsrochki_nachala_deystvija(Float _kolichestvo_periodov_otsrochki_nachala_deystvija){ this.kolichestvo_periodov_otsrochki_nachala_deystvija=_kolichestvo_periodov_otsrochki_nachala_deystvija; }

public Float getKolichestvo_periodov_otsrochki_nachala_deystvija(){ return this.kolichestvo_periodov_otsrochki_nachala_deystvija; }


@Column(name="sposob_primenenija_skidki", columnDefinition="text")
private String sposob_primenenija_skidki;

public void setSposob_primenenija_skidki(String _sposob_primenenija_skidki){ this.sposob_primenenija_skidki=_sposob_primenenija_skidki; }

public String getSposob_primenenija_skidki(){ return this.sposob_primenenija_skidki; }


@Column(name="psihologicheskoe_okruglenie")

private Float psihologicheskoe_okruglenie;
public void setPsihologicheskoe_okruglenie(Float _psihologicheskoe_okruglenie){ this.psihologicheskoe_okruglenie=_psihologicheskoe_okruglenie; }

public Float getPsihologicheskoe_okruglenie(){ return this.psihologicheskoe_okruglenie; }


@Column(name="bonusnaja_programma_lojalnosti", columnDefinition="text")
private String bonusnaja_programma_lojalnosti;

public void setBonusnaja_programma_lojalnosti(String _bonusnaja_programma_lojalnosti){ this.bonusnaja_programma_lojalnosti=_bonusnaja_programma_lojalnosti; }

public String getBonusnaja_programma_lojalnosti(){ return this.bonusnaja_programma_lojalnosti; }


@Column(name="period_otsrochki_nachala_deystvija", columnDefinition="text")
private String period_otsrochki_nachala_deystvija;

public void setPeriod_otsrochki_nachala_deystvija(String _period_otsrochki_nachala_deystvija){ this.period_otsrochki_nachala_deystvija=_period_otsrochki_nachala_deystvija; }

public String getPeriod_otsrochki_nachala_deystvija(){ return this.period_otsrochki_nachala_deystvija; }


@Column(name="segment_nomenklaturi_ogranichenija", columnDefinition="text")
private String segment_nomenklaturi_ogranichenija;

public void setSegment_nomenklaturi_ogranichenija(String _segment_nomenklaturi_ogranichenija){ this.segment_nomenklaturi_ogranichenija=_segment_nomenklaturi_ogranichenija; }

public String getSegment_nomenklaturi_ogranichenija(){ return this.segment_nomenklaturi_ogranichenija; }


@Column(name="variant_otbora_nomenklaturi", columnDefinition="text")
private String variant_otbora_nomenklaturi;

public void setVariant_otbora_nomenklaturi(String _variant_otbora_nomenklaturi){ this.variant_otbora_nomenklaturi=_variant_otbora_nomenklaturi; }

public String getVariant_otbora_nomenklaturi(){ return this.variant_otbora_nomenklaturi; }


@Column(name="parametri_vneshney_obrabotki", columnDefinition="text")
private String parametri_vneshney_obrabotki;

public void setParametri_vneshney_obrabotki(String _parametri_vneshney_obrabotki){ this.parametri_vneshney_obrabotki=_parametri_vneshney_obrabotki; }

public String getParametri_vneshney_obrabotki(){ return this.parametri_vneshney_obrabotki; }


@Column(name="variant_okruglenija", columnDefinition="text")
private String variant_okruglenija;

public void setVariant_okruglenija(String _variant_okruglenija){ this.variant_okruglenija=_variant_okruglenija; }

public String getVariant_okruglenija(){ return this.variant_okruglenija; }


@Column(name="ustanovlen_dopolnitelniy_otbor")

private Boolean ustanovlen_dopolnitelniy_otbor;
public void setUstanovlen_dopolnitelniy_otbor(Boolean _ustanovlen_dopolnitelniy_otbor){ this.ustanovlen_dopolnitelniy_otbor=_ustanovlen_dopolnitelniy_otbor; }

public Boolean getUstanovlen_dopolnitelniy_otbor(){ return this.ustanovlen_dopolnitelniy_otbor; }


@Column(name="uchitivat_harakteristiki")

private Boolean uchitivat_harakteristiki;
public void setUchitivat_harakteristiki(Boolean _uchitivat_harakteristiki){ this.uchitivat_harakteristiki=_uchitivat_harakteristiki; }

public Boolean getUchitivat_harakteristiki(){ return this.uchitivat_harakteristiki; }


}
