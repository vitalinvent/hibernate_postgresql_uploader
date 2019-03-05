import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="sposobi_otrazhenija_zarplati_v_buh_uchete")
public class sposobi_otrazhenija_zarplati_v_buh_uchete implements Serializable {

public sposobi_otrazhenija_zarplati_v_buh_uchete(){}

public sposobi_otrazhenija_zarplati_v_buh_uchete(String _guid){ this.guid=UUID.fromString(_guid); }

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
@JoinColumn(name="napravlenie_dejatelnosti", insertable = true, updatable = true)
private napravlenija_dejatelnosti napravlenie_dejatelnosti;

public napravlenija_dejatelnosti getNapravlenie_dejatelnosti(){ try{return this.napravlenie_dejatelnosti;}catch(Exception ex){ return null;} }

public void setNapravlenie_dejatelnosti( Object _napravlenie_dejatelnosti){if (_napravlenie_dejatelnosti instanceof String){this.napravlenie_dejatelnosti= new napravlenija_dejatelnosti (_napravlenie_dejatelnosti.toString());}else{try{this.napravlenie_dejatelnosti= (napravlenija_dejatelnosti) _napravlenie_dejatelnosti;}catch(Exception ex){Variables.logger.error(ex);this.napravlenie_dejatelnosti= new napravlenija_dejatelnosti (_napravlenie_dejatelnosti.toString());}}}

public UUID getNapravlenie_dejatelnosti_uuid(){ try{return this.napravlenie_dejatelnosti.getGuid();}catch(Exception ex){return null;} }

public String getNapravlenie_dejatelnosti_type(){ try{return this.napravlenie_dejatelnosti.getClass().getName();}catch(Exception ex){return null;} }

public napravlenija_dejatelnosti getNapravlenie_dejatelnosti_obj(){ return this.napravlenie_dejatelnosti; }

public void setNapravlenie_dejatelnosti_obj( Object _napravlenie_dejatelnosti){ this.napravlenie_dejatelnosti=(napravlenija_dejatelnosti) _napravlenie_dejatelnosti; }


@ManyToOne
@JoinColumn(name="analitika_rashodov", insertable = true, updatable = true)
private struktura_predprijatija analitika_rashodov;

public struktura_predprijatija getAnalitika_rashodov(){ try{return this.analitika_rashodov;}catch(Exception ex){ return null;} }

public void setAnalitika_rashodov( Object _analitika_rashodov){if (_analitika_rashodov instanceof String){this.analitika_rashodov= new struktura_predprijatija (_analitika_rashodov.toString());}else{try{this.analitika_rashodov= (struktura_predprijatija) _analitika_rashodov;}catch(Exception ex){Variables.logger.error(ex);this.analitika_rashodov= new struktura_predprijatija (_analitika_rashodov.toString());}}}

public UUID getAnalitika_rashodov_uuid(){ try{return this.analitika_rashodov.getGuid();}catch(Exception ex){return null;} }

public String getAnalitika_rashodov_type(){ try{return this.analitika_rashodov.getClass().getName();}catch(Exception ex){return null;} }

public struktura_predprijatija getAnalitika_rashodov_obj(){ return this.analitika_rashodov; }

public void setAnalitika_rashodov_obj( Object _analitika_rashodov){ this.analitika_rashodov=(struktura_predprijatija) _analitika_rashodov; }


@Column(name="est_prochie_operatsii")

private Boolean est_prochie_operatsii;
public void setEst_prochie_operatsii(Boolean _est_prochie_operatsii){ this.est_prochie_operatsii=_est_prochie_operatsii; }

public Boolean getEst_prochie_operatsii(){ return this.est_prochie_operatsii; }



@ManyToOne
@JoinColumn(name="analitika_rashodov_e_n_v_d", insertable = true, updatable = true)
private struktura_predprijatija analitika_rashodov_e_n_v_d;

public struktura_predprijatija getAnalitika_rashodov_e_n_v_d(){ try{return this.analitika_rashodov_e_n_v_d;}catch(Exception ex){ return null;} }

public void setAnalitika_rashodov_e_n_v_d( Object _analitika_rashodov_e_n_v_d){if (_analitika_rashodov_e_n_v_d instanceof String){this.analitika_rashodov_e_n_v_d= new struktura_predprijatija (_analitika_rashodov_e_n_v_d.toString());}else{try{this.analitika_rashodov_e_n_v_d= (struktura_predprijatija) _analitika_rashodov_e_n_v_d;}catch(Exception ex){Variables.logger.error(ex);this.analitika_rashodov_e_n_v_d= new struktura_predprijatija (_analitika_rashodov_e_n_v_d.toString());}}}

public UUID getAnalitika_rashodov_e_n_v_d_uuid(){ try{return this.analitika_rashodov_e_n_v_d.getGuid();}catch(Exception ex){return null;} }

public String getAnalitika_rashodov_e_n_v_d_type(){ try{return this.analitika_rashodov_e_n_v_d.getClass().getName();}catch(Exception ex){return null;} }

public struktura_predprijatija getAnalitika_rashodov_e_n_v_d_obj(){ return this.analitika_rashodov_e_n_v_d; }

public void setAnalitika_rashodov_e_n_v_d_obj( Object _analitika_rashodov_e_n_v_d){ this.analitika_rashodov_e_n_v_d=(struktura_predprijatija) _analitika_rashodov_e_n_v_d; }


@Column(name="subkonto1_travmatizm", columnDefinition="text")
private String subkonto1_travmatizm;

public void setSubkonto1_travmatizm(String _subkonto1_travmatizm){ this.subkonto1_travmatizm=_subkonto1_travmatizm; }

public String getSubkonto1_travmatizm(){ return this.subkonto1_travmatizm; }


@Column(name="subkonto2", columnDefinition="text")
private String subkonto2;

public void setSubkonto2(String _subkonto2){ this.subkonto2=_subkonto2; }

public String getSubkonto2(){ return this.subkonto2; }


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }



@Column(name="osobiy_sootvetstvuet_osnovnomu")

private Boolean osobiy_sootvetstvuet_osnovnomu;
public void setOsobiy_sootvetstvuet_osnovnomu(Boolean _osobiy_sootvetstvuet_osnovnomu){ this.osobiy_sootvetstvuet_osnovnomu=_osobiy_sootvetstvuet_osnovnomu; }

public Boolean getOsobiy_sootvetstvuet_osnovnomu(){ return this.osobiy_sootvetstvuet_osnovnomu; }


@Column(name="opisanie", columnDefinition="text")
private String opisanie;

public void setOpisanie(String _opisanie){ this.opisanie=_opisanie; }

public String getOpisanie(){ return this.opisanie; }


@Column(name="subkonto2_travmatizm", columnDefinition="text")
private String subkonto2_travmatizm;

public void setSubkonto2_travmatizm(String _subkonto2_travmatizm){ this.subkonto2_travmatizm=_subkonto2_travmatizm; }

public String getSubkonto2_travmatizm(){ return this.subkonto2_travmatizm; }


@ManyToOne
@JoinColumn(name="analitika_aktivov_passivov", insertable = true, updatable = true)
private struktura_predprijatija analitika_aktivov_passivov;

public struktura_predprijatija getAnalitika_aktivov_passivov(){ try{return this.analitika_aktivov_passivov;}catch(Exception ex){ return null;} }

public void setAnalitika_aktivov_passivov( Object _analitika_aktivov_passivov){if (_analitika_aktivov_passivov instanceof String){this.analitika_aktivov_passivov= new struktura_predprijatija (_analitika_aktivov_passivov.toString());}else{try{this.analitika_aktivov_passivov= (struktura_predprijatija) _analitika_aktivov_passivov;}catch(Exception ex){Variables.logger.error(ex);this.analitika_aktivov_passivov= new struktura_predprijatija (_analitika_aktivov_passivov.toString());}}}

public UUID getAnalitika_aktivov_passivov_uuid(){ try{return this.analitika_aktivov_passivov.getGuid();}catch(Exception ex){return null;} }

public String getAnalitika_aktivov_passivov_type(){ try{return this.analitika_aktivov_passivov.getClass().getName();}catch(Exception ex){return null;} }

public struktura_predprijatija getAnalitika_aktivov_passivov_obj(){ return this.analitika_aktivov_passivov; }

public void setAnalitika_aktivov_passivov_obj( Object _analitika_aktivov_passivov){ this.analitika_aktivov_passivov=(struktura_predprijatija) _analitika_aktivov_passivov; }


@ManyToOne
@JoinColumn(name="analitika_aktivov_passivov_e_n_v_d", insertable = true, updatable = true)
private struktura_predprijatija analitika_aktivov_passivov_e_n_v_d;

public struktura_predprijatija getAnalitika_aktivov_passivov_e_n_v_d(){ try{return this.analitika_aktivov_passivov_e_n_v_d;}catch(Exception ex){ return null;} }

public void setAnalitika_aktivov_passivov_e_n_v_d( Object _analitika_aktivov_passivov_e_n_v_d){if (_analitika_aktivov_passivov_e_n_v_d instanceof String){this.analitika_aktivov_passivov_e_n_v_d= new struktura_predprijatija (_analitika_aktivov_passivov_e_n_v_d.toString());}else{try{this.analitika_aktivov_passivov_e_n_v_d= (struktura_predprijatija) _analitika_aktivov_passivov_e_n_v_d;}catch(Exception ex){Variables.logger.error(ex);this.analitika_aktivov_passivov_e_n_v_d= new struktura_predprijatija (_analitika_aktivov_passivov_e_n_v_d.toString());}}}

public UUID getAnalitika_aktivov_passivov_e_n_v_d_uuid(){ try{return this.analitika_aktivov_passivov_e_n_v_d.getGuid();}catch(Exception ex){return null;} }

public String getAnalitika_aktivov_passivov_e_n_v_d_type(){ try{return this.analitika_aktivov_passivov_e_n_v_d.getClass().getName();}catch(Exception ex){return null;} }

public struktura_predprijatija getAnalitika_aktivov_passivov_e_n_v_d_obj(){ return this.analitika_aktivov_passivov_e_n_v_d; }

public void setAnalitika_aktivov_passivov_e_n_v_d_obj( Object _analitika_aktivov_passivov_e_n_v_d){ this.analitika_aktivov_passivov_e_n_v_d=(struktura_predprijatija) _analitika_aktivov_passivov_e_n_v_d; }


@ManyToOne
@JoinColumn(name="statja_kalkuljatsii_vznosov", insertable = true, updatable = true)
private stati_kalkuljatsii statja_kalkuljatsii_vznosov;

public stati_kalkuljatsii getStatja_kalkuljatsii_vznosov(){ try{return this.statja_kalkuljatsii_vznosov;}catch(Exception ex){ return null;} }

public void setStatja_kalkuljatsii_vznosov( Object _statja_kalkuljatsii_vznosov){if (_statja_kalkuljatsii_vznosov instanceof String){this.statja_kalkuljatsii_vznosov= new stati_kalkuljatsii (_statja_kalkuljatsii_vznosov.toString());}else{try{this.statja_kalkuljatsii_vznosov= (stati_kalkuljatsii) _statja_kalkuljatsii_vznosov;}catch(Exception ex){Variables.logger.error(ex);this.statja_kalkuljatsii_vznosov= new stati_kalkuljatsii (_statja_kalkuljatsii_vznosov.toString());}}}

public UUID getStatja_kalkuljatsii_vznosov_uuid(){ try{return this.statja_kalkuljatsii_vznosov.getGuid();}catch(Exception ex){return null;} }

public String getStatja_kalkuljatsii_vznosov_type(){ try{return this.statja_kalkuljatsii_vznosov.getClass().getName();}catch(Exception ex){return null;} }

public stati_kalkuljatsii getStatja_kalkuljatsii_vznosov_obj(){ return this.statja_kalkuljatsii_vznosov; }

public void setStatja_kalkuljatsii_vznosov_obj( Object _statja_kalkuljatsii_vznosov){ this.statja_kalkuljatsii_vznosov=(stati_kalkuljatsii) _statja_kalkuljatsii_vznosov; }


@Column(name="otdelnaja_statja_kalkuljatsii_vznosov")

private Boolean otdelnaja_statja_kalkuljatsii_vznosov;
public void setOtdelnaja_statja_kalkuljatsii_vznosov(Boolean _otdelnaja_statja_kalkuljatsii_vznosov){ this.otdelnaja_statja_kalkuljatsii_vznosov=_otdelnaja_statja_kalkuljatsii_vznosov; }

public Boolean getOtdelnaja_statja_kalkuljatsii_vznosov(){ return this.otdelnaja_statja_kalkuljatsii_vznosov; }


@Column(name="subkonto1", columnDefinition="text")
private String subkonto1;

public void setSubkonto1(String _subkonto1){ this.subkonto1=_subkonto1; }

public String getSubkonto1(){ return this.subkonto1; }


@Column(name="subkonto3", columnDefinition="text")
private String subkonto3;

public void setSubkonto3(String _subkonto3){ this.subkonto3=_subkonto3; }

public String getSubkonto3(){ return this.subkonto3; }


@Column(name="rezhim_ucheta_vznosov")

private Float rezhim_ucheta_vznosov;
public void setRezhim_ucheta_vznosov(Float _rezhim_ucheta_vznosov){ this.rezhim_ucheta_vznosov=_rezhim_ucheta_vznosov; }

public Float getRezhim_ucheta_vznosov(){ return this.rezhim_ucheta_vznosov; }


@Column(name="rezhim_ucheta_vznosov_e_n_v_d")

private Float rezhim_ucheta_vznosov_e_n_v_d;
public void setRezhim_ucheta_vznosov_e_n_v_d(Float _rezhim_ucheta_vznosov_e_n_v_d){ this.rezhim_ucheta_vznosov_e_n_v_d=_rezhim_ucheta_vznosov_e_n_v_d; }

public Float getRezhim_ucheta_vznosov_e_n_v_d(){ return this.rezhim_ucheta_vznosov_e_n_v_d; }


@Column(name="subkonto1_e_n_v_d", columnDefinition="text")
private String subkonto1_e_n_v_d;

public void setSubkonto1_e_n_v_d(String _subkonto1_e_n_v_d){ this.subkonto1_e_n_v_d=_subkonto1_e_n_v_d; }

public String getSubkonto1_e_n_v_d(){ return this.subkonto1_e_n_v_d; }


@Column(name="subkonto2_e_n_v_d", columnDefinition="text")
private String subkonto2_e_n_v_d;

public void setSubkonto2_e_n_v_d(String _subkonto2_e_n_v_d){ this.subkonto2_e_n_v_d=_subkonto2_e_n_v_d; }

public String getSubkonto2_e_n_v_d(){ return this.subkonto2_e_n_v_d; }


@Column(name="subkonto3_e_n_v_d", columnDefinition="text")
private String subkonto3_e_n_v_d;

public void setSubkonto3_e_n_v_d(String _subkonto3_e_n_v_d){ this.subkonto3_e_n_v_d=_subkonto3_e_n_v_d; }

public String getSubkonto3_e_n_v_d(){ return this.subkonto3_e_n_v_d; }


@Column(name="oplata_sdelnih_rabot")

private Boolean oplata_sdelnih_rabot;
public void setOplata_sdelnih_rabot(Boolean _oplata_sdelnih_rabot){ this.oplata_sdelnih_rabot=_oplata_sdelnih_rabot; }

public Boolean getOplata_sdelnih_rabot(){ return this.oplata_sdelnih_rabot; }


@ManyToOne
@JoinColumn(name="analitika_rashodov_vznosov", insertable = true, updatable = true)
private struktura_predprijatija analitika_rashodov_vznosov;

public struktura_predprijatija getAnalitika_rashodov_vznosov(){ try{return this.analitika_rashodov_vznosov;}catch(Exception ex){ return null;} }

public void setAnalitika_rashodov_vznosov( Object _analitika_rashodov_vznosov){if (_analitika_rashodov_vznosov instanceof String){this.analitika_rashodov_vznosov= new struktura_predprijatija (_analitika_rashodov_vznosov.toString());}else{try{this.analitika_rashodov_vznosov= (struktura_predprijatija) _analitika_rashodov_vznosov;}catch(Exception ex){Variables.logger.error(ex);this.analitika_rashodov_vznosov= new struktura_predprijatija (_analitika_rashodov_vznosov.toString());}}}

public UUID getAnalitika_rashodov_vznosov_uuid(){ try{return this.analitika_rashodov_vznosov.getGuid();}catch(Exception ex){return null;} }

public String getAnalitika_rashodov_vznosov_type(){ try{return this.analitika_rashodov_vznosov.getClass().getName();}catch(Exception ex){return null;} }

public struktura_predprijatija getAnalitika_rashodov_vznosov_obj(){ return this.analitika_rashodov_vznosov; }

public void setAnalitika_rashodov_vznosov_obj( Object _analitika_rashodov_vznosov){ this.analitika_rashodov_vznosov=(struktura_predprijatija) _analitika_rashodov_vznosov; }


@ManyToOne
@JoinColumn(name="analitika_aktivov_passivov_vznosov", insertable = true, updatable = true)
private struktura_predprijatija analitika_aktivov_passivov_vznosov;

public struktura_predprijatija getAnalitika_aktivov_passivov_vznosov(){ try{return this.analitika_aktivov_passivov_vznosov;}catch(Exception ex){ return null;} }

public void setAnalitika_aktivov_passivov_vznosov( Object _analitika_aktivov_passivov_vznosov){if (_analitika_aktivov_passivov_vznosov instanceof String){this.analitika_aktivov_passivov_vznosov= new struktura_predprijatija (_analitika_aktivov_passivov_vznosov.toString());}else{try{this.analitika_aktivov_passivov_vznosov= (struktura_predprijatija) _analitika_aktivov_passivov_vznosov;}catch(Exception ex){Variables.logger.error(ex);this.analitika_aktivov_passivov_vznosov= new struktura_predprijatija (_analitika_aktivov_passivov_vznosov.toString());}}}

public UUID getAnalitika_aktivov_passivov_vznosov_uuid(){ try{return this.analitika_aktivov_passivov_vznosov.getGuid();}catch(Exception ex){return null;} }

public String getAnalitika_aktivov_passivov_vznosov_type(){ try{return this.analitika_aktivov_passivov_vznosov.getClass().getName();}catch(Exception ex){return null;} }

public struktura_predprijatija getAnalitika_aktivov_passivov_vznosov_obj(){ return this.analitika_aktivov_passivov_vznosov; }

public void setAnalitika_aktivov_passivov_vznosov_obj( Object _analitika_aktivov_passivov_vznosov){ this.analitika_aktivov_passivov_vznosov=(struktura_predprijatija) _analitika_aktivov_passivov_vznosov; }


@Column(name="subkonto1_vznosov", columnDefinition="text")
private String subkonto1_vznosov;

public void setSubkonto1_vznosov(String _subkonto1_vznosov){ this.subkonto1_vznosov=_subkonto1_vznosov; }

public String getSubkonto1_vznosov(){ return this.subkonto1_vznosov; }


@Column(name="subkonto2_vznosov", columnDefinition="text")
private String subkonto2_vznosov;

public void setSubkonto2_vznosov(String _subkonto2_vznosov){ this.subkonto2_vznosov=_subkonto2_vznosov; }

public String getSubkonto2_vznosov(){ return this.subkonto2_vznosov; }


@Column(name="subkonto3_vznosov", columnDefinition="text")
private String subkonto3_vznosov;

public void setSubkonto3_vznosov(String _subkonto3_vznosov){ this.subkonto3_vznosov=_subkonto3_vznosov; }

public String getSubkonto3_vznosov(){ return this.subkonto3_vznosov; }


@ManyToOne
@JoinColumn(name="analitika_rashodov_vznosov_e_n_v_d", insertable = true, updatable = true)
private struktura_predprijatija analitika_rashodov_vznosov_e_n_v_d;

public struktura_predprijatija getAnalitika_rashodov_vznosov_e_n_v_d(){ try{return this.analitika_rashodov_vznosov_e_n_v_d;}catch(Exception ex){ return null;} }

public void setAnalitika_rashodov_vznosov_e_n_v_d( Object _analitika_rashodov_vznosov_e_n_v_d){if (_analitika_rashodov_vznosov_e_n_v_d instanceof String){this.analitika_rashodov_vznosov_e_n_v_d= new struktura_predprijatija (_analitika_rashodov_vznosov_e_n_v_d.toString());}else{try{this.analitika_rashodov_vznosov_e_n_v_d= (struktura_predprijatija) _analitika_rashodov_vznosov_e_n_v_d;}catch(Exception ex){Variables.logger.error(ex);this.analitika_rashodov_vznosov_e_n_v_d= new struktura_predprijatija (_analitika_rashodov_vznosov_e_n_v_d.toString());}}}

public UUID getAnalitika_rashodov_vznosov_e_n_v_d_uuid(){ try{return this.analitika_rashodov_vznosov_e_n_v_d.getGuid();}catch(Exception ex){return null;} }

public String getAnalitika_rashodov_vznosov_e_n_v_d_type(){ try{return this.analitika_rashodov_vznosov_e_n_v_d.getClass().getName();}catch(Exception ex){return null;} }

public struktura_predprijatija getAnalitika_rashodov_vznosov_e_n_v_d_obj(){ return this.analitika_rashodov_vznosov_e_n_v_d; }

public void setAnalitika_rashodov_vznosov_e_n_v_d_obj( Object _analitika_rashodov_vznosov_e_n_v_d){ this.analitika_rashodov_vznosov_e_n_v_d=(struktura_predprijatija) _analitika_rashodov_vznosov_e_n_v_d; }


@Column(name="subkonto3_travmatizm", columnDefinition="text")
private String subkonto3_travmatizm;

public void setSubkonto3_travmatizm(String _subkonto3_travmatizm){ this.subkonto3_travmatizm=_subkonto3_travmatizm; }

public String getSubkonto3_travmatizm(){ return this.subkonto3_travmatizm; }


@ManyToOne
@JoinColumn(name="analitika_aktivov_passivov_vznosov_e_n_v_d", insertable = true, updatable = true)
private struktura_predprijatija analitika_aktivov_passivov_vznosov_e_n_v_d;

public struktura_predprijatija getAnalitika_aktivov_passivov_vznosov_e_n_v_d(){ try{return this.analitika_aktivov_passivov_vznosov_e_n_v_d;}catch(Exception ex){ return null;} }

public void setAnalitika_aktivov_passivov_vznosov_e_n_v_d( Object _analitika_aktivov_passivov_vznosov_e_n_v_d){if (_analitika_aktivov_passivov_vznosov_e_n_v_d instanceof String){this.analitika_aktivov_passivov_vznosov_e_n_v_d= new struktura_predprijatija (_analitika_aktivov_passivov_vznosov_e_n_v_d.toString());}else{try{this.analitika_aktivov_passivov_vznosov_e_n_v_d= (struktura_predprijatija) _analitika_aktivov_passivov_vznosov_e_n_v_d;}catch(Exception ex){Variables.logger.error(ex);this.analitika_aktivov_passivov_vznosov_e_n_v_d= new struktura_predprijatija (_analitika_aktivov_passivov_vznosov_e_n_v_d.toString());}}}

public UUID getAnalitika_aktivov_passivov_vznosov_e_n_v_d_uuid(){ try{return this.analitika_aktivov_passivov_vznosov_e_n_v_d.getGuid();}catch(Exception ex){return null;} }

public String getAnalitika_aktivov_passivov_vznosov_e_n_v_d_type(){ try{return this.analitika_aktivov_passivov_vznosov_e_n_v_d.getClass().getName();}catch(Exception ex){return null;} }

public struktura_predprijatija getAnalitika_aktivov_passivov_vznosov_e_n_v_d_obj(){ return this.analitika_aktivov_passivov_vznosov_e_n_v_d; }

public void setAnalitika_aktivov_passivov_vznosov_e_n_v_d_obj( Object _analitika_aktivov_passivov_vznosov_e_n_v_d){ this.analitika_aktivov_passivov_vznosov_e_n_v_d=(struktura_predprijatija) _analitika_aktivov_passivov_vznosov_e_n_v_d; }


@Column(name="subkonto1_vznosov_e_n_v_d", columnDefinition="text")
private String subkonto1_vznosov_e_n_v_d;

public void setSubkonto1_vznosov_e_n_v_d(String _subkonto1_vznosov_e_n_v_d){ this.subkonto1_vznosov_e_n_v_d=_subkonto1_vznosov_e_n_v_d; }

public String getSubkonto1_vznosov_e_n_v_d(){ return this.subkonto1_vznosov_e_n_v_d; }


@Column(name="analitika_rashodov_travmatizm", columnDefinition="text")
private String analitika_rashodov_travmatizm;

public void setAnalitika_rashodov_travmatizm(String _analitika_rashodov_travmatizm){ this.analitika_rashodov_travmatizm=_analitika_rashodov_travmatizm; }

public String getAnalitika_rashodov_travmatizm(){ return this.analitika_rashodov_travmatizm; }


@Column(name="subkonto2_vznosov_e_n_v_d", columnDefinition="text")
private String subkonto2_vznosov_e_n_v_d;

public void setSubkonto2_vznosov_e_n_v_d(String _subkonto2_vznosov_e_n_v_d){ this.subkonto2_vznosov_e_n_v_d=_subkonto2_vznosov_e_n_v_d; }

public String getSubkonto2_vznosov_e_n_v_d(){ return this.subkonto2_vznosov_e_n_v_d; }


@ManyToOne
@JoinColumn(name="statja_kalkuljatsii", insertable = true, updatable = true)
private stati_kalkuljatsii statja_kalkuljatsii;

public stati_kalkuljatsii getStatja_kalkuljatsii(){ try{return this.statja_kalkuljatsii;}catch(Exception ex){ return null;} }

public void setStatja_kalkuljatsii( Object _statja_kalkuljatsii){if (_statja_kalkuljatsii instanceof String){this.statja_kalkuljatsii= new stati_kalkuljatsii (_statja_kalkuljatsii.toString());}else{try{this.statja_kalkuljatsii= (stati_kalkuljatsii) _statja_kalkuljatsii;}catch(Exception ex){Variables.logger.error(ex);this.statja_kalkuljatsii= new stati_kalkuljatsii (_statja_kalkuljatsii.toString());}}}

public UUID getStatja_kalkuljatsii_uuid(){ try{return this.statja_kalkuljatsii.getGuid();}catch(Exception ex){return null;} }

public String getStatja_kalkuljatsii_type(){ try{return this.statja_kalkuljatsii.getClass().getName();}catch(Exception ex){return null;} }

public stati_kalkuljatsii getStatja_kalkuljatsii_obj(){ return this.statja_kalkuljatsii; }

public void setStatja_kalkuljatsii_obj( Object _statja_kalkuljatsii){ this.statja_kalkuljatsii=(stati_kalkuljatsii) _statja_kalkuljatsii; }


@Column(name="otdelnaja_statja_kalkuljatsii")

private Boolean otdelnaja_statja_kalkuljatsii;
public void setOtdelnaja_statja_kalkuljatsii(Boolean _otdelnaja_statja_kalkuljatsii){ this.otdelnaja_statja_kalkuljatsii=_otdelnaja_statja_kalkuljatsii; }

public Boolean getOtdelnaja_statja_kalkuljatsii(){ return this.otdelnaja_statja_kalkuljatsii; }


@Column(name="subkonto3_vznosov_e_n_v_d", columnDefinition="text")
private String subkonto3_vznosov_e_n_v_d;

public void setSubkonto3_vznosov_e_n_v_d(String _subkonto3_vznosov_e_n_v_d){ this.subkonto3_vznosov_e_n_v_d=_subkonto3_vznosov_e_n_v_d; }

public String getSubkonto3_vznosov_e_n_v_d(){ return this.subkonto3_vznosov_e_n_v_d; }


@Column(name="rezhim_ucheta_vznosov_na_travmatizm")

private Float rezhim_ucheta_vznosov_na_travmatizm;
public void setRezhim_ucheta_vznosov_na_travmatizm(Float _rezhim_ucheta_vznosov_na_travmatizm){ this.rezhim_ucheta_vznosov_na_travmatizm=_rezhim_ucheta_vznosov_na_travmatizm; }

public Float getRezhim_ucheta_vznosov_na_travmatizm(){ return this.rezhim_ucheta_vznosov_na_travmatizm; }


@Column(name="analitika_aktivov_passivov_travmatizm", columnDefinition="text")
private String analitika_aktivov_passivov_travmatizm;

public void setAnalitika_aktivov_passivov_travmatizm(String _analitika_aktivov_passivov_travmatizm){ this.analitika_aktivov_passivov_travmatizm=_analitika_aktivov_passivov_travmatizm; }

public String getAnalitika_aktivov_passivov_travmatizm(){ return this.analitika_aktivov_passivov_travmatizm; }


}
