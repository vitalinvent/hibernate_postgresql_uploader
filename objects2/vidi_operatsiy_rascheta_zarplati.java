import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="vidi_operatsiy_rascheta_zarplati")
public class vidi_operatsiy_rascheta_zarplati implements Serializable {

public vidi_operatsiy_rascheta_zarplati(){}

public vidi_operatsiy_rascheta_zarplati(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="lgoti")

private Boolean lgoti;
public void setLgoti(Boolean _lgoti){ this.lgoti=_lgoti; }

public Boolean getLgoti(){ return this.lgoti; }



@Column(name="nachislenie")

private Boolean nachislenie;
public void setNachislenie(Boolean _nachislenie){ this.nachislenie=_nachislenie; }

public Boolean getNachislenie(){ return this.nachislenie; }


@Column(name="dogovori")

private Boolean dogovori;
public void setDogovori(Boolean _dogovori){ this.dogovori=_dogovori; }

public Boolean getDogovori(){ return this.dogovori; }


@Column(name="n_d_f_l")

private Boolean n_d_f_l;
public void setN_d_f_l(Boolean _n_d_f_l){ this.n_d_f_l=_n_d_f_l; }

public Boolean getN_d_f_l(){ return this.n_d_f_l; }


@Column(name="posobija")

private Boolean posobija;
public void setPosobija(Boolean _posobija){ this.posobija=_posobija; }

public Boolean getPosobija(){ return this.posobija; }


@Column(name="uderzhanija")

private Boolean uderzhanija;
public void setUderzhanija(Boolean _uderzhanija){ this.uderzhanija=_uderzhanija; }

public Boolean getUderzhanija(){ return this.uderzhanija; }


@Column(name="zaymi")

private Boolean zaymi;
public void setZaymi(Boolean _zaymi){ this.zaymi=_zaymi; }

public Boolean getZaymi(){ return this.zaymi; }


@Column(name="vznosi")

private Boolean vznosi;
public void setVznosi(Boolean _vznosi){ this.vznosi=_vznosi; }

public Boolean getVznosi(){ return this.vznosi; }


@Column(name="v_arhive")

private Boolean v_arhive;
public void setV_arhive(Boolean _v_arhive){ this.v_arhive=_v_arhive; }

public Boolean getV_arhive(){ return this.v_arhive; }


}
