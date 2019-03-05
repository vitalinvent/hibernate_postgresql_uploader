import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="strani_mira")
public class strani_mira implements Serializable {

public strani_mira(){}

public strani_mira(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="kod_alfa2", columnDefinition="text")
private String kod_alfa2;

public void setKod_alfa2(String _kod_alfa2){ this.kod_alfa2=_kod_alfa2; }

public String getKod_alfa2(){ return this.kod_alfa2; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="naimenovanie_polnoe", columnDefinition="text")
private String naimenovanie_polnoe;

public void setNaimenovanie_polnoe(String _naimenovanie_polnoe){ this.naimenovanie_polnoe=_naimenovanie_polnoe; }

public String getNaimenovanie_polnoe(){ return this.naimenovanie_polnoe; }



@Column(name="kod_alfa3", columnDefinition="text")
private String kod_alfa3;

public void setKod_alfa3(String _kod_alfa3){ this.kod_alfa3=_kod_alfa3; }

public String getKod_alfa3(){ return this.kod_alfa3; }


@Column(name="uchastnik_e_a_e_s")

private Boolean uchastnik_e_a_e_s;
public void setUchastnik_e_a_e_s(Boolean _uchastnik_e_a_e_s){ this.uchastnik_e_a_e_s=_uchastnik_e_a_e_s; }

public Boolean getUchastnik_e_a_e_s(){ return this.uchastnik_e_a_e_s; }


}
