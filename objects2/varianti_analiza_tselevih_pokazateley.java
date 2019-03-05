import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="varianti_analiza_tselevih_pokazateley")
public class varianti_analiza_tselevih_pokazateley implements Serializable {

public varianti_analiza_tselevih_pokazateley(){}

public varianti_analiza_tselevih_pokazateley(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="vivodit_podpisi_k_diagrammam")

private Boolean vivodit_podpisi_k_diagrammam;
public void setVivodit_podpisi_k_diagrammam(Boolean _vivodit_podpisi_k_diagrammam){ this.vivodit_podpisi_k_diagrammam=_vivodit_podpisi_k_diagrammam; }

public Boolean getVivodit_podpisi_k_diagrammam(){ return this.vivodit_podpisi_k_diagrammam; }



@Column(name="znachenie_analiza", columnDefinition="text")
private String znachenie_analiza;

public void setZnachenie_analiza(String _znachenie_analiza){ this.znachenie_analiza=_znachenie_analiza; }

public String getZnachenie_analiza(){ return this.znachenie_analiza; }



@Column(name="vivodit_marker_tochek_prognoza")

private Boolean vivodit_marker_tochek_prognoza;
public void setVivodit_marker_tochek_prognoza(Boolean _vivodit_marker_tochek_prognoza){ this.vivodit_marker_tochek_prognoza=_vivodit_marker_tochek_prognoza; }

public Boolean getVivodit_marker_tochek_prognoza(){ return this.vivodit_marker_tochek_prognoza; }


@Column(name="period_sravnenija", columnDefinition="text")
private String period_sravnenija;

public void setPeriod_sravnenija(String _period_sravnenija){ this.period_sravnenija=_period_sravnenija; }

public String getPeriod_sravnenija(){ return this.period_sravnenija; }


@Column(name="vivodit_markeri_tochek")

private Boolean vivodit_markeri_tochek;
public void setVivodit_markeri_tochek(Boolean _vivodit_markeri_tochek){ this.vivodit_markeri_tochek=_vivodit_markeri_tochek; }

public Boolean getVivodit_markeri_tochek(){ return this.vivodit_markeri_tochek; }


@Column(name="vklyuchat_nol")

private Boolean vklyuchat_nol;
public void setVklyuchat_nol(Boolean _vklyuchat_nol){ this.vklyuchat_nol=_vklyuchat_nol; }

public Boolean getVklyuchat_nol(){ return this.vklyuchat_nol; }


@Column(name="videljat_maksimalnoe_znachenie_dlja_pokomponentnogo_sravnenija")

private Boolean videljat_maksimalnoe_znachenie_dlja_pokomponentnogo_sravnenija;
public void setVideljat_maksimalnoe_znachenie_dlja_pokomponentnogo_sravnenija(Boolean _videljat_maksimalnoe_znachenie_dlja_pokomponentnogo_sravnenija){ this.videljat_maksimalnoe_znachenie_dlja_pokomponentnogo_sravnenija=_videljat_maksimalnoe_znachenie_dlja_pokomponentnogo_sravnenija; }

public Boolean getVideljat_maksimalnoe_znachenie_dlja_pokomponentnogo_sravnenija(){ return this.videljat_maksimalnoe_znachenie_dlja_pokomponentnogo_sravnenija; }


@Column(name="glubina_analiza_prognoza")

private Float glubina_analiza_prognoza;
public void setGlubina_analiza_prognoza(Float _glubina_analiza_prognoza){ this.glubina_analiza_prognoza=_glubina_analiza_prognoza; }

public Float getGlubina_analiza_prognoza(){ return this.glubina_analiza_prognoza; }


@Column(name="gorizont_prognoza")

private Float gorizont_prognoza;
public void setGorizont_prognoza(Float _gorizont_prognoza){ this.gorizont_prognoza=_gorizont_prognoza; }

public Float getGorizont_prognoza(){ return this.gorizont_prognoza; }


@ManyToOne
@JoinColumn(name="otvetstvenniy", insertable = true, updatable = true)
private polzovateli otvetstvenniy;

public polzovateli getOtvetstvenniy(){ try{return this.otvetstvenniy;}catch(Exception ex){ return null;} }

public void setOtvetstvenniy( Object _otvetstvenniy){if (_otvetstvenniy instanceof String){this.otvetstvenniy= new polzovateli (_otvetstvenniy.toString());}else{try{this.otvetstvenniy= (polzovateli) _otvetstvenniy;}catch(Exception ex){Variables.logger.error(ex);this.otvetstvenniy= new polzovateli (_otvetstvenniy.toString());}}}

public UUID getOtvetstvenniy_uuid(){ try{return this.otvetstvenniy.getGuid();}catch(Exception ex){return null;} }

public String getOtvetstvenniy_type(){ try{return this.otvetstvenniy.getClass().getName();}catch(Exception ex){return null;} }

public polzovateli getOtvetstvenniy_obj(){ return this.otvetstvenniy; }

public void setOtvetstvenniy_obj( Object _otvetstvenniy){ this.otvetstvenniy=(polzovateli) _otvetstvenniy; }


@Column(name="gradient_dlja_pokomponentnogo_sravnenija")

private Boolean gradient_dlja_pokomponentnogo_sravnenija;
public void setGradient_dlja_pokomponentnogo_sravnenija(Boolean _gradient_dlja_pokomponentnogo_sravnenija){ this.gradient_dlja_pokomponentnogo_sravnenija=_gradient_dlja_pokomponentnogo_sravnenija; }

public Boolean getGradient_dlja_pokomponentnogo_sravnenija(){ return this.gradient_dlja_pokomponentnogo_sravnenija; }


@Column(name="znachenie_analiza_dopolnitelnoe", columnDefinition="text")
private String znachenie_analiza_dopolnitelnoe;

public void setZnachenie_analiza_dopolnitelnoe(String _znachenie_analiza_dopolnitelnoe){ this.znachenie_analiza_dopolnitelnoe=_znachenie_analiza_dopolnitelnoe; }

public String getZnachenie_analiza_dopolnitelnoe(){ return this.znachenie_analiza_dopolnitelnoe; }


@Column(name="tolko_tsvet_osnovnoy_serii")

private Boolean tolko_tsvet_osnovnoy_serii;
public void setTolko_tsvet_osnovnoy_serii(Boolean _tolko_tsvet_osnovnoy_serii){ this.tolko_tsvet_osnovnoy_serii=_tolko_tsvet_osnovnoy_serii; }

public Boolean getTolko_tsvet_osnovnoy_serii(){ return this.tolko_tsvet_osnovnoy_serii; }


@Column(name="obyekt_analiza", columnDefinition="text")
private String obyekt_analiza;

public void setObyekt_analiza(String _obyekt_analiza){ this.obyekt_analiza=_obyekt_analiza; }

public String getObyekt_analiza(){ return this.obyekt_analiza; }


@Column(name="rasschitivat_prognoz")

private Boolean rasschitivat_prognoz;
public void setRasschitivat_prognoz(Boolean _rasschitivat_prognoz){ this.rasschitivat_prognoz=_rasschitivat_prognoz; }

public Boolean getRasschitivat_prognoz(){ return this.rasschitivat_prognoz; }


@Column(name="okantovka_diagramm")

private Boolean okantovka_diagramm;
public void setOkantovka_diagramm(Boolean _okantovka_diagramm){ this.okantovka_diagramm=_okantovka_diagramm; }

public Boolean getOkantovka_diagramm(){ return this.okantovka_diagramm; }


@Column(name="rezhim_pokomponentnogo_sravnenija")

private Float rezhim_pokomponentnogo_sravnenija;
public void setRezhim_pokomponentnogo_sravnenija(Float _rezhim_pokomponentnogo_sravnenija){ this.rezhim_pokomponentnogo_sravnenija=_rezhim_pokomponentnogo_sravnenija; }

public Float getRezhim_pokomponentnogo_sravnenija(){ return this.rezhim_pokomponentnogo_sravnenija; }


@Column(name="otobrazhat_legendu")

private Boolean otobrazhat_legendu;
public void setOtobrazhat_legendu(Boolean _otobrazhat_legendu){ this.otobrazhat_legendu=_otobrazhat_legendu; }

public Boolean getOtobrazhat_legendu(){ return this.otobrazhat_legendu; }


@Column(name="period_aktualnosti_rascheta")

private Float period_aktualnosti_rascheta;
public void setPeriod_aktualnosti_rascheta(Float _period_aktualnosti_rascheta){ this.period_aktualnosti_rascheta=_period_aktualnosti_rascheta; }

public Float getPeriod_aktualnosti_rascheta(){ return this.period_aktualnosti_rascheta; }


@Column(name="period_analiza", columnDefinition="text")
private String period_analiza;

public void setPeriod_analiza(String _period_analiza){ this.period_analiza=_period_analiza; }

public String getPeriod_analiza(){ return this.period_analiza; }


@Column(name="rezhim_sglazhivanija_diagramm")

private Boolean rezhim_sglazhivanija_diagramm;
public void setRezhim_sglazhivanija_diagramm(Boolean _rezhim_sglazhivanija_diagramm){ this.rezhim_sglazhivanija_diagramm=_rezhim_sglazhivanija_diagramm; }

public Boolean getRezhim_sglazhivanija_diagramm(){ return this.rezhim_sglazhivanija_diagramm; }


@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }


@Column(name="tochnost_rascheta_drobnoy_chasti")

private Float tochnost_rascheta_drobnoy_chasti;
public void setTochnost_rascheta_drobnoy_chasti(Float _tochnost_rascheta_drobnoy_chasti){ this.tochnost_rascheta_drobnoy_chasti=_tochnost_rascheta_drobnoy_chasti; }

public Float getTochnost_rascheta_drobnoy_chasti(){ return this.tochnost_rascheta_drobnoy_chasti; }


@Column(name="hranilishche_demonstratsionnih_dannih", columnDefinition="text")
private String hranilishche_demonstratsionnih_dannih;

public void setHranilishche_demonstratsionnih_dannih(String _hranilishche_demonstratsionnih_dannih){ this.hranilishche_demonstratsionnih_dannih=_hranilishche_demonstratsionnih_dannih; }

public String getHranilishche_demonstratsionnih_dannih(){ return this.hranilishche_demonstratsionnih_dannih; }


@Column(name="hranilishche_nastroek_oformlenija", columnDefinition="text")
private String hranilishche_nastroek_oformlenija;

public void setHranilishche_nastroek_oformlenija(String _hranilishche_nastroek_oformlenija){ this.hranilishche_nastroek_oformlenija=_hranilishche_nastroek_oformlenija; }

public String getHranilishche_nastroek_oformlenija(){ return this.hranilishche_nastroek_oformlenija; }


@Column(name="hranilishche_polzovatelskih_nastroek_komponovki_dannih", columnDefinition="text")
private String hranilishche_polzovatelskih_nastroek_komponovki_dannih;

public void setHranilishche_polzovatelskih_nastroek_komponovki_dannih(String _hranilishche_polzovatelskih_nastroek_komponovki_dannih){ this.hranilishche_polzovatelskih_nastroek_komponovki_dannih=_hranilishche_polzovatelskih_nastroek_komponovki_dannih; }

public String getHranilishche_polzovatelskih_nastroek_komponovki_dannih(){ return this.hranilishche_polzovatelskih_nastroek_komponovki_dannih; }


}
