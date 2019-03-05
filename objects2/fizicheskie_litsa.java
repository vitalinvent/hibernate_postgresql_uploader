import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="fizicheskie_litsa")
public class fizicheskie_litsa implements Serializable {

public fizicheskie_litsa(){}

public fizicheskie_litsa(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="data_rozhdenija", columnDefinition="text")
private String data_rozhdenija;

public void setData_rozhdenija(String _data_rozhdenija){ this.data_rozhdenija=_data_rozhdenija; }

public String getData_rozhdenija(){ return this.data_rozhdenija; }


@Column(name="i_n_n", columnDefinition="text")
private String i_n_n;

public void setI_n_n(String _i_n_n){ this.i_n_n=_i_n_n; }

public String getI_n_n(){ return this.i_n_n; }


@Column(name="imeet_izobretenija")

private Boolean imeet_izobretenija;
public void setImeet_izobretenija(Boolean _imeet_izobretenija){ this.imeet_izobretenija=_imeet_izobretenija; }

public Boolean getImeet_izobretenija(){ return this.imeet_izobretenija; }


@Column(name="strahovoy_nomer_p_f_r", columnDefinition="text")
private String strahovoy_nomer_p_f_r;

public void setStrahovoy_nomer_p_f_r(String _strahovoy_nomer_p_f_r){ this.strahovoy_nomer_p_f_r=_strahovoy_nomer_p_f_r; }

public String getStrahovoy_nomer_p_f_r(){ return this.strahovoy_nomer_p_f_r; }


@Column(name="mesto_rozhdenija", columnDefinition="text")
private String mesto_rozhdenija;

public void setMesto_rozhdenija(String _mesto_rozhdenija){ this.mesto_rozhdenija=_mesto_rozhdenija; }

public String getMesto_rozhdenija(){ return this.mesto_rozhdenija; }


@Column(name="imeet_nauchnie_trudi")

private Boolean imeet_nauchnie_trudi;
public void setImeet_nauchnie_trudi(Boolean _imeet_nauchnie_trudi){ this.imeet_nauchnie_trudi=_imeet_nauchnie_trudi; }

public Boolean getImeet_nauchnie_trudi(){ return this.imeet_nauchnie_trudi; }


@Column(name="f_i_o", columnDefinition="text")
private String f_i_o;

public void setF_i_o(String _f_i_o){ this.f_i_o=_f_i_o; }

public String getF_i_o(){ return this.f_i_o; }


@Column(name="utochnenie_naimenovanija", columnDefinition="text")
private String utochnenie_naimenovanija;

public void setUtochnenie_naimenovanija(String _utochnenie_naimenovanija){ this.utochnenie_naimenovanija=_utochnenie_naimenovanija; }

public String getUtochnenie_naimenovanija(){ return this.utochnenie_naimenovanija; }


@Column(name="udalit_protsent_severnoy_nadbavki_fizicheskogo_litsa")

private Float udalit_protsent_severnoy_nadbavki_fizicheskogo_litsa;
public void setUdalit_protsent_severnoy_nadbavki_fizicheskogo_litsa(Float _udalit_protsent_severnoy_nadbavki_fizicheskogo_litsa){ this.udalit_protsent_severnoy_nadbavki_fizicheskogo_litsa=_udalit_protsent_severnoy_nadbavki_fizicheskogo_litsa; }

public Float getUdalit_protsent_severnoy_nadbavki_fizicheskogo_litsa(){ return this.udalit_protsent_severnoy_nadbavki_fizicheskogo_litsa; }


@Column(name="udalit_protsent_severnoy_nadbavki_fizicheskogo_litsa_izmenjaetsja")

private Boolean udalit_protsent_severnoy_nadbavki_fizicheskogo_litsa_izmenjaetsja;
public void setUdalit_protsent_severnoy_nadbavki_fizicheskogo_litsa_izmenjaetsja(Boolean _udalit_protsent_severnoy_nadbavki_fizicheskogo_litsa_izmenjaetsja){ this.udalit_protsent_severnoy_nadbavki_fizicheskogo_litsa_izmenjaetsja=_udalit_protsent_severnoy_nadbavki_fizicheskogo_litsa_izmenjaetsja; }

public Boolean getUdalit_protsent_severnoy_nadbavki_fizicheskogo_litsa_izmenjaetsja(){ return this.udalit_protsent_severnoy_nadbavki_fizicheskogo_litsa_izmenjaetsja; }


@Column(name="imja", columnDefinition="text")
private String imja;

public void setImja(String _imja){ this.imja=_imja; }

public String getImja(){ return this.imja; }


@Column(name="data_registratsii", columnDefinition="text")
private String data_registratsii;

public void setData_registratsii(String _data_registratsii){ this.data_registratsii=_data_registratsii; }

public String getData_registratsii(){ return this.data_registratsii; }


@Column(name="naimenovanie_sluzhebnoe", columnDefinition="text")
private String naimenovanie_sluzhebnoe;

public void setNaimenovanie_sluzhebnoe(String _naimenovanie_sluzhebnoe){ this.naimenovanie_sluzhebnoe=_naimenovanie_sluzhebnoe; }

public String getNaimenovanie_sluzhebnoe(){ return this.naimenovanie_sluzhebnoe; }


@Column(name="postojanno_prozhival_v_krimu18_marta2014_goda")

private Boolean postojanno_prozhival_v_krimu18_marta2014_goda;
public void setPostojanno_prozhival_v_krimu18_marta2014_goda(Boolean _postojanno_prozhival_v_krimu18_marta2014_goda){ this.postojanno_prozhival_v_krimu18_marta2014_goda=_postojanno_prozhival_v_krimu18_marta2014_goda; }

public Boolean getPostojanno_prozhival_v_krimu18_marta2014_goda(){ return this.postojanno_prozhival_v_krimu18_marta2014_goda; }


@Column(name="familija", columnDefinition="text")
private String familija;

public void setFamilija(String _familija){ this.familija=_familija; }

public String getFamilija(){ return this.familija; }


@Column(name="otchestvo", columnDefinition="text")
private String otchestvo;

public void setOtchestvo(String _otchestvo){ this.otchestvo=_otchestvo; }

public String getOtchestvo(){ return this.otchestvo; }


@Column(name="initsiali_imeni", columnDefinition="text")
private String initsiali_imeni;

public void setInitsiali_imeni(String _initsiali_imeni){ this.initsiali_imeni=_initsiali_imeni; }

public String getInitsiali_imeni(){ return this.initsiali_imeni; }


}
