import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="klyuchi_analitiki_ucheta_partiy")
public class klyuchi_analitiki_ucheta_partiy implements Serializable {

public klyuchi_analitiki_ucheta_partiy(){}

public klyuchi_analitiki_ucheta_partiy(String _guid){ this.guid=UUID.fromString(_guid); }

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
@JoinColumn(name="postavshchik", insertable = true, updatable = true)
private partneri postavshchik;

public partneri getPostavshchik(){ try{return this.postavshchik;}catch(Exception ex){ return null;} }

public void setPostavshchik( Object _postavshchik){if (_postavshchik instanceof String){this.postavshchik= new partneri (_postavshchik.toString());}else{try{this.postavshchik= (partneri) _postavshchik;}catch(Exception ex){Variables.logger.error(ex);this.postavshchik= new partneri (_postavshchik.toString());}}}

public UUID getPostavshchik_uuid(){ try{return this.postavshchik.getGuid();}catch(Exception ex){return null;} }

public String getPostavshchik_type(){ try{return this.postavshchik.getClass().getName();}catch(Exception ex){return null;} }

public partneri getPostavshchik_obj(){ return this.postavshchik; }

public void setPostavshchik_obj( Object _postavshchik){ this.postavshchik=(partneri) _postavshchik; }



@ManyToOne
@JoinColumn(name="gruppa_finansovogo_ucheta", insertable = true, updatable = true)
private gruppi_finansovogo_ucheta_nomenklaturi gruppa_finansovogo_ucheta;

public gruppi_finansovogo_ucheta_nomenklaturi getGruppa_finansovogo_ucheta(){ try{return this.gruppa_finansovogo_ucheta;}catch(Exception ex){ return null;} }

public void setGruppa_finansovogo_ucheta( Object _gruppa_finansovogo_ucheta){if (_gruppa_finansovogo_ucheta instanceof String){this.gruppa_finansovogo_ucheta= new gruppi_finansovogo_ucheta_nomenklaturi (_gruppa_finansovogo_ucheta.toString());}else{try{this.gruppa_finansovogo_ucheta= (gruppi_finansovogo_ucheta_nomenklaturi) _gruppa_finansovogo_ucheta;}catch(Exception ex){Variables.logger.error(ex);this.gruppa_finansovogo_ucheta= new gruppi_finansovogo_ucheta_nomenklaturi (_gruppa_finansovogo_ucheta.toString());}}}

public UUID getGruppa_finansovogo_ucheta_uuid(){ try{return this.gruppa_finansovogo_ucheta.getGuid();}catch(Exception ex){return null;} }

public String getGruppa_finansovogo_ucheta_type(){ try{return this.gruppa_finansovogo_ucheta.getClass().getName();}catch(Exception ex){return null;} }

public gruppi_finansovogo_ucheta_nomenklaturi getGruppa_finansovogo_ucheta_obj(){ return this.gruppa_finansovogo_ucheta; }

public void setGruppa_finansovogo_ucheta_obj( Object _gruppa_finansovogo_ucheta){ this.gruppa_finansovogo_ucheta=(gruppi_finansovogo_ucheta_nomenklaturi) _gruppa_finansovogo_ucheta; }


@Column(name="kontragent", columnDefinition="text")
private String kontragent;

public void setKontragent(String _kontragent){ this.kontragent=_kontragent; }

public String getKontragent(){ return this.kontragent; }


@Column(name="kod_stroki")

private Float kod_stroki;
public void setKod_stroki(Float _kod_stroki){ this.kod_stroki=_kod_stroki; }

public Float getKod_stroki(){ return this.kod_stroki; }


}
