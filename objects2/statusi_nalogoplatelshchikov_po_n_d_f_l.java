import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="statusi_nalogoplatelshchikov_po_n_d_f_l")
public class statusi_nalogoplatelshchikov_po_n_d_f_l implements Serializable {

public statusi_nalogoplatelshchikov_po_n_d_f_l(){}

public statusi_nalogoplatelshchikov_po_n_d_f_l(String _guid){ this.guid=UUID.fromString(_guid); }

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


@Column(name="rekvizit_dop_uporjadochivanija")

private Float rekvizit_dop_uporjadochivanija;
public void setRekvizit_dop_uporjadochivanija(Float _rekvizit_dop_uporjadochivanija){ this.rekvizit_dop_uporjadochivanija=_rekvizit_dop_uporjadochivanija; }

public Float getRekvizit_dop_uporjadochivanija(){ return this.rekvizit_dop_uporjadochivanija; }



@Column(name="kod_f_n_s_2015", columnDefinition="text")
private String kod_f_n_s_2015;

public void setKod_f_n_s_2015(String _kod_f_n_s_2015){ this.kod_f_n_s_2015=_kod_f_n_s_2015; }

public String getKod_f_n_s_2015(){ return this.kod_f_n_s_2015; }



@Column(name="kod_f_n_s", columnDefinition="text")
private String kod_f_n_s;

public void setKod_f_n_s(String _kod_f_n_s){ this.kod_f_n_s=_kod_f_n_s; }

public String getKod_f_n_s(){ return this.kod_f_n_s; }


}
