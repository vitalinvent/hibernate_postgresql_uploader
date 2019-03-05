import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="upakovki_edinitsi_izmerenija")
public class upakovki_edinitsi_izmerenija implements Serializable {

public upakovki_edinitsi_izmerenija(){}

public upakovki_edinitsi_izmerenija(String _guid){ this.guid=UUID.fromString(_guid); }

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
@JoinColumn(name="glubina_edinitsa_izmerenija", insertable = true, updatable = true)
private upakovki_edinitsi_izmerenija glubina_edinitsa_izmerenija;

public upakovki_edinitsi_izmerenija getGlubina_edinitsa_izmerenija(){ try{return this.glubina_edinitsa_izmerenija;}catch(Exception ex){ return null;} }

public void setGlubina_edinitsa_izmerenija( Object _glubina_edinitsa_izmerenija){if (_glubina_edinitsa_izmerenija instanceof String){this.glubina_edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_glubina_edinitsa_izmerenija.toString());}else{try{this.glubina_edinitsa_izmerenija= (upakovki_edinitsi_izmerenija) _glubina_edinitsa_izmerenija;}catch(Exception ex){Variables.logger.error(ex);this.glubina_edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_glubina_edinitsa_izmerenija.toString());}}}

public UUID getGlubina_edinitsa_izmerenija_uuid(){ try{return this.glubina_edinitsa_izmerenija.getGuid();}catch(Exception ex){return null;} }

public String getGlubina_edinitsa_izmerenija_type(){ try{return this.glubina_edinitsa_izmerenija.getClass().getName();}catch(Exception ex){return null;} }

public upakovki_edinitsi_izmerenija getGlubina_edinitsa_izmerenija_obj(){ return this.glubina_edinitsa_izmerenija; }

public void setGlubina_edinitsa_izmerenija_obj( Object _glubina_edinitsa_izmerenija){ this.glubina_edinitsa_izmerenija=(upakovki_edinitsi_izmerenija) _glubina_edinitsa_izmerenija; }



@ManyToOne
@JoinColumn(name="ves_edinitsa_izmerenija", insertable = true, updatable = true)
private upakovki_edinitsi_izmerenija ves_edinitsa_izmerenija;

public upakovki_edinitsi_izmerenija getVes_edinitsa_izmerenija(){ try{return this.ves_edinitsa_izmerenija;}catch(Exception ex){ return null;} }

public void setVes_edinitsa_izmerenija( Object _ves_edinitsa_izmerenija){if (_ves_edinitsa_izmerenija instanceof String){this.ves_edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_ves_edinitsa_izmerenija.toString());}else{try{this.ves_edinitsa_izmerenija= (upakovki_edinitsi_izmerenija) _ves_edinitsa_izmerenija;}catch(Exception ex){Variables.logger.error(ex);this.ves_edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_ves_edinitsa_izmerenija.toString());}}}

public UUID getVes_edinitsa_izmerenija_uuid(){ try{return this.ves_edinitsa_izmerenija.getGuid();}catch(Exception ex){return null;} }

public String getVes_edinitsa_izmerenija_type(){ try{return this.ves_edinitsa_izmerenija.getClass().getName();}catch(Exception ex){return null;} }

public upakovki_edinitsi_izmerenija getVes_edinitsa_izmerenija_obj(){ return this.ves_edinitsa_izmerenija; }

public void setVes_edinitsa_izmerenija_obj( Object _ves_edinitsa_izmerenija){ this.ves_edinitsa_izmerenija=(upakovki_edinitsi_izmerenija) _ves_edinitsa_izmerenija; }


@Column(name="postavljaetsja_v_mnogooborotnoy_tare")

private Boolean postavljaetsja_v_mnogooborotnoy_tare;
public void setPostavljaetsja_v_mnogooborotnoy_tare(Boolean _postavljaetsja_v_mnogooborotnoy_tare){ this.postavljaetsja_v_mnogooborotnoy_tare=_postavljaetsja_v_mnogooborotnoy_tare; }

public Boolean getPostavljaetsja_v_mnogooborotnoy_tare(){ return this.postavljaetsja_v_mnogooborotnoy_tare; }


@Column(name="bezrazmernaja")

private Boolean bezrazmernaja;
public void setBezrazmernaja(Boolean _bezrazmernaja){ this.bezrazmernaja=_bezrazmernaja; }

public Boolean getBezrazmernaja(){ return this.bezrazmernaja; }


@Column(name="ves")

private Float ves;
public void setVes(Float _ves){ this.ves=_ves; }

public Float getVes(){ return this.ves; }


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }



@Column(name="visota")

private Float visota;
public void setVisota(Float _visota){ this.visota=_visota; }

public Float getVisota(){ return this.visota; }


@ManyToOne
@JoinColumn(name="visota_edinitsa_izmerenija", insertable = true, updatable = true)
private upakovki_edinitsi_izmerenija visota_edinitsa_izmerenija;

public upakovki_edinitsi_izmerenija getVisota_edinitsa_izmerenija(){ try{return this.visota_edinitsa_izmerenija;}catch(Exception ex){ return null;} }

public void setVisota_edinitsa_izmerenija( Object _visota_edinitsa_izmerenija){if (_visota_edinitsa_izmerenija instanceof String){this.visota_edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_visota_edinitsa_izmerenija.toString());}else{try{this.visota_edinitsa_izmerenija= (upakovki_edinitsi_izmerenija) _visota_edinitsa_izmerenija;}catch(Exception ex){Variables.logger.error(ex);this.visota_edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_visota_edinitsa_izmerenija.toString());}}}

public UUID getVisota_edinitsa_izmerenija_uuid(){ try{return this.visota_edinitsa_izmerenija.getGuid();}catch(Exception ex){return null;} }

public String getVisota_edinitsa_izmerenija_type(){ try{return this.visota_edinitsa_izmerenija.getClass().getName();}catch(Exception ex){return null;} }

public upakovki_edinitsi_izmerenija getVisota_edinitsa_izmerenija_obj(){ return this.visota_edinitsa_izmerenija; }

public void setVisota_edinitsa_izmerenija_obj( Object _visota_edinitsa_izmerenija){ this.visota_edinitsa_izmerenija=(upakovki_edinitsi_izmerenija) _visota_edinitsa_izmerenija; }


@Column(name="glubina")

private Float glubina;
public void setGlubina(Float _glubina){ this.glubina=_glubina; }

public Float getGlubina(){ return this.glubina; }


@Column(name="naimenovanie_polnoe", columnDefinition="text")
private String naimenovanie_polnoe;

public void setNaimenovanie_polnoe(String _naimenovanie_polnoe){ this.naimenovanie_polnoe=_naimenovanie_polnoe; }

public String getNaimenovanie_polnoe(){ return this.naimenovanie_polnoe; }


@ManyToOne
@JoinColumn(name="edinitsa_izmerenija", insertable = true, updatable = true)
private upakovki_edinitsi_izmerenija edinitsa_izmerenija;

public upakovki_edinitsi_izmerenija getEdinitsa_izmerenija(){ try{return this.edinitsa_izmerenija;}catch(Exception ex){ return null;} }

public void setEdinitsa_izmerenija( Object _edinitsa_izmerenija){if (_edinitsa_izmerenija instanceof String){this.edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_edinitsa_izmerenija.toString());}else{try{this.edinitsa_izmerenija= (upakovki_edinitsi_izmerenija) _edinitsa_izmerenija;}catch(Exception ex){Variables.logger.error(ex);this.edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_edinitsa_izmerenija.toString());}}}

public UUID getEdinitsa_izmerenija_uuid(){ try{return this.edinitsa_izmerenija.getGuid();}catch(Exception ex){return null;} }

public String getEdinitsa_izmerenija_type(){ try{return this.edinitsa_izmerenija.getClass().getName();}catch(Exception ex){return null;} }

public upakovki_edinitsi_izmerenija getEdinitsa_izmerenija_obj(){ return this.edinitsa_izmerenija; }

public void setEdinitsa_izmerenija_obj( Object _edinitsa_izmerenija){ this.edinitsa_izmerenija=(upakovki_edinitsi_izmerenija) _edinitsa_izmerenija; }


@Column(name="chislitel")

private Float chislitel;
public void setChislitel(Float _chislitel){ this.chislitel=_chislitel; }

public Float getChislitel(){ return this.chislitel; }


@Column(name="znamenatel")

private Float znamenatel;
public void setZnamenatel(Float _znamenatel){ this.znamenatel=_znamenatel; }

public Float getZnamenatel(){ return this.znamenatel; }


@Column(name="lineynie_razmeri_predstavlenie", columnDefinition="text")
private String lineynie_razmeri_predstavlenie;

public void setLineynie_razmeri_predstavlenie(String _lineynie_razmeri_predstavlenie){ this.lineynie_razmeri_predstavlenie=_lineynie_razmeri_predstavlenie; }

public String getLineynie_razmeri_predstavlenie(){ return this.lineynie_razmeri_predstavlenie; }


@Column(name="obyem")

private Float obyem;
public void setObyem(Float _obyem){ this.obyem=_obyem; }

public Float getObyem(){ return this.obyem; }


@ManyToOne
@JoinColumn(name="obyem_edinitsa_izmerenija", insertable = true, updatable = true)
private upakovki_edinitsi_izmerenija obyem_edinitsa_izmerenija;

public upakovki_edinitsi_izmerenija getObyem_edinitsa_izmerenija(){ try{return this.obyem_edinitsa_izmerenija;}catch(Exception ex){ return null;} }

public void setObyem_edinitsa_izmerenija( Object _obyem_edinitsa_izmerenija){if (_obyem_edinitsa_izmerenija instanceof String){this.obyem_edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_obyem_edinitsa_izmerenija.toString());}else{try{this.obyem_edinitsa_izmerenija= (upakovki_edinitsi_izmerenija) _obyem_edinitsa_izmerenija;}catch(Exception ex){Variables.logger.error(ex);this.obyem_edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_obyem_edinitsa_izmerenija.toString());}}}

public UUID getObyem_edinitsa_izmerenija_uuid(){ try{return this.obyem_edinitsa_izmerenija.getGuid();}catch(Exception ex){return null;} }

public String getObyem_edinitsa_izmerenija_type(){ try{return this.obyem_edinitsa_izmerenija.getClass().getName();}catch(Exception ex){return null;} }

public upakovki_edinitsi_izmerenija getObyem_edinitsa_izmerenija_obj(){ return this.obyem_edinitsa_izmerenija; }

public void setObyem_edinitsa_izmerenija_obj( Object _obyem_edinitsa_izmerenija){ this.obyem_edinitsa_izmerenija=(upakovki_edinitsi_izmerenija) _obyem_edinitsa_izmerenija; }


@Column(name="shirina")

private Float shirina;
public void setShirina(Float _shirina){ this.shirina=_shirina; }

public Float getShirina(){ return this.shirina; }


@ManyToOne
@JoinColumn(name="shirina_edinitsa_izmerenija", insertable = true, updatable = true)
private upakovki_edinitsi_izmerenija shirina_edinitsa_izmerenija;

public upakovki_edinitsi_izmerenija getShirina_edinitsa_izmerenija(){ try{return this.shirina_edinitsa_izmerenija;}catch(Exception ex){ return null;} }

public void setShirina_edinitsa_izmerenija( Object _shirina_edinitsa_izmerenija){if (_shirina_edinitsa_izmerenija instanceof String){this.shirina_edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_shirina_edinitsa_izmerenija.toString());}else{try{this.shirina_edinitsa_izmerenija= (upakovki_edinitsi_izmerenija) _shirina_edinitsa_izmerenija;}catch(Exception ex){Variables.logger.error(ex);this.shirina_edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_shirina_edinitsa_izmerenija.toString());}}}

public UUID getShirina_edinitsa_izmerenija_uuid(){ try{return this.shirina_edinitsa_izmerenija.getGuid();}catch(Exception ex){return null;} }

public String getShirina_edinitsa_izmerenija_type(){ try{return this.shirina_edinitsa_izmerenija.getClass().getName();}catch(Exception ex){return null;} }

public upakovki_edinitsi_izmerenija getShirina_edinitsa_izmerenija_obj(){ return this.shirina_edinitsa_izmerenija; }

public void setShirina_edinitsa_izmerenija_obj( Object _shirina_edinitsa_izmerenija){ this.shirina_edinitsa_izmerenija=(upakovki_edinitsi_izmerenija) _shirina_edinitsa_izmerenija; }


@Column(name="kolichestvo_upakovok")

private Float kolichestvo_upakovok;
public void setKolichestvo_upakovok(Float _kolichestvo_upakovok){ this.kolichestvo_upakovok=_kolichestvo_upakovok; }

public Float getKolichestvo_upakovok(){ return this.kolichestvo_upakovok; }


@ManyToOne
@JoinColumn(name="nomenklatura_mnogooborotnaja_tara", insertable = true, updatable = true)
private nomenklatura nomenklatura_mnogooborotnaja_tara;

public nomenklatura getNomenklatura_mnogooborotnaja_tara(){ try{return this.nomenklatura_mnogooborotnaja_tara;}catch(Exception ex){ return null;} }

public void setNomenklatura_mnogooborotnaja_tara( Object _nomenklatura_mnogooborotnaja_tara){if (_nomenklatura_mnogooborotnaja_tara instanceof String){this.nomenklatura_mnogooborotnaja_tara= new nomenklatura (_nomenklatura_mnogooborotnaja_tara.toString());}else{try{this.nomenklatura_mnogooborotnaja_tara= (nomenklatura) _nomenklatura_mnogooborotnaja_tara;}catch(Exception ex){Variables.logger.error(ex);this.nomenklatura_mnogooborotnaja_tara= new nomenklatura (_nomenklatura_mnogooborotnaja_tara.toString());}}}

public UUID getNomenklatura_mnogooborotnaja_tara_uuid(){ try{return this.nomenklatura_mnogooborotnaja_tara.getGuid();}catch(Exception ex){return null;} }

public String getNomenklatura_mnogooborotnaja_tara_type(){ try{return this.nomenklatura_mnogooborotnaja_tara.getClass().getName();}catch(Exception ex){return null;} }

public nomenklatura getNomenklatura_mnogooborotnaja_tara_obj(){ return this.nomenklatura_mnogooborotnaja_tara; }

public void setNomenklatura_mnogooborotnaja_tara_obj( Object _nomenklatura_mnogooborotnaja_tara){ this.nomenklatura_mnogooborotnaja_tara=(nomenklatura) _nomenklatura_mnogooborotnaja_tara; }


@Column(name="minimalnoe_kolichestvo_upakovok_mnogooborotnoy_tari")

private Float minimalnoe_kolichestvo_upakovok_mnogooborotnoy_tari;
public void setMinimalnoe_kolichestvo_upakovok_mnogooborotnoy_tari(Float _minimalnoe_kolichestvo_upakovok_mnogooborotnoy_tari){ this.minimalnoe_kolichestvo_upakovok_mnogooborotnoy_tari=_minimalnoe_kolichestvo_upakovok_mnogooborotnoy_tari; }

public Float getMinimalnoe_kolichestvo_upakovok_mnogooborotnoy_tari(){ return this.minimalnoe_kolichestvo_upakovok_mnogooborotnoy_tari; }


@Column(name="mezhdunarodnoe_sokrashchenie", columnDefinition="text")
private String mezhdunarodnoe_sokrashchenie;

public void setMezhdunarodnoe_sokrashchenie(String _mezhdunarodnoe_sokrashchenie){ this.mezhdunarodnoe_sokrashchenie=_mezhdunarodnoe_sokrashchenie; }

public String getMezhdunarodnoe_sokrashchenie(){ return this.mezhdunarodnoe_sokrashchenie; }


}
