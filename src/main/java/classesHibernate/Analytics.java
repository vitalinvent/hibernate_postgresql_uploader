package classesHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Entity
public class Analytics implements Serializable {

    public Analytics(){}
    public Analytics(String _naimenovaniedb){
        this.guid=UUID.randomUUID();
        this.naimenovaniedb=_naimenovaniedb; }
    public Analytics(String _naimenovanie,String _naimenovaniedb,Integer _code){
        this.guid=UUID.randomUUID();
        this.naimenovanie=_naimenovanie;
        this.naimenovaniedb=_naimenovaniedb;
        this.code=_code;}

    @Id
    private UUID guid;
    public UUID getGuid(){return this.guid;}
    public void setGuid(UUID _guid){ this.guid=_guid;}

    @Column(name = "naimenovanie",columnDefinition = "TEXT")
    private String naimenovanie;
    public String getNaimenovanie(){ return this.naimenovanie; }
    public void setNaimenovanie(String _naimenovanie){ this.naimenovanie=_naimenovanie; }

    @Column(name = "naimenovaniedb",columnDefinition = "TEXT")
    private String naimenovaniedb;
    public String getNaimenovaniedb(){ return this.naimenovaniedb; }
    public void setNaimenovaniedb(String _naimenovaniedb){ this.naimenovaniedb=_naimenovaniedb; }

    @Column(name = "code",columnDefinition = "integer")
    private Integer code;
    public Integer getCode(){ return this.code; }
    public void setCode(Integer _code){ this.code=_code; }

}
