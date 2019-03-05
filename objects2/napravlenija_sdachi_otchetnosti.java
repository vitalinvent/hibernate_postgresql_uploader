import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="napravlenija_sdachi_otchetnosti")
public class napravlenija_sdachi_otchetnosti implements Serializable {

public napravlenija_sdachi_otchetnosti(){}

public napravlenija_sdachi_otchetnosti(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="data_aktualizatsii", columnDefinition="text")
private String data_aktualizatsii;

public void setData_aktualizatsii(String _data_aktualizatsii){ this.data_aktualizatsii=_data_aktualizatsii; }

public String getData_aktualizatsii(){ return this.data_aktualizatsii; }



@Column(name="organizatsija", columnDefinition="text")
private String organizatsija;

public void setOrganizatsija(String _organizatsija){ this.organizatsija=_organizatsija; }

public String getOrganizatsija(){ return this.organizatsija; }


@Column(name="napravlenie", columnDefinition="text")
private String napravlenie;

public void setNapravlenie(String _napravlenie){ this.napravlenie=_napravlenie; }

public String getNapravlenie(){ return this.napravlenie; }


}
