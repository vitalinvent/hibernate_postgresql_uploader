import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="identifikatori_obyektov_metadannih")
public class identifikatori_obyektov_metadannih implements Serializable {

public identifikatori_obyektov_metadannih(){}

public identifikatori_obyektov_metadannih(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="klyuch_obyekta_metadannih", columnDefinition="text")
private String klyuch_obyekta_metadannih;

public void setKlyuch_obyekta_metadannih(String _klyuch_obyekta_metadannih){ this.klyuch_obyekta_metadannih=_klyuch_obyekta_metadannih; }

public String getKlyuch_obyekta_metadannih(){ return this.klyuch_obyekta_metadannih; }


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


}
