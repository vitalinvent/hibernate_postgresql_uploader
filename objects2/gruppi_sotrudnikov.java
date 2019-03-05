import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="gruppi_sotrudnikov")
public class gruppi_sotrudnikov implements Serializable {

public gruppi_sotrudnikov(){}

public gruppi_sotrudnikov(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="hranilishche_nastroek", columnDefinition="text")
private String hranilishche_nastroek;

public void setHranilishche_nastroek(String _hranilishche_nastroek){ this.hranilishche_nastroek=_hranilishche_nastroek; }

public String getHranilishche_nastroek(){ return this.hranilishche_nastroek; }




@Column(name="formirovat_avtomaticheski")

private Boolean formirovat_avtomaticheski;
public void setFormirovat_avtomaticheski(Boolean _formirovat_avtomaticheski){ this.formirovat_avtomaticheski=_formirovat_avtomaticheski; }

public Boolean getFormirovat_avtomaticheski(){ return this.formirovat_avtomaticheski; }


}
