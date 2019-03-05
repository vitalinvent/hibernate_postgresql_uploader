import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="udalit_vidi_tarifov_strahovih_vznosov")
public class udalit_vidi_tarifov_strahovih_vznosov implements Serializable {

public udalit_vidi_tarifov_strahovih_vznosov(){}

public udalit_vidi_tarifov_strahovih_vznosov(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="kod_p_f_r2012", columnDefinition="text")
private String kod_p_f_r2012;

public void setKod_p_f_r2012(String _kod_p_f_r2012){ this.kod_p_f_r2012=_kod_p_f_r2012; }

public String getKod_p_f_r2012(){ return this.kod_p_f_r2012; }


@Column(name="udalit_identifikator_obyekta", columnDefinition="text")
private String udalit_identifikator_obyekta;

public void setUdalit_identifikator_obyekta(String _udalit_identifikator_obyekta){ this.udalit_identifikator_obyekta=_udalit_identifikator_obyekta; }

public String getUdalit_identifikator_obyekta(){ return this.udalit_identifikator_obyekta; }


@Column(name="primenjaetsja_po_otdelnim_dohodam")

private Boolean primenjaetsja_po_otdelnim_dohodam;
public void setPrimenjaetsja_po_otdelnim_dohodam(Boolean _primenjaetsja_po_otdelnim_dohodam){ this.primenjaetsja_po_otdelnim_dohodam=_primenjaetsja_po_otdelnim_dohodam; }

public Boolean getPrimenjaetsja_po_otdelnim_dohodam(){ return this.primenjaetsja_po_otdelnim_dohodam; }




@Column(name="kod_f_s_s2012", columnDefinition="text")
private String kod_f_s_s2012;

public void setKod_f_s_s2012(String _kod_f_s_s2012){ this.kod_f_s_s2012=_kod_f_s_s2012; }

public String getKod_f_s_s2012(){ return this.kod_f_s_s2012; }


@Column(name="kod_p_f_r2011", columnDefinition="text")
private String kod_p_f_r2011;

public void setKod_p_f_r2011(String _kod_p_f_r2011){ this.kod_p_f_r2011=_kod_p_f_r2011; }

public String getKod_p_f_r2011(){ return this.kod_p_f_r2011; }


@Column(name="kod_f_s_s2011", columnDefinition="text")
private String kod_f_s_s2011;

public void setKod_f_s_s2011(String _kod_f_s_s2011){ this.kod_f_s_s2011=_kod_f_s_s2011; }

public String getKod_f_s_s2011(){ return this.kod_f_s_s2011; }


@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }


}
