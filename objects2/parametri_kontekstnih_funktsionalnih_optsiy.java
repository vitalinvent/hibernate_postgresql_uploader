import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="parametri_kontekstnih_funktsionalnih_optsiy")
public class parametri_kontekstnih_funktsionalnih_optsiy implements Serializable {

public parametri_kontekstnih_funktsionalnih_optsiy(){}

public parametri_kontekstnih_funktsionalnih_optsiy(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="ispolzovat_dannie_torgovogo_predstavitelja")

private Boolean ispolzovat_dannie_torgovogo_predstavitelja;
public void setIspolzovat_dannie_torgovogo_predstavitelja(Boolean _ispolzovat_dannie_torgovogo_predstavitelja){ this.ispolzovat_dannie_torgovogo_predstavitelja=_ispolzovat_dannie_torgovogo_predstavitelja; }

public Boolean getIspolzovat_dannie_torgovogo_predstavitelja(){ return this.ispolzovat_dannie_torgovogo_predstavitelja; }


@Column(name="ispolzovat_dannie_partnera_postavshchika")

private Boolean ispolzovat_dannie_partnera_postavshchika;
public void setIspolzovat_dannie_partnera_postavshchika(Boolean _ispolzovat_dannie_partnera_postavshchika){ this.ispolzovat_dannie_partnera_postavshchika=_ispolzovat_dannie_partnera_postavshchika; }

public Boolean getIspolzovat_dannie_partnera_postavshchika(){ return this.ispolzovat_dannie_partnera_postavshchika; }



@Column(name="ispolzovat_dannie_partnera_klienta")

private Boolean ispolzovat_dannie_partnera_klienta;
public void setIspolzovat_dannie_partnera_klienta(Boolean _ispolzovat_dannie_partnera_klienta){ this.ispolzovat_dannie_partnera_klienta=_ispolzovat_dannie_partnera_klienta; }

public Boolean getIspolzovat_dannie_partnera_klienta(){ return this.ispolzovat_dannie_partnera_klienta; }


@Column(name="ispolzovat_dannie_kontragenta_fizicheskogo_litsa")

private Boolean ispolzovat_dannie_kontragenta_fizicheskogo_litsa;
public void setIspolzovat_dannie_kontragenta_fizicheskogo_litsa(Boolean _ispolzovat_dannie_kontragenta_fizicheskogo_litsa){ this.ispolzovat_dannie_kontragenta_fizicheskogo_litsa=_ispolzovat_dannie_kontragenta_fizicheskogo_litsa; }

public Boolean getIspolzovat_dannie_kontragenta_fizicheskogo_litsa(){ return this.ispolzovat_dannie_kontragenta_fizicheskogo_litsa; }


@Column(name="ispolzovat_dannie_postavshchika_ili_konkurenta")

private Boolean ispolzovat_dannie_postavshchika_ili_konkurenta;
public void setIspolzovat_dannie_postavshchika_ili_konkurenta(Boolean _ispolzovat_dannie_postavshchika_ili_konkurenta){ this.ispolzovat_dannie_postavshchika_ili_konkurenta=_ispolzovat_dannie_postavshchika_ili_konkurenta; }

public Boolean getIspolzovat_dannie_postavshchika_ili_konkurenta(){ return this.ispolzovat_dannie_postavshchika_ili_konkurenta; }


@Column(name="ispolzovat_dannie_partnera_soglashenija_s_klientami")

private Boolean ispolzovat_dannie_partnera_soglashenija_s_klientami;
public void setIspolzovat_dannie_partnera_soglashenija_s_klientami(Boolean _ispolzovat_dannie_partnera_soglashenija_s_klientami){ this.ispolzovat_dannie_partnera_soglashenija_s_klientami=_ispolzovat_dannie_partnera_soglashenija_s_klientami; }

public Boolean getIspolzovat_dannie_partnera_soglashenija_s_klientami(){ return this.ispolzovat_dannie_partnera_soglashenija_s_klientami; }


@Column(name="ispolzovat_materiali_v_ekspluatatsii")

private Boolean ispolzovat_materiali_v_ekspluatatsii;
public void setIspolzovat_materiali_v_ekspluatatsii(Boolean _ispolzovat_materiali_v_ekspluatatsii){ this.ispolzovat_materiali_v_ekspluatatsii=_ispolzovat_materiali_v_ekspluatatsii; }

public Boolean getIspolzovat_materiali_v_ekspluatatsii(){ return this.ispolzovat_materiali_v_ekspluatatsii; }


@Column(name="ispolzovat_varianti_naladki")

private Boolean ispolzovat_varianti_naladki;
public void setIspolzovat_varianti_naladki(Boolean _ispolzovat_varianti_naladki){ this.ispolzovat_varianti_naladki=_ispolzovat_varianti_naladki; }

public Boolean getIspolzovat_varianti_naladki(){ return this.ispolzovat_varianti_naladki; }


@Column(name="ispolzovat_dannie_podpisok")

private Boolean ispolzovat_dannie_podpisok;
public void setIspolzovat_dannie_podpisok(Boolean _ispolzovat_dannie_podpisok){ this.ispolzovat_dannie_podpisok=_ispolzovat_dannie_podpisok; }

public Boolean getIspolzovat_dannie_podpisok(){ return this.ispolzovat_dannie_podpisok; }


@Column(name="ispolzovat_dogovori_kreditov_i_depozitov")

private Boolean ispolzovat_dogovori_kreditov_i_depozitov;
public void setIspolzovat_dogovori_kreditov_i_depozitov(Boolean _ispolzovat_dogovori_kreditov_i_depozitov){ this.ispolzovat_dogovori_kreditov_i_depozitov=_ispolzovat_dogovori_kreditov_i_depozitov; }

public Boolean getIspolzovat_dogovori_kreditov_i_depozitov(){ return this.ispolzovat_dogovori_kreditov_i_depozitov; }


@Column(name="ispolzovat_ustanavlivaemiy_nefinansoviy_pokazatel_byudzhetov")

private Boolean ispolzovat_ustanavlivaemiy_nefinansoviy_pokazatel_byudzhetov;
public void setIspolzovat_ustanavlivaemiy_nefinansoviy_pokazatel_byudzhetov(Boolean _ispolzovat_ustanavlivaemiy_nefinansoviy_pokazatel_byudzhetov){ this.ispolzovat_ustanavlivaemiy_nefinansoviy_pokazatel_byudzhetov=_ispolzovat_ustanavlivaemiy_nefinansoviy_pokazatel_byudzhetov; }

public Boolean getIspolzovat_ustanavlivaemiy_nefinansoviy_pokazatel_byudzhetov(){ return this.ispolzovat_ustanavlivaemiy_nefinansoviy_pokazatel_byudzhetov; }


@Column(name="ispolzovat_svjazi_statey_byudzhetov")

private Boolean ispolzovat_svjazi_statey_byudzhetov;
public void setIspolzovat_svjazi_statey_byudzhetov(Boolean _ispolzovat_svjazi_statey_byudzhetov){ this.ispolzovat_svjazi_statey_byudzhetov=_ispolzovat_svjazi_statey_byudzhetov; }

public Boolean getIspolzovat_svjazi_statey_byudzhetov(){ return this.ispolzovat_svjazi_statey_byudzhetov; }


}
