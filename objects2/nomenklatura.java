import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="nomenklatura")
public class nomenklatura implements Serializable {

public nomenklatura(){}

public nomenklatura(String _guid){ this.guid=UUID.fromString(_guid); }

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
@JoinColumn(name="vid_nomenklaturi", insertable = true, updatable = true)
private vidi_nomenklaturi vid_nomenklaturi;

public vidi_nomenklaturi getVid_nomenklaturi(){ try{return this.vid_nomenklaturi;}catch(Exception ex){ return null;} }

public void setVid_nomenklaturi( Object _vid_nomenklaturi){if (_vid_nomenklaturi instanceof String){this.vid_nomenklaturi= new vidi_nomenklaturi (_vid_nomenklaturi.toString());}else{try{this.vid_nomenklaturi= (vidi_nomenklaturi) _vid_nomenklaturi;}catch(Exception ex){Variables.logger.error(ex);this.vid_nomenklaturi= new vidi_nomenklaturi (_vid_nomenklaturi.toString());}}}

public UUID getVid_nomenklaturi_uuid(){ try{return this.vid_nomenklaturi.getGuid();}catch(Exception ex){return null;} }

public String getVid_nomenklaturi_type(){ try{return this.vid_nomenklaturi.getClass().getName();}catch(Exception ex){return null;} }

public vidi_nomenklaturi getVid_nomenklaturi_obj(){ return this.vid_nomenklaturi; }

public void setVid_nomenklaturi_obj( Object _vid_nomenklaturi){ this.vid_nomenklaturi=(vidi_nomenklaturi) _vid_nomenklaturi; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



}
