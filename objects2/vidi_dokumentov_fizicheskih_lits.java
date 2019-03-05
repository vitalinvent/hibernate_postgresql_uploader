import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="vidi_dokumentov_fizicheskih_lits")
public class vidi_dokumentov_fizicheskih_lits implements Serializable {

public vidi_dokumentov_fizicheskih_lits(){}

public vidi_dokumentov_fizicheskih_lits(String _guid){ this.guid=UUID.fromString(_guid); }

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




@Column(name="kod_m_v_d", columnDefinition="text")
private String kod_m_v_d;

public void setKod_m_v_d(String _kod_m_v_d){ this.kod_m_v_d=_kod_m_v_d; }

public String getKod_m_v_d(){ return this.kod_m_v_d; }


@Column(name="kod_p_f_r", columnDefinition="text")
private String kod_p_f_r;

public void setKod_p_f_r(String _kod_p_f_r){ this.kod_p_f_r=_kod_p_f_r; }

public String getKod_p_f_r(){ return this.kod_p_f_r; }


}
