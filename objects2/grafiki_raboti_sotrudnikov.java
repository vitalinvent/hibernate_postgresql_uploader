import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="grafiki_raboti_sotrudnikov")
public class grafiki_raboti_sotrudnikov implements Serializable {

public grafiki_raboti_sotrudnikov(){}

public grafiki_raboti_sotrudnikov(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="uchitivat_prazdniki")

private Boolean uchitivat_prazdniki;
public void setUchitivat_prazdniki(Boolean _uchitivat_prazdniki){ this.uchitivat_prazdniki=_uchitivat_prazdniki; }

public Boolean getUchitivat_prazdniki(){ return this.uchitivat_prazdniki; }


@Column(name="data_otscheta", columnDefinition="text")
private String data_otscheta;

public void setData_otscheta(String _data_otscheta){ this.data_otscheta=_data_otscheta; }

public String getData_otscheta(){ return this.data_otscheta; }




@Column(name="dlitelnost_rabochey_nedeli")

private Float dlitelnost_rabochey_nedeli;
public void setDlitelnost_rabochey_nedeli(Float _dlitelnost_rabochey_nedeli){ this.dlitelnost_rabochey_nedeli=_dlitelnost_rabochey_nedeli; }

public Float getDlitelnost_rabochey_nedeli(){ return this.dlitelnost_rabochey_nedeli; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }


@ManyToOne
@JoinColumn(name="proizvodstvenniy_kalendar", insertable = true, updatable = true)
private proizvodstvennie_kalendari proizvodstvenniy_kalendar;

public proizvodstvennie_kalendari getProizvodstvenniy_kalendar(){ try{return this.proizvodstvenniy_kalendar;}catch(Exception ex){ return null;} }

public void setProizvodstvenniy_kalendar( Object _proizvodstvenniy_kalendar){if (_proizvodstvenniy_kalendar instanceof String){this.proizvodstvenniy_kalendar= new proizvodstvennie_kalendari (_proizvodstvenniy_kalendar.toString());}else{try{this.proizvodstvenniy_kalendar= (proizvodstvennie_kalendari) _proizvodstvenniy_kalendar;}catch(Exception ex){Variables.logger.error(ex);this.proizvodstvenniy_kalendar= new proizvodstvennie_kalendari (_proizvodstvenniy_kalendar.toString());}}}

public UUID getProizvodstvenniy_kalendar_uuid(){ try{return this.proizvodstvenniy_kalendar.getGuid();}catch(Exception ex){return null;} }

public String getProizvodstvenniy_kalendar_type(){ try{return this.proizvodstvenniy_kalendar.getClass().getName();}catch(Exception ex){return null;} }

public proizvodstvennie_kalendari getProizvodstvenniy_kalendar_obj(){ return this.proizvodstvenniy_kalendar; }

public void setProizvodstvenniy_kalendar_obj( Object _proizvodstvenniy_kalendar){ this.proizvodstvenniy_kalendar=(proizvodstvennie_kalendari) _proizvodstvenniy_kalendar; }


@Column(name="nepolnoe_rabochee_vremja")

private Boolean nepolnoe_rabochee_vremja;
public void setNepolnoe_rabochee_vremja(Boolean _nepolnoe_rabochee_vremja){ this.nepolnoe_rabochee_vremja=_nepolnoe_rabochee_vremja; }

public Boolean getNepolnoe_rabochee_vremja(){ return this.nepolnoe_rabochee_vremja; }


@Column(name="summirovanniy_uchet_rabochego_vremeni")

private Boolean summirovanniy_uchet_rabochego_vremeni;
public void setSummirovanniy_uchet_rabochego_vremeni(Boolean _summirovanniy_uchet_rabochego_vremeni){ this.summirovanniy_uchet_rabochego_vremeni=_summirovanniy_uchet_rabochego_vremeni; }

public Boolean getSummirovanniy_uchet_rabochego_vremeni(){ return this.summirovanniy_uchet_rabochego_vremeni; }


@Column(name="sokrashchennaja_rabochaja_nedelja")

private Boolean sokrashchennaja_rabochaja_nedelja;
public void setSokrashchennaja_rabochaja_nedelja(Boolean _sokrashchennaja_rabochaja_nedelja){ this.sokrashchennaja_rabochaja_nedelja=_sokrashchennaja_rabochaja_nedelja; }

public Boolean getSokrashchennaja_rabochaja_nedelja(){ return this.sokrashchennaja_rabochaja_nedelja; }


@Column(name="nepolniy_rabochiy_den")

private Boolean nepolniy_rabochiy_den;
public void setNepolniy_rabochiy_den(Boolean _nepolniy_rabochiy_den){ this.nepolniy_rabochiy_den=_nepolniy_rabochiy_den; }

public Boolean getNepolniy_rabochiy_den(){ return this.nepolniy_rabochiy_den; }


@ManyToOne
@JoinColumn(name="grafik_polnogo_rabochego_vremeni", insertable = true, updatable = true)
private grafiki_raboti_sotrudnikov grafik_polnogo_rabochego_vremeni;

public grafiki_raboti_sotrudnikov getGrafik_polnogo_rabochego_vremeni(){ try{return this.grafik_polnogo_rabochego_vremeni;}catch(Exception ex){ return null;} }

public void setGrafik_polnogo_rabochego_vremeni( Object _grafik_polnogo_rabochego_vremeni){if (_grafik_polnogo_rabochego_vremeni instanceof String){this.grafik_polnogo_rabochego_vremeni= new grafiki_raboti_sotrudnikov (_grafik_polnogo_rabochego_vremeni.toString());}else{try{this.grafik_polnogo_rabochego_vremeni= (grafiki_raboti_sotrudnikov) _grafik_polnogo_rabochego_vremeni;}catch(Exception ex){Variables.logger.error(ex);this.grafik_polnogo_rabochego_vremeni= new grafiki_raboti_sotrudnikov (_grafik_polnogo_rabochego_vremeni.toString());}}}

public UUID getGrafik_polnogo_rabochego_vremeni_uuid(){ try{return this.grafik_polnogo_rabochego_vremeni.getGuid();}catch(Exception ex){return null;} }

public String getGrafik_polnogo_rabochego_vremeni_type(){ try{return this.grafik_polnogo_rabochego_vremeni.getClass().getName();}catch(Exception ex){return null;} }

public grafiki_raboti_sotrudnikov getGrafik_polnogo_rabochego_vremeni_obj(){ return this.grafik_polnogo_rabochego_vremeni; }

public void setGrafik_polnogo_rabochego_vremeni_obj( Object _grafik_polnogo_rabochego_vremeni){ this.grafik_polnogo_rabochego_vremeni=(grafiki_raboti_sotrudnikov) _grafik_polnogo_rabochego_vremeni; }


@Column(name="rabochih_dney_v_nedele")

private Float rabochih_dney_v_nedele;
public void setRabochih_dney_v_nedele(Float _rabochih_dney_v_nedele){ this.rabochih_dney_v_nedele=_rabochih_dney_v_nedele; }

public Float getRabochih_dney_v_nedele(){ return this.rabochih_dney_v_nedele; }


@ManyToOne
@JoinColumn(name="grafik_normi_pri_summirovannom_uchete", insertable = true, updatable = true)
private grafiki_raboti_sotrudnikov grafik_normi_pri_summirovannom_uchete;

public grafiki_raboti_sotrudnikov getGrafik_normi_pri_summirovannom_uchete(){ try{return this.grafik_normi_pri_summirovannom_uchete;}catch(Exception ex){ return null;} }

public void setGrafik_normi_pri_summirovannom_uchete( Object _grafik_normi_pri_summirovannom_uchete){if (_grafik_normi_pri_summirovannom_uchete instanceof String){this.grafik_normi_pri_summirovannom_uchete= new grafiki_raboti_sotrudnikov (_grafik_normi_pri_summirovannom_uchete.toString());}else{try{this.grafik_normi_pri_summirovannom_uchete= (grafiki_raboti_sotrudnikov) _grafik_normi_pri_summirovannom_uchete;}catch(Exception ex){Variables.logger.error(ex);this.grafik_normi_pri_summirovannom_uchete= new grafiki_raboti_sotrudnikov (_grafik_normi_pri_summirovannom_uchete.toString());}}}

public UUID getGrafik_normi_pri_summirovannom_uchete_uuid(){ try{return this.grafik_normi_pri_summirovannom_uchete.getGuid();}catch(Exception ex){return null;} }

public String getGrafik_normi_pri_summirovannom_uchete_type(){ try{return this.grafik_normi_pri_summirovannom_uchete.getClass().getName();}catch(Exception ex){return null;} }

public grafiki_raboti_sotrudnikov getGrafik_normi_pri_summirovannom_uchete_obj(){ return this.grafik_normi_pri_summirovannom_uchete; }

public void setGrafik_normi_pri_summirovannom_uchete_obj( Object _grafik_normi_pri_summirovannom_uchete){ this.grafik_normi_pri_summirovannom_uchete=(grafiki_raboti_sotrudnikov) _grafik_normi_pri_summirovannom_uchete; }


}
