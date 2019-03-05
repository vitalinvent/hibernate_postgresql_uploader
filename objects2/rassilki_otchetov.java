import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="rassilki_otchetov")
public class rassilki_otchetov implements Serializable {

public rassilki_otchetov(){}

public rassilki_otchetov(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="papka", columnDefinition="text")
private String papka;

public void setPapka(String _papka){ this.papka=_papka; }

public String getPapka(){ return this.papka; }


@Column(name="setevoy_katalogwindows", columnDefinition="text")
private String setevoy_katalogwindows;

public void setSetevoy_katalogwindows(String _setevoy_katalogwindows){ this.setevoy_katalogwindows=_setevoy_katalogwindows; }

public String getSetevoy_katalogwindows(){ return this.setevoy_katalogwindows; }



@Column(name="ftp_passivnoe_soedinenie")

private Boolean ftp_passivnoe_soedinenie;
public void setFtp_passivnoe_soedinenie(Boolean _ftp_passivnoe_soedinenie){ this.ftp_passivnoe_soedinenie=_ftp_passivnoe_soedinenie; }

public Boolean getFtp_passivnoe_soedinenie(){ return this.ftp_passivnoe_soedinenie; }


@Column(name="ftp_port")

private Float ftp_port;
public void setFtp_port(Float _ftp_port){ this.ftp_port=_ftp_port; }

public Float getFtp_port(){ return this.ftp_port; }


@Column(name="tip_poluchateley_rassilki", columnDefinition="text")
private String tip_poluchateley_rassilki;

public void setTip_poluchateley_rassilki(String _tip_poluchateley_rassilki){ this.tip_poluchateley_rassilki=_tip_poluchateley_rassilki; }

public String getTip_poluchateley_rassilki(){ return this.tip_poluchateley_rassilki; }


@Column(name="ispolzovat_elektronnuyu_pochtu")

private Boolean ispolzovat_elektronnuyu_pochtu;
public void setIspolzovat_elektronnuyu_pochtu(Boolean _ispolzovat_elektronnuyu_pochtu){ this.ispolzovat_elektronnuyu_pochtu=_ispolzovat_elektronnuyu_pochtu; }

public Boolean getIspolzovat_elektronnuyu_pochtu(){ return this.ispolzovat_elektronnuyu_pochtu; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="ftp_katalog", columnDefinition="text")
private String ftp_katalog;

public void setFtp_katalog(String _ftp_katalog){ this.ftp_katalog=_ftp_katalog; }

public String getFtp_katalog(){ return this.ftp_katalog; }


@Column(name="kartinki_pisma_v_formatehtml", columnDefinition="text")
private String kartinki_pisma_v_formatehtml;

public void setKartinki_pisma_v_formatehtml(String _kartinki_pisma_v_formatehtml){ this.kartinki_pisma_v_formatehtml=_kartinki_pisma_v_formatehtml; }

public String getKartinki_pisma_v_formatehtml(){ return this.kartinki_pisma_v_formatehtml; }


@Column(name="ftp_login", columnDefinition="text")
private String ftp_login;

public void setFtp_login(String _ftp_login){ this.ftp_login=_ftp_login; }

public String getFtp_login(){ return this.ftp_login; }


@Column(name="skritie_kopii")

private Boolean skritie_kopii;
public void setSkritie_kopii(Boolean _skritie_kopii){ this.skritie_kopii=_skritie_kopii; }

public Boolean getSkritie_kopii(){ return this.skritie_kopii; }


@Column(name="ftp_server", columnDefinition="text")
private String ftp_server;

public void setFtp_server(String _ftp_server){ this.ftp_server=_ftp_server; }

public String getFtp_server(){ return this.ftp_server; }


@Column(name="avtor", columnDefinition="text")
private String avtor;

public void setAvtor(String _avtor){ this.avtor=_avtor; }

public String getAvtor(){ return this.avtor; }


@Column(name="adres_otveta", columnDefinition="text")
private String adres_otveta;

public void setAdres_otveta(String _adres_otveta){ this.adres_otveta=_adres_otveta; }

public String getAdres_otveta(){ return this.adres_otveta; }


@Column(name="arhivirovat")

private Boolean arhivirovat;
public void setArhivirovat(Boolean _arhivirovat){ this.arhivirovat=_arhivirovat; }

public Boolean getArhivirovat(){ return this.arhivirovat; }


@Column(name="vid_pochtovogo_adresa_poluchateley", columnDefinition="text")
private String vid_pochtovogo_adresa_poluchateley;

public void setVid_pochtovogo_adresa_poluchateley(String _vid_pochtovogo_adresa_poluchateley){ this.vid_pochtovogo_adresa_poluchateley=_vid_pochtovogo_adresa_poluchateley; }

public String getVid_pochtovogo_adresa_poluchateley(){ return this.vid_pochtovogo_adresa_poluchateley; }


@Column(name="vipolnjat_po_raspisaniyu")

private Boolean vipolnjat_po_raspisaniyu;
public void setVipolnjat_po_raspisaniyu(Boolean _vipolnjat_po_raspisaniyu){ this.vipolnjat_po_raspisaniyu=_vipolnjat_po_raspisaniyu; }

public Boolean getVipolnjat_po_raspisaniyu(){ return this.vipolnjat_po_raspisaniyu; }


@Column(name="pismo_v_formatehtml")

private Boolean pismo_v_formatehtml;
public void setPismo_v_formatehtml(Boolean _pismo_v_formatehtml){ this.pismo_v_formatehtml=_pismo_v_formatehtml; }

public Boolean getPismo_v_formatehtml(){ return this.pismo_v_formatehtml; }


@Column(name="lichnaja")

private Boolean lichnaja;
public void setLichnaja(Boolean _lichnaja){ this.lichnaja=_lichnaja; }

public Boolean getLichnaja(){ return this.lichnaja; }


@Column(name="imja_arhiva", columnDefinition="text")
private String imja_arhiva;

public void setImja_arhiva(String _imja_arhiva){ this.imja_arhiva=_imja_arhiva; }

public String getImja_arhiva(){ return this.imja_arhiva; }


@Column(name="ispolzovatftp_resurs")

private Boolean ispolzovatftp_resurs;
public void setIspolzovatftp_resurs(Boolean _ispolzovatftp_resurs){ this.ispolzovatftp_resurs=_ispolzovatftp_resurs; }

public Boolean getIspolzovatftp_resurs(){ return this.ispolzovatftp_resurs; }


@Column(name="ispolzovat_papku")

private Boolean ispolzovat_papku;
public void setIspolzovat_papku(Boolean _ispolzovat_papku){ this.ispolzovat_papku=_ispolzovat_papku; }

public Boolean getIspolzovat_papku(){ return this.ispolzovat_papku; }


@Column(name="ispolzovat_setevoy_katalog")

private Boolean ispolzovat_setevoy_katalog;
public void setIspolzovat_setevoy_katalog(Boolean _ispolzovat_setevoy_katalog){ this.ispolzovat_setevoy_katalog=_ispolzovat_setevoy_katalog; }

public Boolean getIspolzovat_setevoy_katalog(){ return this.ispolzovat_setevoy_katalog; }


@Column(name="uchetnaja_zapis", columnDefinition="text")
private String uchetnaja_zapis;

public void setUchetnaja_zapis(String _uchetnaja_zapis){ this.uchetnaja_zapis=_uchetnaja_zapis; }

public String getUchetnaja_zapis(){ return this.uchetnaja_zapis; }


@Column(name="periodichnost_raspisanija", columnDefinition="text")
private String periodichnost_raspisanija;

public void setPeriodichnost_raspisanija(String _periodichnost_raspisanija){ this.periodichnost_raspisanija=_periodichnost_raspisanija; }

public String getPeriodichnost_raspisanija(){ return this.periodichnost_raspisanija; }


@Column(name="personalizirovana")

private Boolean personalizirovana;
public void setPersonalizirovana(Boolean _personalizirovana){ this.personalizirovana=_personalizirovana; }

public Boolean getPersonalizirovana(){ return this.personalizirovana; }


@Column(name="podgotovlena")

private Boolean podgotovlena;
public void setPodgotovlena(Boolean _podgotovlena){ this.podgotovlena=_podgotovlena; }

public Boolean getPodgotovlena(){ return this.podgotovlena; }


@Column(name="reglamentnoe_zadanie", columnDefinition="text")
private String reglamentnoe_zadanie;

public void setReglamentnoe_zadanie(String _reglamentnoe_zadanie){ this.reglamentnoe_zadanie=_reglamentnoe_zadanie; }

public String getReglamentnoe_zadanie(){ return this.reglamentnoe_zadanie; }


@Column(name="setevoy_kataloglinux", columnDefinition="text")
private String setevoy_kataloglinux;

public void setSetevoy_kataloglinux(String _setevoy_kataloglinux){ this.setevoy_kataloglinux=_setevoy_kataloglinux; }

public String getSetevoy_kataloglinux(){ return this.setevoy_kataloglinux; }


@Column(name="tekst_pisma", columnDefinition="text")
private String tekst_pisma;

public void setTekst_pisma(String _tekst_pisma){ this.tekst_pisma=_tekst_pisma; }

public String getTekst_pisma(){ return this.tekst_pisma; }


@Column(name="tekst_pisma_v_formatehtml", columnDefinition="text")
private String tekst_pisma_v_formatehtml;

public void setTekst_pisma_v_formatehtml(String _tekst_pisma_v_formatehtml){ this.tekst_pisma_v_formatehtml=_tekst_pisma_v_formatehtml; }

public String getTekst_pisma_v_formatehtml(){ return this.tekst_pisma_v_formatehtml; }


@Column(name="tema_pisma", columnDefinition="text")
private String tema_pisma;

public void setTema_pisma(String _tema_pisma){ this.tema_pisma=_tema_pisma; }

public String getTema_pisma(){ return this.tema_pisma; }


@Column(name="tolko_uvedomit")

private Boolean tolko_uvedomit;
public void setTolko_uvedomit(Boolean _tolko_uvedomit){ this.tolko_uvedomit=_tolko_uvedomit; }

public Boolean getTolko_uvedomit(){ return this.tolko_uvedomit; }


@Column(name="transliterirovat_imena_faylov")

private Boolean transliterirovat_imena_faylov;
public void setTransliterirovat_imena_faylov(Boolean _transliterirovat_imena_faylov){ this.transliterirovat_imena_faylov=_transliterirovat_imena_faylov; }

public Boolean getTransliterirovat_imena_faylov(){ return this.transliterirovat_imena_faylov; }


@Column(name="udalitftp_parol", columnDefinition="text")
private String udalitftp_parol;

public void setUdalitftp_parol(String _udalitftp_parol){ this.udalitftp_parol=_udalitftp_parol; }

public String getUdalitftp_parol(){ return this.udalitftp_parol; }


@Column(name="udalit_parol_arhiva", columnDefinition="text")
private String udalit_parol_arhiva;

public void setUdalit_parol_arhiva(String _udalit_parol_arhiva){ this.udalit_parol_arhiva=_udalit_parol_arhiva; }

public String getUdalit_parol_arhiva(){ return this.udalit_parol_arhiva; }


}
