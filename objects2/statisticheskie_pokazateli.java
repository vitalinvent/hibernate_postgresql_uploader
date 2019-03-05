import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="statisticheskie_pokazateli")
public class statisticheskie_pokazateli implements Serializable {

public statisticheskie_pokazateli(){}

public statisticheskie_pokazateli(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="harakteristika_obyekta_nablyudenija", columnDefinition="text")
private String harakteristika_obyekta_nablyudenija;

public void setHarakteristika_obyekta_nablyudenija(String _harakteristika_obyekta_nablyudenija){ this.harakteristika_obyekta_nablyudenija=_harakteristika_obyekta_nablyudenija; }

public String getHarakteristika_obyekta_nablyudenija(){ return this.harakteristika_obyekta_nablyudenija; }




@Column(name="detalizirovat")

private Boolean detalizirovat;
public void setDetalizirovat(Boolean _detalizirovat){ this.detalizirovat=_detalizirovat; }

public Boolean getDetalizirovat(){ return this.detalizirovat; }


}
