import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="vidi_prochih_dohodov_fizicheskih_lits")
public class vidi_prochih_dohodov_fizicheskih_lits implements Serializable {

public vidi_prochih_dohodov_fizicheskih_lits(){}

public vidi_prochih_dohodov_fizicheskih_lits(String _guid){ this.guid=UUID.fromString(_guid); }

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
@JoinColumn(name="kod_dohoda_strahovie_vznosi", insertable = true, updatable = true)
private vidi_dohodov_po_strahovim_vznosam kod_dohoda_strahovie_vznosi;

public vidi_dohodov_po_strahovim_vznosam getKod_dohoda_strahovie_vznosi(){ try{return this.kod_dohoda_strahovie_vznosi;}catch(Exception ex){ return null;} }

public void setKod_dohoda_strahovie_vznosi( Object _kod_dohoda_strahovie_vznosi){if (_kod_dohoda_strahovie_vznosi instanceof String){this.kod_dohoda_strahovie_vznosi= new vidi_dohodov_po_strahovim_vznosam (_kod_dohoda_strahovie_vznosi.toString());}else{try{this.kod_dohoda_strahovie_vznosi= (vidi_dohodov_po_strahovim_vznosam) _kod_dohoda_strahovie_vznosi;}catch(Exception ex){Variables.logger.error(ex);this.kod_dohoda_strahovie_vznosi= new vidi_dohodov_po_strahovim_vznosam (_kod_dohoda_strahovie_vznosi.toString());}}}

public UUID getKod_dohoda_strahovie_vznosi_uuid(){ try{return this.kod_dohoda_strahovie_vznosi.getGuid();}catch(Exception ex){return null;} }

public String getKod_dohoda_strahovie_vznosi_type(){ try{return this.kod_dohoda_strahovie_vznosi.getClass().getName();}catch(Exception ex){return null;} }

public vidi_dohodov_po_strahovim_vznosam getKod_dohoda_strahovie_vznosi_obj(){ return this.kod_dohoda_strahovie_vznosi; }

public void setKod_dohoda_strahovie_vznosi_obj( Object _kod_dohoda_strahovie_vznosi){ this.kod_dohoda_strahovie_vznosi=(vidi_dohodov_po_strahovim_vznosam) _kod_dohoda_strahovie_vznosi; }


@ManyToOne
@JoinColumn(name="udalit_kod_dohoda_n_d_f_l", insertable = true, updatable = true)
private udalit_vidi_dohodov_n_d_f_l udalit_kod_dohoda_n_d_f_l;

public udalit_vidi_dohodov_n_d_f_l getUdalit_kod_dohoda_n_d_f_l(){ try{return this.udalit_kod_dohoda_n_d_f_l;}catch(Exception ex){ return null;} }

public void setUdalit_kod_dohoda_n_d_f_l( Object _udalit_kod_dohoda_n_d_f_l){if (_udalit_kod_dohoda_n_d_f_l instanceof String){this.udalit_kod_dohoda_n_d_f_l= new udalit_vidi_dohodov_n_d_f_l (_udalit_kod_dohoda_n_d_f_l.toString());}else{try{this.udalit_kod_dohoda_n_d_f_l= (udalit_vidi_dohodov_n_d_f_l) _udalit_kod_dohoda_n_d_f_l;}catch(Exception ex){Variables.logger.error(ex);this.udalit_kod_dohoda_n_d_f_l= new udalit_vidi_dohodov_n_d_f_l (_udalit_kod_dohoda_n_d_f_l.toString());}}}

public UUID getUdalit_kod_dohoda_n_d_f_l_uuid(){ try{return this.udalit_kod_dohoda_n_d_f_l.getGuid();}catch(Exception ex){return null;} }

public String getUdalit_kod_dohoda_n_d_f_l_type(){ try{return this.udalit_kod_dohoda_n_d_f_l.getClass().getName();}catch(Exception ex){return null;} }

public udalit_vidi_dohodov_n_d_f_l getUdalit_kod_dohoda_n_d_f_l_obj(){ return this.udalit_kod_dohoda_n_d_f_l; }

public void setUdalit_kod_dohoda_n_d_f_l_obj( Object _udalit_kod_dohoda_n_d_f_l){ this.udalit_kod_dohoda_n_d_f_l=(udalit_vidi_dohodov_n_d_f_l) _udalit_kod_dohoda_n_d_f_l; }



@ManyToOne
@JoinColumn(name="udalit_kod_dohoda_strahovie_vznosi", insertable = true, updatable = true)
private udalit_vidi_dohodov_po_strahovim_vznosam udalit_kod_dohoda_strahovie_vznosi;

public udalit_vidi_dohodov_po_strahovim_vznosam getUdalit_kod_dohoda_strahovie_vznosi(){ try{return this.udalit_kod_dohoda_strahovie_vznosi;}catch(Exception ex){ return null;} }

public void setUdalit_kod_dohoda_strahovie_vznosi( Object _udalit_kod_dohoda_strahovie_vznosi){if (_udalit_kod_dohoda_strahovie_vznosi instanceof String){this.udalit_kod_dohoda_strahovie_vznosi= new udalit_vidi_dohodov_po_strahovim_vznosam (_udalit_kod_dohoda_strahovie_vznosi.toString());}else{try{this.udalit_kod_dohoda_strahovie_vznosi= (udalit_vidi_dohodov_po_strahovim_vznosam) _udalit_kod_dohoda_strahovie_vznosi;}catch(Exception ex){Variables.logger.error(ex);this.udalit_kod_dohoda_strahovie_vznosi= new udalit_vidi_dohodov_po_strahovim_vznosam (_udalit_kod_dohoda_strahovie_vznosi.toString());}}}

public UUID getUdalit_kod_dohoda_strahovie_vznosi_uuid(){ try{return this.udalit_kod_dohoda_strahovie_vznosi.getGuid();}catch(Exception ex){return null;} }

public String getUdalit_kod_dohoda_strahovie_vznosi_type(){ try{return this.udalit_kod_dohoda_strahovie_vznosi.getClass().getName();}catch(Exception ex){return null;} }

public udalit_vidi_dohodov_po_strahovim_vznosam getUdalit_kod_dohoda_strahovie_vznosi_obj(){ return this.udalit_kod_dohoda_strahovie_vznosi; }

public void setUdalit_kod_dohoda_strahovie_vznosi_obj( Object _udalit_kod_dohoda_strahovie_vznosi){ this.udalit_kod_dohoda_strahovie_vznosi=(udalit_vidi_dohodov_po_strahovim_vznosam) _udalit_kod_dohoda_strahovie_vznosi; }


@ManyToOne
@JoinColumn(name="kod_dohoda_n_d_f_l", insertable = true, updatable = true)
private vidi_dohodov_n_d_f_l kod_dohoda_n_d_f_l;

public vidi_dohodov_n_d_f_l getKod_dohoda_n_d_f_l(){ try{return this.kod_dohoda_n_d_f_l;}catch(Exception ex){ return null;} }

public void setKod_dohoda_n_d_f_l( Object _kod_dohoda_n_d_f_l){if (_kod_dohoda_n_d_f_l instanceof String){this.kod_dohoda_n_d_f_l= new vidi_dohodov_n_d_f_l (_kod_dohoda_n_d_f_l.toString());}else{try{this.kod_dohoda_n_d_f_l= (vidi_dohodov_n_d_f_l) _kod_dohoda_n_d_f_l;}catch(Exception ex){Variables.logger.error(ex);this.kod_dohoda_n_d_f_l= new vidi_dohodov_n_d_f_l (_kod_dohoda_n_d_f_l.toString());}}}

public UUID getKod_dohoda_n_d_f_l_uuid(){ try{return this.kod_dohoda_n_d_f_l.getGuid();}catch(Exception ex){return null;} }

public String getKod_dohoda_n_d_f_l_type(){ try{return this.kod_dohoda_n_d_f_l.getClass().getName();}catch(Exception ex){return null;} }

public vidi_dohodov_n_d_f_l getKod_dohoda_n_d_f_l_obj(){ return this.kod_dohoda_n_d_f_l; }

public void setKod_dohoda_n_d_f_l_obj( Object _kod_dohoda_n_d_f_l){ this.kod_dohoda_n_d_f_l=(vidi_dohodov_n_d_f_l) _kod_dohoda_n_d_f_l; }



}
