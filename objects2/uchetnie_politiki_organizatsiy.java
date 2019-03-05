import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="uchetnie_politiki_organizatsiy")
public class uchetnie_politiki_organizatsiy implements Serializable {

public uchetnie_politiki_organizatsiy(){}

public uchetnie_politiki_organizatsiy(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="data_perehoda_na_u_s_n", columnDefinition="text")
private String data_perehoda_na_u_s_n;

public void setData_perehoda_na_u_s_n(String _data_perehoda_na_u_s_n){ this.data_perehoda_na_u_s_n=_data_perehoda_na_u_s_n; }

public String getData_perehoda_na_u_s_n(){ return this.data_perehoda_na_u_s_n; }


@Column(name="sborka_tovarov_cherez_schet20")

private Boolean sborka_tovarov_cherez_schet20;
public void setSborka_tovarov_cherez_schet20(Boolean _sborka_tovarov_cherez_schet20){ this.sborka_tovarov_cherez_schet20=_sborka_tovarov_cherez_schet20; }

public Boolean getSborka_tovarov_cherez_schet20(){ return this.sborka_tovarov_cherez_schet20; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }



@Column(name="primenjaetsja_p_b_u18")

private Boolean primenjaetsja_p_b_u18;
public void setPrimenjaetsja_p_b_u18(Boolean _primenjaetsja_p_b_u18){ this.primenjaetsja_p_b_u18=_primenjaetsja_p_b_u18; }

public Boolean getPrimenjaetsja_p_b_u18(){ return this.primenjaetsja_p_b_u18; }


@Column(name="primenjaetsja_e_n_v_d")

private Boolean primenjaetsja_e_n_v_d;
public void setPrimenjaetsja_e_n_v_d(Boolean _primenjaetsja_e_n_v_d){ this.primenjaetsja_e_n_v_d=_primenjaetsja_e_n_v_d; }

public Boolean getPrimenjaetsja_e_n_v_d(){ return this.primenjaetsja_e_n_v_d; }


@Column(name="primenjaetsja_uchet_n_d_s_po_fakticheskomu_ispolzovaniyu")

private Boolean primenjaetsja_uchet_n_d_s_po_fakticheskomu_ispolzovaniyu;
public void setPrimenjaetsja_uchet_n_d_s_po_fakticheskomu_ispolzovaniyu(Boolean _primenjaetsja_uchet_n_d_s_po_fakticheskomu_ispolzovaniyu){ this.primenjaetsja_uchet_n_d_s_po_fakticheskomu_ispolzovaniyu=_primenjaetsja_uchet_n_d_s_po_fakticheskomu_ispolzovaniyu; }

public Boolean getPrimenjaetsja_uchet_n_d_s_po_fakticheskomu_ispolzovaniyu(){ return this.primenjaetsja_uchet_n_d_s_po_fakticheskomu_ispolzovaniyu; }


@Column(name="analitika_rashodov_ne_n_d_s", columnDefinition="text")
private String analitika_rashodov_ne_n_d_s;

public void setAnalitika_rashodov_ne_n_d_s(String _analitika_rashodov_ne_n_d_s){ this.analitika_rashodov_ne_n_d_s=_analitika_rashodov_ne_n_d_s; }

public String getAnalitika_rashodov_ne_n_d_s(){ return this.analitika_rashodov_ne_n_d_s; }


@Column(name="provodki_po_rabotnikam")

private Boolean provodki_po_rabotnikam;
public void setProvodki_po_rabotnikam(Boolean _provodki_po_rabotnikam){ this.provodki_po_rabotnikam=_provodki_po_rabotnikam; }

public Boolean getProvodki_po_rabotnikam(){ return this.provodki_po_rabotnikam; }


@Column(name="uchet_gotovoy_produktsii_po_planovoy_stoimosti")

private Boolean uchet_gotovoy_produktsii_po_planovoy_stoimosti;
public void setUchet_gotovoy_produktsii_po_planovoy_stoimosti(Boolean _uchet_gotovoy_produktsii_po_planovoy_stoimosti){ this.uchet_gotovoy_produktsii_po_planovoy_stoimosti=_uchet_gotovoy_produktsii_po_planovoy_stoimosti; }

public Boolean getUchet_gotovoy_produktsii_po_planovoy_stoimosti(){ return this.uchet_gotovoy_produktsii_po_planovoy_stoimosti; }


@Column(name="ispolzovat_schet40")

private Boolean ispolzovat_schet40;
public void setIspolzovat_schet40(Boolean _ispolzovat_schet40){ this.ispolzovat_schet40=_ispolzovat_schet40; }

public Boolean getIspolzovat_schet40(){ return this.ispolzovat_schet40; }


@Column(name="uchitivat5_protsentniy_porog")

private Boolean uchitivat5_protsentniy_porog;
public void setUchitivat5_protsentniy_porog(Boolean _uchitivat5_protsentniy_porog){ this.uchitivat5_protsentniy_porog=_uchitivat5_protsentniy_porog; }

public Boolean getUchitivat5_protsentniy_porog(){ return this.uchitivat5_protsentniy_porog; }


@Column(name="udalit_sborka_tovarov_cherez20_schet_ne_trebuet_obnovlenija")

private Boolean udalit_sborka_tovarov_cherez20_schet_ne_trebuet_obnovlenija;
public void setUdalit_sborka_tovarov_cherez20_schet_ne_trebuet_obnovlenija(Boolean _udalit_sborka_tovarov_cherez20_schet_ne_trebuet_obnovlenija){ this.udalit_sborka_tovarov_cherez20_schet_ne_trebuet_obnovlenija=_udalit_sborka_tovarov_cherez20_schet_ne_trebuet_obnovlenija; }

public Boolean getUdalit_sborka_tovarov_cherez20_schet_ne_trebuet_obnovlenija(){ return this.udalit_sborka_tovarov_cherez20_schet_ne_trebuet_obnovlenija; }


@Column(name="uvedomlenie_data_u_s_n", columnDefinition="text")
private String uvedomlenie_data_u_s_n;

public void setUvedomlenie_data_u_s_n(String _uvedomlenie_data_u_s_n){ this.uvedomlenie_data_u_s_n=_uvedomlenie_data_u_s_n; }

public String getUvedomlenie_data_u_s_n(){ return this.uvedomlenie_data_u_s_n; }


@Column(name="formirovat_rezervi_po_somnitelnim_dolgam_b_u")

private Boolean formirovat_rezervi_po_somnitelnim_dolgam_b_u;
public void setFormirovat_rezervi_po_somnitelnim_dolgam_b_u(Boolean _formirovat_rezervi_po_somnitelnim_dolgam_b_u){ this.formirovat_rezervi_po_somnitelnim_dolgam_b_u=_formirovat_rezervi_po_somnitelnim_dolgam_b_u; }

public Boolean getFormirovat_rezervi_po_somnitelnim_dolgam_b_u(){ return this.formirovat_rezervi_po_somnitelnim_dolgam_b_u; }


@Column(name="formirovat_rezervi_po_somnitelnim_dolgam_n_u")

private Boolean formirovat_rezervi_po_somnitelnim_dolgam_n_u;
public void setFormirovat_rezervi_po_somnitelnim_dolgam_n_u(Boolean _formirovat_rezervi_po_somnitelnim_dolgam_n_u){ this.formirovat_rezervi_po_somnitelnim_dolgam_n_u=_formirovat_rezervi_po_somnitelnim_dolgam_n_u; }

public Boolean getFormirovat_rezervi_po_somnitelnim_dolgam_n_u(){ return this.formirovat_rezervi_po_somnitelnim_dolgam_n_u; }


@Column(name="zabalansoviy_uchet_t_m_ts_v_ekspluatatsii")

private Boolean zabalansoviy_uchet_t_m_ts_v_ekspluatatsii;
public void setZabalansoviy_uchet_t_m_ts_v_ekspluatatsii(Boolean _zabalansoviy_uchet_t_m_ts_v_ekspluatatsii){ this.zabalansoviy_uchet_t_m_ts_v_ekspluatatsii=_zabalansoviy_uchet_t_m_ts_v_ekspluatatsii; }

public Boolean getZabalansoviy_uchet_t_m_ts_v_ekspluatatsii(){ return this.zabalansoviy_uchet_t_m_ts_v_ekspluatatsii; }


@Column(name="vzaimozachet_cherez_schet76")

private Boolean vzaimozachet_cherez_schet76;
public void setVzaimozachet_cherez_schet76(Boolean _vzaimozachet_cherez_schet76){ this.vzaimozachet_cherez_schet76=_vzaimozachet_cherez_schet76; }

public Boolean getVzaimozachet_cherez_schet76(){ return this.vzaimozachet_cherez_schet76; }


@Column(name="javljaetsja_platelshchikom_n_d_p_i")

private Boolean javljaetsja_platelshchikom_n_d_p_i;
public void setJavljaetsja_platelshchikom_n_d_p_i(Boolean _javljaetsja_platelshchikom_n_d_p_i){ this.javljaetsja_platelshchikom_n_d_p_i=_javljaetsja_platelshchikom_n_d_p_i; }

public Boolean getJavljaetsja_platelshchikom_n_d_p_i(){ return this.javljaetsja_platelshchikom_n_d_p_i; }


@Column(name="formirovat_rezerv_otpuskov_b_u")

private Boolean formirovat_rezerv_otpuskov_b_u;
public void setFormirovat_rezerv_otpuskov_b_u(Boolean _formirovat_rezerv_otpuskov_b_u){ this.formirovat_rezerv_otpuskov_b_u=_formirovat_rezerv_otpuskov_b_u; }

public Boolean getFormirovat_rezerv_otpuskov_b_u(){ return this.formirovat_rezerv_otpuskov_b_u; }


@Column(name="formirovat_rezerv_otpuskov_n_u")

private Boolean formirovat_rezerv_otpuskov_n_u;
public void setFormirovat_rezerv_otpuskov_n_u(Boolean _formirovat_rezerv_otpuskov_n_u){ this.formirovat_rezerv_otpuskov_n_u=_formirovat_rezerv_otpuskov_n_u; }

public Boolean getFormirovat_rezerv_otpuskov_n_u(){ return this.formirovat_rezerv_otpuskov_n_u; }


@Column(name="normativ_otchisleniy_v_rezerv_otpuskov")

private Float normativ_otchisleniy_v_rezerv_otpuskov;
public void setNormativ_otchisleniy_v_rezerv_otpuskov(Float _normativ_otchisleniy_v_rezerv_otpuskov){ this.normativ_otchisleniy_v_rezerv_otpuskov=_normativ_otchisleniy_v_rezerv_otpuskov; }

public Float getNormativ_otchisleniy_v_rezerv_otpuskov(){ return this.normativ_otchisleniy_v_rezerv_otpuskov; }


@Column(name="predelnaja_velichina_otchisleniy_v_rezerv_otpuskov")

private Float predelnaja_velichina_otchisleniy_v_rezerv_otpuskov;
public void setPredelnaja_velichina_otchisleniy_v_rezerv_otpuskov(Float _predelnaja_velichina_otchisleniy_v_rezerv_otpuskov){ this.predelnaja_velichina_otchisleniy_v_rezerv_otpuskov=_predelnaja_velichina_otchisleniy_v_rezerv_otpuskov; }

public Float getPredelnaja_velichina_otchisleniy_v_rezerv_otpuskov(){ return this.predelnaja_velichina_otchisleniy_v_rezerv_otpuskov; }


@Column(name="stavka_naloga_u_s_n")

private Float stavka_naloga_u_s_n;
public void setStavka_naloga_u_s_n(Float _stavka_naloga_u_s_n){ this.stavka_naloga_u_s_n=_stavka_naloga_u_s_n; }

public Float getStavka_naloga_u_s_n(){ return this.stavka_naloga_u_s_n; }


@Column(name="uvedomlenie_nomer_u_s_n", columnDefinition="text")
private String uvedomlenie_nomer_u_s_n;

public void setUvedomlenie_nomer_u_s_n(String _uvedomlenie_nomer_u_s_n){ this.uvedomlenie_nomer_u_s_n=_uvedomlenie_nomer_u_s_n; }

public String getUvedomlenie_nomer_u_s_n(){ return this.uvedomlenie_nomer_u_s_n; }


@Column(name="analitika_rashodov_e_n_v_d", columnDefinition="text")
private String analitika_rashodov_e_n_v_d;

public void setAnalitika_rashodov_e_n_v_d(String _analitika_rashodov_e_n_v_d){ this.analitika_rashodov_e_n_v_d=_analitika_rashodov_e_n_v_d; }

public String getAnalitika_rashodov_e_n_v_d(){ return this.analitika_rashodov_e_n_v_d; }


@Column(name="vklyuchat_v_sostav_nalogovih_rashodov_lizingovie_platezhi")

private Boolean vklyuchat_v_sostav_nalogovih_rashodov_lizingovie_platezhi;
public void setVklyuchat_v_sostav_nalogovih_rashodov_lizingovie_platezhi(Boolean _vklyuchat_v_sostav_nalogovih_rashodov_lizingovie_platezhi){ this.vklyuchat_v_sostav_nalogovih_rashodov_lizingovie_platezhi=_vklyuchat_v_sostav_nalogovih_rashodov_lizingovie_platezhi; }

public Boolean getVklyuchat_v_sostav_nalogovih_rashodov_lizingovie_platezhi(){ return this.vklyuchat_v_sostav_nalogovih_rashodov_lizingovie_platezhi; }


@Column(name="primenjaetsja_osvobozhdenie_ot_uplati_n_d_s")

private Boolean primenjaetsja_osvobozhdenie_ot_uplati_n_d_s;
public void setPrimenjaetsja_osvobozhdenie_ot_uplati_n_d_s(Boolean _primenjaetsja_osvobozhdenie_ot_uplati_n_d_s){ this.primenjaetsja_osvobozhdenie_ot_uplati_n_d_s=_primenjaetsja_osvobozhdenie_ot_uplati_n_d_s; }

public Boolean getPrimenjaetsja_osvobozhdenie_ot_uplati_n_d_s(){ return this.primenjaetsja_osvobozhdenie_ot_uplati_n_d_s; }


}
