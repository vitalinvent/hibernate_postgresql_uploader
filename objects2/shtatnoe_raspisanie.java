import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="shtatnoe_raspisanie")
public class shtatnoe_raspisanie implements Serializable {

public shtatnoe_raspisanie(){}

public shtatnoe_raspisanie(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="oklad_tarif_maks")

private Float oklad_tarif_maks;
public void setOklad_tarif_maks(Float _oklad_tarif_maks){ this.oklad_tarif_maks=_oklad_tarif_maks; }

public Float getOklad_tarif_maks(){ return this.oklad_tarif_maks; }


@Column(name="utverzhdena")

private Boolean utverzhdena;
public void setUtverzhdena(Boolean _utverzhdena){ this.utverzhdena=_utverzhdena; }

public Boolean getUtverzhdena(){ return this.utverzhdena; }


@ManyToOne
@JoinColumn(name="grafik_raboti_sotrudnikov", insertable = true, updatable = true)
private grafiki_raboti_sotrudnikov grafik_raboti_sotrudnikov;

public grafiki_raboti_sotrudnikov getGrafik_raboti_sotrudnikov(){ try{return this.grafik_raboti_sotrudnikov;}catch(Exception ex){ return null;} }

public void setGrafik_raboti_sotrudnikov( Object _grafik_raboti_sotrudnikov){if (_grafik_raboti_sotrudnikov instanceof String){this.grafik_raboti_sotrudnikov= new grafiki_raboti_sotrudnikov (_grafik_raboti_sotrudnikov.toString());}else{try{this.grafik_raboti_sotrudnikov= (grafiki_raboti_sotrudnikov) _grafik_raboti_sotrudnikov;}catch(Exception ex){Variables.logger.error(ex);this.grafik_raboti_sotrudnikov= new grafiki_raboti_sotrudnikov (_grafik_raboti_sotrudnikov.toString());}}}

public UUID getGrafik_raboti_sotrudnikov_uuid(){ try{return this.grafik_raboti_sotrudnikov.getGuid();}catch(Exception ex){return null;} }

public String getGrafik_raboti_sotrudnikov_type(){ try{return this.grafik_raboti_sotrudnikov.getClass().getName();}catch(Exception ex){return null;} }

public grafiki_raboti_sotrudnikov getGrafik_raboti_sotrudnikov_obj(){ return this.grafik_raboti_sotrudnikov; }

public void setGrafik_raboti_sotrudnikov_obj( Object _grafik_raboti_sotrudnikov){ this.grafik_raboti_sotrudnikov=(grafiki_raboti_sotrudnikov) _grafik_raboti_sotrudnikov; }



@Column(name="f_o_t_min")

private Float f_o_t_min;
public void setF_o_t_min(Float _f_o_t_min){ this.f_o_t_min=_f_o_t_min; }

public Float getF_o_t_min(){ return this.f_o_t_min; }



@ManyToOne
@JoinColumn(name="dolzhnost", insertable = true, updatable = true)
private dolzhnosti dolzhnost;

public dolzhnosti getDolzhnost(){ try{return this.dolzhnost;}catch(Exception ex){ return null;} }

public void setDolzhnost( Object _dolzhnost){if (_dolzhnost instanceof String){this.dolzhnost= new dolzhnosti (_dolzhnost.toString());}else{try{this.dolzhnost= (dolzhnosti) _dolzhnost;}catch(Exception ex){Variables.logger.error(ex);this.dolzhnost= new dolzhnosti (_dolzhnost.toString());}}}

public UUID getDolzhnost_uuid(){ try{return this.dolzhnost.getGuid();}catch(Exception ex){return null;} }

public String getDolzhnost_type(){ try{return this.dolzhnost.getClass().getName();}catch(Exception ex){return null;} }

public dolzhnosti getDolzhnost_obj(){ return this.dolzhnost; }

public void setDolzhnost_obj( Object _dolzhnost){ this.dolzhnost=(dolzhnosti) _dolzhnost; }


@Column(name="kolichestvo_stavok")

private Float kolichestvo_stavok;
public void setKolichestvo_stavok(Float _kolichestvo_stavok){ this.kolichestvo_stavok=_kolichestvo_stavok; }

public Float getKolichestvo_stavok(){ return this.kolichestvo_stavok; }


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
@JoinColumn(name="podrazdelenie", insertable = true, updatable = true)
private podrazdelenija_organizatsiy podrazdelenie;

public podrazdelenija_organizatsiy getPodrazdelenie(){ try{return this.podrazdelenie;}catch(Exception ex){ return null;} }

public void setPodrazdelenie( Object _podrazdelenie){if (_podrazdelenie instanceof String){this.podrazdelenie= new podrazdelenija_organizatsiy (_podrazdelenie.toString());}else{try{this.podrazdelenie= (podrazdelenija_organizatsiy) _podrazdelenie;}catch(Exception ex){Variables.logger.error(ex);this.podrazdelenie= new podrazdelenija_organizatsiy (_podrazdelenie.toString());}}}

public UUID getPodrazdelenie_uuid(){ try{return this.podrazdelenie.getGuid();}catch(Exception ex){return null;} }

public String getPodrazdelenie_type(){ try{return this.podrazdelenie.getClass().getName();}catch(Exception ex){return null;} }

public podrazdelenija_organizatsiy getPodrazdelenie_obj(){ return this.podrazdelenie; }

public void setPodrazdelenie_obj( Object _podrazdelenie){ this.podrazdelenie=(podrazdelenija_organizatsiy) _podrazdelenie; }


@Column(name="protsent_nadbavki_za_vrednost")

private Float protsent_nadbavki_za_vrednost;
public void setProtsent_nadbavki_za_vrednost(Float _protsent_nadbavki_za_vrednost){ this.protsent_nadbavki_za_vrednost=_protsent_nadbavki_za_vrednost; }

public Float getProtsent_nadbavki_za_vrednost(){ return this.protsent_nadbavki_za_vrednost; }


@Column(name="nadbavka_za_vrednost_razmer_maks")

private Float nadbavka_za_vrednost_razmer_maks;
public void setNadbavka_za_vrednost_razmer_maks(Float _nadbavka_za_vrednost_razmer_maks){ this.nadbavka_za_vrednost_razmer_maks=_nadbavka_za_vrednost_razmer_maks; }

public Float getNadbavka_za_vrednost_razmer_maks(){ return this.nadbavka_za_vrednost_razmer_maks; }


@Column(name="data_utverzhdenija", columnDefinition="text")
private String data_utverzhdenija;

public void setData_utverzhdenija(String _data_utverzhdenija){ this.data_utverzhdenija=_data_utverzhdenija; }

public String getData_utverzhdenija(){ return this.data_utverzhdenija; }


@Column(name="uslovija_priema", columnDefinition="text")
private String uslovija_priema;

public void setUslovija_priema(String _uslovija_priema){ this.uslovija_priema=_uslovija_priema; }

public String getUslovija_priema(){ return this.uslovija_priema; }


@Column(name="severnaja_nadbavka_razmer_maks")

private Float severnaja_nadbavka_razmer_maks;
public void setSevernaja_nadbavka_razmer_maks(Float _severnaja_nadbavka_razmer_maks){ this.severnaja_nadbavka_razmer_maks=_severnaja_nadbavka_razmer_maks; }

public Float getSevernaja_nadbavka_razmer_maks(){ return this.severnaja_nadbavka_razmer_maks; }


@Column(name="zakrita")

private Boolean zakrita;
public void setZakrita(Boolean _zakrita){ this.zakrita=_zakrita; }

public Boolean getZakrita(){ return this.zakrita; }


@Column(name="data_zakritija", columnDefinition="text")
private String data_zakritija;

public void setData_zakritija(String _data_zakritija){ this.data_zakritija=_data_zakritija; }

public String getData_zakritija(){ return this.data_zakritija; }


@ManyToOne
@JoinColumn(name="razrjad_kategorija_nadbavki", insertable = true, updatable = true)
private razrjadi_kategorii_dolzhnostey razrjad_kategorija_nadbavki;

public razrjadi_kategorii_dolzhnostey getRazrjad_kategorija_nadbavki(){ try{return this.razrjad_kategorija_nadbavki;}catch(Exception ex){ return null;} }

public void setRazrjad_kategorija_nadbavki( Object _razrjad_kategorija_nadbavki){if (_razrjad_kategorija_nadbavki instanceof String){this.razrjad_kategorija_nadbavki= new razrjadi_kategorii_dolzhnostey (_razrjad_kategorija_nadbavki.toString());}else{try{this.razrjad_kategorija_nadbavki= (razrjadi_kategorii_dolzhnostey) _razrjad_kategorija_nadbavki;}catch(Exception ex){Variables.logger.error(ex);this.razrjad_kategorija_nadbavki= new razrjadi_kategorii_dolzhnostey (_razrjad_kategorija_nadbavki.toString());}}}

public UUID getRazrjad_kategorija_nadbavki_uuid(){ try{return this.razrjad_kategorija_nadbavki.getGuid();}catch(Exception ex){return null;} }

public String getRazrjad_kategorija_nadbavki_type(){ try{return this.razrjad_kategorija_nadbavki.getClass().getName();}catch(Exception ex){return null;} }

public razrjadi_kategorii_dolzhnostey getRazrjad_kategorija_nadbavki_obj(){ return this.razrjad_kategorija_nadbavki; }

public void setRazrjad_kategorija_nadbavki_obj( Object _razrjad_kategorija_nadbavki){ this.razrjad_kategorija_nadbavki=(razrjadi_kategorii_dolzhnostey) _razrjad_kategorija_nadbavki; }


@Column(name="oklad_tarif")

private Float oklad_tarif;
public void setOklad_tarif(Float _oklad_tarif){ this.oklad_tarif=_oklad_tarif; }

public Float getOklad_tarif(){ return this.oklad_tarif; }


@Column(name="oklad_tarif_min")

private Float oklad_tarif_min;
public void setOklad_tarif_min(Float _oklad_tarif_min){ this.oklad_tarif_min=_oklad_tarif_min; }

public Float getOklad_tarif_min(){ return this.oklad_tarif_min; }


@Column(name="opisanie", columnDefinition="text")
private String opisanie;

public void setOpisanie(String _opisanie){ this.opisanie=_opisanie; }

public String getOpisanie(){ return this.opisanie; }


@ManyToOne
@JoinColumn(name="osobie_uslovija_truda_p_f_r", insertable = true, updatable = true)
private osobie_uslovija_truda_p_f_r osobie_uslovija_truda_p_f_r;

public osobie_uslovija_truda_p_f_r getOsobie_uslovija_truda_p_f_r(){ try{return this.osobie_uslovija_truda_p_f_r;}catch(Exception ex){ return null;} }

public void setOsobie_uslovija_truda_p_f_r( Object _osobie_uslovija_truda_p_f_r){if (_osobie_uslovija_truda_p_f_r instanceof String){this.osobie_uslovija_truda_p_f_r= new osobie_uslovija_truda_p_f_r (_osobie_uslovija_truda_p_f_r.toString());}else{try{this.osobie_uslovija_truda_p_f_r= (osobie_uslovija_truda_p_f_r) _osobie_uslovija_truda_p_f_r;}catch(Exception ex){Variables.logger.error(ex);this.osobie_uslovija_truda_p_f_r= new osobie_uslovija_truda_p_f_r (_osobie_uslovija_truda_p_f_r.toString());}}}

public UUID getOsobie_uslovija_truda_p_f_r_uuid(){ try{return this.osobie_uslovija_truda_p_f_r.getGuid();}catch(Exception ex){return null;} }

public String getOsobie_uslovija_truda_p_f_r_type(){ try{return this.osobie_uslovija_truda_p_f_r.getClass().getName();}catch(Exception ex){return null;} }

public osobie_uslovija_truda_p_f_r getOsobie_uslovija_truda_p_f_r_obj(){ return this.osobie_uslovija_truda_p_f_r; }

public void setOsobie_uslovija_truda_p_f_r_obj( Object _osobie_uslovija_truda_p_f_r){ this.osobie_uslovija_truda_p_f_r=(osobie_uslovija_truda_p_f_r) _osobie_uslovija_truda_p_f_r; }


@Column(name="f_o_t")

private Float f_o_t;
public void setF_o_t(Float _f_o_t){ this.f_o_t=_f_o_t; }

public Float getF_o_t(){ return this.f_o_t; }


@Column(name="f_o_t_maks")

private Float f_o_t_maks;
public void setF_o_t_maks(Float _f_o_t_maks){ this.f_o_t_maks=_f_o_t_maks; }

public Float getF_o_t_maks(){ return this.f_o_t_maks; }


@Column(name="rayonniy_koeffitsient_razmer")

private Float rayonniy_koeffitsient_razmer;
public void setRayonniy_koeffitsient_razmer(Float _rayonniy_koeffitsient_razmer){ this.rayonniy_koeffitsient_razmer=_rayonniy_koeffitsient_razmer; }

public Float getRayonniy_koeffitsient_razmer(){ return this.rayonniy_koeffitsient_razmer; }


@Column(name="rayonniy_koeffitsient_razmer_min")

private Float rayonniy_koeffitsient_razmer_min;
public void setRayonniy_koeffitsient_razmer_min(Float _rayonniy_koeffitsient_razmer_min){ this.rayonniy_koeffitsient_razmer_min=_rayonniy_koeffitsient_razmer_min; }

public Float getRayonniy_koeffitsient_razmer_min(){ return this.rayonniy_koeffitsient_razmer_min; }


@Column(name="rayonniy_koeffitsient_razmer_maks")

private Float rayonniy_koeffitsient_razmer_maks;
public void setRayonniy_koeffitsient_razmer_maks(Float _rayonniy_koeffitsient_razmer_maks){ this.rayonniy_koeffitsient_razmer_maks=_rayonniy_koeffitsient_razmer_maks; }

public Float getRayonniy_koeffitsient_razmer_maks(){ return this.rayonniy_koeffitsient_razmer_maks; }


@Column(name="severnaja_nadbavka_razmer")

private Float severnaja_nadbavka_razmer;
public void setSevernaja_nadbavka_razmer(Float _severnaja_nadbavka_razmer){ this.severnaja_nadbavka_razmer=_severnaja_nadbavka_razmer; }

public Float getSevernaja_nadbavka_razmer(){ return this.severnaja_nadbavka_razmer; }


@Column(name="severnaja_nadbavka_razmer_min")

private Float severnaja_nadbavka_razmer_min;
public void setSevernaja_nadbavka_razmer_min(Float _severnaja_nadbavka_razmer_min){ this.severnaja_nadbavka_razmer_min=_severnaja_nadbavka_razmer_min; }

public Float getSevernaja_nadbavka_razmer_min(){ return this.severnaja_nadbavka_razmer_min; }


@ManyToOne
@JoinColumn(name="sposob_otrazhenija_zarplati_v_buhuchete", insertable = true, updatable = true)
private sposobi_otrazhenija_zarplati_v_buh_uchete sposob_otrazhenija_zarplati_v_buhuchete;

public sposobi_otrazhenija_zarplati_v_buh_uchete getSposob_otrazhenija_zarplati_v_buhuchete(){ try{return this.sposob_otrazhenija_zarplati_v_buhuchete;}catch(Exception ex){ return null;} }

public void setSposob_otrazhenija_zarplati_v_buhuchete( Object _sposob_otrazhenija_zarplati_v_buhuchete){if (_sposob_otrazhenija_zarplati_v_buhuchete instanceof String){this.sposob_otrazhenija_zarplati_v_buhuchete= new sposobi_otrazhenija_zarplati_v_buh_uchete (_sposob_otrazhenija_zarplati_v_buhuchete.toString());}else{try{this.sposob_otrazhenija_zarplati_v_buhuchete= (sposobi_otrazhenija_zarplati_v_buh_uchete) _sposob_otrazhenija_zarplati_v_buhuchete;}catch(Exception ex){Variables.logger.error(ex);this.sposob_otrazhenija_zarplati_v_buhuchete= new sposobi_otrazhenija_zarplati_v_buh_uchete (_sposob_otrazhenija_zarplati_v_buhuchete.toString());}}}

public UUID getSposob_otrazhenija_zarplati_v_buhuchete_uuid(){ try{return this.sposob_otrazhenija_zarplati_v_buhuchete.getGuid();}catch(Exception ex){return null;} }

public String getSposob_otrazhenija_zarplati_v_buhuchete_type(){ try{return this.sposob_otrazhenija_zarplati_v_buhuchete.getClass().getName();}catch(Exception ex){return null;} }

public sposobi_otrazhenija_zarplati_v_buh_uchete getSposob_otrazhenija_zarplati_v_buhuchete_obj(){ return this.sposob_otrazhenija_zarplati_v_buhuchete; }

public void setSposob_otrazhenija_zarplati_v_buhuchete_obj( Object _sposob_otrazhenija_zarplati_v_buhuchete){ this.sposob_otrazhenija_zarplati_v_buhuchete=(sposobi_otrazhenija_zarplati_v_buh_uchete) _sposob_otrazhenija_zarplati_v_buhuchete; }


@Column(name="nadbavka_za_vrednost_razmer_min")

private Float nadbavka_za_vrednost_razmer_min;
public void setNadbavka_za_vrednost_razmer_min(Float _nadbavka_za_vrednost_razmer_min){ this.nadbavka_za_vrednost_razmer_min=_nadbavka_za_vrednost_razmer_min; }

public Float getNadbavka_za_vrednost_razmer_min(){ return this.nadbavka_za_vrednost_razmer_min; }


@Column(name="nadbavka_za_vrednost_razmer")

private Float nadbavka_za_vrednost_razmer;
public void setNadbavka_za_vrednost_razmer(Float _nadbavka_za_vrednost_razmer){ this.nadbavka_za_vrednost_razmer=_nadbavka_za_vrednost_razmer; }

public Float getNadbavka_za_vrednost_razmer(){ return this.nadbavka_za_vrednost_razmer; }


@ManyToOne
@JoinColumn(name="osnovanie_dosrochnogo_naznachenija_pensii", insertable = true, updatable = true)
private osnovanija_dosrochnogo_naznachenija_pensii osnovanie_dosrochnogo_naznachenija_pensii;

public osnovanija_dosrochnogo_naznachenija_pensii getOsnovanie_dosrochnogo_naznachenija_pensii(){ try{return this.osnovanie_dosrochnogo_naznachenija_pensii;}catch(Exception ex){ return null;} }

public void setOsnovanie_dosrochnogo_naznachenija_pensii( Object _osnovanie_dosrochnogo_naznachenija_pensii){if (_osnovanie_dosrochnogo_naznachenija_pensii instanceof String){this.osnovanie_dosrochnogo_naznachenija_pensii= new osnovanija_dosrochnogo_naznachenija_pensii (_osnovanie_dosrochnogo_naznachenija_pensii.toString());}else{try{this.osnovanie_dosrochnogo_naznachenija_pensii= (osnovanija_dosrochnogo_naznachenija_pensii) _osnovanie_dosrochnogo_naznachenija_pensii;}catch(Exception ex){Variables.logger.error(ex);this.osnovanie_dosrochnogo_naznachenija_pensii= new osnovanija_dosrochnogo_naznachenija_pensii (_osnovanie_dosrochnogo_naznachenija_pensii.toString());}}}

public UUID getOsnovanie_dosrochnogo_naznachenija_pensii_uuid(){ try{return this.osnovanie_dosrochnogo_naznachenija_pensii.getGuid();}catch(Exception ex){return null;} }

public String getOsnovanie_dosrochnogo_naznachenija_pensii_type(){ try{return this.osnovanie_dosrochnogo_naznachenija_pensii.getClass().getName();}catch(Exception ex){return null;} }

public osnovanija_dosrochnogo_naznachenija_pensii getOsnovanie_dosrochnogo_naznachenija_pensii_obj(){ return this.osnovanie_dosrochnogo_naznachenija_pensii; }

public void setOsnovanie_dosrochnogo_naznachenija_pensii_obj( Object _osnovanie_dosrochnogo_naznachenija_pensii){ this.osnovanie_dosrochnogo_naznachenija_pensii=(osnovanija_dosrochnogo_naznachenija_pensii) _osnovanie_dosrochnogo_naznachenija_pensii; }


@Column(name="viplachivaetsja_nadbavka_za_vrednost")

private Boolean viplachivaetsja_nadbavka_za_vrednost;
public void setViplachivaetsja_nadbavka_za_vrednost(Boolean _viplachivaetsja_nadbavka_za_vrednost){ this.viplachivaetsja_nadbavka_za_vrednost=_viplachivaetsja_nadbavka_za_vrednost; }

public Boolean getViplachivaetsja_nadbavka_za_vrednost(){ return this.viplachivaetsja_nadbavka_za_vrednost; }


@Column(name="f_o_t_upravlencheskiy")

private Float f_o_t_upravlencheskiy;
public void setF_o_t_upravlencheskiy(Float _f_o_t_upravlencheskiy){ this.f_o_t_upravlencheskiy=_f_o_t_upravlencheskiy; }

public Float getF_o_t_upravlencheskiy(){ return this.f_o_t_upravlencheskiy; }


@Column(name="f_o_t_upravlencheskiy_min")

private Float f_o_t_upravlencheskiy_min;
public void setF_o_t_upravlencheskiy_min(Float _f_o_t_upravlencheskiy_min){ this.f_o_t_upravlencheskiy_min=_f_o_t_upravlencheskiy_min; }

public Float getF_o_t_upravlencheskiy_min(){ return this.f_o_t_upravlencheskiy_min; }


@Column(name="f_o_t_upravlencheskiy_maks")

private Float f_o_t_upravlencheskiy_maks;
public void setF_o_t_upravlencheskiy_maks(Float _f_o_t_upravlencheskiy_maks){ this.f_o_t_upravlencheskiy_maks=_f_o_t_upravlencheskiy_maks; }

public Float getF_o_t_upravlencheskiy_maks(){ return this.f_o_t_upravlencheskiy_maks; }


@Column(name="gruppa_pozitsiy_podrazdelenija")

private Boolean gruppa_pozitsiy_podrazdelenija;
public void setGruppa_pozitsiy_podrazdelenija(Boolean _gruppa_pozitsiy_podrazdelenija){ this.gruppa_pozitsiy_podrazdelenija=_gruppa_pozitsiy_podrazdelenija; }

public Boolean getGruppa_pozitsiy_podrazdelenija(){ return this.gruppa_pozitsiy_podrazdelenija; }


}
