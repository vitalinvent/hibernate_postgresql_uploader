import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="nabori_dopolnitelnih_rekvizitov_i_svedeniy")
public class nabori_dopolnitelnih_rekvizitov_i_svedeniy implements Serializable {

public nabori_dopolnitelnih_rekvizitov_i_svedeniy(){}

public nabori_dopolnitelnih_rekvizitov_i_svedeniy(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="kolichestvo_rekvizitov", columnDefinition="text")
private String kolichestvo_rekvizitov;

public void setKolichestvo_rekvizitov(String _kolichestvo_rekvizitov){ this.kolichestvo_rekvizitov=_kolichestvo_rekvizitov; }

public String getKolichestvo_rekvizitov(){ return this.kolichestvo_rekvizitov; }


@Column(name="kolichestvo_svedeniy", columnDefinition="text")
private String kolichestvo_svedeniy;

public void setKolichestvo_svedeniy(String _kolichestvo_svedeniy){ this.kolichestvo_svedeniy=_kolichestvo_svedeniy; }

public String getKolichestvo_svedeniy(){ return this.kolichestvo_svedeniy; }



@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="ispolzuetsja")

private Boolean ispolzuetsja;
public void setIspolzuetsja(Boolean _ispolzuetsja){ this.ispolzuetsja=_ispolzuetsja; }

public Boolean getIspolzuetsja(){ return this.ispolzuetsja; }


}
