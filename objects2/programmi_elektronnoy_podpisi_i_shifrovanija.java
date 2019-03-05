import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="programmi_elektronnoy_podpisi_i_shifrovanija")
public class programmi_elektronnoy_podpisi_i_shifrovanija implements Serializable {

public programmi_elektronnoy_podpisi_i_shifrovanija(){}

public programmi_elektronnoy_podpisi_i_shifrovanija(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="algoritm_heshirovanija", columnDefinition="text")
private String algoritm_heshirovanija;

public void setAlgoritm_heshirovanija(String _algoritm_heshirovanija){ this.algoritm_heshirovanija=_algoritm_heshirovanija; }

public String getAlgoritm_heshirovanija(){ return this.algoritm_heshirovanija; }




@Column(name="algoritm_shifrovanija", columnDefinition="text")
private String algoritm_shifrovanija;

public void setAlgoritm_shifrovanija(String _algoritm_shifrovanija){ this.algoritm_shifrovanija=_algoritm_shifrovanija; }

public String getAlgoritm_shifrovanija(){ return this.algoritm_shifrovanija; }


@Column(name="imja_programmi", columnDefinition="text")
private String imja_programmi;

public void setImja_programmi(String _imja_programmi){ this.imja_programmi=_imja_programmi; }

public String getImja_programmi(){ return this.imja_programmi; }


@Column(name="tip_programmi")

private Float tip_programmi;
public void setTip_programmi(Float _tip_programmi){ this.tip_programmi=_tip_programmi; }

public Float getTip_programmi(){ return this.tip_programmi; }


@Column(name="algoritm_podpisi", columnDefinition="text")
private String algoritm_podpisi;

public void setAlgoritm_podpisi(String _algoritm_podpisi){ this.algoritm_podpisi=_algoritm_podpisi; }

public String getAlgoritm_podpisi(){ return this.algoritm_podpisi; }


@Column(name="eto_programma_oblachnogo_servisa")

private Boolean eto_programma_oblachnogo_servisa;
public void setEto_programma_oblachnogo_servisa(Boolean _eto_programma_oblachnogo_servisa){ this.eto_programma_oblachnogo_servisa=_eto_programma_oblachnogo_servisa; }

public Boolean getEto_programma_oblachnogo_servisa(){ return this.eto_programma_oblachnogo_servisa; }


}
