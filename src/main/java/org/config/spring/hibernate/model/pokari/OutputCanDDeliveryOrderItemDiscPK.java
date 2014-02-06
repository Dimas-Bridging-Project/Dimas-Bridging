package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OutputCanDDeliveryOrderItemDiscPK implements Serializable {
    
    @Column(name = "sz_doc_id", length = 20)
    private String szDocId;
    
    @Column(name = "sh_item_number")
    private Integer shItemNumber;
    

    public String getSzDocId() {
        return szDocId;
    }

    public void setSzDocId(String szDocId) {
        this.szDocId = szDocId;
    }

    public Integer getShItemNumber() {
        return shItemNumber;
    }

    public void setShItemNumber(Integer shItemNumber) {
        this.shItemNumber = shItemNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.szDocId);
        hash = 37 * hash + Objects.hashCode(this.shItemNumber);
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
        final OutputCanDDeliveryOrderItemDiscPK other = (OutputCanDDeliveryOrderItemDiscPK) obj;
        if (!Objects.equals(this.szDocId, other.szDocId)) {
            return false;
        }
        if (!Objects.equals(this.shItemNumber, other.shItemNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CanDDeliveryOrderItemDiscPK{" + "szDocId=" + szDocId + ", shItemNumber=" + shItemNumber + '}';
    }

        
        
}