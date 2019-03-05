import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="gruppi_vneshnih_polzovateley")
public class gruppi_vneshnih_polzovateley implements Serializable {

public gruppi_vneshnih_polzovateley(){}

public gruppi_vneshnih_polzovateley(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="kommentariy", columnDefinition="text")
private String kommentariy;

public void setKommentariy(String _kommentariy){ this.kommentariy=_kommentariy; }

public String getKommentariy(){ return this.kommentariy; }




@Column(name="udalit_tip_obyektov_avtorizatsii", columnDefinition="text")
private String udalit_tip_obyektov_avtorizatsii;

public void setUdalit_tip_obyektov_avtorizatsii(String _udalit_tip_obyektov_avtorizatsii){ this.udalit_tip_obyektov_avtorizatsii=_udalit_tip_obyektov_avtorizatsii; }

public String getUdalit_tip_obyektov_avtorizatsii(){ return this.udalit_tip_obyektov_avtorizatsii; }


@Column(name="vse_obyekti_avtorizatsii")

private Boolean vse_obyekti_avtorizatsii;
public void setVse_obyekti_avtorizatsii(Boolean _vse_obyekti_avtorizatsii){ this.vse_obyekti_avtorizatsii=_vse_obyekti_avtorizatsii; }

public Boolean getVse_obyekti_avtorizatsii(){ return this.vse_obyekti_avtorizatsii; }


}
