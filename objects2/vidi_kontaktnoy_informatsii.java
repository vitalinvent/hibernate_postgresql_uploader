import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="vidi_kontaktnoy_informatsii")
public class vidi_kontaktnoy_informatsii implements Serializable {

public vidi_kontaktnoy_informatsii(){}

public vidi_kontaktnoy_informatsii(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="zapretit_redaktirovanie_polzovatelem")

private Boolean zapretit_redaktirovanie_polzovatelem;
public void setZapretit_redaktirovanie_polzovatelem(Boolean _zapretit_redaktirovanie_polzovatelem){ this.zapretit_redaktirovanie_polzovatelem=_zapretit_redaktirovanie_polzovatelem; }

public Boolean getZapretit_redaktirovanie_polzovatelem(){ return this.zapretit_redaktirovanie_polzovatelem; }


@Column(name="tip", columnDefinition="text")
private String tip;

public void setTip(String _tip){ this.tip=_tip; }

public String getTip(){ return this.tip; }



@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="tolko_natsionalniy_adres")

private Boolean tolko_natsionalniy_adres;
public void setTolko_natsionalniy_adres(Boolean _tolko_natsionalniy_adres){ this.tolko_natsionalniy_adres=_tolko_natsionalniy_adres; }

public Boolean getTolko_natsionalniy_adres(){ return this.tolko_natsionalniy_adres; }


@Column(name="vid_polja_drugoe", columnDefinition="text")
private String vid_polja_drugoe;

public void setVid_polja_drugoe(String _vid_polja_drugoe){ this.vid_polja_drugoe=_vid_polja_drugoe; }

public String getVid_polja_drugoe(){ return this.vid_polja_drugoe; }


@Column(name="ispolzuetsja")

private Boolean ispolzuetsja;
public void setIspolzuetsja(Boolean _ispolzuetsja){ this.ispolzuetsja=_ispolzuetsja; }

public Boolean getIspolzuetsja(){ return this.ispolzuetsja; }


@Column(name="vklyuchat_stranu_v_predstavlenie")

private Boolean vklyuchat_stranu_v_predstavlenie;
public void setVklyuchat_stranu_v_predstavlenie(Boolean _vklyuchat_stranu_v_predstavlenie){ this.vklyuchat_stranu_v_predstavlenie=_vklyuchat_stranu_v_predstavlenie; }

public Boolean getVklyuchat_stranu_v_predstavlenie(){ return this.vklyuchat_stranu_v_predstavlenie; }


@Column(name="mozhno_izmenjat_sposob_redaktirovanija")

private Boolean mozhno_izmenjat_sposob_redaktirovanija;
public void setMozhno_izmenjat_sposob_redaktirovanija(Boolean _mozhno_izmenjat_sposob_redaktirovanija){ this.mozhno_izmenjat_sposob_redaktirovanija=_mozhno_izmenjat_sposob_redaktirovanija; }

public Boolean getMozhno_izmenjat_sposob_redaktirovanija(){ return this.mozhno_izmenjat_sposob_redaktirovanija; }


@Column(name="objazatelnoe_zapolnenie")

private Boolean objazatelnoe_zapolnenie;
public void setObjazatelnoe_zapolnenie(Boolean _objazatelnoe_zapolnenie){ this.objazatelnoe_zapolnenie=_objazatelnoe_zapolnenie; }

public Boolean getObjazatelnoe_zapolnenie(){ return this.objazatelnoe_zapolnenie; }


@Column(name="proverjat_korrektnost")

private Boolean proverjat_korrektnost;
public void setProverjat_korrektnost(Boolean _proverjat_korrektnost){ this.proverjat_korrektnost=_proverjat_korrektnost; }

public Boolean getProverjat_korrektnost(){ return this.proverjat_korrektnost; }


@Column(name="proverjat_po_f_i_a_s")

private Boolean proverjat_po_f_i_a_s;
public void setProverjat_po_f_i_a_s(Boolean _proverjat_po_f_i_a_s){ this.proverjat_po_f_i_a_s=_proverjat_po_f_i_a_s; }

public Boolean getProverjat_po_f_i_a_s(){ return this.proverjat_po_f_i_a_s; }


@Column(name="razreshit_vvod_neskolkih_znacheniy")

private Boolean razreshit_vvod_neskolkih_znacheniy;
public void setRazreshit_vvod_neskolkih_znacheniy(Boolean _razreshit_vvod_neskolkih_znacheniy){ this.razreshit_vvod_neskolkih_znacheniy=_razreshit_vvod_neskolkih_znacheniy; }

public Boolean getRazreshit_vvod_neskolkih_znacheniy(){ return this.razreshit_vvod_neskolkih_znacheniy; }


@Column(name="redaktirovanie_tolko_v_dialoge")

private Boolean redaktirovanie_tolko_v_dialoge;
public void setRedaktirovanie_tolko_v_dialoge(Boolean _redaktirovanie_tolko_v_dialoge){ this.redaktirovanie_tolko_v_dialoge=_redaktirovanie_tolko_v_dialoge; }

public Boolean getRedaktirovanie_tolko_v_dialoge(){ return this.redaktirovanie_tolko_v_dialoge; }


@Column(name="telefonc_dobavochnim_nomerom")

private Boolean telefonc_dobavochnim_nomerom;
public void setTelefonc_dobavochnim_nomerom(Boolean _telefonc_dobavochnim_nomerom){ this.telefonc_dobavochnim_nomerom=_telefonc_dobavochnim_nomerom; }

public Boolean getTelefonc_dobavochnim_nomerom(){ return this.telefonc_dobavochnim_nomerom; }


@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }


@Column(name="skrivat_neaktualnie_adresa")

private Boolean skrivat_neaktualnie_adresa;
public void setSkrivat_neaktualnie_adresa(Boolean _skrivat_neaktualnie_adresa){ this.skrivat_neaktualnie_adresa=_skrivat_neaktualnie_adresa; }

public Boolean getSkrivat_neaktualnie_adresa(){ return this.skrivat_neaktualnie_adresa; }


@Column(name="udalit_mnogostrochnoe_pole")

private Boolean udalit_mnogostrochnoe_pole;
public void setUdalit_mnogostrochnoe_pole(Boolean _udalit_mnogostrochnoe_pole){ this.udalit_mnogostrochnoe_pole=_udalit_mnogostrochnoe_pole; }

public Boolean getUdalit_mnogostrochnoe_pole(){ return this.udalit_mnogostrochnoe_pole; }


@Column(name="ukazivat_o_k_t_m_o")

private Boolean ukazivat_o_k_t_m_o;
public void setUkazivat_o_k_t_m_o(Boolean _ukazivat_o_k_t_m_o){ this.ukazivat_o_k_t_m_o=_ukazivat_o_k_t_m_o; }

public Boolean getUkazivat_o_k_t_m_o(){ return this.ukazivat_o_k_t_m_o; }


@Column(name="hranit_istoriyu_izmeneniy")

private Boolean hranit_istoriyu_izmeneniy;
public void setHranit_istoriyu_izmeneniy(Boolean _hranit_istoriyu_izmeneniy){ this.hranit_istoriyu_izmeneniy=_hranit_istoriyu_izmeneniy; }

public Boolean getHranit_istoriyu_izmeneniy(){ return this.hranit_istoriyu_izmeneniy; }


}
