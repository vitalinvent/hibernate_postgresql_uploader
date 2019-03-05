import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="partneri")
public class partneri implements Serializable {

public partneri(){}

public partneri(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="kommentariy", columnDefinition="text")
private String kommentariy;

public void setKommentariy(String _kommentariy){ this.kommentariy=_kommentariy; }

public String getKommentariy(){ return this.kommentariy; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="klient")

private Boolean klient;
public void setKlient(Boolean _klient){ this.klient=_klient; }

public Boolean getKlient(){ return this.klient; }



@ManyToOne
@JoinColumn(name="naznachenie_pererabotchika", insertable = true, updatable = true)
private naznachenija naznachenie_pererabotchika;

public naznachenija getNaznachenie_pererabotchika(){ try{return this.naznachenie_pererabotchika;}catch(Exception ex){ return null;} }

public void setNaznachenie_pererabotchika( Object _naznachenie_pererabotchika){if (_naznachenie_pererabotchika instanceof String){this.naznachenie_pererabotchika= new naznachenija (_naznachenie_pererabotchika.toString());}else{try{this.naznachenie_pererabotchika= (naznachenija) _naznachenie_pererabotchika;}catch(Exception ex){Variables.logger.error(ex);this.naznachenie_pererabotchika= new naznachenija (_naznachenie_pererabotchika.toString());}}}

public UUID getNaznachenie_pererabotchika_uuid(){ try{return this.naznachenie_pererabotchika.getGuid();}catch(Exception ex){return null;} }

public String getNaznachenie_pererabotchika_type(){ try{return this.naznachenie_pererabotchika.getClass().getName();}catch(Exception ex){return null;} }

public naznachenija getNaznachenie_pererabotchika_obj(){ return this.naznachenie_pererabotchika; }

public void setNaznachenie_pererabotchika_obj( Object _naznachenie_pererabotchika){ this.naznachenie_pererabotchika=(naznachenija) _naznachenie_pererabotchika; }


@Column(name="data_registratsii", columnDefinition="text")
private String data_registratsii;

public void setData_registratsii(String _data_registratsii){ this.data_registratsii=_data_registratsii; }

public String getData_registratsii(){ return this.data_registratsii; }


@Column(name="postavshchik")

private Boolean postavshchik;
public void setPostavshchik(Boolean _postavshchik){ this.postavshchik=_postavshchik; }

public Boolean getPostavshchik(){ return this.postavshchik; }


@Column(name="naimenovanie_polnoe", columnDefinition="text")
private String naimenovanie_polnoe;

public void setNaimenovanie_polnoe(String _naimenovanie_polnoe){ this.naimenovanie_polnoe=_naimenovanie_polnoe; }

public String getNaimenovanie_polnoe(){ return this.naimenovanie_polnoe; }


@ManyToOne
@JoinColumn(name="osnovnoy_menedzher", insertable = true, updatable = true)
private polzovateli osnovnoy_menedzher;

public polzovateli getOsnovnoy_menedzher(){ try{return this.osnovnoy_menedzher;}catch(Exception ex){ return null;} }

public void setOsnovnoy_menedzher( Object _osnovnoy_menedzher){if (_osnovnoy_menedzher instanceof String){this.osnovnoy_menedzher= new polzovateli (_osnovnoy_menedzher.toString());}else{try{this.osnovnoy_menedzher= (polzovateli) _osnovnoy_menedzher;}catch(Exception ex){Variables.logger.error(ex);this.osnovnoy_menedzher= new polzovateli (_osnovnoy_menedzher.toString());}}}

public UUID getOsnovnoy_menedzher_uuid(){ try{return this.osnovnoy_menedzher.getGuid();}catch(Exception ex){return null;} }

public String getOsnovnoy_menedzher_type(){ try{return this.osnovnoy_menedzher.getClass().getName();}catch(Exception ex){return null;} }

public polzovateli getOsnovnoy_menedzher_obj(){ return this.osnovnoy_menedzher; }

public void setOsnovnoy_menedzher_obj( Object _osnovnoy_menedzher){ this.osnovnoy_menedzher=(polzovateli) _osnovnoy_menedzher; }


@Column(name="konkurent")

private Boolean konkurent;
public void setKonkurent(Boolean _konkurent){ this.konkurent=_konkurent; }

public Boolean getKonkurent(){ return this.konkurent; }


@Column(name="prochie_otnoshenija")

private Boolean prochie_otnoshenija;
public void setProchie_otnoshenija(Boolean _prochie_otnoshenija){ this.prochie_otnoshenija=_prochie_otnoshenija; }

public Boolean getProchie_otnoshenija(){ return this.prochie_otnoshenija; }


@Column(name="obsluzhivaetsja_torgovimi_predstaviteljami")

private Boolean obsluzhivaetsja_torgovimi_predstaviteljami;
public void setObsluzhivaetsja_torgovimi_predstaviteljami(Boolean _obsluzhivaetsja_torgovimi_predstaviteljami){ this.obsluzhivaetsja_torgovimi_predstaviteljami=_obsluzhivaetsja_torgovimi_predstaviteljami; }

public Boolean getObsluzhivaetsja_torgovimi_predstaviteljami(){ return this.obsluzhivaetsja_torgovimi_predstaviteljami; }


@Column(name="dopolnitelnaja_informatsija", columnDefinition="text")
private String dopolnitelnaja_informatsija;

public void setDopolnitelnaja_informatsija(String _dopolnitelnaja_informatsija){ this.dopolnitelnaja_informatsija=_dopolnitelnaja_informatsija; }

public String getDopolnitelnaja_informatsija(){ return this.dopolnitelnaja_informatsija; }


@Column(name="perevozchik")

private Boolean perevozchik;
public void setPerevozchik(Boolean _perevozchik){ this.perevozchik=_perevozchik; }

public Boolean getPerevozchik(){ return this.perevozchik; }


@Column(name="data_rozhdenija", columnDefinition="text")
private String data_rozhdenija;

public void setData_rozhdenija(String _data_rozhdenija){ this.data_rozhdenija=_data_rozhdenija; }

public String getData_rozhdenija(){ return this.data_rozhdenija; }


}
