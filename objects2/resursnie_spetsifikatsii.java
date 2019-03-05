import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="resursnie_spetsifikatsii")
public class resursnie_spetsifikatsii implements Serializable {

public resursnie_spetsifikatsii(){}

public resursnie_spetsifikatsii(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="nachalo_deystvija", columnDefinition="text")
private String nachalo_deystvija;

public void setNachalo_deystvija(String _nachalo_deystvija){ this.nachalo_deystvija=_nachalo_deystvija; }

public String getNachalo_deystvija(){ return this.nachalo_deystvija; }


@Column(name="minimalnaja_partija_vipuska")

private Float minimalnaja_partija_vipuska;
public void setMinimalnaja_partija_vipuska(Float _minimalnaja_partija_vipuska){ this.minimalnaja_partija_vipuska=_minimalnaja_partija_vipuska; }

public Float getMinimalnaja_partija_vipuska(){ return this.minimalnaja_partija_vipuska; }


@Column(name="konets_deystvija", columnDefinition="text")
private String konets_deystvija;

public void setKonets_deystvija(String _konets_deystvija){ this.konets_deystvija=_konets_deystvija; }

public String getKonets_deystvija(){ return this.konets_deystvija; }


@Column(name="mnogoetapniy_proizvodstvenniy_protsess")

private Boolean mnogoetapniy_proizvodstvenniy_protsess;
public void setMnogoetapniy_proizvodstvenniy_protsess(Boolean _mnogoetapniy_proizvodstvenniy_protsess){ this.mnogoetapniy_proizvodstvenniy_protsess=_mnogoetapniy_proizvodstvenniy_protsess; }

public Boolean getMnogoetapniy_proizvodstvenniy_protsess(){ return this.mnogoetapniy_proizvodstvenniy_protsess; }


@Column(name="vipusk_proizvolnimi_portsijami")

private Boolean vipusk_proizvolnimi_portsijami;
public void setVipusk_proizvolnimi_portsijami(Boolean _vipusk_proizvolnimi_portsijami){ this.vipusk_proizvolnimi_portsijami=_vipusk_proizvolnimi_portsijami; }

public Boolean getVipusk_proizvolnimi_portsijami(){ return this.vipusk_proizvolnimi_portsijami; }


@ManyToOne
@JoinColumn(name="otvetstvenniy", insertable = true, updatable = true)
private polzovateli otvetstvenniy;

public polzovateli getOtvetstvenniy(){ try{return this.otvetstvenniy;}catch(Exception ex){ return null;} }

public void setOtvetstvenniy( Object _otvetstvenniy){if (_otvetstvenniy instanceof String){this.otvetstvenniy= new polzovateli (_otvetstvenniy.toString());}else{try{this.otvetstvenniy= (polzovateli) _otvetstvenniy;}catch(Exception ex){Variables.logger.error(ex);this.otvetstvenniy= new polzovateli (_otvetstvenniy.toString());}}}

public UUID getOtvetstvenniy_uuid(){ try{return this.otvetstvenniy.getGuid();}catch(Exception ex){return null;} }

public String getOtvetstvenniy_type(){ try{return this.otvetstvenniy.getClass().getName();}catch(Exception ex){return null;} }

public polzovateli getOtvetstvenniy_obj(){ return this.otvetstvenniy; }

public void setOtvetstvenniy_obj( Object _otvetstvenniy){ this.otvetstvenniy=(polzovateli) _otvetstvenniy; }


@Column(name="opisanie", columnDefinition="text")
private String opisanie;

public void setOpisanie(String _opisanie){ this.opisanie=_opisanie; }

public String getOpisanie(){ return this.opisanie; }


@Column(name="optimalnaja_partija_vipuska")

private Float optimalnaja_partija_vipuska;
public void setOptimalnaja_partija_vipuska(Float _optimalnaja_partija_vipuska){ this.optimalnaja_partija_vipuska=_optimalnaja_partija_vipuska; }

public Float getOptimalnaja_partija_vipuska(){ return this.optimalnaja_partija_vipuska; }


@Column(name="ogranichen_srok_prolezhivanija_vihodnih_izdeliy")

private Boolean ogranichen_srok_prolezhivanija_vihodnih_izdeliy;
public void setOgranichen_srok_prolezhivanija_vihodnih_izdeliy(Boolean _ogranichen_srok_prolezhivanija_vihodnih_izdeliy){ this.ogranichen_srok_prolezhivanija_vihodnih_izdeliy=_ogranichen_srok_prolezhivanija_vihodnih_izdeliy; }

public Boolean getOgranichen_srok_prolezhivanija_vihodnih_izdeliy(){ return this.ogranichen_srok_prolezhivanija_vihodnih_izdeliy; }


@Column(name="maksimalniy_srok_prolezhivanija_vihodnih_izdeliy")

private Float maksimalniy_srok_prolezhivanija_vihodnih_izdeliy;
public void setMaksimalniy_srok_prolezhivanija_vihodnih_izdeliy(Float _maksimalniy_srok_prolezhivanija_vihodnih_izdeliy){ this.maksimalniy_srok_prolezhivanija_vihodnih_izdeliy=_maksimalniy_srok_prolezhivanija_vihodnih_izdeliy; }

public Float getMaksimalniy_srok_prolezhivanija_vihodnih_izdeliy(){ return this.maksimalniy_srok_prolezhivanija_vihodnih_izdeliy; }


@Column(name="optimalnoe_kolichestvo_peredachi_mezhdu_etapami")

private Float optimalnoe_kolichestvo_peredachi_mezhdu_etapami;
public void setOptimalnoe_kolichestvo_peredachi_mezhdu_etapami(Float _optimalnoe_kolichestvo_peredachi_mezhdu_etapami){ this.optimalnoe_kolichestvo_peredachi_mezhdu_etapami=_optimalnoe_kolichestvo_peredachi_mezhdu_etapami; }

public Float getOptimalnoe_kolichestvo_peredachi_mezhdu_etapami(){ return this.optimalnoe_kolichestvo_peredachi_mezhdu_etapami; }


@Column(name="pechat_marshrutnoy_karti", columnDefinition="text")
private String pechat_marshrutnoy_karti;

public void setPechat_marshrutnoy_karti(String _pechat_marshrutnoy_karti){ this.pechat_marshrutnoy_karti=_pechat_marshrutnoy_karti; }

public String getPechat_marshrutnoy_karti(){ return this.pechat_marshrutnoy_karti; }


@ManyToOne
@JoinColumn(name="udalit_statja_kalkuljatsii_p_f_r", insertable = true, updatable = true)
private stati_kalkuljatsii udalit_statja_kalkuljatsii_p_f_r;

public stati_kalkuljatsii getUdalit_statja_kalkuljatsii_p_f_r(){ try{return this.udalit_statja_kalkuljatsii_p_f_r;}catch(Exception ex){ return null;} }

public void setUdalit_statja_kalkuljatsii_p_f_r( Object _udalit_statja_kalkuljatsii_p_f_r){if (_udalit_statja_kalkuljatsii_p_f_r instanceof String){this.udalit_statja_kalkuljatsii_p_f_r= new stati_kalkuljatsii (_udalit_statja_kalkuljatsii_p_f_r.toString());}else{try{this.udalit_statja_kalkuljatsii_p_f_r= (stati_kalkuljatsii) _udalit_statja_kalkuljatsii_p_f_r;}catch(Exception ex){Variables.logger.error(ex);this.udalit_statja_kalkuljatsii_p_f_r= new stati_kalkuljatsii (_udalit_statja_kalkuljatsii_p_f_r.toString());}}}

public UUID getUdalit_statja_kalkuljatsii_p_f_r_uuid(){ try{return this.udalit_statja_kalkuljatsii_p_f_r.getGuid();}catch(Exception ex){return null;} }

public String getUdalit_statja_kalkuljatsii_p_f_r_type(){ try{return this.udalit_statja_kalkuljatsii_p_f_r.getClass().getName();}catch(Exception ex){return null;} }

public stati_kalkuljatsii getUdalit_statja_kalkuljatsii_p_f_r_obj(){ return this.udalit_statja_kalkuljatsii_p_f_r; }

public void setUdalit_statja_kalkuljatsii_p_f_r_obj( Object _udalit_statja_kalkuljatsii_p_f_r){ this.udalit_statja_kalkuljatsii_p_f_r=(stati_kalkuljatsii) _udalit_statja_kalkuljatsii_p_f_r; }


@ManyToOne
@JoinColumn(name="udalit_statja_kalkuljatsii_f_s_s", insertable = true, updatable = true)
private stati_kalkuljatsii udalit_statja_kalkuljatsii_f_s_s;

public stati_kalkuljatsii getUdalit_statja_kalkuljatsii_f_s_s(){ try{return this.udalit_statja_kalkuljatsii_f_s_s;}catch(Exception ex){ return null;} }

public void setUdalit_statja_kalkuljatsii_f_s_s( Object _udalit_statja_kalkuljatsii_f_s_s){if (_udalit_statja_kalkuljatsii_f_s_s instanceof String){this.udalit_statja_kalkuljatsii_f_s_s= new stati_kalkuljatsii (_udalit_statja_kalkuljatsii_f_s_s.toString());}else{try{this.udalit_statja_kalkuljatsii_f_s_s= (stati_kalkuljatsii) _udalit_statja_kalkuljatsii_f_s_s;}catch(Exception ex){Variables.logger.error(ex);this.udalit_statja_kalkuljatsii_f_s_s= new stati_kalkuljatsii (_udalit_statja_kalkuljatsii_f_s_s.toString());}}}

public UUID getUdalit_statja_kalkuljatsii_f_s_s_uuid(){ try{return this.udalit_statja_kalkuljatsii_f_s_s.getGuid();}catch(Exception ex){return null;} }

public String getUdalit_statja_kalkuljatsii_f_s_s_type(){ try{return this.udalit_statja_kalkuljatsii_f_s_s.getClass().getName();}catch(Exception ex){return null;} }

public stati_kalkuljatsii getUdalit_statja_kalkuljatsii_f_s_s_obj(){ return this.udalit_statja_kalkuljatsii_f_s_s; }

public void setUdalit_statja_kalkuljatsii_f_s_s_obj( Object _udalit_statja_kalkuljatsii_f_s_s){ this.udalit_statja_kalkuljatsii_f_s_s=(stati_kalkuljatsii) _udalit_statja_kalkuljatsii_f_s_s; }


@ManyToOne
@JoinColumn(name="udalit_statja_kalkuljatsii_f_o_m_s", insertable = true, updatable = true)
private stati_kalkuljatsii udalit_statja_kalkuljatsii_f_o_m_s;

public stati_kalkuljatsii getUdalit_statja_kalkuljatsii_f_o_m_s(){ try{return this.udalit_statja_kalkuljatsii_f_o_m_s;}catch(Exception ex){ return null;} }

public void setUdalit_statja_kalkuljatsii_f_o_m_s( Object _udalit_statja_kalkuljatsii_f_o_m_s){if (_udalit_statja_kalkuljatsii_f_o_m_s instanceof String){this.udalit_statja_kalkuljatsii_f_o_m_s= new stati_kalkuljatsii (_udalit_statja_kalkuljatsii_f_o_m_s.toString());}else{try{this.udalit_statja_kalkuljatsii_f_o_m_s= (stati_kalkuljatsii) _udalit_statja_kalkuljatsii_f_o_m_s;}catch(Exception ex){Variables.logger.error(ex);this.udalit_statja_kalkuljatsii_f_o_m_s= new stati_kalkuljatsii (_udalit_statja_kalkuljatsii_f_o_m_s.toString());}}}

public UUID getUdalit_statja_kalkuljatsii_f_o_m_s_uuid(){ try{return this.udalit_statja_kalkuljatsii_f_o_m_s.getGuid();}catch(Exception ex){return null;} }

public String getUdalit_statja_kalkuljatsii_f_o_m_s_type(){ try{return this.udalit_statja_kalkuljatsii_f_o_m_s.getClass().getName();}catch(Exception ex){return null;} }

public stati_kalkuljatsii getUdalit_statja_kalkuljatsii_f_o_m_s_obj(){ return this.udalit_statja_kalkuljatsii_f_o_m_s; }

public void setUdalit_statja_kalkuljatsii_f_o_m_s_obj( Object _udalit_statja_kalkuljatsii_f_o_m_s){ this.udalit_statja_kalkuljatsii_f_o_m_s=(stati_kalkuljatsii) _udalit_statja_kalkuljatsii_f_o_m_s; }


}
