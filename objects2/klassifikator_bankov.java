import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="klassifikator_bankov")
public class klassifikator_bankov implements Serializable {

public klassifikator_bankov(){}

public klassifikator_bankov(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="s_v_i_f_t_b_i_k", columnDefinition="text")
private String s_v_i_f_t_b_i_k;

public void setS_v_i_f_t_b_i_k(String _s_v_i_f_t_b_i_k){ this.s_v_i_f_t_b_i_k=_s_v_i_f_t_b_i_k; }

public String getS_v_i_f_t_b_i_k(){ return this.s_v_i_f_t_b_i_k; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="korr_schet", columnDefinition="text")
private String korr_schet;

public void setKorr_schet(String _korr_schet){ this.korr_schet=_korr_schet; }

public String getKorr_schet(){ return this.korr_schet; }


@Column(name="gorod", columnDefinition="text")
private String gorod;

public void setGorod(String _gorod){ this.gorod=_gorod; }

public String getGorod(){ return this.gorod; }


}
