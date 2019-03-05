import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="vidi_vichetov_n_d_f_l")
public class vidi_vichetov_n_d_f_l implements Serializable {

public vidi_vichetov_n_d_f_l(){}

public vidi_vichetov_n_d_f_l(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="ne_predostavljaetsja_nerezidentam")

private Boolean ne_predostavljaetsja_nerezidentam;
public void setNe_predostavljaetsja_nerezidentam(Boolean _ne_predostavljaetsja_nerezidentam){ this.ne_predostavljaetsja_nerezidentam=_ne_predostavljaetsja_nerezidentam; }

public Boolean getNe_predostavljaetsja_nerezidentam(){ return this.ne_predostavljaetsja_nerezidentam; }


@Column(name="kod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda", columnDefinition="text")
private String kod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda;

public void setKod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda(String _kod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda){ this.kod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda=_kod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda; }

public String getKod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda(){ return this.kod_primenjaemiy_v_nalogovoy_otchetnosti_s2010_goda; }


@Column(name="kod_primenjaemiy_v_nalogovoy_otchetnosti_s2011_goda", columnDefinition="text")
private String kod_primenjaemiy_v_nalogovoy_otchetnosti_s2011_goda;

public void setKod_primenjaemiy_v_nalogovoy_otchetnosti_s2011_goda(String _kod_primenjaemiy_v_nalogovoy_otchetnosti_s2011_goda){ this.kod_primenjaemiy_v_nalogovoy_otchetnosti_s2011_goda=_kod_primenjaemiy_v_nalogovoy_otchetnosti_s2011_goda; }

public String getKod_primenjaemiy_v_nalogovoy_otchetnosti_s2011_goda(){ return this.kod_primenjaemiy_v_nalogovoy_otchetnosti_s2011_goda; }


@Column(name="vichet_k_dohodu")

private Boolean vichet_k_dohodu;
public void setVichet_k_dohodu(Boolean _vichet_k_dohodu){ this.vichet_k_dohodu=_vichet_k_dohodu; }

public Boolean getVichet_k_dohodu(){ return this.vichet_k_dohodu; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }



@Column(name="kod_primenjaemiy_v_nalogovoy_otchetnosti_s2015_goda", columnDefinition="text")
private String kod_primenjaemiy_v_nalogovoy_otchetnosti_s2015_goda;

public void setKod_primenjaemiy_v_nalogovoy_otchetnosti_s2015_goda(String _kod_primenjaemiy_v_nalogovoy_otchetnosti_s2015_goda){ this.kod_primenjaemiy_v_nalogovoy_otchetnosti_s2015_goda=_kod_primenjaemiy_v_nalogovoy_otchetnosti_s2015_goda; }

public String getKod_primenjaemiy_v_nalogovoy_otchetnosti_s2015_goda(){ return this.kod_primenjaemiy_v_nalogovoy_otchetnosti_s2015_goda; }


@Column(name="polnoe_naimenovanie", columnDefinition="text")
private String polnoe_naimenovanie;

public void setPolnoe_naimenovanie(String _polnoe_naimenovanie){ this.polnoe_naimenovanie=_polnoe_naimenovanie; }

public String getPolnoe_naimenovanie(){ return this.polnoe_naimenovanie; }


@Column(name="kod_primenjaemiy_v_nalogovoy_otchetnosti_s2016_goda", columnDefinition="text")
private String kod_primenjaemiy_v_nalogovoy_otchetnosti_s2016_goda;

public void setKod_primenjaemiy_v_nalogovoy_otchetnosti_s2016_goda(String _kod_primenjaemiy_v_nalogovoy_otchetnosti_s2016_goda){ this.kod_primenjaemiy_v_nalogovoy_otchetnosti_s2016_goda=_kod_primenjaemiy_v_nalogovoy_otchetnosti_s2016_goda; }

public String getKod_primenjaemiy_v_nalogovoy_otchetnosti_s2016_goda(){ return this.kod_primenjaemiy_v_nalogovoy_otchetnosti_s2016_goda; }


}
