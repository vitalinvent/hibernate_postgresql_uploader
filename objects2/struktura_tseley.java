import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="struktura_tseley")
public class struktura_tseley implements Serializable {

public struktura_tseley(){}

public struktura_tseley(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="tsel_izmerimaja")

private Boolean tsel_izmerimaja;
public void setTsel_izmerimaja(Boolean _tsel_izmerimaja){ this.tsel_izmerimaja=_tsel_izmerimaja; }

public Boolean getTsel_izmerimaja(){ return this.tsel_izmerimaja; }



@Column(name="kratkoe_naimenovanie_tselevogo_pokazatelja", columnDefinition="text")
private String kratkoe_naimenovanie_tselevogo_pokazatelja;

public void setKratkoe_naimenovanie_tselevogo_pokazatelja(String _kratkoe_naimenovanie_tselevogo_pokazatelja){ this.kratkoe_naimenovanie_tselevogo_pokazatelja=_kratkoe_naimenovanie_tselevogo_pokazatelja; }

public String getKratkoe_naimenovanie_tselevogo_pokazatelja(){ return this.kratkoe_naimenovanie_tselevogo_pokazatelja; }



@ManyToOne
@JoinColumn(name="kategorija_tseli", insertable = true, updatable = true)
private kategorii_tseley kategorija_tseli;

public kategorii_tseley getKategorija_tseli(){ try{return this.kategorija_tseli;}catch(Exception ex){ return null;} }

public void setKategorija_tseli( Object _kategorija_tseli){if (_kategorija_tseli instanceof String){this.kategorija_tseli= new kategorii_tseley (_kategorija_tseli.toString());}else{try{this.kategorija_tseli= (kategorii_tseley) _kategorija_tseli;}catch(Exception ex){Variables.logger.error(ex);this.kategorija_tseli= new kategorii_tseley (_kategorija_tseli.toString());}}}

public UUID getKategorija_tseli_uuid(){ try{return this.kategorija_tseli.getGuid();}catch(Exception ex){return null;} }

public String getKategorija_tseli_type(){ try{return this.kategorija_tseli.getClass().getName();}catch(Exception ex){return null;} }

public kategorii_tseley getKategorija_tseli_obj(){ return this.kategorija_tseli; }

public void setKategorija_tseli_obj( Object _kategorija_tseli){ this.kategorija_tseli=(kategorii_tseley) _kategorija_tseli; }


@Column(name="tselevoy_pokazatel", columnDefinition="text")
private String tselevoy_pokazatel;

public void setTselevoy_pokazatel(String _tselevoy_pokazatel){ this.tselevoy_pokazatel=_tselevoy_pokazatel; }

public String getTselevoy_pokazatel(){ return this.tselevoy_pokazatel; }


@Column(name="formula_rascheta", columnDefinition="text")
private String formula_rascheta;

public void setFormula_rascheta(String _formula_rascheta){ this.formula_rascheta=_formula_rascheta; }

public String getFormula_rascheta(){ return this.formula_rascheta; }


@Column(name="shema_komponovki_dannih", columnDefinition="text")
private String shema_komponovki_dannih;

public void setShema_komponovki_dannih(String _shema_komponovki_dannih){ this.shema_komponovki_dannih=_shema_komponovki_dannih; }

public String getShema_komponovki_dannih(){ return this.shema_komponovki_dannih; }


@Column(name="hranilishche_shemi_komponovki_dannih", columnDefinition="text")
private String hranilishche_shemi_komponovki_dannih;

public void setHranilishche_shemi_komponovki_dannih(String _hranilishche_shemi_komponovki_dannih){ this.hranilishche_shemi_komponovki_dannih=_hranilishche_shemi_komponovki_dannih; }

public String getHranilishche_shemi_komponovki_dannih(){ return this.hranilishche_shemi_komponovki_dannih; }


@Column(name="hranilishche_nastroek_komponovki_dannih", columnDefinition="text")
private String hranilishche_nastroek_komponovki_dannih;

public void setHranilishche_nastroek_komponovki_dannih(String _hranilishche_nastroek_komponovki_dannih){ this.hranilishche_nastroek_komponovki_dannih=_hranilishche_nastroek_komponovki_dannih; }

public String getHranilishche_nastroek_komponovki_dannih(){ return this.hranilishche_nastroek_komponovki_dannih; }


@Column(name="razmernost", columnDefinition="text")
private String razmernost;

public void setRazmernost(String _razmernost){ this.razmernost=_razmernost; }

public String getRazmernost(){ return this.razmernost; }


@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }


@Column(name="rekvizit_dop_uporjadochivanija_ierarhicheskogo", columnDefinition="text")
private String rekvizit_dop_uporjadochivanija_ierarhicheskogo;

public void setRekvizit_dop_uporjadochivanija_ierarhicheskogo(String _rekvizit_dop_uporjadochivanija_ierarhicheskogo){ this.rekvizit_dop_uporjadochivanija_ierarhicheskogo=_rekvizit_dop_uporjadochivanija_ierarhicheskogo; }

public String getRekvizit_dop_uporjadochivanija_ierarhicheskogo(){ return this.rekvizit_dop_uporjadochivanija_ierarhicheskogo; }


}
