import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="marzhinalniy_dohod")
public class marzhinalniy_dohod implements Serializable {

public marzhinalniy_dohod(){}

public marzhinalniy_dohod(String _guid){ this.guid=UUID.fromString(_guid); }

@Id
@Column(name = "guid")
private UUID guid;

public UUID getGuid(){ return this.guid; }
public void setGuid(String _guid){ this.guid=UUID.fromString(_guid); }

@Column(name="data", columnDefinition="text")
private String data;

public void setData(String _data){ this.data=_data; }

public String getData(){ return this.data; }


@ManyToOne
@JoinColumn(name="vid_nomenklaturi", insertable = true, updatable = true)
private vidi_nomenklaturi vid_nomenklaturi;

public vidi_nomenklaturi getVid_nomenklaturi(){ try{return this.vid_nomenklaturi;}catch(Exception ex){ return null;} }

public void setVid_nomenklaturi( Object _vid_nomenklaturi){if (_vid_nomenklaturi instanceof String){this.vid_nomenklaturi= new vidi_nomenklaturi (_vid_nomenklaturi.toString());}else{try{this.vid_nomenklaturi= (vidi_nomenklaturi) _vid_nomenklaturi;}catch(Exception ex){Variables.logger.error(ex);this.vid_nomenklaturi= new vidi_nomenklaturi (_vid_nomenklaturi.toString());}}}

public UUID getVid_nomenklaturi_uuid(){ try{return this.vid_nomenklaturi.getGuid();}catch(Exception ex){return null;} }

public String getVid_nomenklaturi_type(){ try{return this.vid_nomenklaturi.getClass().getName();}catch(Exception ex){return null;} }

public vidi_nomenklaturi getVid_nomenklaturi_obj(){ return this.vid_nomenklaturi; }

public void setVid_nomenklaturi_obj( Object _vid_nomenklaturi){ this.vid_nomenklaturi=(vidi_nomenklaturi) _vid_nomenklaturi; }


@ManyToOne
@JoinColumn(name="pokazatel", insertable = true, updatable = true)
private s_o_p__pokazateli_monitora pokazatel;

public s_o_p__pokazateli_monitora getPokazatel(){ try{return this.pokazatel;}catch(Exception ex){ return null;} }

public void setPokazatel( Object _pokazatel){if (_pokazatel instanceof String){this.pokazatel= new s_o_p__pokazateli_monitora (_pokazatel.toString());}else{try{this.pokazatel= (s_o_p__pokazateli_monitora) _pokazatel;}catch(Exception ex){Variables.logger.error(ex);this.pokazatel= new s_o_p__pokazateli_monitora (_pokazatel.toString());}}}

public UUID getPokazatel_uuid(){ try{return this.pokazatel.getGuid();}catch(Exception ex){return null;} }

public String getPokazatel_type(){ try{return this.pokazatel.getClass().getName();}catch(Exception ex){return null;} }

public s_o_p__pokazateli_monitora getPokazatel_obj(){ return this.pokazatel; }

public void setPokazatel_obj( Object _pokazatel){ this.pokazatel=(s_o_p__pokazateli_monitora) _pokazatel; }


@ManyToOne
@JoinColumn(name="sklad", insertable = true, updatable = true)
private skladi sklad;

public skladi getSklad(){ try{return this.sklad;}catch(Exception ex){ return null;} }

public void setSklad( Object _sklad){if (_sklad instanceof String){this.sklad= new skladi (_sklad.toString());}else{try{this.sklad= (skladi) _sklad;}catch(Exception ex){Variables.logger.error(ex);this.sklad= new skladi (_sklad.toString());}}}

public UUID getSklad_uuid(){ try{return this.sklad.getGuid();}catch(Exception ex){return null;} }

public String getSklad_type(){ try{return this.sklad.getClass().getName();}catch(Exception ex){return null;} }

public skladi getSklad_obj(){ return this.sklad; }

public void setSklad_obj( Object _sklad){ this.sklad=(skladi) _sklad; }


@ManyToOne
@JoinColumn(name="kontragent", insertable = true, updatable = true)
private kontragenti kontragent;

public kontragenti getKontragent(){ try{return this.kontragent;}catch(Exception ex){ return null;} }

public void setKontragent( Object _kontragent){if (_kontragent instanceof String){this.kontragent= new kontragenti (_kontragent.toString());}else{try{this.kontragent= (kontragenti) _kontragent;}catch(Exception ex){Variables.logger.error(ex);this.kontragent= new kontragenti (_kontragent.toString());}}}

public UUID getKontragent_uuid(){ try{return this.kontragent.getGuid();}catch(Exception ex){return null;} }

public String getKontragent_type(){ try{return this.kontragent.getClass().getName();}catch(Exception ex){return null;} }

public kontragenti getKontragent_obj(){ return this.kontragent; }

public void setKontragent_obj( Object _kontragent){ this.kontragent=(kontragenti) _kontragent; }


@Column(name="znachenie")

private Float znachenie;
public void setZnachenie(Float _znachenie){ this.znachenie=_znachenie; }

public Float getZnachenie(){ return this.znachenie; }


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
@JoinColumn(name="nomenklatura", insertable = true, updatable = true)
private nomenklatura nomenklatura;

public nomenklatura getNomenklatura(){ try{return this.nomenklatura;}catch(Exception ex){ return null;} }

public void setNomenklatura( Object _nomenklatura){if (_nomenklatura instanceof String){this.nomenklatura= new nomenklatura (_nomenklatura.toString());}else{try{this.nomenklatura= (nomenklatura) _nomenklatura;}catch(Exception ex){Variables.logger.error(ex);this.nomenklatura= new nomenklatura (_nomenklatura.toString());}}}

public UUID getNomenklatura_uuid(){ try{return this.nomenklatura.getGuid();}catch(Exception ex){return null;} }

public String getNomenklatura_type(){ try{return this.nomenklatura.getClass().getName();}catch(Exception ex){return null;} }

public nomenklatura getNomenklatura_obj(){ return this.nomenklatura; }

public void setNomenklatura_obj( Object _nomenklatura){ this.nomenklatura=(nomenklatura) _nomenklatura; }


public marzhinalniy_dohod( String data , UUID vid_nomenklaturi , UUID pokazatel , UUID sklad , UUID kontragent , Float znachenie , UUID organizatsija , UUID nomenklatura ){}

}
