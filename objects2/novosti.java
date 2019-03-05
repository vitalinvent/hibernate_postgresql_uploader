import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="novosti")
public class novosti implements Serializable {

public novosti(){}

public novosti(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="podzagolovok", columnDefinition="text")
private String podzagolovok;

public void setPodzagolovok(String _podzagolovok){ this.podzagolovok=_podzagolovok; }

public String getPodzagolovok(){ return this.podzagolovok; }


@Column(name="skrivat_v_obshchem_spiske_novostey")

private Boolean skrivat_v_obshchem_spiske_novostey;
public void setSkrivat_v_obshchem_spiske_novostey(Boolean _skrivat_v_obshchem_spiske_novostey){ this.skrivat_v_obshchem_spiske_novostey=_skrivat_v_obshchem_spiske_novostey; }

public Boolean getSkrivat_v_obshchem_spiske_novostey(){ return this.skrivat_v_obshchem_spiske_novostey; }



@Column(name="data_zavershenija", columnDefinition="text")
private String data_zavershenija;

public void setData_zavershenija(String _data_zavershenija){ this.data_zavershenija=_data_zavershenija; }

public String getData_zavershenija(){ return this.data_zavershenija; }



@ManyToOne
@JoinColumn(name="lenta_novostey", insertable = true, updatable = true)
private lenti_novostey lenta_novostey;

public lenti_novostey getLenta_novostey(){ try{return this.lenta_novostey;}catch(Exception ex){ return null;} }

public void setLenta_novostey( Object _lenta_novostey){if (_lenta_novostey instanceof String){this.lenta_novostey= new lenti_novostey (_lenta_novostey.toString());}else{try{this.lenta_novostey= (lenti_novostey) _lenta_novostey;}catch(Exception ex){Variables.logger.error(ex);this.lenta_novostey= new lenti_novostey (_lenta_novostey.toString());}}}

public UUID getLenta_novostey_uuid(){ try{return this.lenta_novostey.getGuid();}catch(Exception ex){return null;} }

public String getLenta_novostey_type(){ try{return this.lenta_novostey.getClass().getName();}catch(Exception ex){return null;} }

public lenti_novostey getLenta_novostey_obj(){ return this.lenta_novostey; }

public void setLenta_novostey_obj( Object _lenta_novostey){ this.lenta_novostey=(lenti_novostey) _lenta_novostey; }


@Column(name="u_i_n_novosti", columnDefinition="text")
private String u_i_n_novosti;

public void setU_i_n_novosti(String _u_i_n_novosti){ this.u_i_n_novosti=_u_i_n_novosti; }

public String getU_i_n_novosti(){ return this.u_i_n_novosti; }


@Column(name="data_publikatsii", columnDefinition="text")
private String data_publikatsii;

public void setData_publikatsii(String _data_publikatsii){ this.data_publikatsii=_data_publikatsii; }

public String getData_publikatsii(){ return this.data_publikatsii; }


@Column(name="ssilka_na_polniy_tekst_novosti", columnDefinition="text")
private String ssilka_na_polniy_tekst_novosti;

public void setSsilka_na_polniy_tekst_novosti(String _ssilka_na_polniy_tekst_novosti){ this.ssilka_na_polniy_tekst_novosti=_ssilka_na_polniy_tekst_novosti; }

public String getSsilka_na_polniy_tekst_novosti(){ return this.ssilka_na_polniy_tekst_novosti; }


@Column(name="tekst_novosti", columnDefinition="text")
private String tekst_novosti;

public void setTekst_novosti(String _tekst_novosti){ this.tekst_novosti=_tekst_novosti; }

public String getTekst_novosti(){ return this.tekst_novosti; }


@Column(name="tekst_novosti_dlja_vneshnih_istochnikov", columnDefinition="text")
private String tekst_novosti_dlja_vneshnih_istochnikov;

public void setTekst_novosti_dlja_vneshnih_istochnikov(String _tekst_novosti_dlja_vneshnih_istochnikov){ this.tekst_novosti_dlja_vneshnih_istochnikov=_tekst_novosti_dlja_vneshnih_istochnikov; }

public String getTekst_novosti_dlja_vneshnih_istochnikov(){ return this.tekst_novosti_dlja_vneshnih_istochnikov; }


@Column(name="vazhnost")

private Float vazhnost;
public void setVazhnost(Float _vazhnost){ this.vazhnost=_vazhnost; }

public Float getVazhnost(){ return this.vazhnost; }


@Column(name="data_sbrosa_vazhnosti", columnDefinition="text")
private String data_sbrosa_vazhnosti;

public void setData_sbrosa_vazhnosti(String _data_sbrosa_vazhnosti){ this.data_sbrosa_vazhnosti=_data_sbrosa_vazhnosti; }

public String getData_sbrosa_vazhnosti(){ return this.data_sbrosa_vazhnosti; }


@Column(name="avto_sbros_napominanija_pri_prochtenii")

private Boolean avto_sbros_napominanija_pri_prochtenii;
public void setAvto_sbros_napominanija_pri_prochtenii(Boolean _avto_sbros_napominanija_pri_prochtenii){ this.avto_sbros_napominanija_pri_prochtenii=_avto_sbros_napominanija_pri_prochtenii; }

public Boolean getAvto_sbros_napominanija_pri_prochtenii(){ return this.avto_sbros_napominanija_pri_prochtenii; }


@Column(name="pri_otkritii_srazu_perehodit_po_ssilke")

private Boolean pri_otkritii_srazu_perehodit_po_ssilke;
public void setPri_otkritii_srazu_perehodit_po_ssilke(Boolean _pri_otkritii_srazu_perehodit_po_ssilke){ this.pri_otkritii_srazu_perehodit_po_ssilke=_pri_otkritii_srazu_perehodit_po_ssilke; }

public Boolean getPri_otkritii_srazu_perehodit_po_ssilke(){ return this.pri_otkritii_srazu_perehodit_po_ssilke; }


}
