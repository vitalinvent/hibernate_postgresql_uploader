import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="bankovskie_scheta_kontragentov")
public class bankovskie_scheta_kontragentov implements Serializable {

public bankovskie_scheta_kontragentov(){}

public bankovskie_scheta_kontragentov(String _guid){ this.guid=UUID.fromString(_guid); }

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



@Column(name="nomer_scheta", columnDefinition="text")
private String nomer_scheta;

public void setNomer_scheta(String _nomer_scheta){ this.nomer_scheta=_nomer_scheta; }

public String getNomer_scheta(){ return this.nomer_scheta; }


@Column(name="tekst_korrespondenta", columnDefinition="text")
private String tekst_korrespondenta;

public void setTekst_korrespondenta(String _tekst_korrespondenta){ this.tekst_korrespondenta=_tekst_korrespondenta; }

public String getTekst_korrespondenta(){ return this.tekst_korrespondenta; }


@ManyToOne
@JoinColumn(name="valyuta_denezhnih_sredstv", insertable = true, updatable = true)
private valyuti valyuta_denezhnih_sredstv;

public valyuti getValyuta_denezhnih_sredstv(){ try{return this.valyuta_denezhnih_sredstv;}catch(Exception ex){ return null;} }

public void setValyuta_denezhnih_sredstv( Object _valyuta_denezhnih_sredstv){if (_valyuta_denezhnih_sredstv instanceof String){this.valyuta_denezhnih_sredstv= new valyuti (_valyuta_denezhnih_sredstv.toString());}else{try{this.valyuta_denezhnih_sredstv= (valyuti) _valyuta_denezhnih_sredstv;}catch(Exception ex){Variables.logger.error(ex);this.valyuta_denezhnih_sredstv= new valyuti (_valyuta_denezhnih_sredstv.toString());}}}

public UUID getValyuta_denezhnih_sredstv_uuid(){ try{return this.valyuta_denezhnih_sredstv.getGuid();}catch(Exception ex){return null;} }

public String getValyuta_denezhnih_sredstv_type(){ try{return this.valyuta_denezhnih_sredstv.getClass().getName();}catch(Exception ex){return null;} }

public valyuti getValyuta_denezhnih_sredstv_obj(){ return this.valyuta_denezhnih_sredstv; }

public void setValyuta_denezhnih_sredstv_obj( Object _valyuta_denezhnih_sredstv){ this.valyuta_denezhnih_sredstv=(valyuti) _valyuta_denezhnih_sredstv; }


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


@Column(name="naimenovanie_banka", columnDefinition="text")
private String naimenovanie_banka;

public void setNaimenovanie_banka(String _naimenovanie_banka){ this.naimenovanie_banka=_naimenovanie_banka; }

public String getNaimenovanie_banka(){ return this.naimenovanie_banka; }


@Column(name="korr_schet_banka", columnDefinition="text")
private String korr_schet_banka;

public void setKorr_schet_banka(String _korr_schet_banka){ this.korr_schet_banka=_korr_schet_banka; }

public String getKorr_schet_banka(){ return this.korr_schet_banka; }


@Column(name="gorod_banka", columnDefinition="text")
private String gorod_banka;

public void setGorod_banka(String _gorod_banka){ this.gorod_banka=_gorod_banka; }

public String getGorod_banka(){ return this.gorod_banka; }


@Column(name="adres_banka", columnDefinition="text")
private String adres_banka;

public void setAdres_banka(String _adres_banka){ this.adres_banka=_adres_banka; }

public String getAdres_banka(){ return this.adres_banka; }


@Column(name="telefoni_banka", columnDefinition="text")
private String telefoni_banka;

public void setTelefoni_banka(String _telefoni_banka){ this.telefoni_banka=_telefoni_banka; }

public String getTelefoni_banka(){ return this.telefoni_banka; }


@Column(name="k_p_p_korrespondenta", columnDefinition="text")
private String k_p_p_korrespondenta;

public void setK_p_p_korrespondenta(String _k_p_p_korrespondenta){ this.k_p_p_korrespondenta=_k_p_p_korrespondenta; }

public String getK_p_p_korrespondenta(){ return this.k_p_p_korrespondenta; }


@Column(name="b_i_k_banka_dlja_raschetov", columnDefinition="text")
private String b_i_k_banka_dlja_raschetov;

public void setB_i_k_banka_dlja_raschetov(String _b_i_k_banka_dlja_raschetov){ this.b_i_k_banka_dlja_raschetov=_b_i_k_banka_dlja_raschetov; }

public String getB_i_k_banka_dlja_raschetov(){ return this.b_i_k_banka_dlja_raschetov; }


@Column(name="ruchnoe_izmenenie_rekvizitov_banka_dlja_raschetov")

private Boolean ruchnoe_izmenenie_rekvizitov_banka_dlja_raschetov;
public void setRuchnoe_izmenenie_rekvizitov_banka_dlja_raschetov(Boolean _ruchnoe_izmenenie_rekvizitov_banka_dlja_raschetov){ this.ruchnoe_izmenenie_rekvizitov_banka_dlja_raschetov=_ruchnoe_izmenenie_rekvizitov_banka_dlja_raschetov; }

public Boolean getRuchnoe_izmenenie_rekvizitov_banka_dlja_raschetov(){ return this.ruchnoe_izmenenie_rekvizitov_banka_dlja_raschetov; }


@Column(name="naimenovanie_banka_dlja_raschetov", columnDefinition="text")
private String naimenovanie_banka_dlja_raschetov;

public void setNaimenovanie_banka_dlja_raschetov(String _naimenovanie_banka_dlja_raschetov){ this.naimenovanie_banka_dlja_raschetov=_naimenovanie_banka_dlja_raschetov; }

public String getNaimenovanie_banka_dlja_raschetov(){ return this.naimenovanie_banka_dlja_raschetov; }


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


@Column(name="i_n_n_korrespondenta", columnDefinition="text")
private String i_n_n_korrespondenta;

public void setI_n_n_korrespondenta(String _i_n_n_korrespondenta){ this.i_n_n_korrespondenta=_i_n_n_korrespondenta; }

public String getI_n_n_korrespondenta(){ return this.i_n_n_korrespondenta; }


}
