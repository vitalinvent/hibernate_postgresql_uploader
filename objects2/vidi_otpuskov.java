import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="vidi_otpuskov")
public class vidi_otpuskov implements Serializable {

public vidi_otpuskov(){}

public vidi_otpuskov(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="kolichestvo_dney_v_god")

private Float kolichestvo_dney_v_god;
public void setKolichestvo_dney_v_god(Float _kolichestvo_dney_v_god){ this.kolichestvo_dney_v_god=_kolichestvo_dney_v_god; }

public Float getKolichestvo_dney_v_god(){ return this.kolichestvo_dney_v_god; }



@Column(name="naimenovanie_polnoe", columnDefinition="text")
private String naimenovanie_polnoe;

public void setNaimenovanie_polnoe(String _naimenovanie_polnoe){ this.naimenovanie_polnoe=_naimenovanie_polnoe; }

public String getNaimenovanie_polnoe(){ return this.naimenovanie_polnoe; }



@Column(name="otpusk_javljaetsja_ezhegodnim")

private Boolean otpusk_javljaetsja_ezhegodnim;
public void setOtpusk_javljaetsja_ezhegodnim(Boolean _otpusk_javljaetsja_ezhegodnim){ this.otpusk_javljaetsja_ezhegodnim=_otpusk_javljaetsja_ezhegodnim; }

public Boolean getOtpusk_javljaetsja_ezhegodnim(){ return this.otpusk_javljaetsja_ezhegodnim; }


@Column(name="otpusk_bez_oplati")

private Boolean otpusk_bez_oplati;
public void setOtpusk_bez_oplati(Boolean _otpusk_bez_oplati){ this.otpusk_bez_oplati=_otpusk_bez_oplati; }

public Boolean getOtpusk_bez_oplati(){ return this.otpusk_bez_oplati; }


@Column(name="predostavljat_otpusk_vsem_sotrudnikam")

private Boolean predostavljat_otpusk_vsem_sotrudnikam;
public void setPredostavljat_otpusk_vsem_sotrudnikam(Boolean _predostavljat_otpusk_vsem_sotrudnikam){ this.predostavljat_otpusk_vsem_sotrudnikam=_predostavljat_otpusk_vsem_sotrudnikam; }

public Boolean getPredostavljat_otpusk_vsem_sotrudnikam(){ return this.predostavljat_otpusk_vsem_sotrudnikam; }


@Column(name="udalit_identifikator_obyekta", columnDefinition="text")
private String udalit_identifikator_obyekta;

public void setUdalit_identifikator_obyekta(String _udalit_identifikator_obyekta){ this.udalit_identifikator_obyekta=_udalit_identifikator_obyekta; }

public String getUdalit_identifikator_obyekta(){ return this.udalit_identifikator_obyekta; }


@Column(name="nedeystvitelen")

private Boolean nedeystvitelen;
public void setNedeystvitelen(Boolean _nedeystvitelen){ this.nedeystvitelen=_nedeystvitelen; }

public Boolean getNedeystvitelen(){ return this.nedeystvitelen; }


@Column(name="osnovnoy_otpusk")

private Boolean osnovnoy_otpusk;
public void setOsnovnoy_otpusk(Boolean _osnovnoy_otpusk){ this.osnovnoy_otpusk=_osnovnoy_otpusk; }

public Boolean getOsnovnoy_otpusk(){ return this.osnovnoy_otpusk; }


@Column(name="nakopitelniy_otpusk")

private Boolean nakopitelniy_otpusk;
public void setNakopitelniy_otpusk(Boolean _nakopitelniy_otpusk){ this.nakopitelniy_otpusk=_nakopitelniy_otpusk; }

public Boolean getNakopitelniy_otpusk(){ return this.nakopitelniy_otpusk; }


@ManyToOne
@JoinColumn(name="vid_stazha", insertable = true, updatable = true)
private vidi_stazha vid_stazha;

public vidi_stazha getVid_stazha(){ try{return this.vid_stazha;}catch(Exception ex){ return null;} }

public void setVid_stazha( Object _vid_stazha){if (_vid_stazha instanceof String){this.vid_stazha= new vidi_stazha (_vid_stazha.toString());}else{try{this.vid_stazha= (vidi_stazha) _vid_stazha;}catch(Exception ex){Variables.logger.error(ex);this.vid_stazha= new vidi_stazha (_vid_stazha.toString());}}}

public UUID getVid_stazha_uuid(){ try{return this.vid_stazha.getGuid();}catch(Exception ex){return null;} }

public String getVid_stazha_type(){ try{return this.vid_stazha.getClass().getName();}catch(Exception ex){return null;} }

public vidi_stazha getVid_stazha_obj(){ return this.vid_stazha; }

public void setVid_stazha_obj( Object _vid_stazha){ this.vid_stazha=(vidi_stazha) _vid_stazha; }


}
