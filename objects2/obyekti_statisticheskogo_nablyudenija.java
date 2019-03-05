import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="obyekti_statisticheskogo_nablyudenija")
public class obyekti_statisticheskogo_nablyudenija implements Serializable {

public obyekti_statisticheskogo_nablyudenija(){}

public obyekti_statisticheskogo_nablyudenija(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="data_izmenenija", columnDefinition="text")
private String data_izmenenija;

public void setData_izmenenija(String _data_izmenenija){ this.data_izmenenija=_data_izmenenija; }

public String getData_izmenenija(){ return this.data_izmenenija; }


@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }


@Column(name="nastroyka", columnDefinition="text")
private String nastroyka;

public void setNastroyka(String _nastroyka){ this.nastroyka=_nastroyka; }

public String getNastroyka(){ return this.nastroyka; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }



@Column(name="trebuet_nastroyki")

private Boolean trebuet_nastroyki;
public void setTrebuet_nastroyki(Boolean _trebuet_nastroyki){ this.trebuet_nastroyki=_trebuet_nastroyki; }

public Boolean getTrebuet_nastroyki(){ return this.trebuet_nastroyki; }


}
