import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="sotrudniki")
public class sotrudniki implements Serializable {

public sotrudniki(){}

public sotrudniki(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="tekushchiy_protsent_severnoy_nadbavki")

private Float tekushchiy_protsent_severnoy_nadbavki;
public void setTekushchiy_protsent_severnoy_nadbavki(Float _tekushchiy_protsent_severnoy_nadbavki){ this.tekushchiy_protsent_severnoy_nadbavki=_tekushchiy_protsent_severnoy_nadbavki; }

public Float getTekushchiy_protsent_severnoy_nadbavki(){ return this.tekushchiy_protsent_severnoy_nadbavki; }



@ManyToOne
@JoinColumn(name="fizicheskoe_litso", insertable = true, updatable = true)
private fizicheskie_litsa fizicheskoe_litso;

public fizicheskie_litsa getFizicheskoe_litso(){ try{return this.fizicheskoe_litso;}catch(Exception ex){ return null;} }

public void setFizicheskoe_litso( Object _fizicheskoe_litso){if (_fizicheskoe_litso instanceof String){this.fizicheskoe_litso= new fizicheskie_litsa (_fizicheskoe_litso.toString());}else{try{this.fizicheskoe_litso= (fizicheskie_litsa) _fizicheskoe_litso;}catch(Exception ex){Variables.logger.error(ex);this.fizicheskoe_litso= new fizicheskie_litsa (_fizicheskoe_litso.toString());}}}

public UUID getFizicheskoe_litso_uuid(){ try{return this.fizicheskoe_litso.getGuid();}catch(Exception ex){return null;} }

public String getFizicheskoe_litso_type(){ try{return this.fizicheskoe_litso.getClass().getName();}catch(Exception ex){return null;} }

public fizicheskie_litsa getFizicheskoe_litso_obj(){ return this.fizicheskoe_litso; }

public void setFizicheskoe_litso_obj( Object _fizicheskoe_litso){ this.fizicheskoe_litso=(fizicheskie_litsa) _fizicheskoe_litso; }


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }



@Column(name="v_arhive")

private Boolean v_arhive;
public void setV_arhive(Boolean _v_arhive){ this.v_arhive=_v_arhive; }

public Boolean getV_arhive(){ return this.v_arhive; }


@ManyToOne
@JoinColumn(name="golovnaja_organizatsija", insertable = true, updatable = true)
private organizatsii golovnaja_organizatsija;

public organizatsii getGolovnaja_organizatsija(){ try{return this.golovnaja_organizatsija;}catch(Exception ex){ return null;} }

public void setGolovnaja_organizatsija( Object _golovnaja_organizatsija){if (_golovnaja_organizatsija instanceof String){this.golovnaja_organizatsija= new organizatsii (_golovnaja_organizatsija.toString());}else{try{this.golovnaja_organizatsija= (organizatsii) _golovnaja_organizatsija;}catch(Exception ex){Variables.logger.error(ex);this.golovnaja_organizatsija= new organizatsii (_golovnaja_organizatsija.toString());}}}

public UUID getGolovnaja_organizatsija_uuid(){ try{return this.golovnaja_organizatsija.getGuid();}catch(Exception ex){return null;} }

public String getGolovnaja_organizatsija_type(){ try{return this.golovnaja_organizatsija.getClass().getName();}catch(Exception ex){return null;} }

public organizatsii getGolovnaja_organizatsija_obj(){ return this.golovnaja_organizatsija; }

public void setGolovnaja_organizatsija_obj( Object _golovnaja_organizatsija){ this.golovnaja_organizatsija=(organizatsii) _golovnaja_organizatsija; }


@Column(name="utochnenie_naimenovanija", columnDefinition="text")
private String utochnenie_naimenovanija;

public void setUtochnenie_naimenovanija(String _utochnenie_naimenovanija){ this.utochnenie_naimenovanija=_utochnenie_naimenovanija; }

public String getUtochnenie_naimenovanija(){ return this.utochnenie_naimenovanija; }


@ManyToOne
@JoinColumn(name="golovnoy_sotrudnik", insertable = true, updatable = true)
private sotrudniki golovnoy_sotrudnik;

public sotrudniki getGolovnoy_sotrudnik(){ try{return this.golovnoy_sotrudnik;}catch(Exception ex){ return null;} }

public void setGolovnoy_sotrudnik( Object _golovnoy_sotrudnik){if (_golovnoy_sotrudnik instanceof String){this.golovnoy_sotrudnik= new sotrudniki (_golovnoy_sotrudnik.toString());}else{try{this.golovnoy_sotrudnik= (sotrudniki) _golovnoy_sotrudnik;}catch(Exception ex){Variables.logger.error(ex);this.golovnoy_sotrudnik= new sotrudniki (_golovnoy_sotrudnik.toString());}}}

public UUID getGolovnoy_sotrudnik_uuid(){ try{return this.golovnoy_sotrudnik.getGuid();}catch(Exception ex){return null;} }

public String getGolovnoy_sotrudnik_type(){ try{return this.golovnoy_sotrudnik.getClass().getName();}catch(Exception ex){return null;} }

public sotrudniki getGolovnoy_sotrudnik_obj(){ return this.golovnoy_sotrudnik; }

public void setGolovnoy_sotrudnik_obj( Object _golovnoy_sotrudnik){ this.golovnoy_sotrudnik=(sotrudniki) _golovnoy_sotrudnik; }


}
