import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="profili_grupp_dostupa")
public class profili_grupp_dostupa implements Serializable {

public profili_grupp_dostupa(){}

public profili_grupp_dostupa(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="kommentariy", columnDefinition="text")
private String kommentariy;

public void setKommentariy(String _kommentariy){ this.kommentariy=_kommentariy; }

public String getKommentariy(){ return this.kommentariy; }


@Column(name="identifikator_postavljaemih_dannih", columnDefinition="text")
private String identifikator_postavljaemih_dannih;

public void setIdentifikator_postavljaemih_dannih(String _identifikator_postavljaemih_dannih){ this.identifikator_postavljaemih_dannih=_identifikator_postavljaemih_dannih; }

public String getIdentifikator_postavljaemih_dannih(){ return this.identifikator_postavljaemih_dannih; }



@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="postavljaemiy_profil_izmenen")

private Boolean postavljaemiy_profil_izmenen;
public void setPostavljaemiy_profil_izmenen(Boolean _postavljaemiy_profil_izmenen){ this.postavljaemiy_profil_izmenen=_postavljaemiy_profil_izmenen; }

public Boolean getPostavljaemiy_profil_izmenen(){ return this.postavljaemiy_profil_izmenen; }


}
