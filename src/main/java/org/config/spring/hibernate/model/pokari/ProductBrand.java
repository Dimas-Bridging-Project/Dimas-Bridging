package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "product_brand")
public class ProductBrand implements Serializable {
        @Column(name = "is_default")
        private Boolean isDefault;
        @Id
        @Column(name = "sz_brand_id", length = 20)
	private String szBrandId;
        @Column(name = "sz_name", length = 50)
	private String szName;
        @Column(name = "sz_hirarchy_id", length = 20)
	private String szHirarchyId;

//        Set<MappingProduct> mappingProductSet;
//	Set<SpEmployeeTargetItemDetail> spEmployeeTargetItemDetailSet;

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getSzBrandId() {
        return szBrandId;
    }

    public void setSzBrandId(String szBrandId) {
        this.szBrandId = szBrandId;
    }

    public String getSzName() {
        return szName;
    }

    public void setSzName(String szName) {
        this.szName = szName;
    }

    public String getSzHirarchyId() {
        return szHirarchyId;
    }

    public void setSzHirarchyId(String szHirarchyId) {
        this.szHirarchyId = szHirarchyId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.szBrandId);
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
        final ProductBrand other = (ProductBrand) obj;
        if (!Objects.equals(this.szBrandId, other.szBrandId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return szBrandId + "  " + szName;
    }

 
        

}