import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="razrjadi_kategorii_dolzhnostey")
public class razrjadi_kategorii_dolzhnostey implements Serializable {

public razrjadi_kategorii_dolzhnostey(){}

public razrjadi_kategorii_dolzhnostey(String _guid){ this.guid=UUID.fromString(_guid); }

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



@Column(name="naimenovanie_polnoe", columnDefinition="text")
private String naimenovanie_polnoe;

public void setNaimenovanie_polnoe(String _naimenovanie_polnoe){ this.naimenovanie_polnoe=_naimenovanie_polnoe; }

public String getNaimenovanie_polnoe(){ return this.naimenovanie_polnoe; }



}
