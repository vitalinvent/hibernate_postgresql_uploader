import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="roli_ispolniteley")
public class roli_ispolniteley implements Serializable {

public roli_ispolniteley(){}

public roli_ispolniteley(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="vneshnjaja_rol")

private Boolean vneshnjaja_rol;
public void setVneshnjaja_rol(Boolean _vneshnjaja_rol){ this.vneshnjaja_rol=_vneshnjaja_rol; }

public Boolean getVneshnjaja_rol(){ return this.vneshnjaja_rol; }


@Column(name="kratkoe_predstavlenie", columnDefinition="text")
private String kratkoe_predstavlenie;

public void setKratkoe_predstavlenie(String _kratkoe_predstavlenie){ this.kratkoe_predstavlenie=_kratkoe_predstavlenie; }

public String getKratkoe_predstavlenie(){ return this.kratkoe_predstavlenie; }


@Column(name="kommentariy", columnDefinition="text")
private String kommentariy;

public void setKommentariy(String _kommentariy){ this.kommentariy=_kommentariy; }

public String getKommentariy(){ return this.kommentariy; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="ispolzuetsja_s_obyektami_adresatsii")

private Boolean ispolzuetsja_s_obyektami_adresatsii;
public void setIspolzuetsja_s_obyektami_adresatsii(Boolean _ispolzuetsja_s_obyektami_adresatsii){ this.ispolzuetsja_s_obyektami_adresatsii=_ispolzuetsja_s_obyektami_adresatsii; }

public Boolean getIspolzuetsja_s_obyektami_adresatsii(){ return this.ispolzuetsja_s_obyektami_adresatsii; }


@Column(name="ispolzuetsja_bez_obyektov_adresatsii")

private Boolean ispolzuetsja_bez_obyektov_adresatsii;
public void setIspolzuetsja_bez_obyektov_adresatsii(Boolean _ispolzuetsja_bez_obyektov_adresatsii){ this.ispolzuetsja_bez_obyektov_adresatsii=_ispolzuetsja_bez_obyektov_adresatsii; }

public Boolean getIspolzuetsja_bez_obyektov_adresatsii(){ return this.ispolzuetsja_bez_obyektov_adresatsii; }



@Column(name="uzel_obmena", columnDefinition="text")
private String uzel_obmena;

public void setUzel_obmena(String _uzel_obmena){ this.uzel_obmena=_uzel_obmena; }

public String getUzel_obmena(){ return this.uzel_obmena; }


}
