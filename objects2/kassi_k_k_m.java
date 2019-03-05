import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="kassi_k_k_m")
public class kassi_k_k_m implements Serializable {

public kassi_k_k_m(){}

public kassi_k_k_m(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="registratsionniy_nomer", columnDefinition="text")
private String registratsionniy_nomer;

public void setRegistratsionniy_nomer(String _registratsionniy_nomer){ this.registratsionniy_nomer=_registratsionniy_nomer; }

public String getRegistratsionniy_nomer(){ return this.registratsionniy_nomer; }



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
