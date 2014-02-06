package org.config.spring.hibernate.model.pokari;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "workplace")
public class WorkPlace {
        @Column(name = "is_default")
        private Boolean isDefault;
        @Id
        @Column(name = "workplace_id", length = 20)
	private String workPlaceId;
        @Column(length = 50)
	private String area;

    //	Set<ArCustomer> arCustomerSet;
    //	Set<SpEmployee> spEmployeeSet;
    //	Set<SpEmployeeTargetItemDetail> spEmployeeTargetItemDetailSet;
    //	Set<SpEmployeeTarget> spEmployeeTargetSet;
        
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
        
    public String getWorkPlaceId() {
        return workPlaceId;
    }

    public void setWorkPlaceId(String workPlaceId) {
        this.workPlaceId = workPlaceId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.workPlaceId);
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
        final WorkPlace other = (WorkPlace) obj;
        if (!Objects.equals(this.workPlaceId, other.workPlaceId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return workPlaceId + "  " + area;
    }

 
        
}