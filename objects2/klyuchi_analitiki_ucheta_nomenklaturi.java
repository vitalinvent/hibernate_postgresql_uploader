import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="klyuchi_analitiki_ucheta_nomenklaturi")
public class klyuchi_analitiki_ucheta_nomenklaturi implements Serializable {

public klyuchi_analitiki_ucheta_nomenklaturi(){}

public klyuchi_analitiki_ucheta_nomenklaturi(String _guid){ this.guid=UUID.fromString(_guid); }

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
@JoinColumn(name="nomenklatura", insertable = true, updatable = true)
private nomenklatura nomenklatura;

public nomenklatura getNomenklatura(){ try{return this.nomenklatura;}catch(Exception ex){ return null;} }

public void setNomenklatura( Object _nomenklatura){if (_nomenklatura instanceof String){this.nomenklatura= new nomenklatura (_nomenklatura.toString());}else{try{this.nomenklatura= (nomenklatura) _nomenklatura;}catch(Exception ex){Variables.logger.error(ex);this.nomenklatura= new nomenklatura (_nomenklatura.toString());}}}

public UUID getNomenklatura_uuid(){ try{return this.nomenklatura.getGuid();}catch(Exception ex){return null;} }

public String getNomenklatura_type(){ try{return this.nomenklatura.getClass().getName();}catch(Exception ex){return null;} }

public nomenklatura getNomenklatura_obj(){ return this.nomenklatura; }

public void setNomenklatura_obj( Object _nomenklatura){ this.nomenklatura=(nomenklatura) _nomenklatura; }


@ManyToOne
@JoinColumn(name="naznachenie", insertable = true, updatable = true)
private naznachenija naznachenie;

public naznachenija getNaznachenie(){ try{return this.naznachenie;}catch(Exception ex){ return null;} }

public void setNaznachenie( Object _naznachenie){if (_naznachenie instanceof String){this.naznachenie= new naznachenija (_naznachenie.toString());}else{try{this.naznachenie= (naznachenija) _naznachenie;}catch(Exception ex){Variables.logger.error(ex);this.naznachenie= new naznachenija (_naznachenie.toString());}}}

public UUID getNaznachenie_uuid(){ try{return this.naznachenie.getGuid();}catch(Exception ex){return null;} }

public String getNaznachenie_type(){ try{return this.naznachenie.getClass().getName();}catch(Exception ex){return null;} }

public naznachenija getNaznachenie_obj(){ return this.naznachenie; }

public void setNaznachenie_obj( Object _naznachenie){ this.naznachenie=(naznachenija) _naznachenie; }


@ManyToOne
@JoinColumn(name="statja_kalkuljatsii", insertable = true, updatable = true)
private stati_kalkuljatsii statja_kalkuljatsii;

public stati_kalkuljatsii getStatja_kalkuljatsii(){ try{return this.statja_kalkuljatsii;}catch(Exception ex){ return null;} }

public void setStatja_kalkuljatsii( Object _statja_kalkuljatsii){if (_statja_kalkuljatsii instanceof String){this.statja_kalkuljatsii= new stati_kalkuljatsii (_statja_kalkuljatsii.toString());}else{try{this.statja_kalkuljatsii= (stati_kalkuljatsii) _statja_kalkuljatsii;}catch(Exception ex){Variables.logger.error(ex);this.statja_kalkuljatsii= new stati_kalkuljatsii (_statja_kalkuljatsii.toString());}}}

public UUID getStatja_kalkuljatsii_uuid(){ try{return this.statja_kalkuljatsii.getGuid();}catch(Exception ex){return null;} }

public String getStatja_kalkuljatsii_type(){ try{return this.statja_kalkuljatsii.getClass().getName();}catch(Exception ex){return null;} }

public stati_kalkuljatsii getStatja_kalkuljatsii_obj(){ return this.statja_kalkuljatsii; }

public void setStatja_kalkuljatsii_obj( Object _statja_kalkuljatsii){ this.statja_kalkuljatsii=(stati_kalkuljatsii) _statja_kalkuljatsii; }


@ManyToOne
@JoinColumn(name="sklad", insertable = true, updatable = true)
private skladi sklad;

public skladi getSklad(){ try{return this.sklad;}catch(Exception ex){ return null;} }

public void setSklad( Object _sklad){if (_sklad instanceof String){this.sklad= new skladi (_sklad.toString());}else{try{this.sklad= (skladi) _sklad;}catch(Exception ex){Variables.logger.error(ex);this.sklad= new skladi (_sklad.toString());}}}

public UUID getSklad_uuid(){ try{return this.sklad.getGuid();}catch(Exception ex){return null;} }

public String getSklad_type(){ try{return this.sklad.getClass().getName();}catch(Exception ex){return null;} }

public skladi getSklad_obj(){ return this.sklad; }

public void setSklad_obj( Object _sklad){ this.sklad=(skladi) _sklad; }


}
