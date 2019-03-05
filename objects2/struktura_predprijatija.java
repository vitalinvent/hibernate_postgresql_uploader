import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="struktura_predprijatija")
public class struktura_predprijatija implements Serializable {

public struktura_predprijatija(){}

public struktura_predprijatija(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="zapolnenie_dostupnosti_dlja_raspisanija_r_ts_kolichestvo_intervalov")

private Float zapolnenie_dostupnosti_dlja_raspisanija_r_ts_kolichestvo_intervalov;
public void setZapolnenie_dostupnosti_dlja_raspisanija_r_ts_kolichestvo_intervalov(Float _zapolnenie_dostupnosti_dlja_raspisanija_r_ts_kolichestvo_intervalov){ this.zapolnenie_dostupnosti_dlja_raspisanija_r_ts_kolichestvo_intervalov=_zapolnenie_dostupnosti_dlja_raspisanija_r_ts_kolichestvo_intervalov; }

public Float getZapolnenie_dostupnosti_dlja_raspisanija_r_ts_kolichestvo_intervalov(){ return this.zapolnenie_dostupnosti_dlja_raspisanija_r_ts_kolichestvo_intervalov; }


@Column(name="vremja_na_registratsiyu_vipolnenija")

private Float vremja_na_registratsiyu_vipolnenija;
public void setVremja_na_registratsiyu_vipolnenija(Float _vremja_na_registratsiyu_vipolnenija){ this.vremja_na_registratsiyu_vipolnenija=_vremja_na_registratsiyu_vipolnenija; }

public Float getVremja_na_registratsiyu_vipolnenija(){ return this.vremja_na_registratsiyu_vipolnenija; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="sootvetstvuet_strukture_yuridicheskih_lits")

private Boolean sootvetstvuet_strukture_yuridicheskih_lits;
public void setSootvetstvuet_strukture_yuridicheskih_lits(Boolean _sootvetstvuet_strukture_yuridicheskih_lits){ this.sootvetstvuet_strukture_yuridicheskih_lits=_sootvetstvuet_strukture_yuridicheskih_lits; }

public Boolean getSootvetstvuet_strukture_yuridicheskih_lits(){ return this.sootvetstvuet_strukture_yuridicheskih_lits; }


@ManyToOne
@JoinColumn(name="grafik_raboti", insertable = true, updatable = true)
private kalendari grafik_raboti;

public kalendari getGrafik_raboti(){ try{return this.grafik_raboti;}catch(Exception ex){ return null;} }

public void setGrafik_raboti( Object _grafik_raboti){if (_grafik_raboti instanceof String){this.grafik_raboti= new kalendari (_grafik_raboti.toString());}else{try{this.grafik_raboti= (kalendari) _grafik_raboti;}catch(Exception ex){Variables.logger.error(ex);this.grafik_raboti= new kalendari (_grafik_raboti.toString());}}}

public UUID getGrafik_raboti_uuid(){ try{return this.grafik_raboti.getGuid();}catch(Exception ex){return null;} }

public String getGrafik_raboti_type(){ try{return this.grafik_raboti.getClass().getName();}catch(Exception ex){return null;} }

public kalendari getGrafik_raboti_obj(){ return this.grafik_raboti; }

public void setGrafik_raboti_obj( Object _grafik_raboti){ this.grafik_raboti=(kalendari) _grafik_raboti; }



@ManyToOne
@JoinColumn(name="tekushchiy_rukovoditel", insertable = true, updatable = true)
private fizicheskie_litsa tekushchiy_rukovoditel;

public fizicheskie_litsa getTekushchiy_rukovoditel(){ try{return this.tekushchiy_rukovoditel;}catch(Exception ex){ return null;} }

public void setTekushchiy_rukovoditel( Object _tekushchiy_rukovoditel){if (_tekushchiy_rukovoditel instanceof String){this.tekushchiy_rukovoditel= new fizicheskie_litsa (_tekushchiy_rukovoditel.toString());}else{try{this.tekushchiy_rukovoditel= (fizicheskie_litsa) _tekushchiy_rukovoditel;}catch(Exception ex){Variables.logger.error(ex);this.tekushchiy_rukovoditel= new fizicheskie_litsa (_tekushchiy_rukovoditel.toString());}}}

public UUID getTekushchiy_rukovoditel_uuid(){ try{return this.tekushchiy_rukovoditel.getGuid();}catch(Exception ex){return null;} }

public String getTekushchiy_rukovoditel_type(){ try{return this.tekushchiy_rukovoditel.getClass().getName();}catch(Exception ex){return null;} }

public fizicheskie_litsa getTekushchiy_rukovoditel_obj(){ return this.tekushchiy_rukovoditel; }

public void setTekushchiy_rukovoditel_obj( Object _tekushchiy_rukovoditel){ this.tekushchiy_rukovoditel=(fizicheskie_litsa) _tekushchiy_rukovoditel; }


@Column(name="sposob_pooperatsionnogo_upravlenija", columnDefinition="text")
private String sposob_pooperatsionnogo_upravlenija;

public void setSposob_pooperatsionnogo_upravlenija(String _sposob_pooperatsionnogo_upravlenija){ this.sposob_pooperatsionnogo_upravlenija=_sposob_pooperatsionnogo_upravlenija; }

public String getSposob_pooperatsionnogo_upravlenija(){ return this.sposob_pooperatsionnogo_upravlenija; }


@Column(name="proizvodstvennoe_podrazdelenie")

private Boolean proizvodstvennoe_podrazdelenie;
public void setProizvodstvennoe_podrazdelenie(Boolean _proizvodstvennoe_podrazdelenie){ this.proizvodstvennoe_podrazdelenie=_proizvodstvennoe_podrazdelenie; }

public Boolean getProizvodstvennoe_podrazdelenie(){ return this.proizvodstvennoe_podrazdelenie; }


@Column(name="istochnik", columnDefinition="text")
private String istochnik;

public void setIstochnik(String _istochnik){ this.istochnik=_istochnik; }

public String getIstochnik(){ return this.istochnik; }


@Column(name="ispolzovat_tarifnie_stavki")

private Boolean ispolzovat_tarifnie_stavki;
public void setIspolzovat_tarifnie_stavki(Boolean _ispolzovat_tarifnie_stavki){ this.ispolzovat_tarifnie_stavki=_ispolzovat_tarifnie_stavki; }

public Boolean getIspolzovat_tarifnie_stavki(){ return this.ispolzovat_tarifnie_stavki; }


@Column(name="interval_planirovanija", columnDefinition="text")
private String interval_planirovanija;

public void setInterval_planirovanija(String _interval_planirovanija){ this.interval_planirovanija=_interval_planirovanija; }

public String getInterval_planirovanija(){ return this.interval_planirovanija; }


@Column(name="nachalo_intervala_planirovanija", columnDefinition="text")
private String nachalo_intervala_planirovanija;

public void setNachalo_intervala_planirovanija(String _nachalo_intervala_planirovanija){ this.nachalo_intervala_planirovanija=_nachalo_intervala_planirovanija; }

public String getNachalo_intervala_planirovanija(){ return this.nachalo_intervala_planirovanija; }


@Column(name="okonchanie_intervala_planirovanija", columnDefinition="text")
private String okonchanie_intervala_planirovanija;

public void setOkonchanie_intervala_planirovanija(String _okonchanie_intervala_planirovanija){ this.okonchanie_intervala_planirovanija=_okonchanie_intervala_planirovanija; }

public String getOkonchanie_intervala_planirovanija(){ return this.okonchanie_intervala_planirovanija; }


@Column(name="upravlenie_marshrutnimi_listami", columnDefinition="text")
private String upravlenie_marshrutnimi_listami;

public void setUpravlenie_marshrutnimi_listami(String _upravlenie_marshrutnimi_listami){ this.upravlenie_marshrutnimi_listami=_upravlenie_marshrutnimi_listami; }

public String getUpravlenie_marshrutnimi_listami(){ return this.upravlenie_marshrutnimi_listami; }


@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }


@Column(name="zapolnenie_dostupnosti_dlja_raspisanija_r_ts_napominanie_dney")

private Float zapolnenie_dostupnosti_dlja_raspisanija_r_ts_napominanie_dney;
public void setZapolnenie_dostupnosti_dlja_raspisanija_r_ts_napominanie_dney(Float _zapolnenie_dostupnosti_dlja_raspisanija_r_ts_napominanie_dney){ this.zapolnenie_dostupnosti_dlja_raspisanija_r_ts_napominanie_dney=_zapolnenie_dostupnosti_dlja_raspisanija_r_ts_napominanie_dney; }

public Float getZapolnenie_dostupnosti_dlja_raspisanija_r_ts_napominanie_dney(){ return this.zapolnenie_dostupnosti_dlja_raspisanija_r_ts_napominanie_dney; }


@Column(name="ispolzuetsja_spisanie_zatrat_na_vipusk")

private Boolean ispolzuetsja_spisanie_zatrat_na_vipusk;
public void setIspolzuetsja_spisanie_zatrat_na_vipusk(Boolean _ispolzuetsja_spisanie_zatrat_na_vipusk){ this.ispolzuetsja_spisanie_zatrat_na_vipusk=_ispolzuetsja_spisanie_zatrat_na_vipusk; }

public Boolean getIspolzuetsja_spisanie_zatrat_na_vipusk(){ return this.ispolzuetsja_spisanie_zatrat_na_vipusk; }


@Column(name="zapolnenie_dostupnosti_dlja_grafika_proizvodstva_kolichestvo_intervalov")

private Float zapolnenie_dostupnosti_dlja_grafika_proizvodstva_kolichestvo_intervalov;
public void setZapolnenie_dostupnosti_dlja_grafika_proizvodstva_kolichestvo_intervalov(Float _zapolnenie_dostupnosti_dlja_grafika_proizvodstva_kolichestvo_intervalov){ this.zapolnenie_dostupnosti_dlja_grafika_proizvodstva_kolichestvo_intervalov=_zapolnenie_dostupnosti_dlja_grafika_proizvodstva_kolichestvo_intervalov; }

public Float getZapolnenie_dostupnosti_dlja_grafika_proizvodstva_kolichestvo_intervalov(){ return this.zapolnenie_dostupnosti_dlja_grafika_proizvodstva_kolichestvo_intervalov; }


@Column(name="proizvodstvo_bez_zakazov")

private Boolean proizvodstvo_bez_zakazov;
public void setProizvodstvo_bez_zakazov(Boolean _proizvodstvo_bez_zakazov){ this.proizvodstvo_bez_zakazov=_proizvodstvo_bez_zakazov; }

public Boolean getProizvodstvo_bez_zakazov(){ return this.proizvodstvo_bez_zakazov; }


@Column(name="zapolnenie_dostupnosti_dlja_grafika_proizvodstva_napominanie_dney")

private Float zapolnenie_dostupnosti_dlja_grafika_proizvodstva_napominanie_dney;
public void setZapolnenie_dostupnosti_dlja_grafika_proizvodstva_napominanie_dney(Float _zapolnenie_dostupnosti_dlja_grafika_proizvodstva_napominanie_dney){ this.zapolnenie_dostupnosti_dlja_grafika_proizvodstva_napominanie_dney=_zapolnenie_dostupnosti_dlja_grafika_proizvodstva_napominanie_dney; }

public Float getZapolnenie_dostupnosti_dlja_grafika_proizvodstva_napominanie_dney(){ return this.zapolnenie_dostupnosti_dlja_grafika_proizvodstva_napominanie_dney; }


@Column(name="ispolzovat_serii_nomenklaturi")

private Boolean ispolzovat_serii_nomenklaturi;
public void setIspolzovat_serii_nomenklaturi(Boolean _ispolzovat_serii_nomenklaturi){ this.ispolzovat_serii_nomenklaturi=_ispolzovat_serii_nomenklaturi; }

public Boolean getIspolzovat_serii_nomenklaturi(){ return this.ispolzovat_serii_nomenklaturi; }


@Column(name="podrazdelenie_dispetcher")

private Boolean podrazdelenie_dispetcher;
public void setPodrazdelenie_dispetcher(Boolean _podrazdelenie_dispetcher){ this.podrazdelenie_dispetcher=_podrazdelenie_dispetcher; }

public Boolean getPodrazdelenie_dispetcher(){ return this.podrazdelenie_dispetcher; }


@Column(name="uchitivat_sebestoimost_po_serijam")

private Boolean uchitivat_sebestoimost_po_serijam;
public void setUchitivat_sebestoimost_po_serijam(Boolean _uchitivat_sebestoimost_po_serijam){ this.uchitivat_sebestoimost_po_serijam=_uchitivat_sebestoimost_po_serijam; }

public Boolean getUchitivat_sebestoimost_po_serijam(){ return this.uchitivat_sebestoimost_po_serijam; }


@Column(name="proizvodstvo_po_zakazam")

private Boolean proizvodstvo_po_zakazam;
public void setProizvodstvo_po_zakazam(Boolean _proizvodstvo_po_zakazam){ this.proizvodstvo_po_zakazam=_proizvodstvo_po_zakazam; }

public Boolean getProizvodstvo_po_zakazam(){ return this.proizvodstvo_po_zakazam; }


@Column(name="ispolzovat_k_t_u")

private Boolean ispolzovat_k_t_u;
public void setIspolzovat_k_t_u(Boolean _ispolzovat_k_t_u){ this.ispolzovat_k_t_u=_ispolzovat_k_t_u; }

public Boolean getIspolzovat_k_t_u(){ return this.ispolzovat_k_t_u; }


@Column(name="ispolzovat_materiali_v_operatsijah")

private Boolean ispolzovat_materiali_v_operatsijah;
public void setIspolzovat_materiali_v_operatsijah(Boolean _ispolzovat_materiali_v_operatsijah){ this.ispolzovat_materiali_v_operatsijah=_ispolzovat_materiali_v_operatsijah; }

public Boolean getIspolzovat_materiali_v_operatsijah(){ return this.ispolzovat_materiali_v_operatsijah; }


@Column(name="ispolzovat_pooperatsionnoe_upravlenie")

private Boolean ispolzovat_pooperatsionnoe_upravlenie;
public void setIspolzovat_pooperatsionnoe_upravlenie(Boolean _ispolzovat_pooperatsionnoe_upravlenie){ this.ispolzovat_pooperatsionnoe_upravlenie=_ispolzovat_pooperatsionnoe_upravlenie; }

public Boolean getIspolzovat_pooperatsionnoe_upravlenie(){ return this.ispolzovat_pooperatsionnoe_upravlenie; }


@Column(name="ispolzovat_vihodnie_izdelija_v_operatsijah")

private Boolean ispolzovat_vihodnie_izdelija_v_operatsijah;
public void setIspolzovat_vihodnie_izdelija_v_operatsijah(Boolean _ispolzovat_vihodnie_izdelija_v_operatsijah){ this.ispolzovat_vihodnie_izdelija_v_operatsijah=_ispolzovat_vihodnie_izdelija_v_operatsijah; }

public Boolean getIspolzovat_vihodnie_izdelija_v_operatsijah(){ return this.ispolzovat_vihodnie_izdelija_v_operatsijah; }


@Column(name="ispolzovat_pooperatsionnoe_planirovanie")

private Boolean ispolzovat_pooperatsionnoe_planirovanie;
public void setIspolzovat_pooperatsionnoe_planirovanie(Boolean _ispolzovat_pooperatsionnoe_planirovanie){ this.ispolzovat_pooperatsionnoe_planirovanie=_ispolzovat_pooperatsionnoe_planirovanie; }

public Boolean getIspolzovat_pooperatsionnoe_planirovanie(){ return this.ispolzovat_pooperatsionnoe_planirovanie; }


@Column(name="ispolzovat_otrabotannoe_vremja")

private Boolean ispolzovat_otrabotannoe_vremja;
public void setIspolzovat_otrabotannoe_vremja(Boolean _ispolzovat_otrabotannoe_vremja){ this.ispolzovat_otrabotannoe_vremja=_ispolzovat_otrabotannoe_vremja; }

public Boolean getIspolzovat_otrabotannoe_vremja(){ return this.ispolzovat_otrabotannoe_vremja; }


@Column(name="ispolzovat_brigadnie_narjadi")

private Boolean ispolzovat_brigadnie_narjadi;
public void setIspolzovat_brigadnie_narjadi(Boolean _ispolzovat_brigadnie_narjadi){ this.ispolzovat_brigadnie_narjadi=_ispolzovat_brigadnie_narjadi; }

public Boolean getIspolzovat_brigadnie_narjadi(){ return this.ispolzovat_brigadnie_narjadi; }


@Column(name="ispolzovat_personalnie_narjadi")

private Boolean ispolzovat_personalnie_narjadi;
public void setIspolzovat_personalnie_narjadi(Boolean _ispolzovat_personalnie_narjadi){ this.ispolzovat_personalnie_narjadi=_ispolzovat_personalnie_narjadi; }

public Boolean getIspolzovat_personalnie_narjadi(){ return this.ispolzovat_personalnie_narjadi; }


}
