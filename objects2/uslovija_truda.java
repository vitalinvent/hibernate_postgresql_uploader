import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="uslovija_truda")
public class uslovija_truda implements Serializable {

public uslovija_truda(){}

public uslovija_truda(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }



@Column(name="kod_dlja_otchetnosti2010", columnDefinition="text")
private String kod_dlja_otchetnosti2010;

public void setKod_dlja_otchetnosti2010(String _kod_dlja_otchetnosti2010){ this.kod_dlja_otchetnosti2010=_kod_dlja_otchetnosti2010; }

public String getKod_dlja_otchetnosti2010(){ return this.kod_dlja_otchetnosti2010; }


@Column(name="kod_dlja_otchetnosti2002", columnDefinition="text")
private String kod_dlja_otchetnosti2002;

public void setKod_dlja_otchetnosti2002(String _kod_dlja_otchetnosti2002){ this.kod_dlja_otchetnosti2002=_kod_dlja_otchetnosti2002; }

public String getKod_dlja_otchetnosti2002(){ return this.kod_dlja_otchetnosti2002; }


@Column(name="kod_dlja_otchetnosti2015", columnDefinition="text")
private String kod_dlja_otchetnosti2015;

public void setKod_dlja_otchetnosti2015(String _kod_dlja_otchetnosti2015){ this.kod_dlja_otchetnosti2015=_kod_dlja_otchetnosti2015; }

public String getKod_dlja_otchetnosti2015(){ return this.kod_dlja_otchetnosti2015; }


@ManyToOne
@JoinColumn(name="osnovanie_dosrochnogo_naznachenija_pensii", insertable = true, updatable = true)
private osnovanija_dosrochnogo_naznachenija_pensii osnovanie_dosrochnogo_naznachenija_pensii;

public osnovanija_dosrochnogo_naznachenija_pensii getOsnovanie_dosrochnogo_naznachenija_pensii(){ try{return this.osnovanie_dosrochnogo_naznachenija_pensii;}catch(Exception ex){ return null;} }

public void setOsnovanie_dosrochnogo_naznachenija_pensii( Object _osnovanie_dosrochnogo_naznachenija_pensii){if (_osnovanie_dosrochnogo_naznachenija_pensii instanceof String){this.osnovanie_dosrochnogo_naznachenija_pensii= new osnovanija_dosrochnogo_naznachenija_pensii (_osnovanie_dosrochnogo_naznachenija_pensii.toString());}else{try{this.osnovanie_dosrochnogo_naznachenija_pensii= (osnovanija_dosrochnogo_naznachenija_pensii) _osnovanie_dosrochnogo_naznachenija_pensii;}catch(Exception ex){Variables.logger.error(ex);this.osnovanie_dosrochnogo_naznachenija_pensii= new osnovanija_dosrochnogo_naznachenija_pensii (_osnovanie_dosrochnogo_naznachenija_pensii.toString());}}}

public UUID getOsnovanie_dosrochnogo_naznachenija_pensii_uuid(){ try{return this.osnovanie_dosrochnogo_naznachenija_pensii.getGuid();}catch(Exception ex){return null;} }

public String getOsnovanie_dosrochnogo_naznachenija_pensii_type(){ try{return this.osnovanie_dosrochnogo_naznachenija_pensii.getClass().getName();}catch(Exception ex){return null;} }

public osnovanija_dosrochnogo_naznachenija_pensii getOsnovanie_dosrochnogo_naznachenija_pensii_obj(){ return this.osnovanie_dosrochnogo_naznachenija_pensii; }

public void setOsnovanie_dosrochnogo_naznachenija_pensii_obj( Object _osnovanie_dosrochnogo_naznachenija_pensii){ this.osnovanie_dosrochnogo_naznachenija_pensii=(osnovanija_dosrochnogo_naznachenija_pensii) _osnovanie_dosrochnogo_naznachenija_pensii; }


@ManyToOne
@JoinColumn(name="osobie_uslovija_truda_p_f_r", insertable = true, updatable = true)
private osobie_uslovija_truda_p_f_r osobie_uslovija_truda_p_f_r;

public osobie_uslovija_truda_p_f_r getOsobie_uslovija_truda_p_f_r(){ try{return this.osobie_uslovija_truda_p_f_r;}catch(Exception ex){ return null;} }

public void setOsobie_uslovija_truda_p_f_r( Object _osobie_uslovija_truda_p_f_r){if (_osobie_uslovija_truda_p_f_r instanceof String){this.osobie_uslovija_truda_p_f_r= new osobie_uslovija_truda_p_f_r (_osobie_uslovija_truda_p_f_r.toString());}else{try{this.osobie_uslovija_truda_p_f_r= (osobie_uslovija_truda_p_f_r) _osobie_uslovija_truda_p_f_r;}catch(Exception ex){Variables.logger.error(ex);this.osobie_uslovija_truda_p_f_r= new osobie_uslovija_truda_p_f_r (_osobie_uslovija_truda_p_f_r.toString());}}}

public UUID getOsobie_uslovija_truda_p_f_r_uuid(){ try{return this.osobie_uslovija_truda_p_f_r.getGuid();}catch(Exception ex){return null;} }

public String getOsobie_uslovija_truda_p_f_r_type(){ try{return this.osobie_uslovija_truda_p_f_r.getClass().getName();}catch(Exception ex){return null;} }

public osobie_uslovija_truda_p_f_r getOsobie_uslovija_truda_p_f_r_obj(){ return this.osobie_uslovija_truda_p_f_r; }

public void setOsobie_uslovija_truda_p_f_r_obj( Object _osobie_uslovija_truda_p_f_r){ this.osobie_uslovija_truda_p_f_r=(osobie_uslovija_truda_p_f_r) _osobie_uslovija_truda_p_f_r; }


@Column(name="viplachivaetsja_nadbavka_za_vrednost")

private Boolean viplachivaetsja_nadbavka_za_vrednost;
public void setViplachivaetsja_nadbavka_za_vrednost(Boolean _viplachivaetsja_nadbavka_za_vrednost){ this.viplachivaetsja_nadbavka_za_vrednost=_viplachivaetsja_nadbavka_za_vrednost; }

public Boolean getViplachivaetsja_nadbavka_za_vrednost(){ return this.viplachivaetsja_nadbavka_za_vrednost; }


@Column(name="protsent_nadbavki_za_vrednost")

private Float protsent_nadbavki_za_vrednost;
public void setProtsent_nadbavki_za_vrednost(Float _protsent_nadbavki_za_vrednost){ this.protsent_nadbavki_za_vrednost=_protsent_nadbavki_za_vrednost; }

public Float getProtsent_nadbavki_za_vrednost(){ return this.protsent_nadbavki_za_vrednost; }


@Column(name="kolichestvo_dney_dopolnitelnogo_otpuska_v_god")

private Float kolichestvo_dney_dopolnitelnogo_otpuska_v_god;
public void setKolichestvo_dney_dopolnitelnogo_otpuska_v_god(Float _kolichestvo_dney_dopolnitelnogo_otpuska_v_god){ this.kolichestvo_dney_dopolnitelnogo_otpuska_v_god=_kolichestvo_dney_dopolnitelnogo_otpuska_v_god; }

public Float getKolichestvo_dney_dopolnitelnogo_otpuska_v_god(){ return this.kolichestvo_dney_dopolnitelnogo_otpuska_v_god; }


}
