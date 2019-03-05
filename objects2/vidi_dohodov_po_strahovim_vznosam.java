import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="vidi_dohodov_po_strahovim_vznosam")
public class vidi_dohodov_po_strahovim_vznosam implements Serializable {

public vidi_dohodov_po_strahovim_vznosam(){}

public vidi_dohodov_po_strahovim_vznosam(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }




@Column(name="oblagaetsja_vznosami_chastichno")

private Boolean oblagaetsja_vznosami_chastichno;
public void setOblagaetsja_vznosami_chastichno(Boolean _oblagaetsja_vznosami_chastichno){ this.oblagaetsja_vznosami_chastichno=_oblagaetsja_vznosami_chastichno; }

public Boolean getOblagaetsja_vznosami_chastichno(){ return this.oblagaetsja_vznosami_chastichno; }


@Column(name="vhodit_v_bazu_f_s_s__n_s")

private Boolean vhodit_v_bazu_f_s_s__n_s;
public void setVhodit_v_bazu_f_s_s__n_s(Boolean _vhodit_v_bazu_f_s_s__n_s){ this.vhodit_v_bazu_f_s_s__n_s=_vhodit_v_bazu_f_s_s__n_s; }

public Boolean getVhodit_v_bazu_f_s_s__n_s(){ return this.vhodit_v_bazu_f_s_s__n_s; }


@Column(name="vhodit_v_bazu_p_f_r")

private Boolean vhodit_v_bazu_p_f_r;
public void setVhodit_v_bazu_p_f_r(Boolean _vhodit_v_bazu_p_f_r){ this.vhodit_v_bazu_p_f_r=_vhodit_v_bazu_p_f_r; }

public Boolean getVhodit_v_bazu_p_f_r(){ return this.vhodit_v_bazu_p_f_r; }


@Column(name="vhodit_v_bazu_f_s_s")

private Boolean vhodit_v_bazu_f_s_s;
public void setVhodit_v_bazu_f_s_s(Boolean _vhodit_v_bazu_f_s_s){ this.vhodit_v_bazu_f_s_s=_vhodit_v_bazu_f_s_s; }

public Boolean getVhodit_v_bazu_f_s_s(){ return this.vhodit_v_bazu_f_s_s; }


@Column(name="vhodit_v_bazu_f_o_m_s")

private Boolean vhodit_v_bazu_f_o_m_s;
public void setVhodit_v_bazu_f_o_m_s(Boolean _vhodit_v_bazu_f_o_m_s){ this.vhodit_v_bazu_f_o_m_s=_vhodit_v_bazu_f_o_m_s; }

public Boolean getVhodit_v_bazu_f_o_m_s(){ return this.vhodit_v_bazu_f_o_m_s; }


@Column(name="avtorskie_voznagrazhdenija")

private Boolean avtorskie_voznagrazhdenija;
public void setAvtorskie_voznagrazhdenija(Boolean _avtorskie_voznagrazhdenija){ this.avtorskie_voznagrazhdenija=_avtorskie_voznagrazhdenija; }

public Boolean getAvtorskie_voznagrazhdenija(){ return this.avtorskie_voznagrazhdenija; }


}
