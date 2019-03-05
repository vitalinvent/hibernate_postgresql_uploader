import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="etapi_proizvodstva")
public class etapi_proizvodstva implements Serializable {

public etapi_proizvodstva(){}

public etapi_proizvodstva(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="dlitelnost_etapa")

private Float dlitelnost_etapa;
public void setDlitelnost_etapa(Float _dlitelnost_etapa){ this.dlitelnost_etapa=_dlitelnost_etapa; }

public Float getDlitelnost_etapa(){ return this.dlitelnost_etapa; }



@Column(name="proizvodstvo_na_storone")

private Boolean proizvodstvo_na_storone;
public void setProizvodstvo_na_storone(Boolean _proizvodstvo_na_storone){ this.proizvodstvo_na_storone=_proizvodstvo_na_storone; }

public Boolean getProizvodstvo_na_storone(){ return this.proizvodstvo_na_storone; }



@Column(name="nomer_etapa")

private Float nomer_etapa;
public void setNomer_etapa(Float _nomer_etapa){ this.nomer_etapa=_nomer_etapa; }

public Float getNomer_etapa(){ return this.nomer_etapa; }


@ManyToOne
@JoinColumn(name="partner", insertable = true, updatable = true)
private partneri partner;

public partneri getPartner(){ try{return this.partner;}catch(Exception ex){ return null;} }

public void setPartner( Object _partner){if (_partner instanceof String){this.partner= new partneri (_partner.toString());}else{try{this.partner= (partneri) _partner;}catch(Exception ex){Variables.logger.error(ex);this.partner= new partneri (_partner.toString());}}}

public UUID getPartner_uuid(){ try{return this.partner.getGuid();}catch(Exception ex){return null;} }

public String getPartner_type(){ try{return this.partner.getClass().getName();}catch(Exception ex){return null;} }

public partneri getPartner_obj(){ return this.partner; }

public void setPartner_obj( Object _partner){ this.partner=(partneri) _partner; }


@Column(name="zavershayushchiy_bufer")

private Float zavershayushchiy_bufer;
public void setZavershayushchiy_bufer(Float _zavershayushchiy_bufer){ this.zavershayushchiy_bufer=_zavershayushchiy_bufer; }

public Float getZavershayushchiy_bufer(){ return this.zavershayushchiy_bufer; }


@Column(name="nomer_sleduyushchego_etapa")

private Float nomer_sleduyushchego_etapa;
public void setNomer_sleduyushchego_etapa(Float _nomer_sleduyushchego_etapa){ this.nomer_sleduyushchego_etapa=_nomer_sleduyushchego_etapa; }

public Float getNomer_sleduyushchego_etapa(){ return this.nomer_sleduyushchego_etapa; }


@ManyToOne
@JoinColumn(name="podrazdelenie", insertable = true, updatable = true)
private struktura_predprijatija podrazdelenie;

public struktura_predprijatija getPodrazdelenie(){ try{return this.podrazdelenie;}catch(Exception ex){ return null;} }

public void setPodrazdelenie( Object _podrazdelenie){if (_podrazdelenie instanceof String){this.podrazdelenie= new struktura_predprijatija (_podrazdelenie.toString());}else{try{this.podrazdelenie= (struktura_predprijatija) _podrazdelenie;}catch(Exception ex){Variables.logger.error(ex);this.podrazdelenie= new struktura_predprijatija (_podrazdelenie.toString());}}}

public UUID getPodrazdelenie_uuid(){ try{return this.podrazdelenie.getGuid();}catch(Exception ex){return null;} }

public String getPodrazdelenie_type(){ try{return this.podrazdelenie.getClass().getName();}catch(Exception ex){return null;} }

public struktura_predprijatija getPodrazdelenie_obj(){ return this.podrazdelenie; }

public void setPodrazdelenie_obj( Object _podrazdelenie){ this.podrazdelenie=(struktura_predprijatija) _podrazdelenie; }


@Column(name="neprerivniy")

private Boolean neprerivniy;
public void setNeprerivniy(Boolean _neprerivniy){ this.neprerivniy=_neprerivniy; }

public Boolean getNeprerivniy(){ return this.neprerivniy; }


@Column(name="planirovat_rabotu_vidov_rabochih_tsentrov")

private Boolean planirovat_rabotu_vidov_rabochih_tsentrov;
public void setPlanirovat_rabotu_vidov_rabochih_tsentrov(Boolean _planirovat_rabotu_vidov_rabochih_tsentrov){ this.planirovat_rabotu_vidov_rabochih_tsentrov=_planirovat_rabotu_vidov_rabochih_tsentrov; }

public Boolean getPlanirovat_rabotu_vidov_rabochih_tsentrov(){ return this.planirovat_rabotu_vidov_rabochih_tsentrov; }


@Column(name="odnovremenno_proizvodimoe_kolichestvo_edinits_partiy_izdeliy")

private Float odnovremenno_proizvodimoe_kolichestvo_edinits_partiy_izdeliy;
public void setOdnovremenno_proizvodimoe_kolichestvo_edinits_partiy_izdeliy(Float _odnovremenno_proizvodimoe_kolichestvo_edinits_partiy_izdeliy){ this.odnovremenno_proizvodimoe_kolichestvo_edinits_partiy_izdeliy=_odnovremenno_proizvodimoe_kolichestvo_edinits_partiy_izdeliy; }

public Float getOdnovremenno_proizvodimoe_kolichestvo_edinits_partiy_izdeliy(){ return this.odnovremenno_proizvodimoe_kolichestvo_edinits_partiy_izdeliy; }


@Column(name="predvaritelniy_bufer")

private Float predvaritelniy_bufer;
public void setPredvaritelniy_bufer(Float _predvaritelniy_bufer){ this.predvaritelniy_bufer=_predvaritelniy_bufer; }

public Float getPredvaritelniy_bufer(){ return this.predvaritelniy_bufer; }


@Column(name="zanimaemaja_moshchnost")

private Float zanimaemaja_moshchnost;
public void setZanimaemaja_moshchnost(Float _zanimaemaja_moshchnost){ this.zanimaemaja_moshchnost=_zanimaemaja_moshchnost; }

public Float getZanimaemaja_moshchnost(){ return this.zanimaemaja_moshchnost; }


@Column(name="marshrutnaja_karta", columnDefinition="text")
private String marshrutnaja_karta;

public void setMarshrutnaja_karta(String _marshrutnaja_karta){ this.marshrutnaja_karta=_marshrutnaja_karta; }

public String getMarshrutnaja_karta(){ return this.marshrutnaja_karta; }


@Column(name="opisanie", columnDefinition="text")
private String opisanie;

public void setOpisanie(String _opisanie){ this.opisanie=_opisanie; }

public String getOpisanie(){ return this.opisanie; }


@ManyToOne
@JoinColumn(name="grafik_raboti_partnera", insertable = true, updatable = true)
private kalendari grafik_raboti_partnera;

public kalendari getGrafik_raboti_partnera(){ try{return this.grafik_raboti_partnera;}catch(Exception ex){ return null;} }

public void setGrafik_raboti_partnera( Object _grafik_raboti_partnera){if (_grafik_raboti_partnera instanceof String){this.grafik_raboti_partnera= new kalendari (_grafik_raboti_partnera.toString());}else{try{this.grafik_raboti_partnera= (kalendari) _grafik_raboti_partnera;}catch(Exception ex){Variables.logger.error(ex);this.grafik_raboti_partnera= new kalendari (_grafik_raboti_partnera.toString());}}}

public UUID getGrafik_raboti_partnera_uuid(){ try{return this.grafik_raboti_partnera.getGuid();}catch(Exception ex){return null;} }

public String getGrafik_raboti_partnera_type(){ try{return this.grafik_raboti_partnera.getClass().getName();}catch(Exception ex){return null;} }

public kalendari getGrafik_raboti_partnera_obj(){ return this.grafik_raboti_partnera; }

public void setGrafik_raboti_partnera_obj( Object _grafik_raboti_partnera){ this.grafik_raboti_partnera=(kalendari) _grafik_raboti_partnera; }


@Column(name="maksimalnoe_kolichestvo_edinits_partiy_izdelija")

private Float maksimalnoe_kolichestvo_edinits_partiy_izdelija;
public void setMaksimalnoe_kolichestvo_edinits_partiy_izdelija(Float _maksimalnoe_kolichestvo_edinits_partiy_izdelija){ this.maksimalnoe_kolichestvo_edinits_partiy_izdelija=_maksimalnoe_kolichestvo_edinits_partiy_izdelija; }

public Float getMaksimalnoe_kolichestvo_edinits_partiy_izdelija(){ return this.maksimalnoe_kolichestvo_edinits_partiy_izdelija; }


@Column(name="udalit_dney_do_okonchanija")

private Float udalit_dney_do_okonchanija;
public void setUdalit_dney_do_okonchanija(Float _udalit_dney_do_okonchanija){ this.udalit_dney_do_okonchanija=_udalit_dney_do_okonchanija; }

public Float getUdalit_dney_do_okonchanija(){ return this.udalit_dney_do_okonchanija; }


@Column(name="podhodit_novoy_kontseptsii")

private Boolean podhodit_novoy_kontseptsii;
public void setPodhodit_novoy_kontseptsii(Boolean _podhodit_novoy_kontseptsii){ this.podhodit_novoy_kontseptsii=_podhodit_novoy_kontseptsii; }

public Boolean getPodhodit_novoy_kontseptsii(){ return this.podhodit_novoy_kontseptsii; }


@ManyToOne
@JoinColumn(name="usluga_pererabotchika", insertable = true, updatable = true)
private nomenklatura usluga_pererabotchika;

public nomenklatura getUsluga_pererabotchika(){ try{return this.usluga_pererabotchika;}catch(Exception ex){ return null;} }

public void setUsluga_pererabotchika( Object _usluga_pererabotchika){if (_usluga_pererabotchika instanceof String){this.usluga_pererabotchika= new nomenklatura (_usluga_pererabotchika.toString());}else{try{this.usluga_pererabotchika= (nomenklatura) _usluga_pererabotchika;}catch(Exception ex){Variables.logger.error(ex);this.usluga_pererabotchika= new nomenklatura (_usluga_pererabotchika.toString());}}}

public UUID getUsluga_pererabotchika_uuid(){ try{return this.usluga_pererabotchika.getGuid();}catch(Exception ex){return null;} }

public String getUsluga_pererabotchika_type(){ try{return this.usluga_pererabotchika.getClass().getName();}catch(Exception ex){return null;} }

public nomenklatura getUsluga_pererabotchika_obj(){ return this.usluga_pererabotchika; }

public void setUsluga_pererabotchika_obj( Object _usluga_pererabotchika){ this.usluga_pererabotchika=(nomenklatura) _usluga_pererabotchika; }


@ManyToOne
@JoinColumn(name="statja_kalkuljatsii", insertable = true, updatable = true)
private stati_kalkuljatsii statja_kalkuljatsii;

public stati_kalkuljatsii getStatja_kalkuljatsii(){ try{return this.statja_kalkuljatsii;}catch(Exception ex){ return null;} }

public void setStatja_kalkuljatsii( Object _statja_kalkuljatsii){if (_statja_kalkuljatsii instanceof String){this.statja_kalkuljatsii= new stati_kalkuljatsii (_statja_kalkuljatsii.toString());}else{try{this.statja_kalkuljatsii= (stati_kalkuljatsii) _statja_kalkuljatsii;}catch(Exception ex){Variables.logger.error(ex);this.statja_kalkuljatsii= new stati_kalkuljatsii (_statja_kalkuljatsii.toString());}}}

public UUID getStatja_kalkuljatsii_uuid(){ try{return this.statja_kalkuljatsii.getGuid();}catch(Exception ex){return null;} }

public String getStatja_kalkuljatsii_type(){ try{return this.statja_kalkuljatsii.getClass().getName();}catch(Exception ex){return null;} }

public stati_kalkuljatsii getStatja_kalkuljatsii_obj(){ return this.statja_kalkuljatsii; }

public void setStatja_kalkuljatsii_obj( Object _statja_kalkuljatsii){ this.statja_kalkuljatsii=(stati_kalkuljatsii) _statja_kalkuljatsii; }


@Column(name="koeffitsient_marshrutnoy_karti")

private Float koeffitsient_marshrutnoy_karti;
public void setKoeffitsient_marshrutnoy_karti(Float _koeffitsient_marshrutnoy_karti){ this.koeffitsient_marshrutnoy_karti=_koeffitsient_marshrutnoy_karti; }

public Float getKoeffitsient_marshrutnoy_karti(){ return this.koeffitsient_marshrutnoy_karti; }


@Column(name="porjadok_raboti_vidov_rabochih_tsentrov", columnDefinition="text")
private String porjadok_raboti_vidov_rabochih_tsentrov;

public void setPorjadok_raboti_vidov_rabochih_tsentrov(String _porjadok_raboti_vidov_rabochih_tsentrov){ this.porjadok_raboti_vidov_rabochih_tsentrov=_porjadok_raboti_vidov_rabochih_tsentrov; }

public String getPorjadok_raboti_vidov_rabochih_tsentrov(){ return this.porjadok_raboti_vidov_rabochih_tsentrov; }


}
