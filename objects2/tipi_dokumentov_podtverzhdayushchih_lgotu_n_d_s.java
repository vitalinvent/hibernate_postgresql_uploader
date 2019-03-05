import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="tipi_dokumentov_podtverzhdayushchih_lgotu_n_d_s")
public class tipi_dokumentov_podtverzhdayushchih_lgotu_n_d_s implements Serializable {

public tipi_dokumentov_podtverzhdayushchih_lgotu_n_d_s(){}

public tipi_dokumentov_podtverzhdayushchih_lgotu_n_d_s(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="polnoe_naimenovanie", columnDefinition="text")
private String polnoe_naimenovanie;

public void setPolnoe_naimenovanie(String _polnoe_naimenovanie){ this.polnoe_naimenovanie=_polnoe_naimenovanie; }

public String getPolnoe_naimenovanie(){ return this.polnoe_naimenovanie; }



}
