import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="identifikatori_obyektov_rasshireniy")
public class identifikatori_obyektov_rasshireniy implements Serializable {

public identifikatori_obyektov_rasshireniy(){}

public identifikatori_obyektov_rasshireniy(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="sinonim", columnDefinition="text")
private String sinonim;

public void setSinonim(String _sinonim){ this.sinonim=_sinonim; }

public String getSinonim(){ return this.sinonim; }



@Column(name="polnoe_imja", columnDefinition="text")
private String polnoe_imja;

public void setPolnoe_imja(String _polnoe_imja){ this.polnoe_imja=_polnoe_imja; }

public String getPolnoe_imja(){ return this.polnoe_imja; }


@Column(name="imja", columnDefinition="text")
private String imja;

public void setImja(String _imja){ this.imja=_imja; }

public String getImja(){ return this.imja; }


@Column(name="porjadok_kollektsii")

private Float porjadok_kollektsii;
public void setPorjadok_kollektsii(Float _porjadok_kollektsii){ this.porjadok_kollektsii=_porjadok_kollektsii; }

public Float getPorjadok_kollektsii(){ return this.porjadok_kollektsii; }


@Column(name="polniy_sinonim", columnDefinition="text")
private String polniy_sinonim;

public void setPolniy_sinonim(String _polniy_sinonim){ this.polniy_sinonim=_polniy_sinonim; }

public String getPolniy_sinonim(){ return this.polniy_sinonim; }


@Column(name="bez_dannih")

private Boolean bez_dannih;
public void setBez_dannih(Boolean _bez_dannih){ this.bez_dannih=_bez_dannih; }

public Boolean getBez_dannih(){ return this.bez_dannih; }


@Column(name="znachenie_pustoy_ssilki", columnDefinition="text")
private String znachenie_pustoy_ssilki;

public void setZnachenie_pustoy_ssilki(String _znachenie_pustoy_ssilki){ this.znachenie_pustoy_ssilki=_znachenie_pustoy_ssilki; }

public String getZnachenie_pustoy_ssilki(){ return this.znachenie_pustoy_ssilki; }


@Column(name="klyuch_obyekta_metadannih", columnDefinition="text")
private String klyuch_obyekta_metadannih;

public void setKlyuch_obyekta_metadannih(String _klyuch_obyekta_metadannih){ this.klyuch_obyekta_metadannih=_klyuch_obyekta_metadannih; }

public String getKlyuch_obyekta_metadannih(){ return this.klyuch_obyekta_metadannih; }


@ManyToOne
@JoinColumn(name="novaja_ssilka", insertable = true, updatable = true)
private identifikatori_obyektov_rasshireniy novaja_ssilka;

public identifikatori_obyektov_rasshireniy getNovaja_ssilka(){ try{return this.novaja_ssilka;}catch(Exception ex){ return null;} }

public void setNovaja_ssilka( Object _novaja_ssilka){if (_novaja_ssilka instanceof String){this.novaja_ssilka= new identifikatori_obyektov_rasshireniy (_novaja_ssilka.toString());}else{try{this.novaja_ssilka= (identifikatori_obyektov_rasshireniy) _novaja_ssilka;}catch(Exception ex){Variables.logger.error(ex);this.novaja_ssilka= new identifikatori_obyektov_rasshireniy (_novaja_ssilka.toString());}}}

public UUID getNovaja_ssilka_uuid(){ try{return this.novaja_ssilka.getGuid();}catch(Exception ex){return null;} }

public String getNovaja_ssilka_type(){ try{return this.novaja_ssilka.getClass().getName();}catch(Exception ex){return null;} }

public identifikatori_obyektov_rasshireniy getNovaja_ssilka_obj(){ return this.novaja_ssilka; }

public void setNovaja_ssilka_obj( Object _novaja_ssilka){ this.novaja_ssilka=(identifikatori_obyektov_rasshireniy) _novaja_ssilka; }


@Column(name="imja_rasshirenija", columnDefinition="text")
private String imja_rasshirenija;

public void setImja_rasshirenija(String _imja_rasshirenija){ this.imja_rasshirenija=_imja_rasshirenija; }

public String getImja_rasshirenija(){ return this.imja_rasshirenija; }


@Column(name="hesh_summa_rasshirenija", columnDefinition="text")
private String hesh_summa_rasshirenija;

public void setHesh_summa_rasshirenija(String _hesh_summa_rasshirenija){ this.hesh_summa_rasshirenija=_hesh_summa_rasshirenija; }

public String getHesh_summa_rasshirenija(){ return this.hesh_summa_rasshirenija; }


}
