import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="udalit_vidi_obyektov_e_g_a_i_s")
public class udalit_vidi_obyektov_e_g_a_i_s implements Serializable {

public udalit_vidi_obyektov_e_g_a_i_s(){}

public udalit_vidi_obyektov_e_g_a_i_s(String _guid){ this.guid=UUID.fromString(_guid); }

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



@Column(name="prostranstvo_imen", columnDefinition="text")
private String prostranstvo_imen;

public void setProstranstvo_imen(String _prostranstvo_imen){ this.prostranstvo_imen=_prostranstvo_imen; }

public String getProstranstvo_imen(){ return this.prostranstvo_imen; }


@Column(name="put_na_servere", columnDefinition="text")
private String put_na_servere;

public void setPut_na_servere(String _put_na_servere){ this.put_na_servere=_put_na_servere; }

public String getPut_na_servere(){ return this.put_na_servere; }


@Column(name="prefiks_prostranstva_imen", columnDefinition="text")
private String prefiks_prostranstva_imen;

public void setPrefiks_prostranstva_imen(String _prefiks_prostranstva_imen){ this.prefiks_prostranstva_imen=_prefiks_prostranstva_imen; }

public String getPrefiks_prostranstva_imen(){ return this.prefiks_prostranstva_imen; }


}
