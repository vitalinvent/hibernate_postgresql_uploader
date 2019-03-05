import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="nastroyki_r_m_k")
public class nastroyki_r_m_k implements Serializable {

public nastroyki_r_m_k(){}

public nastroyki_r_m_k(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="kassir_mozhet_bit_prodavtsom")

private Boolean kassir_mozhet_bit_prodavtsom;
public void setKassir_mozhet_bit_prodavtsom(Boolean _kassir_mozhet_bit_prodavtsom){ this.kassir_mozhet_bit_prodavtsom=_kassir_mozhet_bit_prodavtsom; }

public Boolean getKassir_mozhet_bit_prodavtsom(){ return this.kassir_mozhet_bit_prodavtsom; }




@Column(name="ispolzovat_avtorizatsiyu")

private Boolean ispolzovat_avtorizatsiyu;
public void setIspolzovat_avtorizatsiyu(Boolean _ispolzovat_avtorizatsiyu){ this.ispolzovat_avtorizatsiyu=_ispolzovat_avtorizatsiyu; }

public Boolean getIspolzovat_avtorizatsiyu(){ return this.ispolzovat_avtorizatsiyu; }


@ManyToOne
@JoinColumn(name="rabochee_mesto", insertable = true, updatable = true)
private rabochie_mesta rabochee_mesto;

public rabochie_mesta getRabochee_mesto(){ try{return this.rabochee_mesto;}catch(Exception ex){ return null;} }

public void setRabochee_mesto( Object _rabochee_mesto){if (_rabochee_mesto instanceof String){this.rabochee_mesto= new rabochie_mesta (_rabochee_mesto.toString());}else{try{this.rabochee_mesto= (rabochie_mesta) _rabochee_mesto;}catch(Exception ex){Variables.logger.error(ex);this.rabochee_mesto= new rabochie_mesta (_rabochee_mesto.toString());}}}

public UUID getRabochee_mesto_uuid(){ try{return this.rabochee_mesto.getGuid();}catch(Exception ex){return null;} }

public String getRabochee_mesto_type(){ try{return this.rabochee_mesto.getClass().getName();}catch(Exception ex){return null;} }

public rabochie_mesta getRabochee_mesto_obj(){ return this.rabochee_mesto; }

public void setRabochee_mesto_obj( Object _rabochee_mesto){ this.rabochee_mesto=(rabochie_mesta) _rabochee_mesto; }


@Column(name="menedzher_torgovogo_zala_mozhet_bit_prodavtsom")

private Boolean menedzher_torgovogo_zala_mozhet_bit_prodavtsom;
public void setMenedzher_torgovogo_zala_mozhet_bit_prodavtsom(Boolean _menedzher_torgovogo_zala_mozhet_bit_prodavtsom){ this.menedzher_torgovogo_zala_mozhet_bit_prodavtsom=_menedzher_torgovogo_zala_mozhet_bit_prodavtsom; }

public Boolean getMenedzher_torgovogo_zala_mozhet_bit_prodavtsom(){ return this.menedzher_torgovogo_zala_mozhet_bit_prodavtsom; }


}
