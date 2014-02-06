package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "output_sp_employee_target_item_detail")
public class OutputSpEmployeeTargetItemDetail implements Serializable {
        
        @EmbeddedId
        @Column(name = "sp_employee_target_item_detail_pk")
        private OutputSpEmployeeTargetItemDetailPK outputSpEmployeeTargetItemDetailPK;
        @Column(name = "sz_workplace_id", length = 20)
	private String szWorkPlaceId;
        @Column(name = "dec_qty")
	private Double decQty;

    //	ProductBrand productBrand;
    //	WorkPlace workPlace;
    //	SpEmployee spEmployee;
    public OutputSpEmployeeTargetItemDetailPK getOutputSpEmployeeTargetItemDetailPK() {
        return outputSpEmployeeTargetItemDetailPK;
    }

    public void setOutputSpEmployeeTargetItemDetailPK(OutputSpEmployeeTargetItemDetailPK outputSpEmployeeTargetItemDetailPK) {
        this.outputSpEmployeeTargetItemDetailPK = outputSpEmployeeTargetItemDetailPK;
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
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.outputSpEmployeeTargetItemDetailPK);
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
        final OutputSpEmployeeTargetItemDetail other = (OutputSpEmployeeTargetItemDetail) obj;
        if (!Objects.equals(this.outputSpEmployeeTargetItemDetailPK, other.outputSpEmployeeTargetItemDetailPK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OutputSpEmployeeTargetItemDetail{" + "outputSpEmployeeTargetItemDetailPK=" + outputSpEmployeeTargetItemDetailPK + '}';
    }
  
        

}