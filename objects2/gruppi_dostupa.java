import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="gruppi_dostupa")
public class gruppi_dostupa implements Serializable {

public gruppi_dostupa(){}

public gruppi_dostupa(String _guid){ this.guid=UUID.fromString(_guid); }

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
@JoinColumn(name="otvetstvenniy", insertable = true, updatable = true)
private polzovateli otvetstvenniy;

public polzovateli getOtvetstvenniy(){ try{return this.otvetstvenniy;}catch(Exception ex){ return null;} }

public void setOtvetstvenniy( Object _otvetstvenniy){if (_otvetstvenniy instanceof String){this.otvetstvenniy= new polzovateli (_otvetstvenniy.toString());}else{try{this.otvetstvenniy= (polzovateli) _otvetstvenniy;}catch(Exception ex){Variables.logger.error(ex);this.otvetstvenniy= new polzovateli (_otvetstvenniy.toString());}}}

public UUID getOtvetstvenniy_uuid(){ try{return this.otvetstvenniy.getGuid();}catch(Exception ex){return null;} }

public String getOtvetstvenniy_type(){ try{return this.otvetstvenniy.getClass().getName();}catch(Exception ex){return null;} }

public polzovateli getOtvetstvenniy_obj(){ return this.otvetstvenniy; }

public void setOtvetstvenniy_obj( Object _otvetstvenniy){ this.otvetstvenniy=(polzovateli) _otvetstvenniy; }


@Column(name="kommentariy", columnDefinition="text")
private String kommentariy;

public void setKommentariy(String _kommentariy){ this.kommentariy=_kommentariy; }

public String getKommentariy(){ return this.kommentariy; }


@Column(name="polzovatel", columnDefinition="text")
private String polzovatel;

public void setPolzovatel(String _polzovatel){ this.polzovatel=_polzovatel; }

public String getPolzovatel(){ return this.polzovatel; }



@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@ManyToOne
@JoinColumn(name="profil", insertable = true, updatable = true)
private profili_grupp_dostupa profil;

public profili_grupp_dostupa getProfil(){ try{return this.profil;}catch(Exception ex){ return null;} }

public void setProfil( Object _profil){if (_profil instanceof String){this.profil= new profili_grupp_dostupa (_profil.toString());}else{try{this.profil= (profili_grupp_dostupa) _profil;}catch(Exception ex){Variables.logger.error(ex);this.profil= new profili_grupp_dostupa (_profil.toString());}}}

public UUID getProfil_uuid(){ try{return this.profil.getGuid();}catch(Exception ex){return null;} }

public String getProfil_type(){ try{return this.profil.getClass().getName();}catch(Exception ex){return null;} }

public profili_grupp_dostupa getProfil_obj(){ return this.profil; }

public void setProfil_obj( Object _profil){ this.profil=(profili_grupp_dostupa) _profil; }


@Column(name="osnovnaja_gruppa_dostupa_postavljaemogo_profilja")

private Boolean osnovnaja_gruppa_dostupa_postavljaemogo_profilja;
public void setOsnovnaja_gruppa_dostupa_postavljaemogo_profilja(Boolean _osnovnaja_gruppa_dostupa_postavljaemogo_profilja){ this.osnovnaja_gruppa_dostupa_postavljaemogo_profilja=_osnovnaja_gruppa_dostupa_postavljaemogo_profilja; }

public Boolean getOsnovnaja_gruppa_dostupa_postavljaemogo_profilja(){ return this.osnovnaja_gruppa_dostupa_postavljaemogo_profilja; }


}
