import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="naznachenija")
public class naznachenija implements Serializable {

public naznachenija(){}

public naznachenija(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="zakaz", columnDefinition="text")
private String zakaz;

public void setZakaz(String _zakaz){ this.zakaz=_zakaz; }

public String getZakaz(){ return this.zakaz; }


@Column(name="kontrolirovat_tolko_nalichie")

private Boolean kontrolirovat_tolko_nalichie;
public void setKontrolirovat_tolko_nalichie(Boolean _kontrolirovat_tolko_nalichie){ this.kontrolirovat_tolko_nalichie=_kontrolirovat_tolko_nalichie; }

public Boolean getKontrolirovat_tolko_nalichie(){ return this.kontrolirovat_tolko_nalichie; }




@ManyToOne
@JoinColumn(name="partner", insertable = true, updatable = true)
private partneri partner;

public partneri getPartner(){ try{return this.partner;}catch(Exception ex){ return null;} }

public void setPartner( Object _partner){if (_partner instanceof String){this.partner= new partneri (_partner.toString());}else{try{this.partner= (partneri) _partner;}catch(Exception ex){Variables.logger.error(ex);this.partner= new partneri (_partner.toString());}}}

public UUID getPartner_uuid(){ try{return this.partner.getGuid();}catch(Exception ex){return null;} }

public String getPartner_type(){ try{return this.partner.getClass().getName();}catch(Exception ex){return null;} }

public partneri getPartner_obj(){ return this.partner; }

public void setPartner_obj( Object _partner){ this.partner=(partneri) _partner; }


@ManyToOne
@JoinColumn(name="dogovor", insertable = true, updatable = true)
private dogovori_kontragentov dogovor;

public dogovori_kontragentov getDogovor(){ try{return this.dogovor;}catch(Exception ex){ return null;} }

public void setDogovor( Object _dogovor){if (_dogovor instanceof String){this.dogovor= new dogovori_kontragentov (_dogovor.toString());}else{try{this.dogovor= (dogovori_kontragentov) _dogovor;}catch(Exception ex){Variables.logger.error(ex);this.dogovor= new dogovori_kontragentov (_dogovor.toString());}}}

public UUID getDogovor_uuid(){ try{return this.dogovor.getGuid();}catch(Exception ex){return null;} }

public String getDogovor_type(){ try{return this.dogovor.getClass().getName();}catch(Exception ex){return null;} }

public dogovori_kontragentov getDogovor_obj(){ return this.dogovor; }

public void setDogovor_obj( Object _dogovor){ this.dogovor=(dogovori_kontragentov) _dogovor; }


@Column(name="dvizhenija_po_skladskim_registram")

private Boolean dvizhenija_po_skladskim_registram;
public void setDvizhenija_po_skladskim_registram(Boolean _dvizhenija_po_skladskim_registram){ this.dvizhenija_po_skladskim_registram=_dvizhenija_po_skladskim_registram; }

public Boolean getDvizhenija_po_skladskim_registram(){ return this.dvizhenija_po_skladskim_registram; }


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="kod_dlja_otchetnosti2010", columnDefinition="text")
private String kod_dlja_otchetnosti2010;

public void setKod_dlja_otchetnosti2010(String _kod_dlja_otchetnosti2010){ this.kod_dlja_otchetnosti2010=_kod_dlja_otchetnosti2010; }

public String getKod_dlja_otchetnosti2010(){ return this.kod_dlja_otchetnosti2010; }


@Column(name="kod_dlja_otchetnosti2002", columnDefinition="text")
private String kod_dlja_otchetnosti2002;

public void setKod_dlja_otchetnosti2002(String _kod_dlja_otchetnosti2002){ this.kod_dlja_otchetnosti2002=_kod_dlja_otchetnosti2002; }

public String getKod_dlja_otchetnosti2002(){ return this.kod_dlja_otchetnosti2002; }


@Column(name="kod_dlja_otchetnosti2015", columnDefinition="text")
private String kod_dlja_otchetnosti2015;

public void setKod_dlja_otchetnosti2015(String _kod_dlja_otchetnosti2015){ this.kod_dlja_otchetnosti2015=_kod_dlja_otchetnosti2015; }

public String getKod_dlja_otchetnosti2015(){ return this.kod_dlja_otchetnosti2015; }


}
