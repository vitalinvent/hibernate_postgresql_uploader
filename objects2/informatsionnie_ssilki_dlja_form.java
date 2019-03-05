import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="informatsionnie_ssilki_dlja_form")
public class informatsionnie_ssilki_dlja_form implements Serializable {

public informatsionnie_ssilki_dlja_form(){}

public informatsionnie_ssilki_dlja_form(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="udalit_versija_konfiguratsii_ot")

private Float udalit_versija_konfiguratsii_ot;
public void setUdalit_versija_konfiguratsii_ot(Float _udalit_versija_konfiguratsii_ot){ this.udalit_versija_konfiguratsii_ot=_udalit_versija_konfiguratsii_ot; }

public Float getUdalit_versija_konfiguratsii_ot(){ return this.udalit_versija_konfiguratsii_ot; }



@Column(name="ves")

private Float ves;
public void setVes(Float _ves){ this.ves=_ves; }

public Float getVes(){ return this.ves; }


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="data_nachala_aktualnosti", columnDefinition="text")
private String data_nachala_aktualnosti;

public void setData_nachala_aktualnosti(String _data_nachala_aktualnosti){ this.data_nachala_aktualnosti=_data_nachala_aktualnosti; }

public String getData_nachala_aktualnosti(){ return this.data_nachala_aktualnosti; }



@Column(name="adres", columnDefinition="text")
private String adres;

public void setAdres(String _adres){ this.adres=_adres; }

public String getAdres(){ return this.adres; }


@Column(name="udalit_versija_konfiguratsii_do")

private Float udalit_versija_konfiguratsii_do;
public void setUdalit_versija_konfiguratsii_do(Float _udalit_versija_konfiguratsii_do){ this.udalit_versija_konfiguratsii_do=_udalit_versija_konfiguratsii_do; }

public Float getUdalit_versija_konfiguratsii_do(){ return this.udalit_versija_konfiguratsii_do; }


@Column(name="data_obnovlenija", columnDefinition="text")
private String data_obnovlenija;

public void setData_obnovlenija(String _data_obnovlenija){ this.data_obnovlenija=_data_obnovlenija; }

public String getData_obnovlenija(){ return this.data_obnovlenija; }


@Column(name="iz_konfiguratsii")

private Boolean iz_konfiguratsii;
public void setIz_konfiguratsii(Boolean _iz_konfiguratsii){ this.iz_konfiguratsii=_iz_konfiguratsii; }

public Boolean getIz_konfiguratsii(){ return this.iz_konfiguratsii; }


@Column(name="data_okonchanija_aktualnosti", columnDefinition="text")
private String data_okonchanija_aktualnosti;

public void setData_okonchanija_aktualnosti(String _data_okonchanija_aktualnosti){ this.data_okonchanija_aktualnosti=_data_okonchanija_aktualnosti; }

public String getData_okonchanija_aktualnosti(){ return this.data_okonchanija_aktualnosti; }


@Column(name="identifikator", columnDefinition="text")
private String identifikator;

public void setIdentifikator(String _identifikator){ this.identifikator=_identifikator; }

public String getIdentifikator(){ return this.identifikator; }


@Column(name="podskazka", columnDefinition="text")
private String podskazka;

public void setPodskazka(String _podskazka){ this.podskazka=_podskazka; }

public String getPodskazka(){ return this.podskazka; }


@ManyToOne
@JoinColumn(name="polniy_put_k_forme", insertable = true, updatable = true)
private polnie_puti_k_formam polniy_put_k_forme;

public polnie_puti_k_formam getPolniy_put_k_forme(){ try{return this.polniy_put_k_forme;}catch(Exception ex){ return null;} }

public void setPolniy_put_k_forme( Object _polniy_put_k_forme){if (_polniy_put_k_forme instanceof String){this.polniy_put_k_forme= new polnie_puti_k_formam (_polniy_put_k_forme.toString());}else{try{this.polniy_put_k_forme= (polnie_puti_k_formam) _polniy_put_k_forme;}catch(Exception ex){Variables.logger.error(ex);this.polniy_put_k_forme= new polnie_puti_k_formam (_polniy_put_k_forme.toString());}}}

public UUID getPolniy_put_k_forme_uuid(){ try{return this.polniy_put_k_forme.getGuid();}catch(Exception ex){return null;} }

public String getPolniy_put_k_forme_type(){ try{return this.polniy_put_k_forme.getClass().getName();}catch(Exception ex){return null;} }

public polnie_puti_k_formam getPolniy_put_k_forme_obj(){ return this.polniy_put_k_forme; }

public void setPolniy_put_k_forme_obj( Object _polniy_put_k_forme){ this.polniy_put_k_forme=(polnie_puti_k_formam) _polniy_put_k_forme; }


}
