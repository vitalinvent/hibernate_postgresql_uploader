import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="dolzhnosti")
public class dolzhnosti implements Serializable {

public dolzhnosti(){}

public dolzhnosti(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="vvedena_v_shtatnoe_raspisanie")

private Boolean vvedena_v_shtatnoe_raspisanie;
public void setVvedena_v_shtatnoe_raspisanie(Boolean _vvedena_v_shtatnoe_raspisanie){ this.vvedena_v_shtatnoe_raspisanie=_vvedena_v_shtatnoe_raspisanie; }

public Boolean getVvedena_v_shtatnoe_raspisanie(){ return this.vvedena_v_shtatnoe_raspisanie; }


@ManyToOne
@JoinColumn(name="udalit_osobie_uslovija_truda_p_f_r", insertable = true, updatable = true)
private udalit_osobie_uslovija_truda_p_f_r udalit_osobie_uslovija_truda_p_f_r;

public udalit_osobie_uslovija_truda_p_f_r getUdalit_osobie_uslovija_truda_p_f_r(){ try{return this.udalit_osobie_uslovija_truda_p_f_r;}catch(Exception ex){ return null;} }

public void setUdalit_osobie_uslovija_truda_p_f_r( Object _udalit_osobie_uslovija_truda_p_f_r){if (_udalit_osobie_uslovija_truda_p_f_r instanceof String){this.udalit_osobie_uslovija_truda_p_f_r= new udalit_osobie_uslovija_truda_p_f_r (_udalit_osobie_uslovija_truda_p_f_r.toString());}else{try{this.udalit_osobie_uslovija_truda_p_f_r= (udalit_osobie_uslovija_truda_p_f_r) _udalit_osobie_uslovija_truda_p_f_r;}catch(Exception ex){Variables.logger.error(ex);this.udalit_osobie_uslovija_truda_p_f_r= new udalit_osobie_uslovija_truda_p_f_r (_udalit_osobie_uslovija_truda_p_f_r.toString());}}}

public UUID getUdalit_osobie_uslovija_truda_p_f_r_uuid(){ try{return this.udalit_osobie_uslovija_truda_p_f_r.getGuid();}catch(Exception ex){return null;} }

public String getUdalit_osobie_uslovija_truda_p_f_r_type(){ try{return this.udalit_osobie_uslovija_truda_p_f_r.getClass().getName();}catch(Exception ex){return null;} }

public udalit_osobie_uslovija_truda_p_f_r getUdalit_osobie_uslovija_truda_p_f_r_obj(){ return this.udalit_osobie_uslovija_truda_p_f_r; }

public void setUdalit_osobie_uslovija_truda_p_f_r_obj( Object _udalit_osobie_uslovija_truda_p_f_r){ this.udalit_osobie_uslovija_truda_p_f_r=(udalit_osobie_uslovija_truda_p_f_r) _udalit_osobie_uslovija_truda_p_f_r; }


@ManyToOne
@JoinColumn(name="osnovanie_dosrochnogo_naznachenija_pensii", insertable = true, updatable = true)
private osnovanija_dosrochnogo_naznachenija_pensii osnovanie_dosrochnogo_naznachenija_pensii;

public osnovanija_dosrochnogo_naznachenija_pensii getOsnovanie_dosrochnogo_naznachenija_pensii(){ try{return this.osnovanie_dosrochnogo_naznachenija_pensii;}catch(Exception ex){ return null;} }

public void setOsnovanie_dosrochnogo_naznachenija_pensii( Object _osnovanie_dosrochnogo_naznachenija_pensii){if (_osnovanie_dosrochnogo_naznachenija_pensii instanceof String){this.osnovanie_dosrochnogo_naznachenija_pensii= new osnovanija_dosrochnogo_naznachenija_pensii (_osnovanie_dosrochnogo_naznachenija_pensii.toString());}else{try{this.osnovanie_dosrochnogo_naznachenija_pensii= (osnovanija_dosrochnogo_naznachenija_pensii) _osnovanie_dosrochnogo_naznachenija_pensii;}catch(Exception ex){Variables.logger.error(ex);this.osnovanie_dosrochnogo_naznachenija_pensii= new osnovanija_dosrochnogo_naznachenija_pensii (_osnovanie_dosrochnogo_naznachenija_pensii.toString());}}}

public UUID getOsnovanie_dosrochnogo_naznachenija_pensii_uuid(){ try{return this.osnovanie_dosrochnogo_naznachenija_pensii.getGuid();}catch(Exception ex){return null;} }

public String getOsnovanie_dosrochnogo_naznachenija_pensii_type(){ try{return this.osnovanie_dosrochnogo_naznachenija_pensii.getClass().getName();}catch(Exception ex){return null;} }

public osnovanija_dosrochnogo_naznachenija_pensii getOsnovanie_dosrochnogo_naznachenija_pensii_obj(){ return this.osnovanie_dosrochnogo_naznachenija_pensii; }

public void setOsnovanie_dosrochnogo_naznachenija_pensii_obj( Object _osnovanie_dosrochnogo_naznachenija_pensii){ this.osnovanie_dosrochnogo_naznachenija_pensii=(osnovanija_dosrochnogo_naznachenija_pensii) _osnovanie_dosrochnogo_naznachenija_pensii; }


@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }




@Column(name="isklyuchena_iz_shtatnogo_raspisanija")

private Boolean isklyuchena_iz_shtatnogo_raspisanija;
public void setIsklyuchena_iz_shtatnogo_raspisanija(Boolean _isklyuchena_iz_shtatnogo_raspisanija){ this.isklyuchena_iz_shtatnogo_raspisanija=_isklyuchena_iz_shtatnogo_raspisanija; }

public Boolean getIsklyuchena_iz_shtatnogo_raspisanija(){ return this.isklyuchena_iz_shtatnogo_raspisanija; }


@Column(name="data_vvoda", columnDefinition="text")
private String data_vvoda;

public void setData_vvoda(String _data_vvoda){ this.data_vvoda=_data_vvoda; }

public String getData_vvoda(){ return this.data_vvoda; }


@Column(name="letno_podyemniy_sostav")

private Boolean letno_podyemniy_sostav;
public void setLetno_podyemniy_sostav(Boolean _letno_podyemniy_sostav){ this.letno_podyemniy_sostav=_letno_podyemniy_sostav; }

public Boolean getLetno_podyemniy_sostav(){ return this.letno_podyemniy_sostav; }


@Column(name="data_isklyuchenija", columnDefinition="text")
private String data_isklyuchenija;

public void setData_isklyuchenija(String _data_isklyuchenija){ this.data_isklyuchenija=_data_isklyuchenija; }

public String getData_isklyuchenija(){ return this.data_isklyuchenija; }


@Column(name="javljaetsja_dolzhnostyu_letnogo_ekipazha")

private Boolean javljaetsja_dolzhnostyu_letnogo_ekipazha;
public void setJavljaetsja_dolzhnostyu_letnogo_ekipazha(Boolean _javljaetsja_dolzhnostyu_letnogo_ekipazha){ this.javljaetsja_dolzhnostyu_letnogo_ekipazha=_javljaetsja_dolzhnostyu_letnogo_ekipazha; }

public Boolean getJavljaetsja_dolzhnostyu_letnogo_ekipazha(){ return this.javljaetsja_dolzhnostyu_letnogo_ekipazha; }


@Column(name="javljaetsja_shahterskoy_dolzhnostyu")

private Boolean javljaetsja_shahterskoy_dolzhnostyu;
public void setJavljaetsja_shahterskoy_dolzhnostyu(Boolean _javljaetsja_shahterskoy_dolzhnostyu){ this.javljaetsja_shahterskoy_dolzhnostyu=_javljaetsja_shahterskoy_dolzhnostyu; }

public Boolean getJavljaetsja_shahterskoy_dolzhnostyu(){ return this.javljaetsja_shahterskoy_dolzhnostyu; }


@Column(name="javljaetsja_farmatsevticheskoy_dolzhnostyu")

private Boolean javljaetsja_farmatsevticheskoy_dolzhnostyu;
public void setJavljaetsja_farmatsevticheskoy_dolzhnostyu(Boolean _javljaetsja_farmatsevticheskoy_dolzhnostyu){ this.javljaetsja_farmatsevticheskoy_dolzhnostyu=_javljaetsja_farmatsevticheskoy_dolzhnostyu; }

public Boolean getJavljaetsja_farmatsevticheskoy_dolzhnostyu(){ return this.javljaetsja_farmatsevticheskoy_dolzhnostyu; }


@ManyToOne
@JoinColumn(name="udalit_osnovanie_dosrochnogo_naznachenija_pensii", insertable = true, updatable = true)
private udalit_osnovanija_dosrochnogo_naznachenija_pensii udalit_osnovanie_dosrochnogo_naznachenija_pensii;

public udalit_osnovanija_dosrochnogo_naznachenija_pensii getUdalit_osnovanie_dosrochnogo_naznachenija_pensii(){ try{return this.udalit_osnovanie_dosrochnogo_naznachenija_pensii;}catch(Exception ex){ return null;} }

public void setUdalit_osnovanie_dosrochnogo_naznachenija_pensii( Object _udalit_osnovanie_dosrochnogo_naznachenija_pensii){if (_udalit_osnovanie_dosrochnogo_naznachenija_pensii instanceof String){this.udalit_osnovanie_dosrochnogo_naznachenija_pensii= new udalit_osnovanija_dosrochnogo_naznachenija_pensii (_udalit_osnovanie_dosrochnogo_naznachenija_pensii.toString());}else{try{this.udalit_osnovanie_dosrochnogo_naznachenija_pensii= (udalit_osnovanija_dosrochnogo_naznachenija_pensii) _udalit_osnovanie_dosrochnogo_naznachenija_pensii;}catch(Exception ex){Variables.logger.error(ex);this.udalit_osnovanie_dosrochnogo_naznachenija_pensii= new udalit_osnovanija_dosrochnogo_naznachenija_pensii (_udalit_osnovanie_dosrochnogo_naznachenija_pensii.toString());}}}

public UUID getUdalit_osnovanie_dosrochnogo_naznachenija_pensii_uuid(){ try{return this.udalit_osnovanie_dosrochnogo_naznachenija_pensii.getGuid();}catch(Exception ex){return null;} }

public String getUdalit_osnovanie_dosrochnogo_naznachenija_pensii_type(){ try{return this.udalit_osnovanie_dosrochnogo_naznachenija_pensii.getClass().getName();}catch(Exception ex){return null;} }

public udalit_osnovanija_dosrochnogo_naznachenija_pensii getUdalit_osnovanie_dosrochnogo_naznachenija_pensii_obj(){ return this.udalit_osnovanie_dosrochnogo_naznachenija_pensii; }

public void setUdalit_osnovanie_dosrochnogo_naznachenija_pensii_obj( Object _udalit_osnovanie_dosrochnogo_naznachenija_pensii){ this.udalit_osnovanie_dosrochnogo_naznachenija_pensii=(udalit_osnovanija_dosrochnogo_naznachenija_pensii) _udalit_osnovanie_dosrochnogo_naznachenija_pensii; }


@Column(name="plavsostav")

private Boolean plavsostav;
public void setPlavsostav(Boolean _plavsostav){ this.plavsostav=_plavsostav; }

public Boolean getPlavsostav(){ return this.plavsostav; }


@ManyToOne
@JoinColumn(name="udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi", insertable = true, updatable = true)
private stroki_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi;

public stroki_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi getUdalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi(){ try{return this.udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi;}catch(Exception ex){ return null;} }

public void setUdalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi( Object _udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi){if (_udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi instanceof String){this.udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi= new stroki_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi (_udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi.toString());}else{try{this.udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi= (stroki_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi) _udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi;}catch(Exception ex){Variables.logger.error(ex);this.udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi= new stroki_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi (_udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi.toString());}}}

public UUID getUdalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi_uuid(){ try{return this.udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi.getGuid();}catch(Exception ex){return null;} }

public String getUdalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi_type(){ try{return this.udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi.getClass().getName();}catch(Exception ex){return null;} }

public stroki_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi getUdalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi_obj(){ return this.udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi; }

public void setUdalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi_obj( Object _udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi){ this.udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi=(stroki_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi) _udalit_stroka_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi; }


@ManyToOne
@JoinColumn(name="osobie_uslovija_truda_p_f_r", insertable = true, updatable = true)
private osobie_uslovija_truda_p_f_r osobie_uslovija_truda_p_f_r;

public osobie_uslovija_truda_p_f_r getOsobie_uslovija_truda_p_f_r(){ try{return this.osobie_uslovija_truda_p_f_r;}catch(Exception ex){ return null;} }

public void setOsobie_uslovija_truda_p_f_r( Object _osobie_uslovija_truda_p_f_r){if (_osobie_uslovija_truda_p_f_r instanceof String){this.osobie_uslovija_truda_p_f_r= new osobie_uslovija_truda_p_f_r (_osobie_uslovija_truda_p_f_r.toString());}else{try{this.osobie_uslovija_truda_p_f_r= (osobie_uslovija_truda_p_f_r) _osobie_uslovija_truda_p_f_r;}catch(Exception ex){Variables.logger.error(ex);this.osobie_uslovija_truda_p_f_r= new osobie_uslovija_truda_p_f_r (_osobie_uslovija_truda_p_f_r.toString());}}}

public UUID getOsobie_uslovija_truda_p_f_r_uuid(){ try{return this.osobie_uslovija_truda_p_f_r.getGuid();}catch(Exception ex){return null;} }

public String getOsobie_uslovija_truda_p_f_r_type(){ try{return this.osobie_uslovija_truda_p_f_r.getClass().getName();}catch(Exception ex){return null;} }

public osobie_uslovija_truda_p_f_r getOsobie_uslovija_truda_p_f_r_obj(){ return this.osobie_uslovija_truda_p_f_r; }

public void setOsobie_uslovija_truda_p_f_r_obj( Object _osobie_uslovija_truda_p_f_r){ this.osobie_uslovija_truda_p_f_r=(osobie_uslovija_truda_p_f_r) _osobie_uslovija_truda_p_f_r; }


@Column(name="naimenovanie_kratkoe", columnDefinition="text")
private String naimenovanie_kratkoe;

public void setNaimenovanie_kratkoe(String _naimenovanie_kratkoe){ this.naimenovanie_kratkoe=_naimenovanie_kratkoe; }

public String getNaimenovanie_kratkoe(){ return this.naimenovanie_kratkoe; }


@ManyToOne
@JoinColumn(name="razrjad_kategorija", insertable = true, updatable = true)
private razrjadi_kategorii_dolzhnostey razrjad_kategorija;

public razrjadi_kategorii_dolzhnostey getRazrjad_kategorija(){ try{return this.razrjad_kategorija;}catch(Exception ex){ return null;} }

public void setRazrjad_kategorija( Object _razrjad_kategorija){if (_razrjad_kategorija instanceof String){this.razrjad_kategorija= new razrjadi_kategorii_dolzhnostey (_razrjad_kategorija.toString());}else{try{this.razrjad_kategorija= (razrjadi_kategorii_dolzhnostey) _razrjad_kategorija;}catch(Exception ex){Variables.logger.error(ex);this.razrjad_kategorija= new razrjadi_kategorii_dolzhnostey (_razrjad_kategorija.toString());}}}

public UUID getRazrjad_kategorija_uuid(){ try{return this.razrjad_kategorija.getGuid();}catch(Exception ex){return null;} }

public String getRazrjad_kategorija_type(){ try{return this.razrjad_kategorija.getClass().getName();}catch(Exception ex){return null;} }

public razrjadi_kategorii_dolzhnostey getRazrjad_kategorija_obj(){ return this.razrjad_kategorija; }

public void setRazrjad_kategorija_obj( Object _razrjad_kategorija){ this.razrjad_kategorija=(razrjadi_kategorii_dolzhnostey) _razrjad_kategorija; }


@ManyToOne
@JoinColumn(name="razrjad_kategorija_nadbavki", insertable = true, updatable = true)
private razrjadi_kategorii_dolzhnostey razrjad_kategorija_nadbavki;

public razrjadi_kategorii_dolzhnostey getRazrjad_kategorija_nadbavki(){ try{return this.razrjad_kategorija_nadbavki;}catch(Exception ex){ return null;} }

public void setRazrjad_kategorija_nadbavki( Object _razrjad_kategorija_nadbavki){if (_razrjad_kategorija_nadbavki instanceof String){this.razrjad_kategorija_nadbavki= new razrjadi_kategorii_dolzhnostey (_razrjad_kategorija_nadbavki.toString());}else{try{this.razrjad_kategorija_nadbavki= (razrjadi_kategorii_dolzhnostey) _razrjad_kategorija_nadbavki;}catch(Exception ex){Variables.logger.error(ex);this.razrjad_kategorija_nadbavki= new razrjadi_kategorii_dolzhnostey (_razrjad_kategorija_nadbavki.toString());}}}

public UUID getRazrjad_kategorija_nadbavki_uuid(){ try{return this.razrjad_kategorija_nadbavki.getGuid();}catch(Exception ex){return null;} }

public String getRazrjad_kategorija_nadbavki_type(){ try{return this.razrjad_kategorija_nadbavki.getClass().getName();}catch(Exception ex){return null;} }

public razrjadi_kategorii_dolzhnostey getRazrjad_kategorija_nadbavki_obj(){ return this.razrjad_kategorija_nadbavki; }

public void setRazrjad_kategorija_nadbavki_obj( Object _razrjad_kategorija_nadbavki){ this.razrjad_kategorija_nadbavki=(razrjadi_kategorii_dolzhnostey) _razrjad_kategorija_nadbavki; }


@Column(name="protsent_nadbavki_za_vrednost")

private Float protsent_nadbavki_za_vrednost;
public void setProtsent_nadbavki_za_vrednost(Float _protsent_nadbavki_za_vrednost){ this.protsent_nadbavki_za_vrednost=_protsent_nadbavki_za_vrednost; }

public Float getProtsent_nadbavki_za_vrednost(){ return this.protsent_nadbavki_za_vrednost; }


@Column(name="viplachivaetsja_nadbavka_za_vrednost")

private Boolean viplachivaetsja_nadbavka_za_vrednost;
public void setViplachivaetsja_nadbavka_za_vrednost(Boolean _viplachivaetsja_nadbavka_za_vrednost){ this.viplachivaetsja_nadbavka_za_vrednost=_viplachivaetsja_nadbavka_za_vrednost; }

public Boolean getViplachivaetsja_nadbavka_za_vrednost(){ return this.viplachivaetsja_nadbavka_za_vrednost; }


@Column(name="kolichestvo_dney_dopolnitelnogo_otpuska_v_god")

private Float kolichestvo_dney_dopolnitelnogo_otpuska_v_god;
public void setKolichestvo_dney_dopolnitelnogo_otpuska_v_god(Float _kolichestvo_dney_dopolnitelnogo_otpuska_v_god){ this.kolichestvo_dney_dopolnitelnogo_otpuska_v_god=_kolichestvo_dney_dopolnitelnogo_otpuska_v_god; }

public Float getKolichestvo_dney_dopolnitelnogo_otpuska_v_god(){ return this.kolichestvo_dney_dopolnitelnogo_otpuska_v_god; }


@Column(name="o_k_p_d_t_r_kod", columnDefinition="text")
private String o_k_p_d_t_r_kod;

public void setO_k_p_d_t_r_kod(String _o_k_p_d_t_r_kod){ this.o_k_p_d_t_r_kod=_o_k_p_d_t_r_kod; }

public String getO_k_p_d_t_r_kod(){ return this.o_k_p_d_t_r_kod; }


@Column(name="o_k_p_d_t_r_k_ch", columnDefinition="text")
private String o_k_p_d_t_r_k_ch;

public void setO_k_p_d_t_r_k_ch(String _o_k_p_d_t_r_k_ch){ this.o_k_p_d_t_r_k_ch=_o_k_p_d_t_r_k_ch; }

public String getO_k_p_d_t_r_k_ch(){ return this.o_k_p_d_t_r_k_ch; }


@Column(name="o_k_p_d_t_r_kategorija", columnDefinition="text")
private String o_k_p_d_t_r_kategorija;

public void setO_k_p_d_t_r_kategorija(String _o_k_p_d_t_r_kategorija){ this.o_k_p_d_t_r_kategorija=_o_k_p_d_t_r_kategorija; }

public String getO_k_p_d_t_r_kategorija(){ return this.o_k_p_d_t_r_kategorija; }


}
