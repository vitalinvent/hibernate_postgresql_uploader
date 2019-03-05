import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="nabori_upakovok")
public class nabori_upakovok implements Serializable {

public nabori_upakovok(){}

public nabori_upakovok(String _guid){ this.guid=UUID.fromString(_guid); }

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


@ManyToOne
@JoinColumn(name="edinitsa_izmerenija", insertable = true, updatable = true)
private upakovki_edinitsi_izmerenija edinitsa_izmerenija;

public upakovki_edinitsi_izmerenija getEdinitsa_izmerenija(){ try{return this.edinitsa_izmerenija;}catch(Exception ex){ return null;} }

public void setEdinitsa_izmerenija( Object _edinitsa_izmerenija){if (_edinitsa_izmerenija instanceof String){this.edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_edinitsa_izmerenija.toString());}else{try{this.edinitsa_izmerenija= (upakovki_edinitsi_izmerenija) _edinitsa_izmerenija;}catch(Exception ex){Variables.logger.error(ex);this.edinitsa_izmerenija= new upakovki_edinitsi_izmerenija (_edinitsa_izmerenija.toString());}}}

public UUID getEdinitsa_izmerenija_uuid(){ try{return this.edinitsa_izmerenija.getGuid();}catch(Exception ex){return null;} }

public String getEdinitsa_izmerenija_type(){ try{return this.edinitsa_izmerenija.getClass().getName();}catch(Exception ex){return null;} }

public upakovki_edinitsi_izmerenija getEdinitsa_izmerenija_obj(){ return this.edinitsa_izmerenija; }

public void setEdinitsa_izmerenija_obj( Object _edinitsa_izmerenija){ this.edinitsa_izmerenija=(upakovki_edinitsi_izmerenija) _edinitsa_izmerenija; }



@ManyToOne
@JoinColumn(name="edinitsa_dlja_otchetov", insertable = true, updatable = true)
private upakovki_edinitsi_izmerenija edinitsa_dlja_otchetov;

public upakovki_edinitsi_izmerenija getEdinitsa_dlja_otchetov(){ try{return this.edinitsa_dlja_otchetov;}catch(Exception ex){ return null;} }

public void setEdinitsa_dlja_otchetov( Object _edinitsa_dlja_otchetov){if (_edinitsa_dlja_otchetov instanceof String){this.edinitsa_dlja_otchetov= new upakovki_edinitsi_izmerenija (_edinitsa_dlja_otchetov.toString());}else{try{this.edinitsa_dlja_otchetov= (upakovki_edinitsi_izmerenija) _edinitsa_dlja_otchetov;}catch(Exception ex){Variables.logger.error(ex);this.edinitsa_dlja_otchetov= new upakovki_edinitsi_izmerenija (_edinitsa_dlja_otchetov.toString());}}}

public UUID getEdinitsa_dlja_otchetov_uuid(){ try{return this.edinitsa_dlja_otchetov.getGuid();}catch(Exception ex){return null;} }

public String getEdinitsa_dlja_otchetov_type(){ try{return this.edinitsa_dlja_otchetov.getClass().getName();}catch(Exception ex){return null;} }

public upakovki_edinitsi_izmerenija getEdinitsa_dlja_otchetov_obj(){ return this.edinitsa_dlja_otchetov; }

public void setEdinitsa_dlja_otchetov_obj( Object _edinitsa_dlja_otchetov){ this.edinitsa_dlja_otchetov=(upakovki_edinitsi_izmerenija) _edinitsa_dlja_otchetov; }


@Column(name="koeffitsient_edinitsi_dlja_otchetov")

private Float koeffitsient_edinitsi_dlja_otchetov;
public void setKoeffitsient_edinitsi_dlja_otchetov(Float _koeffitsient_edinitsi_dlja_otchetov){ this.koeffitsient_edinitsi_dlja_otchetov=_koeffitsient_edinitsi_dlja_otchetov; }

public Float getKoeffitsient_edinitsi_dlja_otchetov(){ return this.koeffitsient_edinitsi_dlja_otchetov; }


}
