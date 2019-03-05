import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="vidi_registrov_ucheta")
public class vidi_registrov_ucheta implements Serializable {

public vidi_registrov_ucheta(){}

public vidi_registrov_ucheta(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="otchet", columnDefinition="text")
private String otchet;

public void setOtchet(String _otchet){ this.otchet=_otchet; }

public String getOtchet(){ return this.otchet; }


@Column(name="variant_otcheta", columnDefinition="text")
private String variant_otcheta;

public void setVariant_otcheta(String _variant_otcheta){ this.variant_otcheta=_variant_otcheta; }

public String getVariant_otcheta(){ return this.variant_otcheta; }


}
