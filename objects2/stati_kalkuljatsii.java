import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="stati_kalkuljatsii")
public class stati_kalkuljatsii implements Serializable {

public stati_kalkuljatsii(){}

public stati_kalkuljatsii(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }



@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="udalit_predopredelennaja_statja_materialov")

private Boolean udalit_predopredelennaja_statja_materialov;
public void setUdalit_predopredelennaja_statja_materialov(Boolean _udalit_predopredelennaja_statja_materialov){ this.udalit_predopredelennaja_statja_materialov=_udalit_predopredelennaja_statja_materialov; }

public Boolean getUdalit_predopredelennaja_statja_materialov(){ return this.udalit_predopredelennaja_statja_materialov; }


@Column(name="identifikator", columnDefinition="text")
private String identifikator;

public void setIdentifikator(String _identifikator){ this.identifikator=_identifikator; }

public String getIdentifikator(){ return this.identifikator; }


@Column(name="udalit_predopredelennaja_statja_vozvratnih_othodov")

private Boolean udalit_predopredelennaja_statja_vozvratnih_othodov;
public void setUdalit_predopredelennaja_statja_vozvratnih_othodov(Boolean _udalit_predopredelennaja_statja_vozvratnih_othodov){ this.udalit_predopredelennaja_statja_vozvratnih_othodov=_udalit_predopredelennaja_statja_vozvratnih_othodov; }

public Boolean getUdalit_predopredelennaja_statja_vozvratnih_othodov(){ return this.udalit_predopredelennaja_statja_vozvratnih_othodov; }


}
