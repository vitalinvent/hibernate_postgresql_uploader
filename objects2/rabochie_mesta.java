import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="rabochie_mesta")
public class rabochie_mesta implements Serializable {

public rabochie_mesta(){}

public rabochie_mesta(String _guid){ this.guid=UUID.fromString(_guid); }

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



@Column(name="imja_kompyutera", columnDefinition="text")
private String imja_kompyutera;

public void setImja_kompyutera(String _imja_kompyutera){ this.imja_kompyutera=_imja_kompyutera; }

public String getImja_kompyutera(){ return this.imja_kompyutera; }


}
