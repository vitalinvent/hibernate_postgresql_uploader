import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="podrazdelenija_organizatsiy")
public class podrazdelenija_organizatsiy implements Serializable {

public podrazdelenija_organizatsiy(){}

public podrazdelenija_organizatsiy(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="rayonniy_koeffitsient")

private Float rayonniy_koeffitsient;
public void setRayonniy_koeffitsient(Float _rayonniy_koeffitsient){ this.rayonniy_koeffitsient=_rayonniy_koeffitsient; }

public Float getRayonniy_koeffitsient(){ return this.rayonniy_koeffitsient; }


@Column(name="obosoblennoe_podrazdelenie")

private Boolean obosoblennoe_podrazdelenie;
public void setObosoblennoe_podrazdelenie(Boolean _obosoblennoe_podrazdelenie){ this.obosoblennoe_podrazdelenie=_obosoblennoe_podrazdelenie; }

public Boolean getObosoblennoe_podrazdelenie(){ return this.obosoblennoe_podrazdelenie; }


@Column(name="kod_o_k_v_e_d2", columnDefinition="text")
private String kod_o_k_v_e_d2;

public void setKod_o_k_v_e_d2(String _kod_o_k_v_e_d2){ this.kod_o_k_v_e_d2=_kod_o_k_v_e_d2; }

public String getKod_o_k_v_e_d2(){ return this.kod_o_k_v_e_d2; }


@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }



@Column(name="rayonniy_koeffitsient_r_f")

private Float rayonniy_koeffitsient_r_f;
public void setRayonniy_koeffitsient_r_f(Float _rayonniy_koeffitsient_r_f){ this.rayonniy_koeffitsient_r_f=_rayonniy_koeffitsient_r_f; }

public Float getRayonniy_koeffitsient_r_f(){ return this.rayonniy_koeffitsient_r_f; }


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }



@Column(name="sformirovano")

private Boolean sformirovano;
public void setSformirovano(Boolean _sformirovano){ this.sformirovano=_sformirovano; }

public Boolean getSformirovano(){ return this.sformirovano; }


@Column(name="data_sozdanija", columnDefinition="text")
private String data_sozdanija;

public void setData_sozdanija(String _data_sozdanija){ this.data_sozdanija=_data_sozdanija; }

public String getData_sozdanija(){ return this.data_sozdanija; }


@Column(name="rasformirovano")

private Boolean rasformirovano;
public void setRasformirovano(Boolean _rasformirovano){ this.rasformirovano=_rasformirovano; }

public Boolean getRasformirovano(){ return this.rasformirovano; }


@Column(name="data_rasformirovanija", columnDefinition="text")
private String data_rasformirovanija;

public void setData_rasformirovanija(String _data_rasformirovanija){ this.data_rasformirovanija=_data_rasformirovanija; }

public String getData_rasformirovanija(){ return this.data_rasformirovanija; }


@Column(name="naimenovanie_o_k_v_e_d2", columnDefinition="text")
private String naimenovanie_o_k_v_e_d2;

public void setNaimenovanie_o_k_v_e_d2(String _naimenovanie_o_k_v_e_d2){ this.naimenovanie_o_k_v_e_d2=_naimenovanie_o_k_v_e_d2; }

public String getNaimenovanie_o_k_v_e_d2(){ return this.naimenovanie_o_k_v_e_d2; }


@ManyToOne
@JoinColumn(name="golovnaja_organizatsija", insertable = true, updatable = true)
private organizatsii golovnaja_organizatsija;

public organizatsii getGolovnaja_organizatsija(){ try{return this.golovnaja_organizatsija;}catch(Exception ex){ return null;} }

public void setGolovnaja_organizatsija( Object _golovnaja_organizatsija){if (_golovnaja_organizatsija instanceof String){this.golovnaja_organizatsija= new organizatsii (_golovnaja_organizatsija.toString());}else{try{this.golovnaja_organizatsija= (organizatsii) _golovnaja_organizatsija;}catch(Exception ex){Variables.logger.error(ex);this.golovnaja_organizatsija= new organizatsii (_golovnaja_organizatsija.toString());}}}

public UUID getGolovnaja_organizatsija_uuid(){ try{return this.golovnaja_organizatsija.getGuid();}catch(Exception ex){return null;} }

public String getGolovnaja_organizatsija_type(){ try{return this.golovnaja_organizatsija.getClass().getName();}catch(Exception ex){return null;} }

public organizatsii getGolovnaja_organizatsija_obj(){ return this.golovnaja_organizatsija; }

public void setGolovnaja_organizatsija_obj( Object _golovnaja_organizatsija){ this.golovnaja_organizatsija=(organizatsii) _golovnaja_organizatsija; }


@ManyToOne
@JoinColumn(name="udalit_territorialnie_uslovija_p_f_r", insertable = true, updatable = true)
private udalit_territorialnie_uslovija_p_f_r udalit_territorialnie_uslovija_p_f_r;

public udalit_territorialnie_uslovija_p_f_r getUdalit_territorialnie_uslovija_p_f_r(){ try{return this.udalit_territorialnie_uslovija_p_f_r;}catch(Exception ex){ return null;} }

public void setUdalit_territorialnie_uslovija_p_f_r( Object _udalit_territorialnie_uslovija_p_f_r){if (_udalit_territorialnie_uslovija_p_f_r instanceof String){this.udalit_territorialnie_uslovija_p_f_r= new udalit_territorialnie_uslovija_p_f_r (_udalit_territorialnie_uslovija_p_f_r.toString());}else{try{this.udalit_territorialnie_uslovija_p_f_r= (udalit_territorialnie_uslovija_p_f_r) _udalit_territorialnie_uslovija_p_f_r;}catch(Exception ex){Variables.logger.error(ex);this.udalit_territorialnie_uslovija_p_f_r= new udalit_territorialnie_uslovija_p_f_r (_udalit_territorialnie_uslovija_p_f_r.toString());}}}

public UUID getUdalit_territorialnie_uslovija_p_f_r_uuid(){ try{return this.udalit_territorialnie_uslovija_p_f_r.getGuid();}catch(Exception ex){return null;} }

public String getUdalit_territorialnie_uslovija_p_f_r_type(){ try{return this.udalit_territorialnie_uslovija_p_f_r.getClass().getName();}catch(Exception ex){return null;} }

public udalit_territorialnie_uslovija_p_f_r getUdalit_territorialnie_uslovija_p_f_r_obj(){ return this.udalit_territorialnie_uslovija_p_f_r; }

public void setUdalit_territorialnie_uslovija_p_f_r_obj( Object _udalit_territorialnie_uslovija_p_f_r){ this.udalit_territorialnie_uslovija_p_f_r=(udalit_territorialnie_uslovija_p_f_r) _udalit_territorialnie_uslovija_p_f_r; }


@ManyToOne
@JoinColumn(name="registratsija_v_nalogovom_organe", insertable = true, updatable = true)
private registratsii_v_nalogovom_organe registratsija_v_nalogovom_organe;

public registratsii_v_nalogovom_organe getRegistratsija_v_nalogovom_organe(){ try{return this.registratsija_v_nalogovom_organe;}catch(Exception ex){ return null;} }

public void setRegistratsija_v_nalogovom_organe( Object _registratsija_v_nalogovom_organe){if (_registratsija_v_nalogovom_organe instanceof String){this.registratsija_v_nalogovom_organe= new registratsii_v_nalogovom_organe (_registratsija_v_nalogovom_organe.toString());}else{try{this.registratsija_v_nalogovom_organe= (registratsii_v_nalogovom_organe) _registratsija_v_nalogovom_organe;}catch(Exception ex){Variables.logger.error(ex);this.registratsija_v_nalogovom_organe= new registratsii_v_nalogovom_organe (_registratsija_v_nalogovom_organe.toString());}}}

public UUID getRegistratsija_v_nalogovom_organe_uuid(){ try{return this.registratsija_v_nalogovom_organe.getGuid();}catch(Exception ex){return null;} }

public String getRegistratsija_v_nalogovom_organe_type(){ try{return this.registratsija_v_nalogovom_organe.getClass().getName();}catch(Exception ex){return null;} }

public registratsii_v_nalogovom_organe getRegistratsija_v_nalogovom_organe_obj(){ return this.registratsija_v_nalogovom_organe; }

public void setRegistratsija_v_nalogovom_organe_obj( Object _registratsija_v_nalogovom_organe){ this.registratsija_v_nalogovom_organe=(registratsii_v_nalogovom_organe) _registratsija_v_nalogovom_organe; }


@Column(name="sootvetstvuet_sudam_zaregistrirovannim_v_rossiyskom_mezhdunarodnom_reestre_sudov")

private Boolean sootvetstvuet_sudam_zaregistrirovannim_v_rossiyskom_mezhdunarodnom_reestre_sudov;
public void setSootvetstvuet_sudam_zaregistrirovannim_v_rossiyskom_mezhdunarodnom_reestre_sudov(Boolean _sootvetstvuet_sudam_zaregistrirovannim_v_rossiyskom_mezhdunarodnom_reestre_sudov){ this.sootvetstvuet_sudam_zaregistrirovannim_v_rossiyskom_mezhdunarodnom_reestre_sudov=_sootvetstvuet_sudam_zaregistrirovannim_v_rossiyskom_mezhdunarodnom_reestre_sudov; }

public Boolean getSootvetstvuet_sudam_zaregistrirovannim_v_rossiyskom_mezhdunarodnom_reestre_sudov(){ return this.sootvetstvuet_sudam_zaregistrirovannim_v_rossiyskom_mezhdunarodnom_reestre_sudov; }


@Column(name="rekvizit_dop_uporjadochivanija_ierarhicheskogo", columnDefinition="text")
private String rekvizit_dop_uporjadochivanija_ierarhicheskogo;

public void setRekvizit_dop_uporjadochivanija_ierarhicheskogo(String _rekvizit_dop_uporjadochivanija_ierarhicheskogo){ this.rekvizit_dop_uporjadochivanija_ierarhicheskogo=_rekvizit_dop_uporjadochivanija_ierarhicheskogo; }

public String getRekvizit_dop_uporjadochivanija_ierarhicheskogo(){ return this.rekvizit_dop_uporjadochivanija_ierarhicheskogo; }


@Column(name="imeet_nomer_territorialnogo_organa_rosstata")

private Boolean imeet_nomer_territorialnogo_organa_rosstata;
public void setImeet_nomer_territorialnogo_organa_rosstata(Boolean _imeet_nomer_territorialnogo_organa_rosstata){ this.imeet_nomer_territorialnogo_organa_rosstata=_imeet_nomer_territorialnogo_organa_rosstata; }

public Boolean getImeet_nomer_territorialnogo_organa_rosstata(){ return this.imeet_nomer_territorialnogo_organa_rosstata; }


@ManyToOne
@JoinColumn(name="grafik_raboti_sotrudnikov", insertable = true, updatable = true)
private grafiki_raboti_sotrudnikov grafik_raboti_sotrudnikov;

public grafiki_raboti_sotrudnikov getGrafik_raboti_sotrudnikov(){ try{return this.grafik_raboti_sotrudnikov;}catch(Exception ex){ return null;} }

public void setGrafik_raboti_sotrudnikov( Object _grafik_raboti_sotrudnikov){if (_grafik_raboti_sotrudnikov instanceof String){this.grafik_raboti_sotrudnikov= new grafiki_raboti_sotrudnikov (_grafik_raboti_sotrudnikov.toString());}else{try{this.grafik_raboti_sotrudnikov= (grafiki_raboti_sotrudnikov) _grafik_raboti_sotrudnikov;}catch(Exception ex){Variables.logger.error(ex);this.grafik_raboti_sotrudnikov= new grafiki_raboti_sotrudnikov (_grafik_raboti_sotrudnikov.toString());}}}

public UUID getGrafik_raboti_sotrudnikov_uuid(){ try{return this.grafik_raboti_sotrudnikov.getGuid();}catch(Exception ex){return null;} }

public String getGrafik_raboti_sotrudnikov_type(){ try{return this.grafik_raboti_sotrudnikov.getClass().getName();}catch(Exception ex){return null;} }

public grafiki_raboti_sotrudnikov getGrafik_raboti_sotrudnikov_obj(){ return this.grafik_raboti_sotrudnikov; }

public void setGrafik_raboti_sotrudnikov_obj( Object _grafik_raboti_sotrudnikov){ this.grafik_raboti_sotrudnikov=(grafiki_raboti_sotrudnikov) _grafik_raboti_sotrudnikov; }


@Column(name="udalit_kolichestvo_dopolnitelnih_dney_otpuska_v_god")

private Float udalit_kolichestvo_dopolnitelnih_dney_otpuska_v_god;
public void setUdalit_kolichestvo_dopolnitelnih_dney_otpuska_v_god(Float _udalit_kolichestvo_dopolnitelnih_dney_otpuska_v_god){ this.udalit_kolichestvo_dopolnitelnih_dney_otpuska_v_god=_udalit_kolichestvo_dopolnitelnih_dney_otpuska_v_god; }

public Float getUdalit_kolichestvo_dopolnitelnih_dney_otpuska_v_god(){ return this.udalit_kolichestvo_dopolnitelnih_dney_otpuska_v_god; }


@Column(name="kod_o_k_v_e_d", columnDefinition="text")
private String kod_o_k_v_e_d;

public void setKod_o_k_v_e_d(String _kod_o_k_v_e_d){ this.kod_o_k_v_e_d=_kod_o_k_v_e_d; }

public String getKod_o_k_v_e_d(){ return this.kod_o_k_v_e_d; }


@Column(name="naimenovanie_o_k_v_e_d", columnDefinition="text")
private String naimenovanie_o_k_v_e_d;

public void setNaimenovanie_o_k_v_e_d(String _naimenovanie_o_k_v_e_d){ this.naimenovanie_o_k_v_e_d=_naimenovanie_o_k_v_e_d; }

public String getNaimenovanie_o_k_v_e_d(){ return this.naimenovanie_o_k_v_e_d; }


@Column(name="nomer_territorialnogo_organa_rosstata", columnDefinition="text")
private String nomer_territorialnogo_organa_rosstata;

public void setNomer_territorialnogo_organa_rosstata(String _nomer_territorialnogo_organa_rosstata){ this.nomer_territorialnogo_organa_rosstata=_nomer_territorialnogo_organa_rosstata; }

public String getNomer_territorialnogo_organa_rosstata(){ return this.nomer_territorialnogo_organa_rosstata; }


@Column(name="protsent_severnoy_nadbavki")

private Float protsent_severnoy_nadbavki;
public void setProtsent_severnoy_nadbavki(Float _protsent_severnoy_nadbavki){ this.protsent_severnoy_nadbavki=_protsent_severnoy_nadbavki; }

public Float getProtsent_severnoy_nadbavki(){ return this.protsent_severnoy_nadbavki; }


@Column(name="kod_organa_f_s_g_s", columnDefinition="text")
private String kod_organa_f_s_g_s;

public void setKod_organa_f_s_g_s(String _kod_organa_f_s_g_s){ this.kod_organa_f_s_g_s=_kod_organa_f_s_g_s; }

public String getKod_organa_f_s_g_s(){ return this.kod_organa_f_s_g_s; }


}
