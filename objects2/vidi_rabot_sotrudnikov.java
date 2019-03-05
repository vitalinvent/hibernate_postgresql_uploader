import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="vidi_rabot_sotrudnikov")
public class vidi_rabot_sotrudnikov implements Serializable {

public vidi_rabot_sotrudnikov(){}

public vidi_rabot_sotrudnikov(String _guid){ this.guid=UUID.fromString(_guid); }

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
@JoinColumn(name="kvalifikatsionniy_razrjad", insertable = true, updatable = true)
private razrjadi_kategorii_dolzhnostey kvalifikatsionniy_razrjad;

public razrjadi_kategorii_dolzhnostey getKvalifikatsionniy_razrjad(){ try{return this.kvalifikatsionniy_razrjad;}catch(Exception ex){ return null;} }

public void setKvalifikatsionniy_razrjad( Object _kvalifikatsionniy_razrjad){if (_kvalifikatsionniy_razrjad instanceof String){this.kvalifikatsionniy_razrjad= new razrjadi_kategorii_dolzhnostey (_kvalifikatsionniy_razrjad.toString());}else{try{this.kvalifikatsionniy_razrjad= (razrjadi_kategorii_dolzhnostey) _kvalifikatsionniy_razrjad;}catch(Exception ex){Variables.logger.error(ex);this.kvalifikatsionniy_razrjad= new razrjadi_kategorii_dolzhnostey (_kvalifikatsionniy_razrjad.toString());}}}

public UUID getKvalifikatsionniy_razrjad_uuid(){ try{return this.kvalifikatsionniy_razrjad.getGuid();}catch(Exception ex){return null;} }

public String getKvalifikatsionniy_razrjad_type(){ try{return this.kvalifikatsionniy_razrjad.getClass().getName();}catch(Exception ex){return null;} }

public razrjadi_kategorii_dolzhnostey getKvalifikatsionniy_razrjad_obj(){ return this.kvalifikatsionniy_razrjad; }

public void setKvalifikatsionniy_razrjad_obj( Object _kvalifikatsionniy_razrjad){ this.kvalifikatsionniy_razrjad=(razrjadi_kategorii_dolzhnostey) _kvalifikatsionniy_razrjad; }


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@ManyToOne
@JoinColumn(name="edinitsa_izmerenija", insertable = true, updatable = true)
private upakovki_edinitsi_izmerenija edinitsa_izmerenija;

public upakovki_edinitsi_izmerenija getEdinitsa_izmerenija(){ try{return this.edinitsa_izmerenija;}catch(Exception ex){ return null;} }

public void setEdinitsa_izmerenija( Object _edinitsa_izmerenija){if (_edinitsa_izmerenija instanceof String){this.edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_edinitsa_izmerenija.toString());}else{try{this.edinitsa_izmerenija= (upakovki_edinitsi_izmerenija) _edinitsa_izmerenija;}catch(Exception ex){Variables.logger.error(ex);this.edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_edinitsa_izmerenija.toString());}}}

public UUID getEdinitsa_izmerenija_uuid(){ try{return this.edinitsa_izmerenija.getGuid();}catch(Exception ex){return null;} }

public String getEdinitsa_izmerenija_type(){ try{return this.edinitsa_izmerenija.getClass().getName();}catch(Exception ex){return null;} }

public upakovki_edinitsi_izmerenija getEdinitsa_izmerenija_obj(){ return this.edinitsa_izmerenija; }

public void setEdinitsa_izmerenija_obj( Object _edinitsa_izmerenija){ this.edinitsa_izmerenija=(upakovki_edinitsi_izmerenija) _edinitsa_izmerenija; }


@Column(name="kratnost_trudoemkosti")

private Float kratnost_trudoemkosti;
public void setKratnost_trudoemkosti(Float _kratnost_trudoemkosti){ this.kratnost_trudoemkosti=_kratnost_trudoemkosti; }

public Float getKratnost_trudoemkosti(){ return this.kratnost_trudoemkosti; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="trudoemkost")

private Float trudoemkost;
public void setTrudoemkost(Float _trudoemkost){ this.trudoemkost=_trudoemkost; }

public Float getTrudoemkost(){ return this.trudoemkost; }


}
