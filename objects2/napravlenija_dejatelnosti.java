import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="napravlenija_dejatelnosti")
public class napravlenija_dejatelnosti implements Serializable {

public napravlenija_dejatelnosti(){}

public napravlenija_dejatelnosti(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="uchet_zatrat")

private Boolean uchet_zatrat;
public void setUchet_zatrat(Boolean _uchet_zatrat){ this.uchet_zatrat=_uchet_zatrat; }

public Boolean getUchet_zatrat(){ return this.uchet_zatrat; }



@Column(name="pribil_kontrakta")

private Float pribil_kontrakta;
public void setPribil_kontrakta(Float _pribil_kontrakta){ this.pribil_kontrakta=_pribil_kontrakta; }

public Float getPribil_kontrakta(){ return this.pribil_kontrakta; }


@Column(name="data_zavershenija", columnDefinition="text")
private String data_zavershenija;

public void setData_zavershenija(String _data_zavershenija){ this.data_zavershenija=_data_zavershenija; }

public String getData_zavershenija(){ return this.data_zavershenija; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="uchet_dohodov")

private Boolean uchet_dohodov;
public void setUchet_dohodov(Boolean _uchet_dohodov){ this.uchet_dohodov=_uchet_dohodov; }

public Boolean getUchet_dohodov(){ return this.uchet_dohodov; }


@Column(name="uchet_denezhnih_sredstv_razdelno")

private Boolean uchet_denezhnih_sredstv_razdelno;
public void setUchet_denezhnih_sredstv_razdelno(Boolean _uchet_denezhnih_sredstv_razdelno){ this.uchet_denezhnih_sredstv_razdelno=_uchet_denezhnih_sredstv_razdelno; }

public Boolean getUchet_denezhnih_sredstv_razdelno(){ return this.uchet_denezhnih_sredstv_razdelno; }


@Column(name="uchet_denezhnih_sredstv_po_korrespondentsii")

private Boolean uchet_denezhnih_sredstv_po_korrespondentsii;
public void setUchet_denezhnih_sredstv_po_korrespondentsii(Boolean _uchet_denezhnih_sredstv_po_korrespondentsii){ this.uchet_denezhnih_sredstv_po_korrespondentsii=_uchet_denezhnih_sredstv_po_korrespondentsii; }

public Boolean getUchet_denezhnih_sredstv_po_korrespondentsii(){ return this.uchet_denezhnih_sredstv_po_korrespondentsii; }


@Column(name="uchet_vneoborotnih_aktivov")

private Boolean uchet_vneoborotnih_aktivov;
public void setUchet_vneoborotnih_aktivov(Boolean _uchet_vneoborotnih_aktivov){ this.uchet_vneoborotnih_aktivov=_uchet_vneoborotnih_aktivov; }

public Boolean getUchet_vneoborotnih_aktivov(){ return this.uchet_vneoborotnih_aktivov; }


@ManyToOne
@JoinColumn(name="naznachenie", insertable = true, updatable = true)
private naznachenija naznachenie;

public naznachenija getNaznachenie(){ try{return this.naznachenie;}catch(Exception ex){ return null;} }

public void setNaznachenie( Object _naznachenie){if (_naznachenie instanceof String){this.naznachenie= new naznachenija (_naznachenie.toString());}else{try{this.naznachenie= (naznachenija) _naznachenie;}catch(Exception ex){Variables.logger.error(ex);this.naznachenie= new naznachenija (_naznachenie.toString());}}}

public UUID getNaznachenie_uuid(){ try{return this.naznachenie.getGuid();}catch(Exception ex){return null;} }

public String getNaznachenie_type(){ try{return this.naznachenie.getClass().getName();}catch(Exception ex){return null;} }

public naznachenija getNaznachenie_obj(){ return this.naznachenie; }

public void setNaznachenie_obj( Object _naznachenie){ this.naznachenie=(naznachenija) _naznachenie; }


@Column(name="kommentariy", columnDefinition="text")
private String kommentariy;

public void setKommentariy(String _kommentariy){ this.kommentariy=_kommentariy; }

public String getKommentariy(){ return this.kommentariy; }


@Column(name="obyem_finansirovanija_kontrakta")

private Float obyem_finansirovanija_kontrakta;
public void setObyem_finansirovanija_kontrakta(Float _obyem_finansirovanija_kontrakta){ this.obyem_finansirovanija_kontrakta=_obyem_finansirovanija_kontrakta; }

public Float getObyem_finansirovanija_kontrakta(){ return this.obyem_finansirovanija_kontrakta; }


@Column(name="summa_n_d_s")

private Float summa_n_d_s;
public void setSumma_n_d_s(Float _summa_n_d_s){ this.summa_n_d_s=_summa_n_d_s; }

public Float getSumma_n_d_s(){ return this.summa_n_d_s; }


@Column(name="zatrati_na_materiali")

private Float zatrati_na_materiali;
public void setZatrati_na_materiali(Float _zatrati_na_materiali){ this.zatrati_na_materiali=_zatrati_na_materiali; }

public Float getZatrati_na_materiali(){ return this.zatrati_na_materiali; }


@Column(name="dopuskaetsja_obosoblenie_sverh_potrebnosti")

private Boolean dopuskaetsja_obosoblenie_sverh_potrebnosti;
public void setDopuskaetsja_obosoblenie_sverh_potrebnosti(Boolean _dopuskaetsja_obosoblenie_sverh_potrebnosti){ this.dopuskaetsja_obosoblenie_sverh_potrebnosti=_dopuskaetsja_obosoblenie_sverh_potrebnosti; }

public Boolean getDopuskaetsja_obosoblenie_sverh_potrebnosti(){ return this.dopuskaetsja_obosoblenie_sverh_potrebnosti; }


@Column(name="zatrati_na_oplatu_truda")

private Float zatrati_na_oplatu_truda;
public void setZatrati_na_oplatu_truda(Float _zatrati_na_oplatu_truda){ this.zatrati_na_oplatu_truda=_zatrati_na_oplatu_truda; }

public Float getZatrati_na_oplatu_truda(){ return this.zatrati_na_oplatu_truda; }


@Column(name="prochie_proizvodstvennie_zatrati")

private Float prochie_proizvodstvennie_zatrati;
public void setProchie_proizvodstvennie_zatrati(Float _prochie_proizvodstvennie_zatrati){ this.prochie_proizvodstvennie_zatrati=_prochie_proizvodstvennie_zatrati; }

public Float getProchie_proizvodstvennie_zatrati(){ return this.prochie_proizvodstvennie_zatrati; }


@Column(name="obshcheproizvodstvennie_zatrati")

private Float obshcheproizvodstvennie_zatrati;
public void setObshcheproizvodstvennie_zatrati(Float _obshcheproizvodstvennie_zatrati){ this.obshcheproizvodstvennie_zatrati=_obshcheproizvodstvennie_zatrati; }

public Float getObshcheproizvodstvennie_zatrati(){ return this.obshcheproizvodstvennie_zatrati; }


@Column(name="obshchehozjaystvennie_zatrati")

private Float obshchehozjaystvennie_zatrati;
public void setObshchehozjaystvennie_zatrati(Float _obshchehozjaystvennie_zatrati){ this.obshchehozjaystvennie_zatrati=_obshchehozjaystvennie_zatrati; }

public Float getObshchehozjaystvennie_zatrati(){ return this.obshchehozjaystvennie_zatrati; }


@Column(name="kommercheskie_rashodi")

private Float kommercheskie_rashodi;
public void setKommercheskie_rashodi(Float _kommercheskie_rashodi){ this.kommercheskie_rashodi=_kommercheskie_rashodi; }

public Float getKommercheskie_rashodi(){ return this.kommercheskie_rashodi; }


@Column(name="upravlencheskie_rashodi")

private Float upravlencheskie_rashodi;
public void setUpravlencheskie_rashodi(Float _upravlencheskie_rashodi){ this.upravlencheskie_rashodi=_upravlencheskie_rashodi; }

public Float getUpravlencheskie_rashodi(){ return this.upravlencheskie_rashodi; }


}
