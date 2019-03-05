import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="klyuchi_analitiki_ucheta_po_partneram")
public class klyuchi_analitiki_ucheta_po_partneram implements Serializable {

public klyuchi_analitiki_ucheta_po_partneram(){}

public klyuchi_analitiki_ucheta_po_partneram(String _guid){ this.guid=UUID.fromString(_guid); }

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
@JoinColumn(name="partner", insertable = true, updatable = true)
private partneri partner;

public partneri getPartner(){ try{return this.partner;}catch(Exception ex){ return null;} }

public void setPartner( Object _partner){if (_partner instanceof String){this.partner= new partneri (_partner.toString());}else{try{this.partner= (partneri) _partner;}catch(Exception ex){Variables.logger.error(ex);this.partner= new partneri (_partner.toString());}}}

public UUID getPartner_uuid(){ try{return this.partner.getGuid();}catch(Exception ex){return null;} }

public String getPartner_type(){ try{return this.partner.getClass().getName();}catch(Exception ex){return null;} }

public partneri getPartner_obj(){ return this.partner; }

public void setPartner_obj( Object _partner){ this.partner=(partneri) _partner; }


@ManyToOne
@JoinColumn(name="organizatsija", insertable = true, updatable = true)
private organizatsii organizatsija;

public organizatsii getOrganizatsija(){ try{return this.organizatsija;}catch(Exception ex){ return null;} }

public void setOrganizatsija( Object _organizatsija){if (_organizatsija instanceof String){this.organizatsija= new organizatsii (_organizatsija.toString());}else{try{this.organizatsija= (organizatsii) _organizatsija;}catch(Exception ex){Variables.logger.error(ex);this.organizatsija= new organizatsii (_organizatsija.toString());}}}

public UUID getOrganizatsija_uuid(){ try{return this.organizatsija.getGuid();}catch(Exception ex){return null;} }

public String getOrganizatsija_type(){ try{return this.organizatsija.getClass().getName();}catch(Exception ex){return null;} }

public organizatsii getOrganizatsija_obj(){ return this.organizatsija; }

public void setOrganizatsija_obj( Object _organizatsija){ this.organizatsija=(organizatsii) _organizatsija; }


@ManyToOne
@JoinColumn(name="kontragent", insertable = true, updatable = true)
private kontragenti kontragent;

public kontragenti getKontragent(){ try{return this.kontragent;}catch(Exception ex){ return null;} }

public void setKontragent( Object _kontragent){if (_kontragent instanceof String){this.kontragent= new kontragenti (_kontragent.toString());}else{try{this.kontragent= (kontragenti) _kontragent;}catch(Exception ex){Variables.logger.error(ex);this.kontragent= new kontragenti (_kontragent.toString());}}}

public UUID getKontragent_uuid(){ try{return this.kontragent.getGuid();}catch(Exception ex){return null;} }

public String getKontragent_type(){ try{return this.kontragent.getClass().getName();}catch(Exception ex){return null;} }

public kontragenti getKontragent_obj(){ return this.kontragent; }

public void setKontragent_obj( Object _kontragent){ this.kontragent=(kontragenti) _kontragent; }


@ManyToOne
@JoinColumn(name="dogovor", insertable = true, updatable = true)
private dogovori_kontragentov dogovor;

public dogovori_kontragentov getDogovor(){ try{return this.dogovor;}catch(Exception ex){ return null;} }

public void setDogovor( Object _dogovor){if (_dogovor instanceof String){this.dogovor= new dogovori_kontragentov (_dogovor.toString());}else{try{this.dogovor= (dogovori_kontragentov) _dogovor;}catch(Exception ex){Variables.logger.error(ex);this.dogovor= new dogovori_kontragentov (_dogovor.toString());}}}

public UUID getDogovor_uuid(){ try{return this.dogovor.getGuid();}catch(Exception ex){return null;} }

public String getDogovor_type(){ try{return this.dogovor.getClass().getName();}catch(Exception ex){return null;} }

public dogovori_kontragentov getDogovor_obj(){ return this.dogovor; }

public void setDogovor_obj( Object _dogovor){ this.dogovor=(dogovori_kontragentov) _dogovor; }


}
