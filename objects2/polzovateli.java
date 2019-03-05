import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="polzovateli")
public class polzovateli implements Serializable {

public polzovateli(){}

public polzovateli(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="nedeystvitelen")

private Boolean nedeystvitelen;
public void setNedeystvitelen(Boolean _nedeystvitelen){ this.nedeystvitelen=_nedeystvitelen; }

public Boolean getNedeystvitelen(){ return this.nedeystvitelen; }



@Column(name="svoystva_polzovatelja_i_b", columnDefinition="text")
private String svoystva_polzovatelja_i_b;

public void setSvoystva_polzovatelja_i_b(String _svoystva_polzovatelja_i_b){ this.svoystva_polzovatelja_i_b=_svoystva_polzovatelja_i_b; }

public String getSvoystva_polzovatelja_i_b(){ return this.svoystva_polzovatelja_i_b; }


}
