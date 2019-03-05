import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="politiki_ucheta_seriy")
public class politiki_ucheta_seriy implements Serializable {

public politiki_ucheta_seriy(){}

public politiki_ucheta_seriy(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="opisanie", columnDefinition="text")
private String opisanie;

public void setOpisanie(String _opisanie){ this.opisanie=_opisanie; }

public String getOpisanie(){ return this.opisanie; }


@Column(name="ukazivat_pri_proizvodstve_produktsii")

private Boolean ukazivat_pri_proizvodstve_produktsii;
public void setUkazivat_pri_proizvodstve_produktsii(Boolean _ukazivat_pri_proizvodstve_produktsii){ this.ukazivat_pri_proizvodstve_produktsii=_ukazivat_pri_proizvodstve_produktsii; }

public Boolean getUkazivat_pri_proizvodstve_produktsii(){ return this.ukazivat_pri_proizvodstve_produktsii; }


@Column(name="ukazivat_pri_priemke_produktsii_iz_proizvodstva")

private Boolean ukazivat_pri_priemke_produktsii_iz_proizvodstva;
public void setUkazivat_pri_priemke_produktsii_iz_proizvodstva(Boolean _ukazivat_pri_priemke_produktsii_iz_proizvodstva){ this.ukazivat_pri_priemke_produktsii_iz_proizvodstva=_ukazivat_pri_priemke_produktsii_iz_proizvodstva; }

public Boolean getUkazivat_pri_priemke_produktsii_iz_proizvodstva(){ return this.ukazivat_pri_priemke_produktsii_iz_proizvodstva; }


@Column(name="ukazivat_pri_priemke_po_prochemu_oprihodovaniyu")

private Boolean ukazivat_pri_priemke_po_prochemu_oprihodovaniyu;
public void setUkazivat_pri_priemke_po_prochemu_oprihodovaniyu(Boolean _ukazivat_pri_priemke_po_prochemu_oprihodovaniyu){ this.ukazivat_pri_priemke_po_prochemu_oprihodovaniyu=_ukazivat_pri_priemke_po_prochemu_oprihodovaniyu; }

public Boolean getUkazivat_pri_priemke_po_prochemu_oprihodovaniyu(){ return this.ukazivat_pri_priemke_po_prochemu_oprihodovaniyu; }


@Column(name="ukazivat_pri_otrazhenii_zatrat_na_proizvodstvo")

private Boolean ukazivat_pri_otrazhenii_zatrat_na_proizvodstvo;
public void setUkazivat_pri_otrazhenii_zatrat_na_proizvodstvo(Boolean _ukazivat_pri_otrazhenii_zatrat_na_proizvodstvo){ this.ukazivat_pri_otrazhenii_zatrat_na_proizvodstvo=_ukazivat_pri_otrazhenii_zatrat_na_proizvodstvo; }

public Boolean getUkazivat_pri_otrazhenii_zatrat_na_proizvodstvo(){ return this.ukazivat_pri_otrazhenii_zatrat_na_proizvodstvo; }


@Column(name="ukazivat_pri_vozvrate_na_sklad")

private Boolean ukazivat_pri_vozvrate_na_sklad;
public void setUkazivat_pri_vozvrate_na_sklad(Boolean _ukazivat_pri_vozvrate_na_sklad){ this.ukazivat_pri_vozvrate_na_sklad=_ukazivat_pri_vozvrate_na_sklad; }

public Boolean getUkazivat_pri_vozvrate_na_sklad(){ return this.ukazivat_pri_vozvrate_na_sklad; }



@Column(name="ukazivat_pri_pereschete_tovarov")

private Boolean ukazivat_pri_pereschete_tovarov;
public void setUkazivat_pri_pereschete_tovarov(Boolean _ukazivat_pri_pereschete_tovarov){ this.ukazivat_pri_pereschete_tovarov=_ukazivat_pri_pereschete_tovarov; }

public Boolean getUkazivat_pri_pereschete_tovarov(){ return this.ukazivat_pri_pereschete_tovarov; }


@Column(name="ukazivat_pri_rashode_materialov")

private Boolean ukazivat_pri_rashode_materialov;
public void setUkazivat_pri_rashode_materialov(Boolean _ukazivat_pri_rashode_materialov){ this.ukazivat_pri_rashode_materialov=_ukazivat_pri_rashode_materialov; }

public Boolean getUkazivat_pri_rashode_materialov(){ return this.ukazivat_pri_rashode_materialov; }


@Column(name="ukazivat_pri_priemke_po_vozvratu_ot_klienta")

private Boolean ukazivat_pri_priemke_po_vozvratu_ot_klienta;
public void setUkazivat_pri_priemke_po_vozvratu_ot_klienta(Boolean _ukazivat_pri_priemke_po_vozvratu_ot_klienta){ this.ukazivat_pri_priemke_po_vozvratu_ot_klienta=_ukazivat_pri_priemke_po_vozvratu_ot_klienta; }

public Boolean getUkazivat_pri_priemke_po_vozvratu_ot_klienta(){ return this.ukazivat_pri_priemke_po_vozvratu_ot_klienta; }



@Column(name="ukazivat_po_faktu_otbora")

private Boolean ukazivat_po_faktu_otbora;
public void setUkazivat_po_faktu_otbora(Boolean _ukazivat_po_faktu_otbora){ this.ukazivat_po_faktu_otbora=_ukazivat_po_faktu_otbora; }

public Boolean getUkazivat_po_faktu_otbora(){ return this.ukazivat_po_faktu_otbora; }


@Column(name="ukazivat_pri_otgruzke")

private Boolean ukazivat_pri_otgruzke;
public void setUkazivat_pri_otgruzke(Boolean _ukazivat_pri_otgruzke){ this.ukazivat_pri_otgruzke=_ukazivat_pri_otgruzke; }

public Boolean getUkazivat_pri_otgruzke(){ return this.ukazivat_pri_otgruzke; }


@Column(name="ukazivat_pri_otgruzke_klientu")

private Boolean ukazivat_pri_otgruzke_klientu;
public void setUkazivat_pri_otgruzke_klientu(Boolean _ukazivat_pri_otgruzke_klientu){ this.ukazivat_pri_otgruzke_klientu=_ukazivat_pri_otgruzke_klientu; }

public Boolean getUkazivat_pri_otgruzke_klientu(){ return this.ukazivat_pri_otgruzke_klientu; }


@Column(name="ukazivat_pri_vipuske_v_podrazdelenie")

private Boolean ukazivat_pri_vipuske_v_podrazdelenie;
public void setUkazivat_pri_vipuske_v_podrazdelenie(Boolean _ukazivat_pri_vipuske_v_podrazdelenie){ this.ukazivat_pri_vipuske_v_podrazdelenie=_ukazivat_pri_vipuske_v_podrazdelenie; }

public Boolean getUkazivat_pri_vipuske_v_podrazdelenie(){ return this.ukazivat_pri_vipuske_v_podrazdelenie; }


@Column(name="ukazivat_pri_dvizhenii_materialov")

private Boolean ukazivat_pri_dvizhenii_materialov;
public void setUkazivat_pri_dvizhenii_materialov(Boolean _ukazivat_pri_dvizhenii_materialov){ this.ukazivat_pri_dvizhenii_materialov=_ukazivat_pri_dvizhenii_materialov; }

public Boolean getUkazivat_pri_dvizhenii_materialov(){ return this.ukazivat_pri_dvizhenii_materialov; }


@Column(name="dlja_sklada")

private Boolean dlja_sklada;
public void setDlja_sklada(Boolean _dlja_sklada){ this.dlja_sklada=_dlja_sklada; }

public Boolean getDlja_sklada(){ return this.dlja_sklada; }


@Column(name="ukazivat_pri_dvizhenii_produktsii")

private Boolean ukazivat_pri_dvizhenii_produktsii;
public void setUkazivat_pri_dvizhenii_produktsii(Boolean _ukazivat_pri_dvizhenii_produktsii){ this.ukazivat_pri_dvizhenii_produktsii=_ukazivat_pri_dvizhenii_produktsii; }

public Boolean getUkazivat_pri_dvizhenii_produktsii(){ return this.ukazivat_pri_dvizhenii_produktsii; }


@Column(name="ukazivat_pri_otgruzke_v_roznitsu")

private Boolean ukazivat_pri_otgruzke_v_roznitsu;
public void setUkazivat_pri_otgruzke_v_roznitsu(Boolean _ukazivat_pri_otgruzke_v_roznitsu){ this.ukazivat_pri_otgruzke_v_roznitsu=_ukazivat_pri_otgruzke_v_roznitsu; }

public Boolean getUkazivat_pri_otgruzke_v_roznitsu(){ return this.ukazivat_pri_otgruzke_v_roznitsu; }


@Column(name="ukazivat_pri_otgruzke_komplektov_dlja_razborki")

private Boolean ukazivat_pri_otgruzke_komplektov_dlja_razborki;
public void setUkazivat_pri_otgruzke_komplektov_dlja_razborki(Boolean _ukazivat_pri_otgruzke_komplektov_dlja_razborki){ this.ukazivat_pri_otgruzke_komplektov_dlja_razborki=_ukazivat_pri_otgruzke_komplektov_dlja_razborki; }

public Boolean getUkazivat_pri_otgruzke_komplektov_dlja_razborki(){ return this.ukazivat_pri_otgruzke_komplektov_dlja_razborki; }


@Column(name="ukazivat_pri_otgruzke_komplektuyushchih_dlja_sborki")

private Boolean ukazivat_pri_otgruzke_komplektuyushchih_dlja_sborki;
public void setUkazivat_pri_otgruzke_komplektuyushchih_dlja_sborki(Boolean _ukazivat_pri_otgruzke_komplektuyushchih_dlja_sborki){ this.ukazivat_pri_otgruzke_komplektuyushchih_dlja_sborki=_ukazivat_pri_otgruzke_komplektuyushchih_dlja_sborki; }

public Boolean getUkazivat_pri_otgruzke_komplektuyushchih_dlja_sborki(){ return this.ukazivat_pri_otgruzke_komplektuyushchih_dlja_sborki; }


@Column(name="ukazivat_pri_otgruzke_na_vnutrennie_nuzhdi")

private Boolean ukazivat_pri_otgruzke_na_vnutrennie_nuzhdi;
public void setUkazivat_pri_otgruzke_na_vnutrennie_nuzhdi(Boolean _ukazivat_pri_otgruzke_na_vnutrennie_nuzhdi){ this.ukazivat_pri_otgruzke_na_vnutrennie_nuzhdi=_ukazivat_pri_otgruzke_na_vnutrennie_nuzhdi; }

public Boolean getUkazivat_pri_otgruzke_na_vnutrennie_nuzhdi(){ return this.ukazivat_pri_otgruzke_na_vnutrennie_nuzhdi; }


@Column(name="ukazivat_pri_planirovanii_otbora")

private Boolean ukazivat_pri_planirovanii_otbora;
public void setUkazivat_pri_planirovanii_otbora(Boolean _ukazivat_pri_planirovanii_otbora){ this.ukazivat_pri_planirovanii_otbora=_ukazivat_pri_planirovanii_otbora; }

public Boolean getUkazivat_pri_planirovanii_otbora(){ return this.ukazivat_pri_planirovanii_otbora; }


@Column(name="ukazivat_pri_otgruzke_po_vozvratu_postavshchiku")

private Boolean ukazivat_pri_otgruzke_po_vozvratu_postavshchiku;
public void setUkazivat_pri_otgruzke_po_vozvratu_postavshchiku(Boolean _ukazivat_pri_otgruzke_po_vozvratu_postavshchiku){ this.ukazivat_pri_otgruzke_po_vozvratu_postavshchiku=_ukazivat_pri_otgruzke_po_vozvratu_postavshchiku; }

public Boolean getUkazivat_pri_otgruzke_po_vozvratu_postavshchiku(){ return this.ukazivat_pri_otgruzke_po_vozvratu_postavshchiku; }


@Column(name="ukazivat_pri_otgruzke_po_peremeshcheniyu")

private Boolean ukazivat_pri_otgruzke_po_peremeshcheniyu;
public void setUkazivat_pri_otgruzke_po_peremeshcheniyu(Boolean _ukazivat_pri_otgruzke_po_peremeshcheniyu){ this.ukazivat_pri_otgruzke_po_peremeshcheniyu=_ukazivat_pri_otgruzke_po_peremeshcheniyu; }

public Boolean getUkazivat_pri_otgruzke_po_peremeshcheniyu(){ return this.ukazivat_pri_otgruzke_po_peremeshcheniyu; }


@Column(name="ukazivat_pri_priemke_sobrannih_komplektov")

private Boolean ukazivat_pri_priemke_sobrannih_komplektov;
public void setUkazivat_pri_priemke_sobrannih_komplektov(Boolean _ukazivat_pri_priemke_sobrannih_komplektov){ this.ukazivat_pri_priemke_sobrannih_komplektov=_ukazivat_pri_priemke_sobrannih_komplektov; }

public Boolean getUkazivat_pri_priemke_sobrannih_komplektov(){ return this.ukazivat_pri_priemke_sobrannih_komplektov; }


@Column(name="ukazivat_pri_otrazhenii_izlishkov")

private Boolean ukazivat_pri_otrazhenii_izlishkov;
public void setUkazivat_pri_otrazhenii_izlishkov(Boolean _ukazivat_pri_otrazhenii_izlishkov){ this.ukazivat_pri_otrazhenii_izlishkov=_ukazivat_pri_otrazhenii_izlishkov; }

public Boolean getUkazivat_pri_otrazhenii_izlishkov(){ return this.ukazivat_pri_otrazhenii_izlishkov; }


@Column(name="ukazivat_pri_otrazhenii_nedostach")

private Boolean ukazivat_pri_otrazhenii_nedostach;
public void setUkazivat_pri_otrazhenii_nedostach(Boolean _ukazivat_pri_otrazhenii_nedostach){ this.ukazivat_pri_otrazhenii_nedostach=_ukazivat_pri_otrazhenii_nedostach; }

public Boolean getUkazivat_pri_otrazhenii_nedostach(){ return this.ukazivat_pri_otrazhenii_nedostach; }


@Column(name="ukazivat_pri_peremeshchenii_mezhdu_pomeshchenijami")

private Boolean ukazivat_pri_peremeshchenii_mezhdu_pomeshchenijami;
public void setUkazivat_pri_peremeshchenii_mezhdu_pomeshchenijami(Boolean _ukazivat_pri_peremeshchenii_mezhdu_pomeshchenijami){ this.ukazivat_pri_peremeshchenii_mezhdu_pomeshchenijami=_ukazivat_pri_peremeshchenii_mezhdu_pomeshchenijami; }

public Boolean getUkazivat_pri_peremeshchenii_mezhdu_pomeshchenijami(){ return this.ukazivat_pri_peremeshchenii_mezhdu_pomeshchenijami; }


@Column(name="ukazivat_pri_priemke_po_peremeshcheniyu")

private Boolean ukazivat_pri_priemke_po_peremeshcheniyu;
public void setUkazivat_pri_priemke_po_peremeshcheniyu(Boolean _ukazivat_pri_priemke_po_peremeshcheniyu){ this.ukazivat_pri_priemke_po_peremeshcheniyu=_ukazivat_pri_priemke_po_peremeshcheniyu; }

public Boolean getUkazivat_pri_priemke_po_peremeshcheniyu(){ return this.ukazivat_pri_priemke_po_peremeshcheniyu; }


@Column(name="ukazivat_pri_planirovanii_otgruzki")

private Boolean ukazivat_pri_planirovanii_otgruzki;
public void setUkazivat_pri_planirovanii_otgruzki(Boolean _ukazivat_pri_planirovanii_otgruzki){ this.ukazivat_pri_planirovanii_otgruzki=_ukazivat_pri_planirovanii_otgruzki; }

public Boolean getUkazivat_pri_planirovanii_otgruzki(){ return this.ukazivat_pri_planirovanii_otgruzki; }


@Column(name="ukazivat_pri_priemke")

private Boolean ukazivat_pri_priemke;
public void setUkazivat_pri_priemke(Boolean _ukazivat_pri_priemke){ this.ukazivat_pri_priemke=_ukazivat_pri_priemke; }

public Boolean getUkazivat_pri_priemke(){ return this.ukazivat_pri_priemke; }


@Column(name="uchet_tovarov_v_puti_ot_postavshchika_po_serijam")

private Boolean uchet_tovarov_v_puti_ot_postavshchika_po_serijam;
public void setUchet_tovarov_v_puti_ot_postavshchika_po_serijam(Boolean _uchet_tovarov_v_puti_ot_postavshchika_po_serijam){ this.uchet_tovarov_v_puti_ot_postavshchika_po_serijam=_uchet_tovarov_v_puti_ot_postavshchika_po_serijam; }

public Boolean getUchet_tovarov_v_puti_ot_postavshchika_po_serijam(){ return this.uchet_tovarov_v_puti_ot_postavshchika_po_serijam; }


@Column(name="ukazivat_pri_poluchenii_materialov")

private Boolean ukazivat_pri_poluchenii_materialov;
public void setUkazivat_pri_poluchenii_materialov(Boolean _ukazivat_pri_poluchenii_materialov){ this.ukazivat_pri_poluchenii_materialov=_ukazivat_pri_poluchenii_materialov; }

public Boolean getUkazivat_pri_poluchenii_materialov(){ return this.ukazivat_pri_poluchenii_materialov; }


@Column(name="ukazivat_pri_priemke_komplektuyushchih_posle_razborki")

private Boolean ukazivat_pri_priemke_komplektuyushchih_posle_razborki;
public void setUkazivat_pri_priemke_komplektuyushchih_posle_razborki(Boolean _ukazivat_pri_priemke_komplektuyushchih_posle_razborki){ this.ukazivat_pri_priemke_komplektuyushchih_posle_razborki=_ukazivat_pri_priemke_komplektuyushchih_posle_razborki; }

public Boolean getUkazivat_pri_priemke_komplektuyushchih_posle_razborki(){ return this.ukazivat_pri_priemke_komplektuyushchih_posle_razborki; }


@Column(name="ukazivat_pri_priemke_ot_postavshchika")

private Boolean ukazivat_pri_priemke_ot_postavshchika;
public void setUkazivat_pri_priemke_ot_postavshchika(Boolean _ukazivat_pri_priemke_ot_postavshchika){ this.ukazivat_pri_priemke_ot_postavshchika=_ukazivat_pri_priemke_ot_postavshchika; }

public Boolean getUkazivat_pri_priemke_ot_postavshchika(){ return this.ukazivat_pri_priemke_ot_postavshchika; }


@Column(name="ukazivat_pri_markirovke_produktsii_dlja_g_i_s_m")

private Boolean ukazivat_pri_markirovke_produktsii_dlja_g_i_s_m;
public void setUkazivat_pri_markirovke_produktsii_dlja_g_i_s_m(Boolean _ukazivat_pri_markirovke_produktsii_dlja_g_i_s_m){ this.ukazivat_pri_markirovke_produktsii_dlja_g_i_s_m=_ukazivat_pri_markirovke_produktsii_dlja_g_i_s_m; }

public Boolean getUkazivat_pri_markirovke_produktsii_dlja_g_i_s_m(){ return this.ukazivat_pri_markirovke_produktsii_dlja_g_i_s_m; }


@Column(name="uchet_seriy_pofefo")

private Boolean uchet_seriy_pofefo;
public void setUchet_seriy_pofefo(Boolean _uchet_seriy_pofefo){ this.uchet_seriy_pofefo=_uchet_seriy_pofefo; }

public Boolean getUchet_seriy_pofefo(){ return this.uchet_seriy_pofefo; }


@Column(name="uchitivat_ostatki_seriy")

private Boolean uchitivat_ostatki_seriy;
public void setUchitivat_ostatki_seriy(Boolean _uchitivat_ostatki_seriy){ this.uchitivat_ostatki_seriy=_uchitivat_ostatki_seriy; }

public Boolean getUchitivat_ostatki_seriy(){ return this.uchitivat_ostatki_seriy; }


@Column(name="uchitivat_sebestoimost_po_serijam")

private Boolean uchitivat_sebestoimost_po_serijam;
public void setUchitivat_sebestoimost_po_serijam(Boolean _uchitivat_sebestoimost_po_serijam){ this.uchitivat_sebestoimost_po_serijam=_uchitivat_sebestoimost_po_serijam; }

public Boolean getUchitivat_sebestoimost_po_serijam(){ return this.uchitivat_sebestoimost_po_serijam; }


@Column(name="ukazivat_pri_vozvrate_neprinjatih_poluchatelem_tovarov")

private Boolean ukazivat_pri_vozvrate_neprinjatih_poluchatelem_tovarov;
public void setUkazivat_pri_vozvrate_neprinjatih_poluchatelem_tovarov(Boolean _ukazivat_pri_vozvrate_neprinjatih_poluchatelem_tovarov){ this.ukazivat_pri_vozvrate_neprinjatih_poluchatelem_tovarov=_ukazivat_pri_vozvrate_neprinjatih_poluchatelem_tovarov; }

public Boolean getUkazivat_pri_vozvrate_neprinjatih_poluchatelem_tovarov(){ return this.ukazivat_pri_vozvrate_neprinjatih_poluchatelem_tovarov; }


@Column(name="dlja_proizvodstva")

private Boolean dlja_proizvodstva;
public void setDlja_proizvodstva(Boolean _dlja_proizvodstva){ this.dlja_proizvodstva=_dlja_proizvodstva; }

public Boolean getDlja_proizvodstva(){ return this.dlja_proizvodstva; }


@Column(name="uchet_seriy_v_neotfakturovannih_postavkah_tovarov")

private Boolean uchet_seriy_v_neotfakturovannih_postavkah_tovarov;
public void setUchet_seriy_v_neotfakturovannih_postavkah_tovarov(Boolean _uchet_seriy_v_neotfakturovannih_postavkah_tovarov){ this.uchet_seriy_v_neotfakturovannih_postavkah_tovarov=_uchet_seriy_v_neotfakturovannih_postavkah_tovarov; }

public Boolean getUchet_seriy_v_neotfakturovannih_postavkah_tovarov(){ return this.uchet_seriy_v_neotfakturovannih_postavkah_tovarov; }


}
