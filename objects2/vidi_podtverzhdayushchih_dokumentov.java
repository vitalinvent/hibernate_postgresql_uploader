import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="vidi_podtverzhdayushchih_dokumentov")
public class vidi_podtverzhdayushchih_dokumentov implements Serializable {

public vidi_podtverzhdayushchih_dokumentov(){}

public vidi_podtverzhdayushchih_dokumentov(String _guid){ this.guid=UUID.fromString(_guid); }

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



@Column(name="kratkoe_naimenovanie", columnDefinition="text")
private String kratkoe_naimenovanie;

public void setKratkoe_naimenovanie(String _kratkoe_naimenovanie){ this.kratkoe_naimenovanie=_kratkoe_naimenovanie; }

public String getKratkoe_naimenovanie(){ return this.kratkoe_naimenovanie; }


@Column(name="podtverzhdaet_ispolnenie_kontrakta")

private Boolean podtverzhdaet_ispolnenie_kontrakta;
public void setPodtverzhdaet_ispolnenie_kontrakta(Boolean _podtverzhdaet_ispolnenie_kontrakta){ this.podtverzhdaet_ispolnenie_kontrakta=_podtverzhdaet_ispolnenie_kontrakta; }

public Boolean getPodtverzhdaet_ispolnenie_kontrakta(){ return this.podtverzhdaet_ispolnenie_kontrakta; }


}
