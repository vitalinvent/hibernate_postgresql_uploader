import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="predopredelennie_varianti_otchetov")
public class predopredelennie_varianti_otchetov implements Serializable {

public predopredelennie_varianti_otchetov(){}

public predopredelennie_varianti_otchetov(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="opisanie", columnDefinition="text")
private String opisanie;

public void setOpisanie(String _opisanie){ this.opisanie=_opisanie; }

public String getOpisanie(){ return this.opisanie; }



@Column(name="klyuchevie_slova", columnDefinition="text")
private String klyuchevie_slova;

public void setKlyuchevie_slova(String _klyuchevie_slova){ this.klyuchevie_slova=_klyuchevie_slova; }

public String getKlyuchevie_slova(){ return this.klyuchevie_slova; }


@Column(name="naimenovanija_poley", columnDefinition="text")
private String naimenovanija_poley;

public void setNaimenovanija_poley(String _naimenovanija_poley){ this.naimenovanija_poley=_naimenovanija_poley; }

public String getNaimenovanija_poley(){ return this.naimenovanija_poley; }



@Column(name="vklyuchen")

private Boolean vklyuchen;
public void setVklyuchen(Boolean _vklyuchen){ this.vklyuchen=_vklyuchen; }

public Boolean getVklyuchen(){ return this.vklyuchen; }


@ManyToOne
@JoinColumn(name="otchet", insertable = true, updatable = true)
private identifikatori_obyektov_metadannih otchet;

public identifikatori_obyektov_metadannih getOtchet(){ try{return this.otchet;}catch(Exception ex){ return null;} }

public void setOtchet( Object _otchet){if (_otchet instanceof String){this.otchet= new identifikatori_obyektov_metadannih (_otchet.toString());}else{try{this.otchet= (identifikatori_obyektov_metadannih) _otchet;}catch(Exception ex){Variables.logger.error(ex);this.otchet= new identifikatori_obyektov_metadannih (_otchet.toString());}}}

public UUID getOtchet_uuid(){ try{return this.otchet.getGuid();}catch(Exception ex){return null;} }

public String getOtchet_type(){ try{return this.otchet.getClass().getName();}catch(Exception ex){return null;} }

public identifikatori_obyektov_metadannih getOtchet_obj(){ return this.otchet; }

public void setOtchet_obj( Object _otchet){ this.otchet=(identifikatori_obyektov_metadannih) _otchet; }


@Column(name="klyuch_varianta", columnDefinition="text")
private String klyuch_varianta;

public void setKlyuch_varianta(String _klyuch_varianta){ this.klyuch_varianta=_klyuch_varianta; }

public String getKlyuch_varianta(){ return this.klyuch_varianta; }


@Column(name="naimenovanija_parametrov_i_otborov", columnDefinition="text")
private String naimenovanija_parametrov_i_otborov;

public void setNaimenovanija_parametrov_i_otborov(String _naimenovanija_parametrov_i_otborov){ this.naimenovanija_parametrov_i_otborov=_naimenovanija_parametrov_i_otborov; }

public String getNaimenovanija_parametrov_i_otborov(){ return this.naimenovanija_parametrov_i_otborov; }


@Column(name="gruppirovat_po_otchetu")

private Boolean gruppirovat_po_otchetu;
public void setGruppirovat_po_otchetu(Boolean _gruppirovat_po_otchetu){ this.gruppirovat_po_otchetu=_gruppirovat_po_otchetu; }

public Boolean getGruppirovat_po_otchetu(){ return this.gruppirovat_po_otchetu; }


@Column(name="klyuch_zamerov", columnDefinition="text")
private String klyuch_zamerov;

public void setKlyuch_zamerov(String _klyuch_zamerov){ this.klyuch_zamerov=_klyuch_zamerov; }

public String getKlyuch_zamerov(){ return this.klyuch_zamerov; }


@Column(name="vidimost_po_umolchaniyu")

private Boolean vidimost_po_umolchaniyu;
public void setVidimost_po_umolchaniyu(Boolean _vidimost_po_umolchaniyu){ this.vidimost_po_umolchaniyu=_vidimost_po_umolchaniyu; }

public Boolean getVidimost_po_umolchaniyu(){ return this.vidimost_po_umolchaniyu; }


@Column(name="hesh_nastroek", columnDefinition="text")
private String hesh_nastroek;

public void setHesh_nastroek(String _hesh_nastroek){ this.hesh_nastroek=_hesh_nastroek; }

public String getHesh_nastroek(){ return this.hesh_nastroek; }


}
