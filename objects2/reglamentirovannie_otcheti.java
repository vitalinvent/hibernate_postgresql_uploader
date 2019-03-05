import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="reglamentirovannie_otcheti")
public class reglamentirovannie_otcheti implements Serializable {

public reglamentirovannie_otcheti(){}

public reglamentirovannie_otcheti(String _guid){ this.guid=UUID.fromString(_guid); }

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



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="periodi", columnDefinition="text")
private String periodi;

public void setPeriodi(String _periodi){ this.periodi=_periodi; }

public String getPeriodi(){ return this.periodi; }


@Column(name="istochnik_otcheta", columnDefinition="text")
private String istochnik_otcheta;

public void setIstochnik_otcheta(String _istochnik_otcheta){ this.istochnik_otcheta=_istochnik_otcheta; }

public String getIstochnik_otcheta(){ return this.istochnik_otcheta; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="vneshniy_otchet_ispolzovat")

private Boolean vneshniy_otchet_ispolzovat;
public void setVneshniy_otchet_ispolzovat(Boolean _vneshniy_otchet_ispolzovat){ this.vneshniy_otchet_ispolzovat=_vneshniy_otchet_ispolzovat; }

public Boolean getVneshniy_otchet_ispolzovat(){ return this.vneshniy_otchet_ispolzovat; }


@Column(name="vneshniy_otchet_hranilishche", columnDefinition="text")
private String vneshniy_otchet_hranilishche;

public void setVneshniy_otchet_hranilishche(String _vneshniy_otchet_hranilishche){ this.vneshniy_otchet_hranilishche=_vneshniy_otchet_hranilishche; }

public String getVneshniy_otchet_hranilishche(){ return this.vneshniy_otchet_hranilishche; }


@Column(name="vneshniy_otchet_versija", columnDefinition="text")
private String vneshniy_otchet_versija;

public void setVneshniy_otchet_versija(String _vneshniy_otchet_versija){ this.vneshniy_otchet_versija=_vneshniy_otchet_versija; }

public String getVneshniy_otchet_versija(){ return this.vneshniy_otchet_versija; }


@Column(name="u_i_d_otcheta", columnDefinition="text")
private String u_i_d_otcheta;

public void setU_i_d_otcheta(String _u_i_d_otcheta){ this.u_i_d_otcheta=_u_i_d_otcheta; }

public String getU_i_d_otcheta(){ return this.u_i_d_otcheta; }


}
