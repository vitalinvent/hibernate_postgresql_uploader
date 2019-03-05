import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="udalit_vidi_dohodov_n_d_f_l")
public class udalit_vidi_dohodov_n_d_f_l implements Serializable {

public udalit_vidi_dohodov_n_d_f_l(){}

public udalit_vidi_dohodov_n_d_f_l(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="kod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda", columnDefinition="text")
private String kod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda;

public void setKod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda(String _kod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda){ this.kod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda=_kod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda; }

public String getKod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda(){ return this.kod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda; }


@Column(name="ne_oblagaetsja_u_nalogovogo_agenta")

private Boolean ne_oblagaetsja_u_nalogovogo_agenta;
public void setNe_oblagaetsja_u_nalogovogo_agenta(Boolean _ne_oblagaetsja_u_nalogovogo_agenta){ this.ne_oblagaetsja_u_nalogovogo_agenta=_ne_oblagaetsja_u_nalogovogo_agenta; }

public Boolean getNe_oblagaetsja_u_nalogovogo_agenta(){ return this.ne_oblagaetsja_u_nalogovogo_agenta; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="vichet_rasschitivaetsja_avtomaticheski")

private Boolean vichet_rasschitivaetsja_avtomaticheski;
public void setVichet_rasschitivaetsja_avtomaticheski(Boolean _vichet_rasschitivaetsja_avtomaticheski){ this.vichet_rasschitivaetsja_avtomaticheski=_vichet_rasschitivaetsja_avtomaticheski; }

public Boolean getVichet_rasschitivaetsja_avtomaticheski(){ return this.vichet_rasschitivaetsja_avtomaticheski; }



@ManyToOne
@JoinColumn(name="vichet_po_umolchaniyu", insertable = true, updatable = true)
private udalit_vidi_vichetov_n_d_f_l vichet_po_umolchaniyu;

public udalit_vidi_vichetov_n_d_f_l getVichet_po_umolchaniyu(){ try{return this.vichet_po_umolchaniyu;}catch(Exception ex){ return null;} }

public void setVichet_po_umolchaniyu( Object _vichet_po_umolchaniyu){if (_vichet_po_umolchaniyu instanceof String){this.vichet_po_umolchaniyu= new udalit_vidi_vichetov_n_d_f_l (_vichet_po_umolchaniyu.toString());}else{try{this.vichet_po_umolchaniyu= (udalit_vidi_vichetov_n_d_f_l) _vichet_po_umolchaniyu;}catch(Exception ex){Variables.logger.error(ex);this.vichet_po_umolchaniyu= new udalit_vidi_vichetov_n_d_f_l (_vichet_po_umolchaniyu.toString());}}}

public UUID getVichet_po_umolchaniyu_uuid(){ try{return this.vichet_po_umolchaniyu.getGuid();}catch(Exception ex){return null;} }

public String getVichet_po_umolchaniyu_type(){ try{return this.vichet_po_umolchaniyu.getClass().getName();}catch(Exception ex){return null;} }

public udalit_vidi_vichetov_n_d_f_l getVichet_po_umolchaniyu_obj(){ return this.vichet_po_umolchaniyu; }

public void setVichet_po_umolchaniyu_obj( Object _vichet_po_umolchaniyu){ this.vichet_po_umolchaniyu=(udalit_vidi_vichetov_n_d_f_l) _vichet_po_umolchaniyu; }


@Column(name="imeet_edinstvenniy_vichet")

private Boolean imeet_edinstvenniy_vichet;
public void setImeet_edinstvenniy_vichet(Boolean _imeet_edinstvenniy_vichet){ this.imeet_edinstvenniy_vichet=_imeet_edinstvenniy_vichet; }

public Boolean getImeet_edinstvenniy_vichet(){ return this.imeet_edinstvenniy_vichet; }


@Column(name="sootvetstvuet_oplate_truda")

private Boolean sootvetstvuet_oplate_truda;
public void setSootvetstvuet_oplate_truda(Boolean _sootvetstvuet_oplate_truda){ this.sootvetstvuet_oplate_truda=_sootvetstvuet_oplate_truda; }

public Boolean getSootvetstvuet_oplate_truda(){ return this.sootvetstvuet_oplate_truda; }


}
