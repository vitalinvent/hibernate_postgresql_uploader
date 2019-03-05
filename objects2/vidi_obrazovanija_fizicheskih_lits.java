import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="vidi_obrazovanija_fizicheskih_lits")
public class vidi_obrazovanija_fizicheskih_lits implements Serializable {

public vidi_obrazovanija_fizicheskih_lits(){}

public vidi_obrazovanija_fizicheskih_lits(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="faset_o_k_i_n")

private Float faset_o_k_i_n;
public void setFaset_o_k_i_n(Float _faset_o_k_i_n){ this.faset_o_k_i_n=_faset_o_k_i_n; }

public Float getFaset_o_k_i_n(){ return this.faset_o_k_i_n; }



}
