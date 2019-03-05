import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="s_o_p__pokazateli_monitora")
public class s_o_p__pokazateli_monitora implements Serializable {

public s_o_p__pokazateli_monitora(){}

public s_o_p__pokazateli_monitora(String _guid){ this.guid=UUID.fromString(_guid); }

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



@Column(name="sposob_poluchenija")

private Float sposob_poluchenija;
public void setSposob_poluchenija(Float _sposob_poluchenija){ this.sposob_poluchenija=_sposob_poluchenija; }

public Float getSposob_poluchenija(){ return this.sposob_poluchenija; }


@Column(name="eto_gruppa")

private Boolean eto_gruppa;
public void setEto_gruppa(Boolean _eto_gruppa){ this.eto_gruppa=_eto_gruppa; }

public Boolean getEto_gruppa(){ return this.eto_gruppa; }


@Column(name="bez_analitiki_po_vidam_biznesa")

private Boolean bez_analitiki_po_vidam_biznesa;
public void setBez_analitiki_po_vidam_biznesa(Boolean _bez_analitiki_po_vidam_biznesa){ this.bez_analitiki_po_vidam_biznesa=_bez_analitiki_po_vidam_biznesa; }

public Boolean getBez_analitiki_po_vidam_biznesa(){ return this.bez_analitiki_po_vidam_biznesa; }


@Column(name="s_n_d_s")

private Boolean s_n_d_s;
public void setS_n_d_s(Boolean _s_n_d_s){ this.s_n_d_s=_s_n_d_s; }

public Boolean getS_n_d_s(){ return this.s_n_d_s; }


@Column(name="vigruzhat")

private Boolean vigruzhat;
public void setVigruzhat(Boolean _vigruzhat){ this.vigruzhat=_vigruzhat; }

public Boolean getVigruzhat(){ return this.vigruzhat; }


}
