import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="uchetnie_zapisi_elektronnoy_pochti")
public class uchetnie_zapisi_elektronnoy_pochti implements Serializable {

public uchetnie_zapisi_elektronnoy_pochti(){}

public uchetnie_zapisi_elektronnoy_pochti(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="ispolzovat_bezopasniy_vhod_na_server_ishodjashchey_pochti")

private Boolean ispolzovat_bezopasniy_vhod_na_server_ishodjashchey_pochti;
public void setIspolzovat_bezopasniy_vhod_na_server_ishodjashchey_pochti(Boolean _ispolzovat_bezopasniy_vhod_na_server_ishodjashchey_pochti){ this.ispolzovat_bezopasniy_vhod_na_server_ishodjashchey_pochti=_ispolzovat_bezopasniy_vhod_na_server_ishodjashchey_pochti; }

public Boolean getIspolzovat_bezopasniy_vhod_na_server_ishodjashchey_pochti(){ return this.ispolzovat_bezopasniy_vhod_na_server_ishodjashchey_pochti; }


@Column(name="protokol_vhodjashchey_pochti", columnDefinition="text")
private String protokol_vhodjashchey_pochti;

public void setProtokol_vhodjashchey_pochti(String _protokol_vhodjashchey_pochti){ this.protokol_vhodjashchey_pochti=_protokol_vhodjashchey_pochti; }

public String getProtokol_vhodjashchey_pochti(){ return this.protokol_vhodjashchey_pochti; }



@Column(name="ispolzovat_bezopasniy_vhod_na_server_vhodjashchey_pochti")

private Boolean ispolzovat_bezopasniy_vhod_na_server_vhodjashchey_pochti;
public void setIspolzovat_bezopasniy_vhod_na_server_vhodjashchey_pochti(Boolean _ispolzovat_bezopasniy_vhod_na_server_vhodjashchey_pochti){ this.ispolzovat_bezopasniy_vhod_na_server_vhodjashchey_pochti=_ispolzovat_bezopasniy_vhod_na_server_vhodjashchey_pochti; }

public Boolean getIspolzovat_bezopasniy_vhod_na_server_vhodjashchey_pochti(){ return this.ispolzovat_bezopasniy_vhod_na_server_vhodjashchey_pochti; }



@Column(name="imja_polzovatelja", columnDefinition="text")
private String imja_polzovatelja;

public void setImja_polzovatelja(String _imja_polzovatelja){ this.imja_polzovatelja=_imja_polzovatelja; }

public String getImja_polzovatelja(){ return this.imja_polzovatelja; }


@Column(name="ispolzovat_zashchishchennoe_soedinenie_dlja_vhodjashchey_pochti")

private Boolean ispolzovat_zashchishchennoe_soedinenie_dlja_vhodjashchey_pochti;
public void setIspolzovat_zashchishchennoe_soedinenie_dlja_vhodjashchey_pochti(Boolean _ispolzovat_zashchishchennoe_soedinenie_dlja_vhodjashchey_pochti){ this.ispolzovat_zashchishchennoe_soedinenie_dlja_vhodjashchey_pochti=_ispolzovat_zashchishchennoe_soedinenie_dlja_vhodjashchey_pochti; }

public Boolean getIspolzovat_zashchishchennoe_soedinenie_dlja_vhodjashchey_pochti(){ return this.ispolzovat_zashchishchennoe_soedinenie_dlja_vhodjashchey_pochti; }


@Column(name="ispolzovat_dlja_otpravki")

private Boolean ispolzovat_dlja_otpravki;
public void setIspolzovat_dlja_otpravki(Boolean _ispolzovat_dlja_otpravki){ this.ispolzovat_dlja_otpravki=_ispolzovat_dlja_otpravki; }

public Boolean getIspolzovat_dlja_otpravki(){ return this.ispolzovat_dlja_otpravki; }


@Column(name="adres_elektronnoy_pochti", columnDefinition="text")
private String adres_elektronnoy_pochti;

public void setAdres_elektronnoy_pochti(String _adres_elektronnoy_pochti){ this.adres_elektronnoy_pochti=_adres_elektronnoy_pochti; }

public String getAdres_elektronnoy_pochti(){ return this.adres_elektronnoy_pochti; }


@Column(name="vremja_ozhidanija")

private Float vremja_ozhidanija;
public void setVremja_ozhidanija(Float _vremja_ozhidanija){ this.vremja_ozhidanija=_vremja_ozhidanija; }

public Float getVremja_ozhidanija(){ return this.vremja_ozhidanija; }


@Column(name="ispolzovat_dlja_poluchenija")

private Boolean ispolzovat_dlja_poluchenija;
public void setIspolzovat_dlja_poluchenija(Boolean _ispolzovat_dlja_poluchenija){ this.ispolzovat_dlja_poluchenija=_ispolzovat_dlja_poluchenija; }

public Boolean getIspolzovat_dlja_poluchenija(){ return this.ispolzovat_dlja_poluchenija; }


@Column(name="ispolzovat_zashchishchennoe_soedinenie_dlja_ishodjashchey_pochti")

private Boolean ispolzovat_zashchishchennoe_soedinenie_dlja_ishodjashchey_pochti;
public void setIspolzovat_zashchishchennoe_soedinenie_dlja_ishodjashchey_pochti(Boolean _ispolzovat_zashchishchennoe_soedinenie_dlja_ishodjashchey_pochti){ this.ispolzovat_zashchishchennoe_soedinenie_dlja_ishodjashchey_pochti=_ispolzovat_zashchishchennoe_soedinenie_dlja_ishodjashchey_pochti; }

public Boolean getIspolzovat_zashchishchennoe_soedinenie_dlja_ishodjashchey_pochti(){ return this.ispolzovat_zashchishchennoe_soedinenie_dlja_ishodjashchey_pochti; }


@Column(name="ostavljat_kopii_soobshcheniy_na_servere")

private Boolean ostavljat_kopii_soobshcheniy_na_servere;
public void setOstavljat_kopii_soobshcheniy_na_servere(Boolean _ostavljat_kopii_soobshcheniy_na_servere){ this.ostavljat_kopii_soobshcheniy_na_servere=_ostavljat_kopii_soobshcheniy_na_servere; }

public Boolean getOstavljat_kopii_soobshcheniy_na_servere(){ return this.ostavljat_kopii_soobshcheniy_na_servere; }


@Column(name="period_hranenija_soobshcheniy_na_servere")

private Float period_hranenija_soobshcheniy_na_servere;
public void setPeriod_hranenija_soobshcheniy_na_servere(Float _period_hranenija_soobshcheniy_na_servere){ this.period_hranenija_soobshcheniy_na_servere=_period_hranenija_soobshcheniy_na_servere; }

public Float getPeriod_hranenija_soobshcheniy_na_servere(){ return this.period_hranenija_soobshcheniy_na_servere; }


@Column(name="polzovatel", columnDefinition="text")
private String polzovatel;

public void setPolzovatel(String _polzovatel){ this.polzovatel=_polzovatel; }

public String getPolzovatel(){ return this.polzovatel; }


@Column(name="polzovatelsmtp", columnDefinition="text")
private String polzovatelsmtp;

public void setPolzovatelsmtp(String _polzovatelsmtp){ this.polzovatelsmtp=_polzovatelsmtp; }

public String getPolzovatelsmtp(){ return this.polzovatelsmtp; }


@Column(name="port_servera_vhodjashchey_pochti")

private Float port_servera_vhodjashchey_pochti;
public void setPort_servera_vhodjashchey_pochti(Float _port_servera_vhodjashchey_pochti){ this.port_servera_vhodjashchey_pochti=_port_servera_vhodjashchey_pochti; }

public Float getPort_servera_vhodjashchey_pochti(){ return this.port_servera_vhodjashchey_pochti; }


@Column(name="port_servera_ishodjashchey_pochti")

private Float port_servera_ishodjashchey_pochti;
public void setPort_servera_ishodjashchey_pochti(Float _port_servera_ishodjashchey_pochti){ this.port_servera_ishodjashchey_pochti=_port_servera_ishodjashchey_pochti; }

public Float getPort_servera_ishodjashchey_pochti(){ return this.port_servera_ishodjashchey_pochti; }


@Column(name="server_vhodjashchey_pochti", columnDefinition="text")
private String server_vhodjashchey_pochti;

public void setServer_vhodjashchey_pochti(String _server_vhodjashchey_pochti){ this.server_vhodjashchey_pochti=_server_vhodjashchey_pochti; }

public String getServer_vhodjashchey_pochti(){ return this.server_vhodjashchey_pochti; }


@Column(name="server_ishodjashchey_pochti", columnDefinition="text")
private String server_ishodjashchey_pochti;

public void setServer_ishodjashchey_pochti(String _server_ishodjashchey_pochti){ this.server_ishodjashchey_pochti=_server_ishodjashchey_pochti; }

public String getServer_ishodjashchey_pochti(){ return this.server_ishodjashchey_pochti; }


@Column(name="udalit_parol", columnDefinition="text")
private String udalit_parol;

public void setUdalit_parol(String _udalit_parol){ this.udalit_parol=_udalit_parol; }

public String getUdalit_parol(){ return this.udalit_parol; }


@Column(name="trebuetsja_vhod_na_server_pered_otpravkoy")

private Boolean trebuetsja_vhod_na_server_pered_otpravkoy;
public void setTrebuetsja_vhod_na_server_pered_otpravkoy(Boolean _trebuetsja_vhod_na_server_pered_otpravkoy){ this.trebuetsja_vhod_na_server_pered_otpravkoy=_trebuetsja_vhod_na_server_pered_otpravkoy; }

public Boolean getTrebuetsja_vhod_na_server_pered_otpravkoy(){ return this.trebuetsja_vhod_na_server_pered_otpravkoy; }


@Column(name="udalit_v_predstavlenie_vklyuchat_imja_polzovatelja")

private Boolean udalit_v_predstavlenie_vklyuchat_imja_polzovatelja;
public void setUdalit_v_predstavlenie_vklyuchat_imja_polzovatelja(Boolean _udalit_v_predstavlenie_vklyuchat_imja_polzovatelja){ this.udalit_v_predstavlenie_vklyuchat_imja_polzovatelja=_udalit_v_predstavlenie_vklyuchat_imja_polzovatelja; }

public Boolean getUdalit_v_predstavlenie_vklyuchat_imja_polzovatelja(){ return this.udalit_v_predstavlenie_vklyuchat_imja_polzovatelja; }


@ManyToOne
@JoinColumn(name="udalit_otvetstvenniy_za_obrabotku_pisem", insertable = true, updatable = true)
private polzovateli udalit_otvetstvenniy_za_obrabotku_pisem;

public polzovateli getUdalit_otvetstvenniy_za_obrabotku_pisem(){ try{return this.udalit_otvetstvenniy_za_obrabotku_pisem;}catch(Exception ex){ return null;} }

public void setUdalit_otvetstvenniy_za_obrabotku_pisem( Object _udalit_otvetstvenniy_za_obrabotku_pisem){if (_udalit_otvetstvenniy_za_obrabotku_pisem instanceof String){this.udalit_otvetstvenniy_za_obrabotku_pisem= new polzovateli (_udalit_otvetstvenniy_za_obrabotku_pisem.toString());}else{try{this.udalit_otvetstvenniy_za_obrabotku_pisem= (polzovateli) _udalit_otvetstvenniy_za_obrabotku_pisem;}catch(Exception ex){Variables.logger.error(ex);this.udalit_otvetstvenniy_za_obrabotku_pisem= new polzovateli (_udalit_otvetstvenniy_za_obrabotku_pisem.toString());}}}

public UUID getUdalit_otvetstvenniy_za_obrabotku_pisem_uuid(){ try{return this.udalit_otvetstvenniy_za_obrabotku_pisem.getGuid();}catch(Exception ex){return null;} }

public String getUdalit_otvetstvenniy_za_obrabotku_pisem_type(){ try{return this.udalit_otvetstvenniy_za_obrabotku_pisem.getClass().getName();}catch(Exception ex){return null;} }

public polzovateli getUdalit_otvetstvenniy_za_obrabotku_pisem_obj(){ return this.udalit_otvetstvenniy_za_obrabotku_pisem; }

public void setUdalit_otvetstvenniy_za_obrabotku_pisem_obj( Object _udalit_otvetstvenniy_za_obrabotku_pisem){ this.udalit_otvetstvenniy_za_obrabotku_pisem=(polzovateli) _udalit_otvetstvenniy_za_obrabotku_pisem; }


@ManyToOne
@JoinColumn(name="vladelets_uchetnoy_zapisi", insertable = true, updatable = true)
private polzovateli vladelets_uchetnoy_zapisi;

public polzovateli getVladelets_uchetnoy_zapisi(){ try{return this.vladelets_uchetnoy_zapisi;}catch(Exception ex){ return null;} }

public void setVladelets_uchetnoy_zapisi( Object _vladelets_uchetnoy_zapisi){if (_vladelets_uchetnoy_zapisi instanceof String){this.vladelets_uchetnoy_zapisi= new polzovateli (_vladelets_uchetnoy_zapisi.toString());}else{try{this.vladelets_uchetnoy_zapisi= (polzovateli) _vladelets_uchetnoy_zapisi;}catch(Exception ex){Variables.logger.error(ex);this.vladelets_uchetnoy_zapisi= new polzovateli (_vladelets_uchetnoy_zapisi.toString());}}}

public UUID getVladelets_uchetnoy_zapisi_uuid(){ try{return this.vladelets_uchetnoy_zapisi.getGuid();}catch(Exception ex){return null;} }

public String getVladelets_uchetnoy_zapisi_type(){ try{return this.vladelets_uchetnoy_zapisi.getClass().getName();}catch(Exception ex){return null;} }

public polzovateli getVladelets_uchetnoy_zapisi_obj(){ return this.vladelets_uchetnoy_zapisi; }

public void setVladelets_uchetnoy_zapisi_obj( Object _vladelets_uchetnoy_zapisi){ this.vladelets_uchetnoy_zapisi=(polzovateli) _vladelets_uchetnoy_zapisi; }


@Column(name="udalit_parolsmtp", columnDefinition="text")
private String udalit_parolsmtp;

public void setUdalit_parolsmtp(String _udalit_parolsmtp){ this.udalit_parolsmtp=_udalit_parolsmtp; }

public String getUdalit_parolsmtp(){ return this.udalit_parolsmtp; }


@Column(name="otpravljat_skritie_kopii_pisem_na_etot_adres")

private Boolean otpravljat_skritie_kopii_pisem_na_etot_adres;
public void setOtpravljat_skritie_kopii_pisem_na_etot_adres(Boolean _otpravljat_skritie_kopii_pisem_na_etot_adres){ this.otpravljat_skritie_kopii_pisem_na_etot_adres=_otpravljat_skritie_kopii_pisem_na_etot_adres; }

public Boolean getOtpravljat_skritie_kopii_pisem_na_etot_adres(){ return this.otpravljat_skritie_kopii_pisem_na_etot_adres; }


}
