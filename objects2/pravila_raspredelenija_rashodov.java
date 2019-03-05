import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="pravila_raspredelenija_rashodov")
public class pravila_raspredelenija_rashodov implements Serializable {

public pravila_raspredelenija_rashodov(){}

public pravila_raspredelenija_rashodov(String _guid){ this.guid=UUID.fromString(_guid); }

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



@Column(name="predstavlenie_pravila", columnDefinition="text")
private String predstavlenie_pravila;

public void setPredstavlenie_pravila(String _predstavlenie_pravila){ this.predstavlenie_pravila=_predstavlenie_pravila; }

public String getPredstavlenie_pravila(){ return this.predstavlenie_pravila; }


@ManyToOne
@JoinColumn(name="statja_kalkuljatsii", insertable = true, updatable = true)
private stati_kalkuljatsii statja_kalkuljatsii;

public stati_kalkuljatsii getStatja_kalkuljatsii(){ try{return this.statja_kalkuljatsii;}catch(Exception ex){ return null;} }

public void setStatja_kalkuljatsii( Object _statja_kalkuljatsii){if (_statja_kalkuljatsii instanceof String){this.statja_kalkuljatsii= new stati_kalkuljatsii (_statja_kalkuljatsii.toString());}else{try{this.statja_kalkuljatsii= (stati_kalkuljatsii) _statja_kalkuljatsii;}catch(Exception ex){Variables.logger.error(ex);this.statja_kalkuljatsii= new stati_kalkuljatsii (_statja_kalkuljatsii.toString());}}}

public UUID getStatja_kalkuljatsii_uuid(){ try{return this.statja_kalkuljatsii.getGuid();}catch(Exception ex){return null;} }

public String getStatja_kalkuljatsii_type(){ try{return this.statja_kalkuljatsii.getClass().getName();}catch(Exception ex){return null;} }

public stati_kalkuljatsii getStatja_kalkuljatsii_obj(){ return this.statja_kalkuljatsii; }

public void setStatja_kalkuljatsii_obj( Object _statja_kalkuljatsii){ this.statja_kalkuljatsii=(stati_kalkuljatsii) _statja_kalkuljatsii; }


}
