import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="udalit_vidi_otpravljaemih_dokumentov")
public class udalit_vidi_otpravljaemih_dokumentov implements Serializable {

public udalit_vidi_otpravljaemih_dokumentov(){}

public udalit_vidi_otpravljaemih_dokumentov(String _guid){ this.guid=UUID.fromString(_guid); }

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



@Column(name="tip_dokumenta", columnDefinition="text")
private String tip_dokumenta;

public void setTip_dokumenta(String _tip_dokumenta){ this.tip_dokumenta=_tip_dokumenta; }

public String getTip_dokumenta(){ return this.tip_dokumenta; }


@Column(name="tip_poluchatelja", columnDefinition="text")
private String tip_poluchatelja;

public void setTip_poluchatelja(String _tip_poluchatelja){ this.tip_poluchatelja=_tip_poluchatelja; }

public String getTip_poluchatelja(){ return this.tip_poluchatelja; }


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="istochnik", columnDefinition="text")
private String istochnik;

public void setIstochnik(String _istochnik){ this.istochnik=_istochnik; }

public String getIstochnik(){ return this.istochnik; }


}
