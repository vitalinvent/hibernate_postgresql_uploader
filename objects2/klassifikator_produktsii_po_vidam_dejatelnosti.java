import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="klassifikator_produktsii_po_vidam_dejatelnosti")
public class klassifikator_produktsii_po_vidam_dejatelnosti implements Serializable {

public klassifikator_produktsii_po_vidam_dejatelnosti(){}

public klassifikator_produktsii_po_vidam_dejatelnosti(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="naimenovanie_polnoe", columnDefinition="text")
private String naimenovanie_polnoe;

public void setNaimenovanie_polnoe(String _naimenovanie_polnoe){ this.naimenovanie_polnoe=_naimenovanie_polnoe; }

public String getNaimenovanie_polnoe(){ return this.naimenovanie_polnoe; }



@ManyToOne
@JoinColumn(name="edinitsa_statisticheskogo_ucheta", insertable = true, updatable = true)
private upakovki_edinitsi_izmerenija edinitsa_statisticheskogo_ucheta;

public upakovki_edinitsi_izmerenija getEdinitsa_statisticheskogo_ucheta(){ try{return this.edinitsa_statisticheskogo_ucheta;}catch(Exception ex){ return null;} }

public void setEdinitsa_statisticheskogo_ucheta( Object _edinitsa_statisticheskogo_ucheta){if (_edinitsa_statisticheskogo_ucheta instanceof String){this.edinitsa_statisticheskogo_ucheta= new upakovki_edinitsi_izmerenija (_edinitsa_statisticheskogo_ucheta.toString());}else{try{this.edinitsa_statisticheskogo_ucheta= (upakovki_edinitsi_izmerenija) _edinitsa_statisticheskogo_ucheta;}catch(Exception ex){Variables.logger.error(ex);this.edinitsa_statisticheskogo_ucheta= new upakovki_edinitsi_izmerenija (_edinitsa_statisticheskogo_ucheta.toString());}}}

public UUID getEdinitsa_statisticheskogo_ucheta_uuid(){ try{return this.edinitsa_statisticheskogo_ucheta.getGuid();}catch(Exception ex){return null;} }

public String getEdinitsa_statisticheskogo_ucheta_type(){ try{return this.edinitsa_statisticheskogo_ucheta.getClass().getName();}catch(Exception ex){return null;} }

public upakovki_edinitsi_izmerenija getEdinitsa_statisticheskogo_ucheta_obj(){ return this.edinitsa_statisticheskogo_ucheta; }

public void setEdinitsa_statisticheskogo_ucheta_obj( Object _edinitsa_statisticheskogo_ucheta){ this.edinitsa_statisticheskogo_ucheta=(upakovki_edinitsi_izmerenija) _edinitsa_statisticheskogo_ucheta; }


}
