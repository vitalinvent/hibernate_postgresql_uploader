import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="sposobi_viplati_zarplati")
public class sposobi_viplati_zarplati implements Serializable {

public sposobi_viplati_zarplati(){}

public sposobi_viplati_zarplati(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="udalit_identifikator_obyekta", columnDefinition="text")
private String udalit_identifikator_obyekta;

public void setUdalit_identifikator_obyekta(String _udalit_identifikator_obyekta){ this.udalit_identifikator_obyekta=_udalit_identifikator_obyekta; }

public String getUdalit_identifikator_obyekta(){ return this.udalit_identifikator_obyekta; }


@ManyToOne
@JoinColumn(name="okruglenie", insertable = true, updatable = true)
private sposobi_okruglenija_pri_raschete_zarplati okruglenie;

public sposobi_okruglenija_pri_raschete_zarplati getOkruglenie(){ try{return this.okruglenie;}catch(Exception ex){ return null;} }

public void setOkruglenie( Object _okruglenie){if (_okruglenie instanceof String){this.okruglenie= new sposobi_okruglenija_pri_raschete_zarplati (_okruglenie.toString());}else{try{this.okruglenie= (sposobi_okruglenija_pri_raschete_zarplati) _okruglenie;}catch(Exception ex){Variables.logger.error(ex);this.okruglenie= new sposobi_okruglenija_pri_raschete_zarplati (_okruglenie.toString());}}}

public UUID getOkruglenie_uuid(){ try{return this.okruglenie.getGuid();}catch(Exception ex){return null;} }

public String getOkruglenie_type(){ try{return this.okruglenie.getClass().getName();}catch(Exception ex){return null;} }

public sposobi_okruglenija_pri_raschete_zarplati getOkruglenie_obj(){ return this.okruglenie; }

public void setOkruglenie_obj( Object _okruglenie){ this.okruglenie=(sposobi_okruglenija_pri_raschete_zarplati) _okruglenie; }



@Column(name="postavljaemiy")

private Boolean postavljaemiy;
public void setPostavljaemiy(Boolean _postavljaemiy){ this.postavljaemiy=_postavljaemiy; }

public Boolean getPostavljaemiy(){ return this.postavljaemiy; }



@Column(name="protsent_viplati")

private Float protsent_viplati;
public void setProtsent_viplati(Float _protsent_viplati){ this.protsent_viplati=_protsent_viplati; }

public Float getProtsent_viplati(){ return this.protsent_viplati; }


}
