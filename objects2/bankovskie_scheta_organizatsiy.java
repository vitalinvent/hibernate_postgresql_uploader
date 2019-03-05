import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="bankovskie_scheta_organizatsiy")
public class bankovskie_scheta_organizatsiy implements Serializable {

public bankovskie_scheta_organizatsiy(){}

public bankovskie_scheta_organizatsiy(String _guid){ this.guid=UUID.fromString(_guid); }

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
@JoinColumn(name="bank", insertable = true, updatable = true)
private klassifikator_bankov bank;

public klassifikator_bankov getBank(){ try{return this.bank;}catch(Exception ex){ return null;} }

public void setBank( Object _bank){if (_bank instanceof String){this.bank= new klassifikator_bankov (_bank.toString());}else{try{this.bank= (klassifikator_bankov) _bank;}catch(Exception ex){Variables.logger.error(ex);this.bank= new klassifikator_bankov (_bank.toString());}}}

public UUID getBank_uuid(){ try{return this.bank.getGuid();}catch(Exception ex){return null;} }

public String getBank_type(){ try{return this.bank.getClass().getName();}catch(Exception ex){return null;} }

public klassifikator_bankov getBank_obj(){ return this.bank; }

public void setBank_obj( Object _bank){ this.bank=(klassifikator_bankov) _bank; }


@Column(name="tekst_naznachenija", columnDefinition="text")
private String tekst_naznachenija;

public void setTekst_naznachenija(String _tekst_naznachenija){ this.tekst_naznachenija=_tekst_naznachenija; }

public String getTekst_naznachenija(){ return this.tekst_naznachenija; }



@ManyToOne
@JoinColumn(name="bank_dlja_raschetov", insertable = true, updatable = true)
private klassifikator_bankov bank_dlja_raschetov;

public klassifikator_bankov getBank_dlja_raschetov(){ try{return this.bank_dlja_raschetov;}catch(Exception ex){ return null;} }

public void setBank_dlja_raschetov( Object _bank_dlja_raschetov){if (_bank_dlja_raschetov instanceof String){this.bank_dlja_raschetov= new klassifikator_bankov (_bank_dlja_raschetov.toString());}else{try{this.bank_dlja_raschetov= (klassifikator_bankov) _bank_dlja_raschetov;}catch(Exception ex){Variables.logger.error(ex);this.bank_dlja_raschetov= new klassifikator_bankov (_bank_dlja_raschetov.toString());}}}

public UUID getBank_dlja_raschetov_uuid(){ try{return this.bank_dlja_raschetov.getGuid();}catch(Exception ex){return null;} }

public String getBank_dlja_raschetov_type(){ try{return this.bank_dlja_raschetov.getClass().getName();}catch(Exception ex){return null;} }

public klassifikator_bankov getBank_dlja_raschetov_obj(){ return this.bank_dlja_raschetov; }

public void setBank_dlja_raschetov_obj( Object _bank_dlja_raschetov){ this.bank_dlja_raschetov=(klassifikator_bankov) _bank_dlja_raschetov; }



@ManyToOne
@JoinColumn(name="valyuta_denezhnih_sredstv", insertable = true, updatable = true)
private valyuti valyuta_denezhnih_sredstv;

public valyuti getValyuta_denezhnih_sredstv(){ try{return this.valyuta_denezhnih_sredstv;}catch(Exception ex){ return null;} }

public void setValyuta_denezhnih_sredstv( Object _valyuta_denezhnih_sredstv){if (_valyuta_denezhnih_sredstv instanceof String){this.valyuta_denezhnih_sredstv= new valyuti (_valyuta_denezhnih_sredstv.toString());}else{try{this.valyuta_denezhnih_sredstv= (valyuti) _valyuta_denezhnih_sredstv;}catch(Exception ex){Variables.logger.error(ex);this.valyuta_denezhnih_sredstv= new valyuti (_valyuta_denezhnih_sredstv.toString());}}}

public UUID getValyuta_denezhnih_sredstv_uuid(){ try{return this.valyuta_denezhnih_sredstv.getGuid();}catch(Exception ex){return null;} }

public String getValyuta_denezhnih_sredstv_type(){ try{return this.valyuta_denezhnih_sredstv.getClass().getName();}catch(Exception ex){return null;} }

public valyuti getValyuta_denezhnih_sredstv_obj(){ return this.valyuta_denezhnih_sredstv; }

public void setValyuta_denezhnih_sredstv_obj( Object _valyuta_denezhnih_sredstv){ this.valyuta_denezhnih_sredstv=(valyuti) _valyuta_denezhnih_sredstv; }


@Column(name="ispolzovat_prjamoy_obmen_s_bankom")

private Boolean ispolzovat_prjamoy_obmen_s_bankom;
public void setIspolzovat_prjamoy_obmen_s_bankom(Boolean _ispolzovat_prjamoy_obmen_s_bankom){ this.ispolzovat_prjamoy_obmen_s_bankom=_ispolzovat_prjamoy_obmen_s_bankom; }

public Boolean getIspolzovat_prjamoy_obmen_s_bankom(){ return this.ispolzovat_prjamoy_obmen_s_bankom; }


@Column(name="nomer_scheta", columnDefinition="text")
private String nomer_scheta;

public void setNomer_scheta(String _nomer_scheta){ this.nomer_scheta=_nomer_scheta; }

public String getNomer_scheta(){ return this.nomer_scheta; }


@Column(name="tekst_korrespondenta", columnDefinition="text")
private String tekst_korrespondenta;

public void setTekst_korrespondenta(String _tekst_korrespondenta){ this.tekst_korrespondenta=_tekst_korrespondenta; }

public String getTekst_korrespondenta(){ return this.tekst_korrespondenta; }


@Column(name="naimenovanie_banka", columnDefinition="text")
private String naimenovanie_banka;

public void setNaimenovanie_banka(String _naimenovanie_banka){ this.naimenovanie_banka=_naimenovanie_banka; }

public String getNaimenovanie_banka(){ return this.naimenovanie_banka; }


@Column(name="vivodit_summu_bez_kopeek")

private Boolean vivodit_summu_bez_kopeek;
public void setVivodit_summu_bez_kopeek(Boolean _vivodit_summu_bez_kopeek){ this.vivodit_summu_bez_kopeek=_vivodit_summu_bez_kopeek; }

public Boolean getVivodit_summu_bez_kopeek(){ return this.vivodit_summu_bez_kopeek; }


@Column(name="srok_ispolnenija_platezha")

private Float srok_ispolnenija_platezha;
public void setSrok_ispolnenija_platezha(Float _srok_ispolnenija_platezha){ this.srok_ispolnenija_platezha=_srok_ispolnenija_platezha; }

public Float getSrok_ispolnenija_platezha(){ return this.srok_ispolnenija_platezha; }


@Column(name="ispolzovat_obmen_s_bankom")

private Boolean ispolzovat_obmen_s_bankom;
public void setIspolzovat_obmen_s_bankom(Boolean _ispolzovat_obmen_s_bankom){ this.ispolzovat_obmen_s_bankom=_ispolzovat_obmen_s_bankom; }

public Boolean getIspolzovat_obmen_s_bankom(){ return this.ispolzovat_obmen_s_bankom; }


@Column(name="programma", columnDefinition="text")
private String programma;

public void setProgramma(String _programma){ this.programma=_programma; }

public String getProgramma(){ return this.programma; }


@Column(name="kodirovka", columnDefinition="text")
private String kodirovka;

public void setKodirovka(String _kodirovka){ this.kodirovka=_kodirovka; }

public String getKodirovka(){ return this.kodirovka; }


@Column(name="obmen_s_bankom_vklyuchen")

private Boolean obmen_s_bankom_vklyuchen;
public void setObmen_s_bankom_vklyuchen(Boolean _obmen_s_bankom_vklyuchen){ this.obmen_s_bankom_vklyuchen=_obmen_s_bankom_vklyuchen; }

public Boolean getObmen_s_bankom_vklyuchen(){ return this.obmen_s_bankom_vklyuchen; }


@Column(name="naimenovanie_banka_dlja_raschetov", columnDefinition="text")
private String naimenovanie_banka_dlja_raschetov;

public void setNaimenovanie_banka_dlja_raschetov(String _naimenovanie_banka_dlja_raschetov){ this.naimenovanie_banka_dlja_raschetov=_naimenovanie_banka_dlja_raschetov; }

public String getNaimenovanie_banka_dlja_raschetov(){ return this.naimenovanie_banka_dlja_raschetov; }


@Column(name="fayl_zagruzki", columnDefinition="text")
private String fayl_zagruzki;

public void setFayl_zagruzki(String _fayl_zagruzki){ this.fayl_zagruzki=_fayl_zagruzki; }

public String getFayl_zagruzki(){ return this.fayl_zagruzki; }


@ManyToOne
@JoinColumn(name="napravlenie_dejatelnosti", insertable = true, updatable = true)
private napravlenija_dejatelnosti napravlenie_dejatelnosti;

public napravlenija_dejatelnosti getNapravlenie_dejatelnosti(){ try{return this.napravlenie_dejatelnosti;}catch(Exception ex){ return null;} }

public void setNapravlenie_dejatelnosti( Object _napravlenie_dejatelnosti){if (_napravlenie_dejatelnosti instanceof String){this.napravlenie_dejatelnosti= new napravlenija_dejatelnosti (_napravlenie_dejatelnosti.toString());}else{try{this.napravlenie_dejatelnosti= (napravlenija_dejatelnosti) _napravlenie_dejatelnosti;}catch(Exception ex){Variables.logger.error(ex);this.napravlenie_dejatelnosti= new napravlenija_dejatelnosti (_napravlenie_dejatelnosti.toString());}}}

public UUID getNapravlenie_dejatelnosti_uuid(){ try{return this.napravlenie_dejatelnosti.getGuid();}catch(Exception ex){return null;} }

public String getNapravlenie_dejatelnosti_type(){ try{return this.napravlenie_dejatelnosti.getClass().getName();}catch(Exception ex){return null;} }

public napravlenija_dejatelnosti getNapravlenie_dejatelnosti_obj(){ return this.napravlenie_dejatelnosti; }

public void setNapravlenie_dejatelnosti_obj( Object _napravlenie_dejatelnosti){ this.napravlenie_dejatelnosti=(napravlenija_dejatelnosti) _napravlenie_dejatelnosti; }


@Column(name="fayl_vigruzki", columnDefinition="text")
private String fayl_vigruzki;

public void setFayl_vigruzki(String _fayl_vigruzki){ this.fayl_vigruzki=_fayl_vigruzki; }

public String getFayl_vigruzki(){ return this.fayl_vigruzki; }


@Column(name="adres_banka", columnDefinition="text")
private String adres_banka;

public void setAdres_banka(String _adres_banka){ this.adres_banka=_adres_banka; }

public String getAdres_banka(){ return this.adres_banka; }


@Column(name="razreshit_platezhi_bez_ukazanija_zajavok")

private Boolean razreshit_platezhi_bez_ukazanija_zajavok;
public void setRazreshit_platezhi_bez_ukazanija_zajavok(Boolean _razreshit_platezhi_bez_ukazanija_zajavok){ this.razreshit_platezhi_bez_ukazanija_zajavok=_razreshit_platezhi_bez_ukazanija_zajavok; }

public Boolean getRazreshit_platezhi_bez_ukazanija_zajavok(){ return this.razreshit_platezhi_bez_ukazanija_zajavok; }


@ManyToOne
@JoinColumn(name="podrazdelenie", insertable = true, updatable = true)
private struktura_predprijatija podrazdelenie;

public struktura_predprijatija getPodrazdelenie(){ try{return this.podrazdelenie;}catch(Exception ex){ return null;} }

public void setPodrazdelenie( Object _podrazdelenie){if (_podrazdelenie instanceof String){this.podrazdelenie= new struktura_predprijatija (_podrazdelenie.toString());}else{try{this.podrazdelenie= (struktura_predprijatija) _podrazdelenie;}catch(Exception ex){Variables.logger.error(ex);this.podrazdelenie= new struktura_predprijatija (_podrazdelenie.toString());}}}

public UUID getPodrazdelenie_uuid(){ try{return this.podrazdelenie.getGuid();}catch(Exception ex){return null;} }

public String getPodrazdelenie_type(){ try{return this.podrazdelenie.getClass().getName();}catch(Exception ex){return null;} }

public struktura_predprijatija getPodrazdelenie_obj(){ return this.podrazdelenie; }

public void setPodrazdelenie_obj( Object _podrazdelenie){ this.podrazdelenie=(struktura_predprijatija) _podrazdelenie; }


@Column(name="schet_v_banke_dlja_raschetov", columnDefinition="text")
private String schet_v_banke_dlja_raschetov;

public void setSchet_v_banke_dlja_raschetov(String _schet_v_banke_dlja_raschetov){ this.schet_v_banke_dlja_raschetov=_schet_v_banke_dlja_raschetov; }

public String getSchet_v_banke_dlja_raschetov(){ return this.schet_v_banke_dlja_raschetov; }


@Column(name="b_i_k_banka", columnDefinition="text")
private String b_i_k_banka;

public void setB_i_k_banka(String _b_i_k_banka){ this.b_i_k_banka=_b_i_k_banka; }

public String getB_i_k_banka(){ return this.b_i_k_banka; }


@Column(name="otdelniy_schet_g_o_z")

private Boolean otdelniy_schet_g_o_z;
public void setOtdelniy_schet_g_o_z(Boolean _otdelniy_schet_g_o_z){ this.otdelniy_schet_g_o_z=_otdelniy_schet_g_o_z; }

public Boolean getOtdelniy_schet_g_o_z(){ return this.otdelniy_schet_g_o_z; }


@Column(name="ruchnoe_izmenenie_rekvizitov_banka")

private Boolean ruchnoe_izmenenie_rekvizitov_banka;
public void setRuchnoe_izmenenie_rekvizitov_banka(Boolean _ruchnoe_izmenenie_rekvizitov_banka){ this.ruchnoe_izmenenie_rekvizitov_banka=_ruchnoe_izmenenie_rekvizitov_banka; }

public Boolean getRuchnoe_izmenenie_rekvizitov_banka(){ return this.ruchnoe_izmenenie_rekvizitov_banka; }


@Column(name="korr_schet_banka", columnDefinition="text")
private String korr_schet_banka;

public void setKorr_schet_banka(String _korr_schet_banka){ this.korr_schet_banka=_korr_schet_banka; }

public String getKorr_schet_banka(){ return this.korr_schet_banka; }


@Column(name="gorod_banka", columnDefinition="text")
private String gorod_banka;

public void setGorod_banka(String _gorod_banka){ this.gorod_banka=_gorod_banka; }

public String getGorod_banka(){ return this.gorod_banka; }


@Column(name="telefoni_banka", columnDefinition="text")
private String telefoni_banka;

public void setTelefoni_banka(String _telefoni_banka){ this.telefoni_banka=_telefoni_banka; }

public String getTelefoni_banka(){ return this.telefoni_banka; }


@Column(name="b_i_k_banka_dlja_raschetov", columnDefinition="text")
private String b_i_k_banka_dlja_raschetov;

public void setB_i_k_banka_dlja_raschetov(String _b_i_k_banka_dlja_raschetov){ this.b_i_k_banka_dlja_raschetov=_b_i_k_banka_dlja_raschetov; }

public String getB_i_k_banka_dlja_raschetov(){ return this.b_i_k_banka_dlja_raschetov; }


@Column(name="ruchnoe_izmenenie_rekvizitov_banka_dlja_raschetov")

private Boolean ruchnoe_izmenenie_rekvizitov_banka_dlja_raschetov;
public void setRuchnoe_izmenenie_rekvizitov_banka_dlja_raschetov(Boolean _ruchnoe_izmenenie_rekvizitov_banka_dlja_raschetov){ this.ruchnoe_izmenenie_rekvizitov_banka_dlja_raschetov=_ruchnoe_izmenenie_rekvizitov_banka_dlja_raschetov; }

public Boolean getRuchnoe_izmenenie_rekvizitov_banka_dlja_raschetov(){ return this.ruchnoe_izmenenie_rekvizitov_banka_dlja_raschetov; }


@Column(name="korr_schet_banka_dlja_raschetov", columnDefinition="text")
private String korr_schet_banka_dlja_raschetov;

public void setKorr_schet_banka_dlja_raschetov(String _korr_schet_banka_dlja_raschetov){ this.korr_schet_banka_dlja_raschetov=_korr_schet_banka_dlja_raschetov; }

public String getKorr_schet_banka_dlja_raschetov(){ return this.korr_schet_banka_dlja_raschetov; }


@Column(name="gorod_banka_dlja_raschetov", columnDefinition="text")
private String gorod_banka_dlja_raschetov;

public void setGorod_banka_dlja_raschetov(String _gorod_banka_dlja_raschetov){ this.gorod_banka_dlja_raschetov=_gorod_banka_dlja_raschetov; }

public String getGorod_banka_dlja_raschetov(){ return this.gorod_banka_dlja_raschetov; }


@Column(name="adres_banka_dlja_raschetov", columnDefinition="text")
private String adres_banka_dlja_raschetov;

public void setAdres_banka_dlja_raschetov(String _adres_banka_dlja_raschetov){ this.adres_banka_dlja_raschetov=_adres_banka_dlja_raschetov; }

public String getAdres_banka_dlja_raschetov(){ return this.adres_banka_dlja_raschetov; }


@Column(name="telefoni_banka_dlja_raschetov", columnDefinition="text")
private String telefoni_banka_dlja_raschetov;

public void setTelefoni_banka_dlja_raschetov(String _telefoni_banka_dlja_raschetov){ this.telefoni_banka_dlja_raschetov=_telefoni_banka_dlja_raschetov; }

public String getTelefoni_banka_dlja_raschetov(){ return this.telefoni_banka_dlja_raschetov; }


@Column(name="s_v_i_f_t_banka", columnDefinition="text")
private String s_v_i_f_t_banka;

public void setS_v_i_f_t_banka(String _s_v_i_f_t_banka){ this.s_v_i_f_t_banka=_s_v_i_f_t_banka; }

public String getS_v_i_f_t_banka(){ return this.s_v_i_f_t_banka; }


@Column(name="s_v_i_f_t_banka_dlja_raschetov", columnDefinition="text")
private String s_v_i_f_t_banka_dlja_raschetov;

public void setS_v_i_f_t_banka_dlja_raschetov(String _s_v_i_f_t_banka_dlja_raschetov){ this.s_v_i_f_t_banka_dlja_raschetov=_s_v_i_f_t_banka_dlja_raschetov; }

public String getS_v_i_f_t_banka_dlja_raschetov(){ return this.s_v_i_f_t_banka_dlja_raschetov; }


@Column(name="inostranniy_bank")

private Boolean inostranniy_bank;
public void setInostranniy_bank(Boolean _inostranniy_bank){ this.inostranniy_bank=_inostranniy_bank; }

public Boolean getInostranniy_bank(){ return this.inostranniy_bank; }


@Column(name="zakrit")

private Boolean zakrit;
public void setZakrit(Boolean _zakrit){ this.zakrit=_zakrit; }

public Boolean getZakrit(){ return this.zakrit; }


}
