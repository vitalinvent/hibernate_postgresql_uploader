import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="nastroyki_hozjaystvennih_operatsiy")
public class nastroyki_hozjaystvennih_operatsiy implements Serializable {

public nastroyki_hozjaystvennih_operatsiy(){}

public nastroyki_hozjaystvennih_operatsiy(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="ispolzovat_dlja_vibora")

private Boolean ispolzovat_dlja_vibora;
public void setIspolzovat_dlja_vibora(Boolean _ispolzovat_dlja_vibora){ this.ispolzovat_dlja_vibora=_ispolzovat_dlja_vibora; }

public Boolean getIspolzovat_dlja_vibora(){ return this.ispolzovat_dlja_vibora; }


@Column(name="opisanie", columnDefinition="text")
private String opisanie;

public void setOpisanie(String _opisanie){ this.opisanie=_opisanie; }

public String getOpisanie(){ return this.opisanie; }


@Column(name="istochnik_dannih", columnDefinition="text")
private String istochnik_dannih;

public void setIstochnik_dannih(String _istochnik_dannih){ this.istochnik_dannih=_istochnik_dannih; }

public String getIstochnik_dannih(){ return this.istochnik_dannih; }



@Column(name="ispolzovat_v_byudzhetirovanii")

private Boolean ispolzovat_v_byudzhetirovanii;
public void setIspolzovat_v_byudzhetirovanii(Boolean _ispolzovat_v_byudzhetirovanii){ this.ispolzovat_v_byudzhetirovanii=_ispolzovat_v_byudzhetirovanii; }

public Boolean getIspolzovat_v_byudzhetirovanii(){ return this.ispolzovat_v_byudzhetirovanii; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }



@Column(name="predstavlenie_istochnika_dannih", columnDefinition="text")
private String predstavlenie_istochnika_dannih;

public void setPredstavlenie_istochnika_dannih(String _predstavlenie_istochnika_dannih){ this.predstavlenie_istochnika_dannih=_predstavlenie_istochnika_dannih; }

public String getPredstavlenie_istochnika_dannih(){ return this.predstavlenie_istochnika_dannih; }


@Column(name="rashod", columnDefinition="text")
private String rashod;

public void setRashod(String _rashod){ this.rashod=_rashod; }

public String getRashod(){ return this.rashod; }


@Column(name="prihod", columnDefinition="text")
private String prihod;

public void setPrihod(String _prihod){ this.prihod=_prihod; }

public String getPrihod(){ return this.prihod; }


@Column(name="hozjaystvennaja_operatsija", columnDefinition="text")
private String hozjaystvennaja_operatsija;

public void setHozjaystvennaja_operatsija(String _hozjaystvennaja_operatsija){ this.hozjaystvennaja_operatsija=_hozjaystvennaja_operatsija; }

public String getHozjaystvennaja_operatsija(){ return this.hozjaystvennaja_operatsija; }


@Column(name="ispolzovat_v_mezhdunarodnom_uchete")

private Boolean ispolzovat_v_mezhdunarodnom_uchete;
public void setIspolzovat_v_mezhdunarodnom_uchete(Boolean _ispolzovat_v_mezhdunarodnom_uchete){ this.ispolzovat_v_mezhdunarodnom_uchete=_ispolzovat_v_mezhdunarodnom_uchete; }

public Boolean getIspolzovat_v_mezhdunarodnom_uchete(){ return this.ispolzovat_v_mezhdunarodnom_uchete; }


@Column(name="ispolzovat_v_reestre_dokumentov")

private Boolean ispolzovat_v_reestre_dokumentov;
public void setIspolzovat_v_reestre_dokumentov(Boolean _ispolzovat_v_reestre_dokumentov){ this.ispolzovat_v_reestre_dokumentov=_ispolzovat_v_reestre_dokumentov; }

public Boolean getIspolzovat_v_reestre_dokumentov(){ return this.ispolzovat_v_reestre_dokumentov; }


}
