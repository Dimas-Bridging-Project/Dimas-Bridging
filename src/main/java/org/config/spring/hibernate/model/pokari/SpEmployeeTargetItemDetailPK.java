package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SpEmployeeTargetItemDetailPK implements Serializable {
        @Column(name = "sz_year" , length = 20)
	private String szYear;
        @Column(name = "sz_month", length = 20)
        private String szMonth;
        @Column(name = "sz_employee_id", length = 20)
	private String szEmployeeId;
        @Column(name = "sz_brand_id", length = 20)
	private String szBrandId;

    //	ProductBrand productBrand;
    //	WorkPlace workPlace;
    //	SpEmployee spEmployee;
    public String getSzYear() {
        return szYear;
    }

    public void setSzYear(String szYear) {
        this.szYear = szYear;
    }

    public String getSzMonth() {
        return szMonth;
    }

    public void setSzMonth(String szMonth) {
        this.szMonth = szMonth;
    }

    public String getSzEmployeeId() {
        return szEmployeeId;
    }

    public void setSzEmployeeId(String szEmployeeId) {
        this.szEmployeeId = szEmployeeId;
    }

    public String getSzBrandId() {
        return szBrandId;
    }

    public void setSzBrandId(String szBrandId) {
        this.szBrandId = szBrandId;
    }

    @Override
    public String toString() {
        return szYear + "-" + szMonth + ":" + szEmployeeId + ":" + szBrandId ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.szYear);
        hash = 83 * hash + Objects.hashCode(this.szMonth);
        hash = 83 * hash + Objects.hashCode(this.szEmployeeId);
        hash = 83 * hash + Objects.hashCode(this.szBrandId);
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
        final SpEmployeeTargetItemDetailPK other = (SpEmployeeTargetItemDetailPK) obj;
        if (!Objects.equals(this.szYear, other.szYear)) {
            return false;
        }
        if (!Objects.equals(this.szMonth, other.szMonth)) {
            return false;
        }
        if (!Objects.equals(this.szEmployeeId, other.szEmployeeId)) {
            return false;
        }
        if (!Objects.equals(this.szBrandId, other.szBrandId)) {
            return false;
        }
        return true;
    }
        
        

}