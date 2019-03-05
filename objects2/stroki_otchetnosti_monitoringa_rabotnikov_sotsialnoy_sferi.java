import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="stroki_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi")
public class stroki_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi implements Serializable {

public stroki_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi(){}

public stroki_otchetnosti_monitoringa_rabotnikov_sotsialnoy_sferi(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="pojasnenie", columnDefinition="text")
private String pojasnenie;

public void setPojasnenie(String _pojasnenie){ this.pojasnenie=_pojasnenie; }

public String getPojasnenie(){ return this.pojasnenie; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="kod_kategorii_personala", columnDefinition="text")
private String kod_kategorii_personala;

public void setKod_kategorii_personala(String _kod_kategorii_personala){ this.kod_kategorii_personala=_kod_kategorii_personala; }

public String getKod_kategorii_personala(){ return this.kod_kategorii_personala; }



}
