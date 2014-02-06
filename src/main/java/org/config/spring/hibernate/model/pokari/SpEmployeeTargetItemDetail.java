package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sp_employee_target_item_detail")
public class SpEmployeeTargetItemDetail implements Serializable {
        
        @EmbeddedId
        @Column(name = "sp_employee_target_item_detail_pk")
        SpEmployeeTargetItemDetailPK spEmployeeTargetItemDetailPK;
        @Column(name = "sz_workplace_id", length = 20)
	private String szWorkPlaceId;
        @Column(name = "dec_qty")
	private Double decQty;

    //	ProductBrand productBrand;
    //	WorkPlace workPlace;
    //	SpEmployee spEmployee;
    public SpEmployeeTargetItemDetailPK getSpEmployeeTargetItemDetailPK() {
        return spEmployeeTargetItemDetailPK;
    }

    public void setSpEmployeeTargetItemDetailPK(SpEmployeeTargetItemDetailPK spEmployeeTargetItemDetailPK) {
        this.spEmployeeTargetItemDetailPK = spEmployeeTargetItemDetailPK;
    }

    public String getSzWorkPlaceId() {
        return szWorkPlaceId;
    }

    public void setSzWorkPlaceId(String szWorkPlaceId) {
        this.szWorkPlaceId = szWorkPlaceId;
    }

    public Double getDecQty() {
        return decQty;
    }

    public void setDecQty(Double decQty) {
        this.decQty = decQty;
    }
        
        
    @Override
    public String toString() {
        return "SpEmployeeTargetItemDetail{" + "spEmployeeTargetItemDetailPK=" + spEmployeeTargetItemDetailPK + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.spEmployeeTargetItemDetailPK);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SpEmployeeTargetItemDetail other = (SpEmployeeTargetItemDetail) obj;
        if (!Objects.equals(this.spEmployeeTargetItemDetailPK, other.spEmployeeTargetItemDetailPK)) {
            return false;
        }
        return true;
    }
        

}