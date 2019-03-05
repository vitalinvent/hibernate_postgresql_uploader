import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="vidi_dokumentov_vvod_dannih_dlja_rascheta_zarplati")
public class vidi_dokumentov_vvod_dannih_dlja_rascheta_zarplati implements Serializable {

public vidi_dokumentov_vvod_dannih_dlja_rascheta_zarplati(){}

public vidi_dokumentov_vvod_dannih_dlja_rascheta_zarplati(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="ne_ispolzuetsja")

private Boolean ne_ispolzuetsja;
public void setNe_ispolzuetsja(Boolean _ne_ispolzuetsja){ this.ne_ispolzuetsja=_ne_ispolzuetsja; }

public Boolean getNe_ispolzuetsja(){ return this.ne_ispolzuetsja; }


@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }


@Column(name="podskazka", columnDefinition="text")
private String podskazka;

public void setPodskazka(String _podskazka){ this.podskazka=_podskazka; }

public String getPodskazka(){ return this.podskazka; }




@Column(name="neskolko_podrazdeleniy")

private Boolean neskolko_podrazdeleniy;
public void setNeskolko_podrazdeleniy(Boolean _neskolko_podrazdeleniy){ this.neskolko_podrazdeleniy=_neskolko_podrazdeleniy; }

public Boolean getNeskolko_podrazdeleniy(){ return this.neskolko_podrazdeleniy; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }


@Column(name="neskolko_organizatsiy")

private Boolean neskolko_organizatsiy;
public void setNeskolko_organizatsiy(Boolean _neskolko_organizatsiy){ this.neskolko_organizatsiy=_neskolko_organizatsiy; }

public Boolean getNeskolko_organizatsiy(){ return this.neskolko_organizatsiy; }


@Column(name="vremja_vvoditsja_svodno")

private Boolean vremja_vvoditsja_svodno;
public void setVremja_vvoditsja_svodno(Boolean _vremja_vvoditsja_svodno){ this.vremja_vvoditsja_svodno=_vremja_vvoditsja_svodno; }

public Boolean getVremja_vvoditsja_svodno(){ return this.vremja_vvoditsja_svodno; }


@Column(name="predstavlenie_dokumenta", columnDefinition="text")
private String predstavlenie_dokumenta;

public void setPredstavlenie_dokumenta(String _predstavlenie_dokumenta){ this.predstavlenie_dokumenta=_predstavlenie_dokumenta; }

public String getPredstavlenie_dokumenta(){ return this.predstavlenie_dokumenta; }


@Column(name="neskolko_sotrudnikov")

private Boolean neskolko_sotrudnikov;
public void setNeskolko_sotrudnikov(Boolean _neskolko_sotrudnikov){ this.neskolko_sotrudnikov=_neskolko_sotrudnikov; }

public Boolean getNeskolko_sotrudnikov(){ return this.neskolko_sotrudnikov; }


@ManyToOne
@JoinColumn(name="organizatsija", insertable = true, updatable = true)
private organizatsii organizatsija;

public organizatsii getOrganizatsija(){ try{return this.organizatsija;}catch(Exception ex){ return null;} }

public void setOrganizatsija( Object _organizatsija){if (_organizatsija instanceof String){this.organizatsija= new organizatsii (_organizatsija.toString());}else{try{this.organizatsija= (organizatsii) _organizatsija;}catch(Exception ex){Variables.logger.error(ex);this.organizatsija= new organizatsii (_organizatsija.toString());}}}

public UUID getOrganizatsija_uuid(){ try{return this.organizatsija.getGuid();}catch(Exception ex){return null;} }

public String getOrganizatsija_type(){ try{return this.organizatsija.getClass().getName();}catch(Exception ex){return null;} }

public organizatsii getOrganizatsija_obj(){ return this.organizatsija; }

public void setOrganizatsija_obj( Object _organizatsija){ this.organizatsija=(organizatsii) _organizatsija; }


@Column(name="znachenija_pokazateley_vvodjatsja_na_raznie_dati")

private Boolean znachenija_pokazateley_vvodjatsja_na_raznie_dati;
public void setZnachenija_pokazateley_vvodjatsja_na_raznie_dati(Boolean _znachenija_pokazateley_vvodjatsja_na_raznie_dati){ this.znachenija_pokazateley_vvodjatsja_na_raznie_dati=_znachenija_pokazateley_vvodjatsja_na_raznie_dati; }

public Boolean getZnachenija_pokazateley_vvodjatsja_na_raznie_dati(){ return this.znachenija_pokazateley_vvodjatsja_na_raznie_dati; }


@ManyToOne
@JoinColumn(name="podrazdelenie", insertable = true, updatable = true)
private podrazdelenija_organizatsiy podrazdelenie;

public podrazdelenija_organizatsiy getPodrazdelenie(){ try{return this.podrazdelenie;}catch(Exception ex){ return null;} }

public void setPodrazdelenie( Object _podrazdelenie){if (_podrazdelenie instanceof String){this.podrazdelenie= new podrazdelenija_organizatsiy (_podrazdelenie.toString());}else{try{this.podrazdelenie= (podrazdelenija_organizatsiy) _podrazdelenie;}catch(Exception ex){Variables.logger.error(ex);this.podrazdelenie= new podrazdelenija_organizatsiy (_podrazdelenie.toString());}}}

public UUID getPodrazdelenie_uuid(){ try{return this.podrazdelenie.getGuid();}catch(Exception ex){return null;} }

public String getPodrazdelenie_type(){ try{return this.podrazdelenie.getClass().getName();}catch(Exception ex){return null;} }

public podrazdelenija_organizatsiy getPodrazdelenie_obj(){ return this.podrazdelenie; }

public void setPodrazdelenie_obj( Object _podrazdelenie){ this.podrazdelenie=(podrazdelenija_organizatsiy) _podrazdelenie; }


@Column(name="zapolnjat_spisok_obyektov")

private Boolean zapolnjat_spisok_obyektov;
public void setZapolnjat_spisok_obyektov(Boolean _zapolnjat_spisok_obyektov){ this.zapolnjat_spisok_obyektov=_zapolnjat_spisok_obyektov; }

public Boolean getZapolnjat_spisok_obyektov(){ return this.zapolnjat_spisok_obyektov; }


@Column(name="vipolnennie_raboti_raspredeljayutsja_s_uchetom_koeffitsientov")

private Boolean vipolnennie_raboti_raspredeljayutsja_s_uchetom_koeffitsientov;
public void setVipolnennie_raboti_raspredeljayutsja_s_uchetom_koeffitsientov(Boolean _vipolnennie_raboti_raspredeljayutsja_s_uchetom_koeffitsientov){ this.vipolnennie_raboti_raspredeljayutsja_s_uchetom_koeffitsientov=_vipolnennie_raboti_raspredeljayutsja_s_uchetom_koeffitsientov; }

public Boolean getVipolnennie_raboti_raspredeljayutsja_s_uchetom_koeffitsientov(){ return this.vipolnennie_raboti_raspredeljayutsja_s_uchetom_koeffitsientov; }


@Column(name="pokazivat_podrazdelenie")

private Boolean pokazivat_podrazdelenie;
public void setPokazivat_podrazdelenie(Boolean _pokazivat_podrazdelenie){ this.pokazivat_podrazdelenie=_pokazivat_podrazdelenie; }

public Boolean getPokazivat_podrazdelenie(){ return this.pokazivat_podrazdelenie; }


@Column(name="proverjat_zapolnenie_podrazdelenija")

private Boolean proverjat_zapolnenie_podrazdelenija;
public void setProverjat_zapolnenie_podrazdelenija(Boolean _proverjat_zapolnenie_podrazdelenija){ this.proverjat_zapolnenie_podrazdelenija=_proverjat_zapolnenie_podrazdelenija; }

public Boolean getProverjat_zapolnenie_podrazdelenija(){ return this.proverjat_zapolnenie_podrazdelenija; }


@Column(name="ispolzovat_period_okonchanija")

private Boolean ispolzovat_period_okonchanija;
public void setIspolzovat_period_okonchanija(Boolean _ispolzovat_period_okonchanija){ this.ispolzovat_period_okonchanija=_ispolzovat_period_okonchanija; }

public Boolean getIspolzovat_period_okonchanija(){ return this.ispolzovat_period_okonchanija; }


@Column(name="vremja_vvoditsja_za_mesjats")

private Boolean vremja_vvoditsja_za_mesjats;
public void setVremja_vvoditsja_za_mesjats(Boolean _vremja_vvoditsja_za_mesjats){ this.vremja_vvoditsja_za_mesjats=_vremja_vvoditsja_za_mesjats; }

public Boolean getVremja_vvoditsja_za_mesjats(){ return this.vremja_vvoditsja_za_mesjats; }


@Column(name="udalit_identifikator_obyekta", columnDefinition="text")
private String udalit_identifikator_obyekta;

public void setUdalit_identifikator_obyekta(String _udalit_identifikator_obyekta){ this.udalit_identifikator_obyekta=_udalit_identifikator_obyekta; }

public String getUdalit_identifikator_obyekta(){ return this.udalit_identifikator_obyekta; }


@Column(name="vidi_rabot_zapolnjayutsja_v_dokumente")

private Boolean vidi_rabot_zapolnjayutsja_v_dokumente;
public void setVidi_rabot_zapolnjayutsja_v_dokumente(Boolean _vidi_rabot_zapolnjayutsja_v_dokumente){ this.vidi_rabot_zapolnjayutsja_v_dokumente=_vidi_rabot_zapolnjayutsja_v_dokumente; }

public Boolean getVidi_rabot_zapolnjayutsja_v_dokumente(){ return this.vidi_rabot_zapolnjayutsja_v_dokumente; }


@Column(name="vipolnennie_raboti_raspredeljayutsja_po_sotrudnikam")

private Boolean vipolnennie_raboti_raspredeljayutsja_po_sotrudnikam;
public void setVipolnennie_raboti_raspredeljayutsja_po_sotrudnikam(Boolean _vipolnennie_raboti_raspredeljayutsja_po_sotrudnikam){ this.vipolnennie_raboti_raspredeljayutsja_po_sotrudnikam=_vipolnennie_raboti_raspredeljayutsja_po_sotrudnikam; }

public Boolean getVipolnennie_raboti_raspredeljayutsja_po_sotrudnikam(){ return this.vipolnennie_raboti_raspredeljayutsja_po_sotrudnikam; }


@Column(name="vipolnennie_raboti_raspredeljayutsja_s_uchetom_tarifnih_stavok")

private Boolean vipolnennie_raboti_raspredeljayutsja_s_uchetom_tarifnih_stavok;
public void setVipolnennie_raboti_raspredeljayutsja_s_uchetom_tarifnih_stavok(Boolean _vipolnennie_raboti_raspredeljayutsja_s_uchetom_tarifnih_stavok){ this.vipolnennie_raboti_raspredeljayutsja_s_uchetom_tarifnih_stavok=_vipolnennie_raboti_raspredeljayutsja_s_uchetom_tarifnih_stavok; }

public Boolean getVipolnennie_raboti_raspredeljayutsja_s_uchetom_tarifnih_stavok(){ return this.vipolnennie_raboti_raspredeljayutsja_s_uchetom_tarifnih_stavok; }


@Column(name="vipolnennie_raboti_raspredeljayutsja_s_uchetom_otrabotannogo_vremeni")

private Boolean vipolnennie_raboti_raspredeljayutsja_s_uchetom_otrabotannogo_vremeni;
public void setVipolnennie_raboti_raspredeljayutsja_s_uchetom_otrabotannogo_vremeni(Boolean _vipolnennie_raboti_raspredeljayutsja_s_uchetom_otrabotannogo_vremeni){ this.vipolnennie_raboti_raspredeljayutsja_s_uchetom_otrabotannogo_vremeni=_vipolnennie_raboti_raspredeljayutsja_s_uchetom_otrabotannogo_vremeni; }

public Boolean getVipolnennie_raboti_raspredeljayutsja_s_uchetom_otrabotannogo_vremeni(){ return this.vipolnennie_raboti_raspredeljayutsja_s_uchetom_otrabotannogo_vremeni; }


@Column(name="vipolnennie_raboti_vvodjatsja_svodno")

private Boolean vipolnennie_raboti_vvodjatsja_svodno;
public void setVipolnennie_raboti_vvodjatsja_svodno(Boolean _vipolnennie_raboti_vvodjatsja_svodno){ this.vipolnennie_raboti_vvodjatsja_svodno=_vipolnennie_raboti_vvodjatsja_svodno; }

public Boolean getVipolnennie_raboti_vvodjatsja_svodno(){ return this.vipolnennie_raboti_vvodjatsja_svodno; }


@Column(name="kratkiy_sostav", columnDefinition="text")
private String kratkiy_sostav;

public void setKratkiy_sostav(String _kratkiy_sostav){ this.kratkiy_sostav=_kratkiy_sostav; }

public String getKratkiy_sostav(){ return this.kratkiy_sostav; }


}
