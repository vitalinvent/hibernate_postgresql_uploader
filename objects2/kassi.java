import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="kassi")
public class kassi implements Serializable {

public kassi(){}

public kassi(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="eto_kassa_obosoblennogo_podrazdelenija")

private Boolean eto_kassa_obosoblennogo_podrazdelenija;
public void setEto_kassa_obosoblennogo_podrazdelenija(Boolean _eto_kassa_obosoblennogo_podrazdelenija){ this.eto_kassa_obosoblennogo_podrazdelenija=_eto_kassa_obosoblennogo_podrazdelenija; }

public Boolean getEto_kassa_obosoblennogo_podrazdelenija(){ return this.eto_kassa_obosoblennogo_podrazdelenija; }


@Column(name="srok_inkassatsii")

private Float srok_inkassatsii;
public void setSrok_inkassatsii(Float _srok_inkassatsii){ this.srok_inkassatsii=_srok_inkassatsii; }

public Float getSrok_inkassatsii(){ return this.srok_inkassatsii; }




@ManyToOne
@JoinColumn(name="valyuta_denezhnih_sredstv", insertable = true, updatable = true)
private valyuti valyuta_denezhnih_sredstv;

public valyuti getValyuta_denezhnih_sredstv(){ try{return this.valyuta_denezhnih_sredstv;}catch(Exception ex){ return null;} }

public void setValyuta_denezhnih_sredstv( Object _valyuta_denezhnih_sredstv){if (_valyuta_denezhnih_sredstv instanceof String){this.valyuta_denezhnih_sredstv= new valyuti (_valyuta_denezhnih_sredstv.toString());}else{try{this.valyuta_denezhnih_sredstv= (valyuti) _valyuta_denezhnih_sredstv;}catch(Exception ex){Variables.logger.error(ex);this.valyuta_denezhnih_sredstv= new valyuti (_valyuta_denezhnih_sredstv.toString());}}}

public UUID getValyuta_denezhnih_sredstv_uuid(){ try{return this.valyuta_denezhnih_sredstv.getGuid();}catch(Exception ex){return null;} }

public String getValyuta_denezhnih_sredstv_type(){ try{return this.valyuta_denezhnih_sredstv.getClass().getName();}catch(Exception ex){return null;} }

public valyuti getValyuta_denezhnih_sredstv_obj(){ return this.valyuta_denezhnih_sredstv; }

public void setValyuta_denezhnih_sredstv_obj( Object _valyuta_denezhnih_sredstv){ this.valyuta_denezhnih_sredstv=(valyuti) _valyuta_denezhnih_sredstv; }


@ManyToOne
@JoinColumn(name="podrazdelenie", insertable = true, updatable = true)
private struktura_predprijatija podrazdelenie;

public struktura_predprijatija getPodrazdelenie(){ try{return this.podrazdelenie;}catch(Exception ex){ return null;} }

public void setPodrazdelenie( Object _podrazdelenie){if (_podrazdelenie instanceof String){this.podrazdelenie= new struktura_predprijatija (_podrazdelenie.toString());}else{try{this.podrazdelenie= (struktura_predprijatija) _podrazdelenie;}catch(Exception ex){Variables.logger.error(ex);this.podrazdelenie= new struktura_predprijatija (_podrazdelenie.toString());}}}

public UUID getPodrazdelenie_uuid(){ try{return this.podrazdelenie.getGuid();}catch(Exception ex){return null;} }

public String getPodrazdelenie_type(){ try{return this.podrazdelenie.getClass().getName();}catch(Exception ex){return null;} }

public struktura_predprijatija getPodrazdelenie_obj(){ return this.podrazdelenie; }

public void setPodrazdelenie_obj( Object _podrazdelenie){ this.podrazdelenie=(struktura_predprijatija) _podrazdelenie; }


@Column(name="razreshit_platezhi_bez_ukazanija_zajavok")

private Boolean razreshit_platezhi_bez_ukazanija_zajavok;
public void setRazreshit_platezhi_bez_ukazanija_zajavok(Boolean _razreshit_platezhi_bez_ukazanija_zajavok){ this.razreshit_platezhi_bez_ukazanija_zajavok=_razreshit_platezhi_bez_ukazanija_zajavok; }

public Boolean getRazreshit_platezhi_bez_ukazanija_zajavok(){ return this.razreshit_platezhi_bez_ukazanija_zajavok; }


@ManyToOne
@JoinColumn(name="napravlenie_dejatelnosti", insertable = true, updatable = true)
private napravlenija_dejatelnosti napravlenie_dejatelnosti;

public napravlenija_dejatelnosti getNapravlenie_dejatelnosti(){ try{return this.napravlenie_dejatelnosti;}catch(Exception ex){ return null;} }

public void setNapravlenie_dejatelnosti( Object _napravlenie_dejatelnosti){if (_napravlenie_dejatelnosti instanceof String){this.napravlenie_dejatelnosti= new napravlenija_dejatelnosti (_napravlenie_dejatelnosti.toString());}else{try{this.napravlenie_dejatelnosti= (napravlenija_dejatelnosti) _napravlenie_dejatelnosti;}catch(Exception ex){Variables.logger.error(ex);this.napravlenie_dejatelnosti= new napravlenija_dejatelnosti (_napravlenie_dejatelnosti.toString());}}}

public UUID getNapravlenie_dejatelnosti_uuid(){ try{return this.napravlenie_dejatelnosti.getGuid();}catch(Exception ex){return null;} }

public String getNapravlenie_dejatelnosti_type(){ try{return this.napravlenie_dejatelnosti.getClass().getName();}catch(Exception ex){return null;} }

public napravlenija_dejatelnosti getNapravlenie_dejatelnosti_obj(){ return this.napravlenie_dejatelnosti; }

public void setNapravlenie_dejatelnosti_obj( Object _napravlenie_dejatelnosti){ this.napravlenie_dejatelnosti=(napravlenija_dejatelnosti) _napravlenie_dejatelnosti; }


@Column(name="registratsionniy_nomer", columnDefinition="text")
private String registratsionniy_nomer;

public void setRegistratsionniy_nomer(String _registratsionniy_nomer){ this.registratsionniy_nomer=_registratsionniy_nomer; }

public String getRegistratsionniy_nomer(){ return this.registratsionniy_nomer; }


@ManyToOne
@JoinColumn(name="sklad", insertable = true, updatable = true)
private skladi sklad;

public skladi getSklad(){ try{return this.sklad;}catch(Exception ex){ return null;} }

public void setSklad( Object _sklad){if (_sklad instanceof String){this.sklad= new skladi (_sklad.toString());}else{try{this.sklad= (skladi) _sklad;}catch(Exception ex){Variables.logger.error(ex);this.sklad= new skladi (_sklad.toString());}}}

public UUID getSklad_uuid(){ try{return this.sklad.getGuid();}catch(Exception ex){return null;} }

public String getSklad_type(){ try{return this.sklad.getClass().getName();}catch(Exception ex){return null;} }

public skladi getSklad_obj(){ return this.sklad; }

public void setSklad_obj( Object _sklad){ this.sklad=(skladi) _sklad; }


@Column(name="seriyniy_nomer", columnDefinition="text")
private String seriyniy_nomer;

public void setSeriyniy_nomer(String _seriyniy_nomer){ this.seriyniy_nomer=_seriyniy_nomer; }

public String getSeriyniy_nomer(){ return this.seriyniy_nomer; }


}
