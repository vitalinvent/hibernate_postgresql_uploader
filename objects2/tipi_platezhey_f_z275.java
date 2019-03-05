import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="tipi_platezhey_f_z275")
public class tipi_platezhey_f_z275 implements Serializable {

public tipi_platezhey_f_z275(){}

public tipi_platezhey_f_z275(String _guid){ this.guid=UUID.fromString(_guid); }

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



@Column(name="nomer_punkta_zakona", columnDefinition="text")
private String nomer_punkta_zakona;

public void setNomer_punkta_zakona(String _nomer_punkta_zakona){ this.nomer_punkta_zakona=_nomer_punkta_zakona; }

public String getNomer_punkta_zakona(){ return this.nomer_punkta_zakona; }


@Column(name="opisanie_punkta_zakona", columnDefinition="text")
private String opisanie_punkta_zakona;

public void setOpisanie_punkta_zakona(String _opisanie_punkta_zakona){ this.opisanie_punkta_zakona=_opisanie_punkta_zakona; }

public String getOpisanie_punkta_zakona(){ return this.opisanie_punkta_zakona; }


@Column(name="ne_trebuyutsja_dokumenti_podtverzhdenija_ispolnenija_kontrakta")

private Boolean ne_trebuyutsja_dokumenti_podtverzhdenija_ispolnenija_kontrakta;
public void setNe_trebuyutsja_dokumenti_podtverzhdenija_ispolnenija_kontrakta(Boolean _ne_trebuyutsja_dokumenti_podtverzhdenija_ispolnenija_kontrakta){ this.ne_trebuyutsja_dokumenti_podtverzhdenija_ispolnenija_kontrakta=_ne_trebuyutsja_dokumenti_podtverzhdenija_ispolnenija_kontrakta; }

public Boolean getNe_trebuyutsja_dokumenti_podtverzhdenija_ispolnenija_kontrakta(){ return this.ne_trebuyutsja_dokumenti_podtverzhdenija_ispolnenija_kontrakta; }


}
