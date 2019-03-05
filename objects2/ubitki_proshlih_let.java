import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="ubitki_proshlih_let")
public class ubitki_proshlih_let implements Serializable {

public ubitki_proshlih_let(){}

public ubitki_proshlih_let(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="data_okonchanija_spisanija", columnDefinition="text")
private String data_okonchanija_spisanija;

public void setData_okonchanija_spisanija(String _data_okonchanija_spisanija){ this.data_okonchanija_spisanija=_data_okonchanija_spisanija; }

public String getData_okonchanija_spisanija(){ return this.data_okonchanija_spisanija; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }



@Column(name="data_nachala_spisanija", columnDefinition="text")
private String data_nachala_spisanija;

public void setData_nachala_spisanija(String _data_nachala_spisanija){ this.data_nachala_spisanija=_data_nachala_spisanija; }

public String getData_nachala_spisanija(){ return this.data_nachala_spisanija; }


}
