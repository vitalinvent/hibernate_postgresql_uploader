import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="dogovori_kontragentov")
public class dogovori_kontragentov implements Serializable {

public dogovori_kontragentov(){}

public dogovori_kontragentov(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="naimenovanie_dlja_pechati", columnDefinition="text")
private String naimenovanie_dlja_pechati;

public void setNaimenovanie_dlja_pechati(String _naimenovanie_dlja_pechati){ this.naimenovanie_dlja_pechati=_naimenovanie_dlja_pechati; }

public String getNaimenovanie_dlja_pechati(){ return this.naimenovanie_dlja_pechati; }


@Column(name="nomer", columnDefinition="text")
private String nomer;

public void setNomer(String _nomer){ this.nomer=_nomer; }

public String getNomer(){ return this.nomer; }


@Column(name="kommentariy", columnDefinition="text")
private String kommentariy;

public void setKommentariy(String _kommentariy){ this.kommentariy=_kommentariy; }

public String getKommentariy(){ return this.kommentariy; }




@Column(name="identifikator_platezha", columnDefinition="text")
private String identifikator_platezha;

public void setIdentifikator_platezha(String _identifikator_platezha){ this.identifikator_platezha=_identifikator_platezha; }

public String getIdentifikator_platezha(){ return this.identifikator_platezha; }


@ManyToOne
@JoinColumn(name="bankovskiy_schet_kontragenta", insertable = true, updatable = true)
private bankovskie_scheta_kontragentov bankovskiy_schet_kontragenta;

public bankovskie_scheta_kontragentov getBankovskiy_schet_kontragenta(){ try{return this.bankovskiy_schet_kontragenta;}catch(Exception ex){ return null;} }

public void setBankovskiy_schet_kontragenta( Object _bankovskiy_schet_kontragenta){if (_bankovskiy_schet_kontragenta instanceof String){this.bankovskiy_schet_kontragenta= new bankovskie_scheta_kontragentov (_bankovskiy_schet_kontragenta.toString());}else{try{this.bankovskiy_schet_kontragenta= (bankovskie_scheta_kontragentov) _bankovskiy_schet_kontragenta;}catch(Exception ex){Variables.logger.error(ex);this.bankovskiy_schet_kontragenta= new bankovskie_scheta_kontragentov (_bankovskiy_schet_kontragenta.toString());}}}

public UUID getBankovskiy_schet_kontragenta_uuid(){ try{return this.bankovskiy_schet_kontragenta.getGuid();}catch(Exception ex){return null;} }

public String getBankovskiy_schet_kontragenta_type(){ try{return this.bankovskiy_schet_kontragenta.getClass().getName();}catch(Exception ex){return null;} }

public bankovskie_scheta_kontragentov getBankovskiy_schet_kontragenta_obj(){ return this.bankovskiy_schet_kontragenta; }

public void setBankovskiy_schet_kontragenta_obj( Object _bankovskiy_schet_kontragenta){ this.bankovskiy_schet_kontragenta=(bankovskie_scheta_kontragentov) _bankovskiy_schet_kontragenta; }


@ManyToOne
@JoinColumn(name="bankovskiy_schet", insertable = true, updatable = true)
private bankovskie_scheta_organizatsiy bankovskiy_schet;

public bankovskie_scheta_organizatsiy getBankovskiy_schet(){ try{return this.bankovskiy_schet;}catch(Exception ex){ return null;} }

public void setBankovskiy_schet( Object _bankovskiy_schet){if (_bankovskiy_schet instanceof String){this.bankovskiy_schet= new bankovskie_scheta_organizatsiy (_bankovskiy_schet.toString());}else{try{this.bankovskiy_schet= (bankovskie_scheta_organizatsiy) _bankovskiy_schet;}catch(Exception ex){Variables.logger.error(ex);this.bankovskiy_schet= new bankovskie_scheta_organizatsiy (_bankovskiy_schet.toString());}}}

public UUID getBankovskiy_schet_uuid(){ try{return this.bankovskiy_schet.getGuid();}catch(Exception ex){return null;} }

public String getBankovskiy_schet_type(){ try{return this.bankovskiy_schet.getClass().getName();}catch(Exception ex){return null;} }

public bankovskie_scheta_organizatsiy getBankovskiy_schet_obj(){ return this.bankovskiy_schet; }

public void setBankovskiy_schet_obj( Object _bankovskiy_schet){ this.bankovskiy_schet=(bankovskie_scheta_organizatsiy) _bankovskiy_schet; }


@Column(name="soglasovan")

private Boolean soglasovan;
public void setSoglasovan(Boolean _soglasovan){ this.soglasovan=_soglasovan; }

public Boolean getSoglasovan(){ return this.soglasovan; }


@ManyToOne
@JoinColumn(name="valyuta_vzaimoraschetov", insertable = true, updatable = true)
private valyuti valyuta_vzaimoraschetov;

public valyuti getValyuta_vzaimoraschetov(){ try{return this.valyuta_vzaimoraschetov;}catch(Exception ex){ return null;} }

public void setValyuta_vzaimoraschetov( Object _valyuta_vzaimoraschetov){if (_valyuta_vzaimoraschetov instanceof String){this.valyuta_vzaimoraschetov= new valyuti (_valyuta_vzaimoraschetov.toString());}else{try{this.valyuta_vzaimoraschetov= (valyuti) _valyuta_vzaimoraschetov;}catch(Exception ex){Variables.logger.error(ex);this.valyuta_vzaimoraschetov= new valyuti (_valyuta_vzaimoraschetov.toString());}}}

public UUID getValyuta_vzaimoraschetov_uuid(){ try{return this.valyuta_vzaimoraschetov.getGuid();}catch(Exception ex){return null;} }

public String getValyuta_vzaimoraschetov_type(){ try{return this.valyuta_vzaimoraschetov.getClass().getName();}catch(Exception ex){return null;} }

public valyuti getValyuta_vzaimoraschetov_obj(){ return this.valyuta_vzaimoraschetov; }

public void setValyuta_vzaimoraschetov_obj( Object _valyuta_vzaimoraschetov){ this.valyuta_vzaimoraschetov=(valyuti) _valyuta_vzaimoraschetov; }


@Column(name="data_nachala_deystvija", columnDefinition="text")
private String data_nachala_deystvija;

public void setData_nachala_deystvija(String _data_nachala_deystvija){ this.data_nachala_deystvija=_data_nachala_deystvija; }

public String getData_nachala_deystvija(){ return this.data_nachala_deystvija; }


@Column(name="adres_dostavki_perevozchika_znachenija_poley", columnDefinition="text")
private String adres_dostavki_perevozchika_znachenija_poley;

public void setAdres_dostavki_perevozchika_znachenija_poley(String _adres_dostavki_perevozchika_znachenija_poley){ this.adres_dostavki_perevozchika_znachenija_poley=_adres_dostavki_perevozchika_znachenija_poley; }

public String getAdres_dostavki_perevozchika_znachenija_poley(){ return this.adres_dostavki_perevozchika_znachenija_poley; }


@Column(name="summa_predoplati_do_otgruzki")

private Float summa_predoplati_do_otgruzki;
public void setSumma_predoplati_do_otgruzki(Float _summa_predoplati_do_otgruzki){ this.summa_predoplati_do_otgruzki=_summa_predoplati_do_otgruzki; }

public Float getSumma_predoplati_do_otgruzki(){ return this.summa_predoplati_do_otgruzki; }


@Column(name="ogranichivat_summu_zadolzhennosti")

private Boolean ogranichivat_summu_zadolzhennosti;
public void setOgranichivat_summu_zadolzhennosti(Boolean _ogranichivat_summu_zadolzhennosti){ this.ogranichivat_summu_zadolzhennosti=_ogranichivat_summu_zadolzhennosti; }

public Boolean getOgranichivat_summu_zadolzhennosti(){ return this.ogranichivat_summu_zadolzhennosti; }


@Column(name="data_okonchanija_deystvija", columnDefinition="text")
private String data_okonchanija_deystvija;

public void setData_okonchanija_deystvija(String _data_okonchanija_deystvija){ this.data_okonchanija_deystvija=_data_okonchanija_deystvija; }

public String getData_okonchanija_deystvija(){ return this.data_okonchanija_deystvija; }


@ManyToOne
@JoinColumn(name="kontragent", insertable = true, updatable = true)
private kontragenti kontragent;

public kontragenti getKontragent(){ try{return this.kontragent;}catch(Exception ex){ return null;} }

public void setKontragent( Object _kontragent){if (_kontragent instanceof String){this.kontragent= new kontragenti (_kontragent.toString());}else{try{this.kontragent= (kontragenti) _kontragent;}catch(Exception ex){Variables.logger.error(ex);this.kontragent= new kontragenti (_kontragent.toString());}}}

public UUID getKontragent_uuid(){ try{return this.kontragent.getGuid();}catch(Exception ex){return null;} }

public String getKontragent_type(){ try{return this.kontragent.getClass().getName();}catch(Exception ex){return null;} }

public kontragenti getKontragent_obj(){ return this.kontragent; }

public void setKontragent_obj( Object _kontragent){ this.kontragent=(kontragenti) _kontragent; }


@ManyToOne
@JoinColumn(name="organizatsija", insertable = true, updatable = true)
private organizatsii organizatsija;

public organizatsii getOrganizatsija(){ try{return this.organizatsija;}catch(Exception ex){ return null;} }

public void setOrganizatsija( Object _organizatsija){if (_organizatsija instanceof String){this.organizatsija= new organizatsii (_organizatsija.toString());}else{try{this.organizatsija= (organizatsii) _organizatsija;}catch(Exception ex){Variables.logger.error(ex);this.organizatsija= new organizatsii (_organizatsija.toString());}}}

public UUID getOrganizatsija_uuid(){ try{return this.organizatsija.getGuid();}catch(Exception ex){return null;} }

public String getOrganizatsija_type(){ try{return this.organizatsija.getClass().getName();}catch(Exception ex){return null;} }

public organizatsii getOrganizatsija_obj(){ return this.organizatsija; }

public void setOrganizatsija_obj( Object _organizatsija){ this.organizatsija=(organizatsii) _organizatsija; }


@ManyToOne
@JoinColumn(name="menedzher", insertable = true, updatable = true)
private polzovateli menedzher;

public polzovateli getMenedzher(){ try{return this.menedzher;}catch(Exception ex){ return null;} }

public void setMenedzher( Object _menedzher){if (_menedzher instanceof String){this.menedzher= new polzovateli (_menedzher.toString());}else{try{this.menedzher= (polzovateli) _menedzher;}catch(Exception ex){Variables.logger.error(ex);this.menedzher= new polzovateli (_menedzher.toString());}}}

public UUID getMenedzher_uuid(){ try{return this.menedzher.getGuid();}catch(Exception ex){return null;} }

public String getMenedzher_type(){ try{return this.menedzher.getClass().getName();}catch(Exception ex){return null;} }

public polzovateli getMenedzher_obj(){ return this.menedzher; }

public void setMenedzher_obj( Object _menedzher){ this.menedzher=(polzovateli) _menedzher; }


@Column(name="uchet_agentskogo_n_d_s")

private Boolean uchet_agentskogo_n_d_s;
public void setUchet_agentskogo_n_d_s(Boolean _uchet_agentskogo_n_d_s){ this.uchet_agentskogo_n_d_s=_uchet_agentskogo_n_d_s; }

public Boolean getUchet_agentskogo_n_d_s(){ return this.uchet_agentskogo_n_d_s; }


@ManyToOne
@JoinColumn(name="statja_dvizhenija_denezhnih_sredstv", insertable = true, updatable = true)
private stati_dvizhenija_denezhnih_sredstv statja_dvizhenija_denezhnih_sredstv;

public stati_dvizhenija_denezhnih_sredstv getStatja_dvizhenija_denezhnih_sredstv(){ try{return this.statja_dvizhenija_denezhnih_sredstv;}catch(Exception ex){ return null;} }

public void setStatja_dvizhenija_denezhnih_sredstv( Object _statja_dvizhenija_denezhnih_sredstv){if (_statja_dvizhenija_denezhnih_sredstv instanceof String){this.statja_dvizhenija_denezhnih_sredstv= new stati_dvizhenija_denezhnih_sredstv (_statja_dvizhenija_denezhnih_sredstv.toString());}else{try{this.statja_dvizhenija_denezhnih_sredstv= (stati_dvizhenija_denezhnih_sredstv) _statja_dvizhenija_denezhnih_sredstv;}catch(Exception ex){Variables.logger.error(ex);this.statja_dvizhenija_denezhnih_sredstv= new stati_dvizhenija_denezhnih_sredstv (_statja_dvizhenija_denezhnih_sredstv.toString());}}}

public UUID getStatja_dvizhenija_denezhnih_sredstv_uuid(){ try{return this.statja_dvizhenija_denezhnih_sredstv.getGuid();}catch(Exception ex){return null;} }

public String getStatja_dvizhenija_denezhnih_sredstv_type(){ try{return this.statja_dvizhenija_denezhnih_sredstv.getClass().getName();}catch(Exception ex){return null;} }

public stati_dvizhenija_denezhnih_sredstv getStatja_dvizhenija_denezhnih_sredstv_obj(){ return this.statja_dvizhenija_denezhnih_sredstv; }

public void setStatja_dvizhenija_denezhnih_sredstv_obj( Object _statja_dvizhenija_denezhnih_sredstv){ this.statja_dvizhenija_denezhnih_sredstv=(stati_dvizhenija_denezhnih_sredstv) _statja_dvizhenija_denezhnih_sredstv; }


@Column(name="data", columnDefinition="text")
private String data;

public void setData(String _data){ this.data=_data; }

public String getData(){ return this.data; }


@Column(name="identifikator_gos_kontrakta", columnDefinition="text")
private String identifikator_gos_kontrakta;

public void setIdentifikator_gos_kontrakta(String _identifikator_gos_kontrakta){ this.identifikator_gos_kontrakta=_identifikator_gos_kontrakta; }

public String getIdentifikator_gos_kontrakta(){ return this.identifikator_gos_kontrakta; }


@ManyToOne
@JoinColumn(name="partner", insertable = true, updatable = true)
private partneri partner;

public partneri getPartner(){ try{return this.partner;}catch(Exception ex){ return null;} }

public void setPartner( Object _partner){if (_partner instanceof String){this.partner= new partneri (_partner.toString());}else{try{this.partner= (partneri) _partner;}catch(Exception ex){Variables.logger.error(ex);this.partner= new partneri (_partner.toString());}}}

public UUID getPartner_uuid(){ try{return this.partner.getGuid();}catch(Exception ex){return null;} }

public String getPartner_type(){ try{return this.partner.getClass().getName();}catch(Exception ex){return null;} }

public partneri getPartner_obj(){ return this.partner; }

public void setPartner_obj( Object _partner){ this.partner=(partneri) _partner; }


@ManyToOne
@JoinColumn(name="podrazdelenie", insertable = true, updatable = true)
private struktura_predprijatija podrazdelenie;

public struktura_predprijatija getPodrazdelenie(){ try{return this.podrazdelenie;}catch(Exception ex){ return null;} }

public void setPodrazdelenie( Object _podrazdelenie){if (_podrazdelenie instanceof String){this.podrazdelenie= new struktura_predprijatija (_podrazdelenie.toString());}else{try{this.podrazdelenie= (struktura_predprijatija) _podrazdelenie;}catch(Exception ex){Variables.logger.error(ex);this.podrazdelenie= new struktura_predprijatija (_podrazdelenie.toString());}}}

public UUID getPodrazdelenie_uuid(){ try{return this.podrazdelenie.getGuid();}catch(Exception ex){return null;} }

public String getPodrazdelenie_type(){ try{return this.podrazdelenie.getClass().getName();}catch(Exception ex){return null;} }

public struktura_predprijatija getPodrazdelenie_obj(){ return this.podrazdelenie; }

public void setPodrazdelenie_obj( Object _podrazdelenie){ this.podrazdelenie=(struktura_predprijatija) _podrazdelenie; }


@ManyToOne
@JoinColumn(name="naznachenie", insertable = true, updatable = true)
private naznachenija naznachenie;

public naznachenija getNaznachenie(){ try{return this.naznachenie;}catch(Exception ex){ return null;} }

public void setNaznachenie( Object _naznachenie){if (_naznachenie instanceof String){this.naznachenie= new naznachenija (_naznachenie.toString());}else{try{this.naznachenie= (naznachenija) _naznachenie;}catch(Exception ex){Variables.logger.error(ex);this.naznachenie= new naznachenija (_naznachenie.toString());}}}

public UUID getNaznachenie_uuid(){ try{return this.naznachenie.getGuid();}catch(Exception ex){return null;} }

public String getNaznachenie_type(){ try{return this.naznachenie.getClass().getName();}catch(Exception ex){return null;} }

public naznachenija getNaznachenie_obj(){ return this.naznachenie; }

public void setNaznachenie_obj( Object _naznachenie){ this.naznachenie=(naznachenija) _naznachenie; }


@Column(name="adres_dostavki_perevozchika", columnDefinition="text")
private String adres_dostavki_perevozchika;

public void setAdres_dostavki_perevozchika(String _adres_dostavki_perevozchika){ this.adres_dostavki_perevozchika=_adres_dostavki_perevozchika; }

public String getAdres_dostavki_perevozchika(){ return this.adres_dostavki_perevozchika; }


@Column(name="dopolnitelnaja_informatsija_po_dostavke", columnDefinition="text")
private String dopolnitelnaja_informatsija_po_dostavke;

public void setDopolnitelnaja_informatsija_po_dostavke(String _dopolnitelnaja_informatsija_po_dostavke){ this.dopolnitelnaja_informatsija_po_dostavke=_dopolnitelnaja_informatsija_po_dostavke; }

public String getDopolnitelnaja_informatsija_po_dostavke(){ return this.dopolnitelnaja_informatsija_po_dostavke; }


@Column(name="dopustimaja_summa_zadolzhennosti")

private Float dopustimaja_summa_zadolzhennosti;
public void setDopustimaja_summa_zadolzhennosti(Float _dopustimaja_summa_zadolzhennosti){ this.dopustimaja_summa_zadolzhennosti=_dopustimaja_summa_zadolzhennosti; }

public Float getDopustimaja_summa_zadolzhennosti(){ return this.dopustimaja_summa_zadolzhennosti; }


@Column(name="zapreshchaetsja_prosrochennaja_zadolzhennost")

private Boolean zapreshchaetsja_prosrochennaja_zadolzhennost;
public void setZapreshchaetsja_prosrochennaja_zadolzhennost(Boolean _zapreshchaetsja_prosrochennaja_zadolzhennost){ this.zapreshchaetsja_prosrochennaja_zadolzhennost=_zapreshchaetsja_prosrochennaja_zadolzhennost; }

public Boolean getZapreshchaetsja_prosrochennaja_zadolzhennost(){ return this.zapreshchaetsja_prosrochennaja_zadolzhennost; }


@Column(name="vipolneni_objazatelstva_po_dogovoru_g_o_z")

private Boolean vipolneni_objazatelstva_po_dogovoru_g_o_z;
public void setVipolneni_objazatelstva_po_dogovoru_g_o_z(Boolean _vipolneni_objazatelstva_po_dogovoru_g_o_z){ this.vipolneni_objazatelstva_po_dogovoru_g_o_z=_vipolneni_objazatelstva_po_dogovoru_g_o_z; }

public Boolean getVipolneni_objazatelstva_po_dogovoru_g_o_z(){ return this.vipolneni_objazatelstva_po_dogovoru_g_o_z; }


@Column(name="ustanovlen_srok_oplati")

private Boolean ustanovlen_srok_oplati;
public void setUstanovlen_srok_oplati(Boolean _ustanovlen_srok_oplati){ this.ustanovlen_srok_oplati=_ustanovlen_srok_oplati; }

public Boolean getUstanovlen_srok_oplati(){ return this.ustanovlen_srok_oplati; }


@Column(name="summa_pribili")

private Float summa_pribili;
public void setSumma_pribili(Float _summa_pribili){ this.summa_pribili=_summa_pribili; }

public Float getSumma_pribili(){ return this.summa_pribili; }


@Column(name="srok_oplati")

private Float srok_oplati;
public void setSrok_oplati(Float _srok_oplati){ this.srok_oplati=_srok_oplati; }

public Float getSrok_oplati(){ return this.srok_oplati; }


@Column(name="summa")

private Float summa;
public void setSumma(Float _summa){ this.summa=_summa; }

public Float getSumma(){ return this.summa; }


@Column(name="zadan_grafik_ispolnenija")

private Boolean zadan_grafik_ispolnenija;
public void setZadan_grafik_ispolnenija(Boolean _zadan_grafik_ispolnenija){ this.zadan_grafik_ispolnenija=_zadan_grafik_ispolnenija; }

public Boolean getZadan_grafik_ispolnenija(){ return this.zadan_grafik_ispolnenija; }


@Column(name="dogovor_s_uchastnikom_g_o_z")

private Boolean dogovor_s_uchastnikom_g_o_z;
public void setDogovor_s_uchastnikom_g_o_z(Boolean _dogovor_s_uchastnikom_g_o_z){ this.dogovor_s_uchastnikom_g_o_z=_dogovor_s_uchastnikom_g_o_z; }

public Boolean getDogovor_s_uchastnikom_g_o_z(){ return this.dogovor_s_uchastnikom_g_o_z; }


@Column(name="vremja_dostavki_po", columnDefinition="text")
private String vremja_dostavki_po;

public void setVremja_dostavki_po(String _vremja_dostavki_po){ this.vremja_dostavki_po=_vremja_dostavki_po; }

public String getVremja_dostavki_po(){ return this.vremja_dostavki_po; }


@ManyToOne
@JoinColumn(name="tip_platezha_f_z275", insertable = true, updatable = true)
private tipi_platezhey_f_z275 tip_platezha_f_z275;

public tipi_platezhey_f_z275 getTip_platezha_f_z275(){ try{return this.tip_platezha_f_z275;}catch(Exception ex){ return null;} }

public void setTip_platezha_f_z275( Object _tip_platezha_f_z275){if (_tip_platezha_f_z275 instanceof String){this.tip_platezha_f_z275= new tipi_platezhey_f_z275 (_tip_platezha_f_z275.toString());}else{try{this.tip_platezha_f_z275= (tipi_platezhey_f_z275) _tip_platezha_f_z275;}catch(Exception ex){Variables.logger.error(ex);this.tip_platezha_f_z275= new tipi_platezhey_f_z275 (_tip_platezha_f_z275.toString());}}}

public UUID getTip_platezha_f_z275_uuid(){ try{return this.tip_platezha_f_z275.getGuid();}catch(Exception ex){return null;} }

public String getTip_platezha_f_z275_type(){ try{return this.tip_platezha_f_z275.getClass().getName();}catch(Exception ex){return null;} }

public tipi_platezhey_f_z275 getTip_platezha_f_z275_obj(){ return this.tip_platezha_f_z275; }

public void setTip_platezha_f_z275_obj( Object _tip_platezha_f_z275){ this.tip_platezha_f_z275=(tipi_platezhey_f_z275) _tip_platezha_f_z275; }


@Column(name="platezhi_po275_f_z")

private Boolean platezhi_po275_f_z;
public void setPlatezhi_po275_f_z(Boolean _platezhi_po275_f_z){ this.platezhi_po275_f_z=_platezhi_po275_f_z; }

public Boolean getPlatezhi_po275_f_z(){ return this.platezhi_po275_f_z; }


@Column(name="inostranniy_ispolnitel_v_utverzhdennom_perechne_g_o_z")

private Boolean inostranniy_ispolnitel_v_utverzhdennom_perechne_g_o_z;
public void setInostranniy_ispolnitel_v_utverzhdennom_perechne_g_o_z(Boolean _inostranniy_ispolnitel_v_utverzhdennom_perechne_g_o_z){ this.inostranniy_ispolnitel_v_utverzhdennom_perechne_g_o_z=_inostranniy_ispolnitel_v_utverzhdennom_perechne_g_o_z; }

public Boolean getInostranniy_ispolnitel_v_utverzhdennom_perechne_g_o_z(){ return this.inostranniy_ispolnitel_v_utverzhdennom_perechne_g_o_z; }


@ManyToOne
@JoinColumn(name="napravlenie_dejatelnosti", insertable = true, updatable = true)
private napravlenija_dejatelnosti napravlenie_dejatelnosti;

public napravlenija_dejatelnosti getNapravlenie_dejatelnosti(){ try{return this.napravlenie_dejatelnosti;}catch(Exception ex){ return null;} }

public void setNapravlenie_dejatelnosti( Object _napravlenie_dejatelnosti){if (_napravlenie_dejatelnosti instanceof String){this.napravlenie_dejatelnosti= new napravlenija_dejatelnosti (_napravlenie_dejatelnosti.toString());}else{try{this.napravlenie_dejatelnosti= (napravlenija_dejatelnosti) _napravlenie_dejatelnosti;}catch(Exception ex){Variables.logger.error(ex);this.napravlenie_dejatelnosti= new napravlenija_dejatelnosti (_napravlenie_dejatelnosti.toString());}}}

public UUID getNapravlenie_dejatelnosti_uuid(){ try{return this.napravlenie_dejatelnosti.getGuid();}catch(Exception ex){return null;} }

public String getNapravlenie_dejatelnosti_type(){ try{return this.napravlenie_dejatelnosti.getClass().getName();}catch(Exception ex){return null;} }

public napravlenija_dejatelnosti getNapravlenie_dejatelnosti_obj(){ return this.napravlenie_dejatelnosti; }

public void setNapravlenie_dejatelnosti_obj( Object _napravlenie_dejatelnosti){ this.napravlenie_dejatelnosti=(napravlenija_dejatelnosti) _napravlenie_dejatelnosti; }


@Column(name="oplata_rashodov_po_tarifam_s_gosregulirovaniem")

private Boolean oplata_rashodov_po_tarifam_s_gosregulirovaniem;
public void setOplata_rashodov_po_tarifam_s_gosregulirovaniem(Boolean _oplata_rashodov_po_tarifam_s_gosregulirovaniem){ this.oplata_rashodov_po_tarifam_s_gosregulirovaniem=_oplata_rashodov_po_tarifam_s_gosregulirovaniem; }

public Boolean getOplata_rashodov_po_tarifam_s_gosregulirovaniem(){ return this.oplata_rashodov_po_tarifam_s_gosregulirovaniem; }


@Column(name="adres_dostavki_dlja_postavshchika", columnDefinition="text")
private String adres_dostavki_dlja_postavshchika;

public void setAdres_dostavki_dlja_postavshchika(String _adres_dostavki_dlja_postavshchika){ this.adres_dostavki_dlja_postavshchika=_adres_dostavki_dlja_postavshchika; }

public String getAdres_dostavki_dlja_postavshchika(){ return this.adres_dostavki_dlja_postavshchika; }


@ManyToOne
@JoinColumn(name="statja_kalkuljatsii", insertable = true, updatable = true)
private stati_kalkuljatsii statja_kalkuljatsii;

public stati_kalkuljatsii getStatja_kalkuljatsii(){ try{return this.statja_kalkuljatsii;}catch(Exception ex){ return null;} }

public void setStatja_kalkuljatsii( Object _statja_kalkuljatsii){if (_statja_kalkuljatsii instanceof String){this.statja_kalkuljatsii= new stati_kalkuljatsii (_statja_kalkuljatsii.toString());}else{try{this.statja_kalkuljatsii= (stati_kalkuljatsii) _statja_kalkuljatsii;}catch(Exception ex){Variables.logger.error(ex);this.statja_kalkuljatsii= new stati_kalkuljatsii (_statja_kalkuljatsii.toString());}}}

public UUID getStatja_kalkuljatsii_uuid(){ try{return this.statja_kalkuljatsii.getGuid();}catch(Exception ex){return null;} }

public String getStatja_kalkuljatsii_type(){ try{return this.statja_kalkuljatsii.getClass().getName();}catch(Exception ex){return null;} }

public stati_kalkuljatsii getStatja_kalkuljatsii_obj(){ return this.statja_kalkuljatsii; }

public void setStatja_kalkuljatsii_obj( Object _statja_kalkuljatsii){ this.statja_kalkuljatsii=(stati_kalkuljatsii) _statja_kalkuljatsii; }


@Column(name="vremja_dostavki_s", columnDefinition="text")
private String vremja_dostavki_s;

public void setVremja_dostavki_s(String _vremja_dostavki_s){ this.vremja_dostavki_s=_vremja_dostavki_s; }

public String getVremja_dostavki_s(){ return this.vremja_dostavki_s; }


@ManyToOne
@JoinColumn(name="perevozchik_partner", insertable = true, updatable = true)
private partneri perevozchik_partner;

public partneri getPerevozchik_partner(){ try{return this.perevozchik_partner;}catch(Exception ex){ return null;} }

public void setPerevozchik_partner( Object _perevozchik_partner){if (_perevozchik_partner instanceof String){this.perevozchik_partner= new partneri (_perevozchik_partner.toString());}else{try{this.perevozchik_partner= (partneri) _perevozchik_partner;}catch(Exception ex){Variables.logger.error(ex);this.perevozchik_partner= new partneri (_perevozchik_partner.toString());}}}

public UUID getPerevozchik_partner_uuid(){ try{return this.perevozchik_partner.getGuid();}catch(Exception ex){return null;} }

public String getPerevozchik_partner_type(){ try{return this.perevozchik_partner.getClass().getName();}catch(Exception ex){return null;} }

public partneri getPerevozchik_partner_obj(){ return this.perevozchik_partner; }

public void setPerevozchik_partner_obj( Object _perevozchik_partner){ this.perevozchik_partner=(partneri) _perevozchik_partner; }


@Column(name="adres_dostavki", columnDefinition="text")
private String adres_dostavki;

public void setAdres_dostavki(String _adres_dostavki){ this.adres_dostavki=_adres_dostavki; }

public String getAdres_dostavki(){ return this.adres_dostavki; }


@Column(name="adres_dostavki_znachenija_poley", columnDefinition="text")
private String adres_dostavki_znachenija_poley;

public void setAdres_dostavki_znachenija_poley(String _adres_dostavki_znachenija_poley){ this.adres_dostavki_znachenija_poley=_adres_dostavki_znachenija_poley; }

public String getAdres_dostavki_znachenija_poley(){ return this.adres_dostavki_znachenija_poley; }


}
