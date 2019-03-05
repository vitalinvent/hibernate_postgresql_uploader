import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="brigadi")
public class brigadi implements Serializable {

public brigadi(){}

public brigadi(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@ManyToOne
@JoinColumn(name="organizatsija", insertable = true, updatable = true)
private organizatsii organizatsija;

public organizatsii getOrganizatsija(){ try{return this.organizatsija;}catch(Exception ex){ return null;} }

public void setOrganizatsija( Object _organizatsija){if (_organizatsija instanceof String){this.organizatsija= new organizatsii (_organizatsija.toString());}else{try{this.organizatsija= (organizatsii) _organizatsija;}catch(Exception ex){Variables.logger.error(ex);this.organizatsija= new organizatsii (_organizatsija.toString());}}}

public UUID getOrganizatsija_uuid(){ try{return this.organizatsija.getGuid();}catch(Exception ex){return null;} }

public String getOrganizatsija_type(){ try{return this.organizatsija.getClass().getName();}catch(Exception ex){return null;} }

public organizatsii getOrganizatsija_obj(){ return this.organizatsija; }

public void setOrganizatsija_obj( Object _organizatsija){ this.organizatsija=(organizatsii) _organizatsija; }


@Column(name="primenjat_raspredelenie_po_k_t_u")

private Boolean primenjat_raspredelenie_po_k_t_u;
public void setPrimenjat_raspredelenie_po_k_t_u(Boolean _primenjat_raspredelenie_po_k_t_u){ this.primenjat_raspredelenie_po_k_t_u=_primenjat_raspredelenie_po_k_t_u; }

public Boolean getPrimenjat_raspredelenie_po_k_t_u(){ return this.primenjat_raspredelenie_po_k_t_u; }


@ManyToOne
@JoinColumn(name="podrazdelenie", insertable = true, updatable = true)
private struktura_predprijatija podrazdelenie;

public struktura_predprijatija getPodrazdelenie(){ try{return this.podrazdelenie;}catch(Exception ex){ return null;} }

public void setPodrazdelenie( Object _podrazdelenie){if (_podrazdelenie instanceof String){this.podrazdelenie= new struktura_predprijatija (_podrazdelenie.toString());}else{try{this.podrazdelenie= (struktura_predprijatija) _podrazdelenie;}catch(Exception ex){Variables.logger.error(ex);this.podrazdelenie= new struktura_predprijatija (_podrazdelenie.toString());}}}

public UUID getPodrazdelenie_uuid(){ try{return this.podrazdelenie.getGuid();}catch(Exception ex){return null;} }

public String getPodrazdelenie_type(){ try{return this.podrazdelenie.getClass().getName();}catch(Exception ex){return null;} }

public struktura_predprijatija getPodrazdelenie_obj(){ return this.podrazdelenie; }

public void setPodrazdelenie_obj( Object _podrazdelenie){ this.podrazdelenie=(struktura_predprijatija) _podrazdelenie; }


}
