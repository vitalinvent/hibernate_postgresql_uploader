import classesHibernate.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name="registratsii_v_nalogovom_organe")
public class registratsii_v_nalogovom_organe implements Serializable {

public registratsii_v_nalogovom_organe(){}

public registratsii_v_nalogovom_organe(String _guid){ this.guid=UUID.fromString(_guid); }

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

@Column(name="tsifrovoy_indeks_obosoblennogo_podrazdelenija")

private Float tsifrovoy_indeks_obosoblennogo_podrazdelenija;
public void setTsifrovoy_indeks_obosoblennogo_podrazdelenija(Float _tsifrovoy_indeks_obosoblennogo_podrazdelenija){ this.tsifrovoy_indeks_obosoblennogo_podrazdelenija=_tsifrovoy_indeks_obosoblennogo_podrazdelenija; }

public Float getTsifrovoy_indeks_obosoblennogo_podrazdelenija(){ return this.tsifrovoy_indeks_obosoblennogo_podrazdelenija; }


@Column(name="kod_po_o_k_a_t_o", columnDefinition="text")
private String kod_po_o_k_a_t_o;

public void setKod_po_o_k_a_t_o(String _kod_po_o_k_a_t_o){ this.kod_po_o_k_a_t_o=_kod_po_o_k_a_t_o; }

public String getKod_po_o_k_a_t_o(){ return this.kod_po_o_k_a_t_o; }


@Column(name="dokument_predstavitelja", columnDefinition="text")
private String dokument_predstavitelja;

public void setDokument_predstavitelja(String _dokument_predstavitelja){ this.dokument_predstavitelja=_dokument_predstavitelja; }

public String getDokument_predstavitelja(){ return this.dokument_predstavitelja; }



@Column(name="kod", columnDefinition="text")
private String kod;

public void setKod(String _kod){ this.kod=_kod; }

public String getKod(){ return this.kod; }


@Column(name="kod_po_o_k_t_m_o", columnDefinition="text")
private String kod_po_o_k_t_m_o;

public void setKod_po_o_k_t_m_o(String _kod_po_o_k_t_m_o){ this.kod_po_o_k_t_m_o=_kod_po_o_k_t_m_o; }

public String getKod_po_o_k_t_m_o(){ return this.kod_po_o_k_t_m_o; }



@Column(name="k_p_p", columnDefinition="text")
private String k_p_p;

public void setK_p_p(String _k_p_p){ this.k_p_p=_k_p_p; }

public String getK_p_p(){ return this.k_p_p; }


@Column(name="naimenovanie_i_f_n_s", columnDefinition="text")
private String naimenovanie_i_f_n_s;

public void setNaimenovanie_i_f_n_s(String _naimenovanie_i_f_n_s){ this.naimenovanie_i_f_n_s=_naimenovanie_i_f_n_s; }

public String getNaimenovanie_i_f_n_s(){ return this.naimenovanie_i_f_n_s; }


@Column(name="naimenovanie_obosoblennogo_podrazdelenija", columnDefinition="text")
private String naimenovanie_obosoblennogo_podrazdelenija;

public void setNaimenovanie_obosoblennogo_podrazdelenija(String _naimenovanie_obosoblennogo_podrazdelenija){ this.naimenovanie_obosoblennogo_podrazdelenija=_naimenovanie_obosoblennogo_podrazdelenija; }

public String getNaimenovanie_obosoblennogo_podrazdelenija(){ return this.naimenovanie_obosoblennogo_podrazdelenija; }


@Column(name="predstavitel", columnDefinition="text")
private String predstavitel;

public void setPredstavitel(String _predstavitel){ this.predstavitel=_predstavitel; }

public String getPredstavitel(){ return this.predstavitel; }


@Column(name="upolnomochennoe_litso_predstavitelja", columnDefinition="text")
private String upolnomochennoe_litso_predstavitelja;

public void setUpolnomochennoe_litso_predstavitelja(String _upolnomochennoe_litso_predstavitelja){ this.upolnomochennoe_litso_predstavitelja=_upolnomochennoe_litso_predstavitelja; }

public String getUpolnomochennoe_litso_predstavitelja(){ return this.upolnomochennoe_litso_predstavitelja; }


}
