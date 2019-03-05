import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="polnie_puti_k_formam")
public class polnie_puti_k_formam implements Serializable {

public polnie_puti_k_formam(){}

public polnie_puti_k_formam(String _guid){ this.guid=UUID.fromString(_guid); }

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



@Column(name="hesh", columnDefinition="text")
private String hesh;

public void setHesh(String _hesh){ this.hesh=_hesh; }

public String getHesh(){ return this.hesh; }


@Column(name="polniy_put_k_forme", columnDefinition="text")
private String polniy_put_k_forme;

public void setPolniy_put_k_forme(String _polniy_put_k_forme){ this.polniy_put_k_forme=_polniy_put_k_forme; }

public String getPolniy_put_k_forme(){ return this.polniy_put_k_forme; }


}
