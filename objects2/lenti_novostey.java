import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="lenti_novostey")
public class lenti_novostey implements Serializable {

public lenti_novostey(){}

public lenti_novostey(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="protokol", columnDefinition="text")
private String protokol;

public void setProtokol(String _protokol){ this.protokol=_protokol; }

public String getProtokol(){ return this.protokol; }


@Column(name="sayt", columnDefinition="text")
private String sayt;

public void setSayt(String _sayt){ this.sayt=_sayt; }

public String getSayt(){ return this.sayt; }


@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }



@Column(name="chastota_obnovlenija")

private Float chastota_obnovlenija;
public void setChastota_obnovlenija(Float _chastota_obnovlenija){ this.chastota_obnovlenija=_chastota_obnovlenija; }

public Float getChastota_obnovlenija(){ return this.chastota_obnovlenija; }


@Column(name="objazatelniy_kanal")

private Boolean objazatelniy_kanal;
public void setObjazatelniy_kanal(Boolean _objazatelniy_kanal){ this.objazatelniy_kanal=_objazatelniy_kanal; }

public Boolean getObjazatelniy_kanal(){ return this.objazatelniy_kanal; }


@Column(name="imja_fayla", columnDefinition="text")
private String imja_fayla;

public void setImja_fayla(String _imja_fayla){ this.imja_fayla=_imja_fayla; }

public String getImja_fayla(){ return this.imja_fayla; }


@Column(name="login", columnDefinition="text")
private String login;

public void setLogin(String _login){ this.login=_login; }

public String getLogin(){ return this.login; }


@Column(name="parol", columnDefinition="text")
private String parol;

public void setParol(String _parol){ this.parol=_parol; }

public String getParol(){ return this.parol; }


@Column(name="udalit_parol", columnDefinition="text")
private String udalit_parol;

public void setUdalit_parol(String _udalit_parol){ this.udalit_parol=_udalit_parol; }

public String getUdalit_parol(){ return this.udalit_parol; }


@Column(name="zagruzheno_s_servera")

private Boolean zagruzheno_s_servera;
public void setZagruzheno_s_servera(Boolean _zagruzheno_s_servera){ this.zagruzheno_s_servera=_zagruzheno_s_servera; }

public Boolean getZagruzheno_s_servera(){ return this.zagruzheno_s_servera; }


@Column(name="vidimost_po_umolchaniyu")

private Boolean vidimost_po_umolchaniyu;
public void setVidimost_po_umolchaniyu(Boolean _vidimost_po_umolchaniyu){ this.vidimost_po_umolchaniyu=_vidimost_po_umolchaniyu; }

public Boolean getVidimost_po_umolchaniyu(){ return this.vidimost_po_umolchaniyu; }


@Column(name="kommentariy", columnDefinition="text")
private String kommentariy;

public void setKommentariy(String _kommentariy){ this.kommentariy=_kommentariy; }

public String getKommentariy(){ return this.kommentariy; }


@Column(name="propuskat_zagruzku_binarnih_dannih")

private Boolean propuskat_zagruzku_binarnih_dannih;
public void setPropuskat_zagruzku_binarnih_dannih(Boolean _propuskat_zagruzku_binarnih_dannih){ this.propuskat_zagruzku_binarnih_dannih=_propuskat_zagruzku_binarnih_dannih; }

public Boolean getPropuskat_zagruzku_binarnih_dannih(){ return this.propuskat_zagruzku_binarnih_dannih; }


@Column(name="lokalnaja_lenta_novostey")

private Boolean lokalnaja_lenta_novostey;
public void setLokalnaja_lenta_novostey(Boolean _lokalnaja_lenta_novostey){ this.lokalnaja_lenta_novostey=_lokalnaja_lenta_novostey; }

public Boolean getLokalnaja_lenta_novostey(){ return this.lokalnaja_lenta_novostey; }


}
