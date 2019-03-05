import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="udalit_osnovanija_dosrochnogo_naznachenija_pensii_dlja_s_z_v_k")
public class udalit_osnovanija_dosrochnogo_naznachenija_pensii_dlja_s_z_v_k implements Serializable {

public udalit_osnovanija_dosrochnogo_naznachenija_pensii_dlja_s_z_v_k(){}

public udalit_osnovanija_dosrochnogo_naznachenija_pensii_dlja_s_z_v_k(String _guid){ this.guid=UUID.fromString(_guid); }

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



}
