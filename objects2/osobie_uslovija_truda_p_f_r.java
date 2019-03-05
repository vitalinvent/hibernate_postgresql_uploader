import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="osobie_uslovija_truda_p_f_r")
public class osobie_uslovija_truda_p_f_r implements Serializable {

public osobie_uslovija_truda_p_f_r(){}

public osobie_uslovija_truda_p_f_r(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="kod_dlja_otchetnosti2010", columnDefinition="text")
private String kod_dlja_otchetnosti2010;

public void setKod_dlja_otchetnosti2010(String _kod_dlja_otchetnosti2010){ this.kod_dlja_otchetnosti2010=_kod_dlja_otchetnosti2010; }

public String getKod_dlja_otchetnosti2010(){ return this.kod_dlja_otchetnosti2010; }



@Column(name="kod_dlja_otchetnosti2002", columnDefinition="text")
private String kod_dlja_otchetnosti2002;

public void setKod_dlja_otchetnosti2002(String _kod_dlja_otchetnosti2002){ this.kod_dlja_otchetnosti2002=_kod_dlja_otchetnosti2002; }

public String getKod_dlja_otchetnosti2002(){ return this.kod_dlja_otchetnosti2002; }


@Column(name="kod_dlja_otchetnosti2015", columnDefinition="text")
private String kod_dlja_otchetnosti2015;

public void setKod_dlja_otchetnosti2015(String _kod_dlja_otchetnosti2015){ this.kod_dlja_otchetnosti2015=_kod_dlja_otchetnosti2015; }

public String getKod_dlja_otchetnosti2015(){ return this.kod_dlja_otchetnosti2015; }


}
