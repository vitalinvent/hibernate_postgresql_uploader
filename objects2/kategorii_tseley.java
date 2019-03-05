import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="kategorii_tseley")
public class kategorii_tseley implements Serializable {

public kategorii_tseley(){}

public kategorii_tseley(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="rekvizit_dop_uporjadochivanija_ierarhicheskogo", columnDefinition="text")
private String rekvizit_dop_uporjadochivanija_ierarhicheskogo;

public void setRekvizit_dop_uporjadochivanija_ierarhicheskogo(String _rekvizit_dop_uporjadochivanija_ierarhicheskogo){ this.rekvizit_dop_uporjadochivanija_ierarhicheskogo=_rekvizit_dop_uporjadochivanija_ierarhicheskogo; }

public String getRekvizit_dop_uporjadochivanija_ierarhicheskogo(){ return this.rekvizit_dop_uporjadochivanija_ierarhicheskogo; }


@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }




}
