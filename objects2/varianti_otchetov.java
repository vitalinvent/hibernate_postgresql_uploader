import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="varianti_otchetov")
public class varianti_otchetov implements Serializable {

public varianti_otchetov(){}

public varianti_otchetov(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="polzovatelskiy")

private Boolean polzovatelskiy;
public void setPolzovatelskiy(Boolean _polzovatelskiy){ this.polzovatelskiy=_polzovatelskiy; }

public Boolean getPolzovatelskiy(){ return this.polzovatelskiy; }



@Column(name="naimenovanija_poley", columnDefinition="text")
private String naimenovanija_poley;

public void setNaimenovanija_poley(String _naimenovanija_poley){ this.naimenovanija_poley=_naimenovanija_poley; }

public String getNaimenovanija_poley(){ return this.naimenovanija_poley; }



@Column(name="klyuchevie_slova", columnDefinition="text")
private String klyuchevie_slova;

public void setKlyuchevie_slova(String _klyuchevie_slova){ this.klyuchevie_slova=_klyuchevie_slova; }

public String getKlyuchevie_slova(){ return this.klyuchevie_slova; }


@Column(name="avtor", columnDefinition="text")
private String avtor;

public void setAvtor(String _avtor){ this.avtor=_avtor; }

public String getAvtor(){ return this.avtor; }


@Column(name="vidimost_po_umolchaniyu")

private Boolean vidimost_po_umolchaniyu;
public void setVidimost_po_umolchaniyu(Boolean _vidimost_po_umolchaniyu){ this.vidimost_po_umolchaniyu=_vidimost_po_umolchaniyu; }

public Boolean getVidimost_po_umolchaniyu(){ return this.vidimost_po_umolchaniyu; }


@Column(name="klyuch_varianta", columnDefinition="text")
private String klyuch_varianta;

public void setKlyuch_varianta(String _klyuch_varianta){ this.klyuch_varianta=_klyuch_varianta; }

public String getKlyuch_varianta(){ return this.klyuch_varianta; }


@Column(name="tolko_dlja_avtora")

private Boolean tolko_dlja_avtora;
public void setTolko_dlja_avtora(Boolean _tolko_dlja_avtora){ this.tolko_dlja_avtora=_tolko_dlja_avtora; }

public Boolean getTolko_dlja_avtora(){ return this.tolko_dlja_avtora; }


@Column(name="vidimost_po_umolchaniyu_pereopredelena")

private Boolean vidimost_po_umolchaniyu_pereopredelena;
public void setVidimost_po_umolchaniyu_pereopredelena(Boolean _vidimost_po_umolchaniyu_pereopredelena){ this.vidimost_po_umolchaniyu_pereopredelena=_vidimost_po_umolchaniyu_pereopredelena; }

public Boolean getVidimost_po_umolchaniyu_pereopredelena(){ return this.vidimost_po_umolchaniyu_pereopredelena; }


@Column(name="interaktivnaja_pometka_udalenija")

private Boolean interaktivnaja_pometka_udalenija;
public void setInteraktivnaja_pometka_udalenija(Boolean _interaktivnaja_pometka_udalenija){ this.interaktivnaja_pometka_udalenija=_interaktivnaja_pometka_udalenija; }

public Boolean getInteraktivnaja_pometka_udalenija(){ return this.interaktivnaja_pometka_udalenija; }


@Column(name="naimenovanija_parametrov_i_otborov", columnDefinition="text")
private String naimenovanija_parametrov_i_otborov;

public void setNaimenovanija_parametrov_i_otborov(String _naimenovanija_parametrov_i_otborov){ this.naimenovanija_parametrov_i_otborov=_naimenovanija_parametrov_i_otborov; }

public String getNaimenovanija_parametrov_i_otborov(){ return this.naimenovanija_parametrov_i_otborov; }


@Column(name="nastroyki", columnDefinition="text")
private String nastroyki;

public void setNastroyki(String _nastroyki){ this.nastroyki=_nastroyki; }

public String getNastroyki(){ return this.nastroyki; }


@Column(name="udalit_klyuch_obyekta", columnDefinition="text")
private String udalit_klyuch_obyekta;

public void setUdalit_klyuch_obyekta(String _udalit_klyuch_obyekta){ this.udalit_klyuch_obyekta=_udalit_klyuch_obyekta; }

public String getUdalit_klyuch_obyekta(){ return this.udalit_klyuch_obyekta; }


@Column(name="opisanie", columnDefinition="text")
private String opisanie;

public void setOpisanie(String _opisanie){ this.opisanie=_opisanie; }

public String getOpisanie(){ return this.opisanie; }


@ManyToOne
@JoinColumn(name="otchet", insertable = true, updatable = true)
private identifikatori_obyektov_metadannih otchet;

public identifikatori_obyektov_metadannih getOtchet(){ try{return this.otchet;}catch(Exception ex){ return null;} }

public void setOtchet( Object _otchet){if (_otchet instanceof String){this.otchet= new identifikatori_obyektov_metadannih (_otchet.toString());}else{try{this.otchet= (identifikatori_obyektov_metadannih) _otchet;}catch(Exception ex){Variables.logger.error(ex);this.otchet= new identifikatori_obyektov_metadannih (_otchet.toString());}}}

public UUID getOtchet_uuid(){ try{return this.otchet.getGuid();}catch(Exception ex){return null;} }

public String getOtchet_type(){ try{return this.otchet.getClass().getName();}catch(Exception ex){return null;} }

public identifikatori_obyektov_metadannih getOtchet_obj(){ return this.otchet; }

public void setOtchet_obj( Object _otchet){ this.otchet=(identifikatori_obyektov_metadannih) _otchet; }


@ManyToOne
@JoinColumn(name="predopredelenniy_variant", insertable = true, updatable = true)
private predopredelennie_varianti_otchetov predopredelenniy_variant;

public predopredelennie_varianti_otchetov getPredopredelenniy_variant(){ try{return this.predopredelenniy_variant;}catch(Exception ex){ return null;} }

public void setPredopredelenniy_variant( Object _predopredelenniy_variant){if (_predopredelenniy_variant instanceof String){this.predopredelenniy_variant= new predopredelennie_varianti_otchetov (_predopredelenniy_variant.toString());}else{try{this.predopredelenniy_variant= (predopredelennie_varianti_otchetov) _predopredelenniy_variant;}catch(Exception ex){Variables.logger.error(ex);this.predopredelenniy_variant= new predopredelennie_varianti_otchetov (_predopredelenniy_variant.toString());}}}

public UUID getPredopredelenniy_variant_uuid(){ try{return this.predopredelenniy_variant.getGuid();}catch(Exception ex){return null;} }

public String getPredopredelenniy_variant_type(){ try{return this.predopredelenniy_variant.getClass().getName();}catch(Exception ex){return null;} }

public predopredelennie_varianti_otchetov getPredopredelenniy_variant_obj(){ return this.predopredelenniy_variant; }

public void setPredopredelenniy_variant_obj( Object _predopredelenniy_variant){ this.predopredelenniy_variant=(predopredelennie_varianti_otchetov) _predopredelenniy_variant; }


@Column(name="udalit_predstavlenie_obyekta", columnDefinition="text")
private String udalit_predstavlenie_obyekta;

public void setUdalit_predstavlenie_obyekta(String _udalit_predstavlenie_obyekta){ this.udalit_predstavlenie_obyekta=_udalit_predstavlenie_obyekta; }

public String getUdalit_predstavlenie_obyekta(){ return this.udalit_predstavlenie_obyekta; }


@Column(name="hesh_nastroek", columnDefinition="text")
private String hesh_nastroek;

public void setHesh_nastroek(String _hesh_nastroek){ this.hesh_nastroek=_hesh_nastroek; }

public String getHesh_nastroek(){ return this.hesh_nastroek; }


@Column(name="vklyuchen")

private Boolean vklyuchen;
public void setVklyuchen(Boolean _vklyuchen){ this.vklyuchen=_vklyuchen; }

public Boolean getVklyuchen(){ return this.vklyuchen; }


@Column(name="gruppirovat_po_otchetu")

private Boolean gruppirovat_po_otchetu;
public void setGruppirovat_po_otchetu(Boolean _gruppirovat_po_otchetu){ this.gruppirovat_po_otchetu=_gruppirovat_po_otchetu; }

public Boolean getGruppirovat_po_otchetu(){ return this.gruppirovat_po_otchetu; }


@Column(name="klyuch_zamerov", columnDefinition="text")
private String klyuch_zamerov;

public void setKlyuch_zamerov(String _klyuch_zamerov){ this.klyuch_zamerov=_klyuch_zamerov; }

public String getKlyuch_zamerov(){ return this.klyuch_zamerov; }


}
