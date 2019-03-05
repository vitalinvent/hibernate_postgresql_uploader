import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="proverki_sostojanija_sistemi")
public class proverki_sostojanija_sistemi implements Serializable {

public proverki_sostojanija_sistemi(){}

public proverki_sostojanija_sistemi(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="vozmozhno_izmenenie_vazhnosti")

private Boolean vozmozhno_izmenenie_vazhnosti;
public void setVozmozhno_izmenenie_vazhnosti(Boolean _vozmozhno_izmenenie_vazhnosti){ this.vozmozhno_izmenenie_vazhnosti=_vozmozhno_izmenenie_vazhnosti; }

public Boolean getVozmozhno_izmenenie_vazhnosti(){ return this.vozmozhno_izmenenie_vazhnosti; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="reglamentnoe_zadanieguid", columnDefinition="text")
private String reglamentnoe_zadanieguid;

public void setReglamentnoe_zadanieguid(String _reglamentnoe_zadanieguid){ this.reglamentnoe_zadanieguid=_reglamentnoe_zadanieguid; }

public String getReglamentnoe_zadanieguid(){ return this.reglamentnoe_zadanieguid; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="reglamentnoe_zadanie_predstavlenie", columnDefinition="text")
private String reglamentnoe_zadanie_predstavlenie;

public void setReglamentnoe_zadanie_predstavlenie(String _reglamentnoe_zadanie_predstavlenie){ this.reglamentnoe_zadanie_predstavlenie=_reglamentnoe_zadanie_predstavlenie; }

public String getReglamentnoe_zadanie_predstavlenie(){ return this.reglamentnoe_zadanie_predstavlenie; }


@Column(name="vazhnost", columnDefinition="text")
private String vazhnost;

public void setVazhnost(String _vazhnost){ this.vazhnost=_vazhnost; }

public String getVazhnost(){ return this.vazhnost; }


@Column(name="ispolzuetsja")

private Boolean ispolzuetsja;
public void setIspolzuetsja(Boolean _ispolzuetsja){ this.ispolzuetsja=_ispolzuetsja; }

public Boolean getIspolzuetsja(){ return this.ispolzuetsja; }


@Column(name="opisanie_dopolnitelnih_parametrov", columnDefinition="text")
private String opisanie_dopolnitelnih_parametrov;

public void setOpisanie_dopolnitelnih_parametrov(String _opisanie_dopolnitelnih_parametrov){ this.opisanie_dopolnitelnih_parametrov=_opisanie_dopolnitelnih_parametrov; }

public String getOpisanie_dopolnitelnih_parametrov(){ return this.opisanie_dopolnitelnih_parametrov; }


@Column(name="po_otdelnomu_raspisaniyu")

private Boolean po_otdelnomu_raspisaniyu;
public void setPo_otdelnomu_raspisaniyu(Boolean _po_otdelnomu_raspisaniyu){ this.po_otdelnomu_raspisaniyu=_po_otdelnomu_raspisaniyu; }

public Boolean getPo_otdelnomu_raspisaniyu(){ return this.po_otdelnomu_raspisaniyu; }


@Column(name="raspisanie", columnDefinition="text")
private String raspisanie;

public void setRaspisanie(String _raspisanie){ this.raspisanie=_raspisanie; }

public String getRaspisanie(){ return this.raspisanie; }


@Column(name="dopolnitelnie_parametri_avtoproverki", columnDefinition="text")
private String dopolnitelnie_parametri_avtoproverki;

public void setDopolnitelnie_parametri_avtoproverki(String _dopolnitelnie_parametri_avtoproverki){ this.dopolnitelnie_parametri_avtoproverki=_dopolnitelnie_parametri_avtoproverki; }

public String getDopolnitelnie_parametri_avtoproverki(){ return this.dopolnitelnie_parametri_avtoproverki; }


@Column(name="kommentariy", columnDefinition="text")
private String kommentariy;

public void setKommentariy(String _kommentariy){ this.kommentariy=_kommentariy; }

public String getKommentariy(){ return this.kommentariy; }


@Column(name="identifikator", columnDefinition="text")
private String identifikator;

public void setIdentifikator(String _identifikator){ this.identifikator=_identifikator; }

public String getIdentifikator(){ return this.identifikator; }


@Column(name="utochnenie_konteksta_vipolnenija", columnDefinition="text")
private String utochnenie_konteksta_vipolnenija;

public void setUtochnenie_konteksta_vipolnenija(String _utochnenie_konteksta_vipolnenija){ this.utochnenie_konteksta_vipolnenija=_utochnenie_konteksta_vipolnenija; }

public String getUtochnenie_konteksta_vipolnenija(){ return this.utochnenie_konteksta_vipolnenija; }


@Column(name="vipolnjaetsja_tolko_v_kontekste")

private Boolean vipolnjaetsja_tolko_v_kontekste;
public void setVipolnjaetsja_tolko_v_kontekste(Boolean _vipolnjaetsja_tolko_v_kontekste){ this.vipolnjaetsja_tolko_v_kontekste=_vipolnjaetsja_tolko_v_kontekste; }

public Boolean getVipolnjaetsja_tolko_v_kontekste(){ return this.vipolnjaetsja_tolko_v_kontekste; }


@Column(name="predshestvuyushchaja_proverka", columnDefinition="text")
private String predshestvuyushchaja_proverka;

public void setPredshestvuyushchaja_proverka(String _predshestvuyushchaja_proverka){ this.predshestvuyushchaja_proverka=_predshestvuyushchaja_proverka; }

public String getPredshestvuyushchaja_proverka(){ return this.predshestvuyushchaja_proverka; }


@Column(name="obrabotchik", columnDefinition="text")
private String obrabotchik;

public void setObrabotchik(String _obrabotchik){ this.obrabotchik=_obrabotchik; }

public String getObrabotchik(){ return this.obrabotchik; }


@Column(name="sposob_vipolnenija", columnDefinition="text")
private String sposob_vipolnenija;

public void setSposob_vipolnenija(String _sposob_vipolnenija){ this.sposob_vipolnenija=_sposob_vipolnenija; }

public String getSposob_vipolnenija(){ return this.sposob_vipolnenija; }


@Column(name="detalizatsija_do_organizatsii")

private Boolean detalizatsija_do_organizatsii;
public void setDetalizatsija_do_organizatsii(Boolean _detalizatsija_do_organizatsii){ this.detalizatsija_do_organizatsii=_detalizatsija_do_organizatsii; }

public Boolean getDetalizatsija_do_organizatsii(){ return this.detalizatsija_do_organizatsii; }


@Column(name="detalizatsija_do_perioda")

private Boolean detalizatsija_do_perioda;
public void setDetalizatsija_do_perioda(Boolean _detalizatsija_do_perioda){ this.detalizatsija_do_perioda=_detalizatsija_do_perioda; }

public Boolean getDetalizatsija_do_perioda(){ return this.detalizatsija_do_perioda; }


}
