import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="tarifi_platezhnih_agentov")
public class tarifi_platezhnih_agentov implements Serializable {

public tarifi_platezhnih_agentov(){}

public tarifi_platezhnih_agentov(String _guid){ this.guid=UUID.fromString(_guid); }

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



@Column(name="sposob_vvoda_summi")

private Float sposob_vvoda_summi;
public void setSposob_vvoda_summi(Float _sposob_vvoda_summi){ this.sposob_vvoda_summi=_sposob_vvoda_summi; }

public Float getSposob_vvoda_summi(){ return this.sposob_vvoda_summi; }


@Column(name="ispolzuetsja_shkala")

private Boolean ispolzuetsja_shkala;
public void setIspolzuetsja_shkala(Boolean _ispolzuetsja_shkala){ this.ispolzuetsja_shkala=_ispolzuetsja_shkala; }

public Boolean getIspolzuetsja_shkala(){ return this.ispolzuetsja_shkala; }


}
