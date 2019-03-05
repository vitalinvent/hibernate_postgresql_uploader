import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="drayveri_oborudovanija")
public class drayveri_oborudovanija implements Serializable {

public drayveri_oborudovanija(){}

public drayveri_oborudovanija(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="postavljaetsja_distributivom")

private Boolean postavljaetsja_distributivom;
public void setPostavljaetsja_distributivom(Boolean _postavljaetsja_distributivom){ this.postavljaetsja_distributivom=_postavljaetsja_distributivom; }

public Boolean getPostavljaetsja_distributivom(){ return this.postavljaetsja_distributivom; }




@Column(name="identifikator_obyekta", columnDefinition="text")
private String identifikator_obyekta;

public void setIdentifikator_obyekta(String _identifikator_obyekta){ this.identifikator_obyekta=_identifikator_obyekta; }

public String getIdentifikator_obyekta(){ return this.identifikator_obyekta; }


@Column(name="zagruzhenniy_drayver", columnDefinition="text")
private String zagruzhenniy_drayver;

public void setZagruzhenniy_drayver(String _zagruzhenniy_drayver){ this.zagruzhenniy_drayver=_zagruzhenniy_drayver; }

public String getZagruzhenniy_drayver(){ return this.zagruzhenniy_drayver; }


@Column(name="imja_fayla_drayvera", columnDefinition="text")
private String imja_fayla_drayvera;

public void setImja_fayla_drayvera(String _imja_fayla_drayvera){ this.imja_fayla_drayvera=_imja_fayla_drayvera; }

public String getImja_fayla_drayvera(){ return this.imja_fayla_drayvera; }


@Column(name="imja_maketa_drayvera", columnDefinition="text")
private String imja_maketa_drayvera;

public void setImja_maketa_drayvera(String _imja_maketa_drayvera){ this.imja_maketa_drayvera=_imja_maketa_drayvera; }

public String getImja_maketa_drayvera(){ return this.imja_maketa_drayvera; }


@Column(name="versija_drayvera", columnDefinition="text")
private String versija_drayvera;

public void setVersija_drayvera(String _versija_drayvera){ this.versija_drayvera=_versija_drayvera; }

public String getVersija_drayvera(){ return this.versija_drayvera; }


@Column(name="snjat_s_podderzhki")

private Boolean snjat_s_podderzhki;
public void setSnjat_s_podderzhki(Boolean _snjat_s_podderzhki){ this.snjat_s_podderzhki=_snjat_s_podderzhki; }

public Boolean getSnjat_s_podderzhki(){ return this.snjat_s_podderzhki; }


}
