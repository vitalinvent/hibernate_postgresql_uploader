import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="kalendari")
public class kalendari implements Serializable {

public kalendari(){}

public kalendari(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="data_okonchanija", columnDefinition="text")
private String data_okonchanija;

public void setData_okonchanija(String _data_okonchanija){ this.data_okonchanija=_data_okonchanija; }

public String getData_okonchanija(){ return this.data_okonchanija; }


@Column(name="uchitivat_prazdniki")

private Boolean uchitivat_prazdniki;
public void setUchitivat_prazdniki(Boolean _uchitivat_prazdniki){ this.uchitivat_prazdniki=_uchitivat_prazdniki; }

public Boolean getUchitivat_prazdniki(){ return this.uchitivat_prazdniki; }


@Column(name="data_otscheta", columnDefinition="text")
private String data_otscheta;

public void setData_otscheta(String _data_otscheta){ this.data_otscheta=_data_otscheta; }

public String getData_otscheta(){ return this.data_otscheta; }


@Column(name="data_nachala", columnDefinition="text")
private String data_nachala;

public void setData_nachala(String _data_nachala){ this.data_nachala=_data_nachala; }

public String getData_nachala(){ return this.data_nachala; }



@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }


@Column(name="vladelets_grafika", columnDefinition="text")
private String vladelets_grafika;

public void setVladelets_grafika(String _vladelets_grafika){ this.vladelets_grafika=_vladelets_grafika; }

public String getVladelets_grafika(){ return this.vladelets_grafika; }



@ManyToOne
@JoinColumn(name="proizvodstvenniy_kalendar", insertable = true, updatable = true)
private proizvodstvennie_kalendari proizvodstvenniy_kalendar;

public proizvodstvennie_kalendari getProizvodstvenniy_kalendar(){ try{return this.proizvodstvenniy_kalendar;}catch(Exception ex){ return null;} }

public void setProizvodstvenniy_kalendar( Object _proizvodstvenniy_kalendar){if (_proizvodstvenniy_kalendar instanceof String){this.proizvodstvenniy_kalendar= new proizvodstvennie_kalendari (_proizvodstvenniy_kalendar.toString());}else{try{this.proizvodstvenniy_kalendar= (proizvodstvennie_kalendari) _proizvodstvenniy_kalendar;}catch(Exception ex){Variables.logger.error(ex);this.proizvodstvenniy_kalendar= new proizvodstvennie_kalendari (_proizvodstvenniy_kalendar.toString());}}}

public UUID getProizvodstvenniy_kalendar_uuid(){ try{return this.proizvodstvenniy_kalendar.getGuid();}catch(Exception ex){return null;} }

public String getProizvodstvenniy_kalendar_type(){ try{return this.proizvodstvenniy_kalendar.getClass().getName();}catch(Exception ex){return null;} }

public proizvodstvennie_kalendari getProizvodstvenniy_kalendar_obj(){ return this.proizvodstvenniy_kalendar; }

public void setProizvodstvenniy_kalendar_obj( Object _proizvodstvenniy_kalendar){ this.proizvodstvenniy_kalendar=(proizvodstvennie_kalendari) _proizvodstvenniy_kalendar; }


@Column(name="opisanie", columnDefinition="text")
private String opisanie;

public void setOpisanie(String _opisanie){ this.opisanie=_opisanie; }

public String getOpisanie(){ return this.opisanie; }


@Column(name="gorizont_planirovanija")

private Float gorizont_planirovanija;
public void setGorizont_planirovanija(Float _gorizont_planirovanija){ this.gorizont_planirovanija=_gorizont_planirovanija; }

public Float getGorizont_planirovanija(){ return this.gorizont_planirovanija; }


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@ManyToOne
@JoinColumn(name="bazoviy_kalendar", insertable = true, updatable = true)
private proizvodstvennie_kalendari bazoviy_kalendar;

public proizvodstvennie_kalendari getBazoviy_kalendar(){ try{return this.bazoviy_kalendar;}catch(Exception ex){ return null;} }

public void setBazoviy_kalendar( Object _bazoviy_kalendar){if (_bazoviy_kalendar instanceof String){this.bazoviy_kalendar= new proizvodstvennie_kalendari (_bazoviy_kalendar.toString());}else{try{this.bazoviy_kalendar= (proizvodstvennie_kalendari) _bazoviy_kalendar;}catch(Exception ex){Variables.logger.error(ex);this.bazoviy_kalendar= new proizvodstvennie_kalendari (_bazoviy_kalendar.toString());}}}

public UUID getBazoviy_kalendar_uuid(){ try{return this.bazoviy_kalendar.getGuid();}catch(Exception ex){return null;} }

public String getBazoviy_kalendar_type(){ try{return this.bazoviy_kalendar.getClass().getName();}catch(Exception ex){return null;} }

public proizvodstvennie_kalendari getBazoviy_kalendar_obj(){ return this.bazoviy_kalendar; }

public void setBazoviy_kalendar_obj( Object _bazoviy_kalendar){ this.bazoviy_kalendar=(proizvodstvennie_kalendari) _bazoviy_kalendar; }


}
