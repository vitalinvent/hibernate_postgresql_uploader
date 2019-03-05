import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="klyuchevie_operatsii")
public class klyuchevie_operatsii implements Serializable {

public klyuchevie_operatsii(){}

public klyuchevie_operatsii(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="vipolnena_s_oshibkoy")

private Boolean vipolnena_s_oshibkoy;
public void setVipolnena_s_oshibkoy(Boolean _vipolnena_s_oshibkoy){ this.vipolnena_s_oshibkoy=_vipolnena_s_oshibkoy; }

public Boolean getVipolnena_s_oshibkoy(){ return this.vipolnena_s_oshibkoy; }



@Column(name="imja_hesh", columnDefinition="text")
private String imja_hesh;

public void setImja_hesh(String _imja_hesh){ this.imja_hesh=_imja_hesh; }

public String getImja_hesh(){ return this.imja_hesh; }


@Column(name="dlitelnaja")

private Boolean dlitelnaja;
public void setDlitelnaja(Boolean _dlitelnaja){ this.dlitelnaja=_dlitelnaja; }

public Boolean getDlitelnaja(){ return this.dlitelnaja; }



@Column(name="imja", columnDefinition="text")
private String imja;

public void setImja(String _imja){ this.imja=_imja; }

public String getImja(){ return this.imja; }


@Column(name="prioritet")

private Float prioritet;
public void setPrioritet(Float _prioritet){ this.prioritet=_prioritet; }

public Float getPrioritet(){ return this.prioritet; }


@Column(name="tselevoe_vremja")

private Float tselevoe_vremja;
public void setTselevoe_vremja(Float _tselevoe_vremja){ this.tselevoe_vremja=_tselevoe_vremja; }

public Float getTselevoe_vremja(){ return this.tselevoe_vremja; }


}
