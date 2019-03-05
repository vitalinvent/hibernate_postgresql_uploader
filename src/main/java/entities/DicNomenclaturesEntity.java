package entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dic_nomenclatures", schema = "main", catalog = "biplane")
public class DicNomenclaturesEntity {
    private String code;
    private String guid;
    private String name;
    private String unit;
    private Boolean externalActiv;
    private BigDecimal weightUnit;
    private String brand;
    private Boolean thisGroup;
    private int id;

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "guid")
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "external_activ")
    public Boolean getExternalActiv() {
        return externalActiv;
    }

    public void setExternalActiv(Boolean externalActiv) {
        this.externalActiv = externalActiv;
    }

    @Basic
    @Column(name = "weight_unit")
    public BigDecimal getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(BigDecimal weightUnit) {
        this.weightUnit = weightUnit;
    }

    @Basic
    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "this_group")
    public Boolean getThisGroup() {
        return thisGroup;
    }

    public void setThisGroup(Boolean thisGroup) {
        this.thisGroup = thisGroup;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DicNomenclaturesEntity that = (DicNomenclaturesEntity) o;
        return id == that.id &&
                Objects.equals(code, that.code) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(externalActiv, that.externalActiv) &&
                Objects.equals(weightUnit, that.weightUnit) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(thisGroup, that.thisGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, guid, name, unit, externalActiv, weightUnit, brand, thisGroup, id);
    }
}
