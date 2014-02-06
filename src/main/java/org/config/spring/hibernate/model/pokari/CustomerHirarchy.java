package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_hirarchy")
public class CustomerHirarchy implements Serializable {
        @Column(name = "is_default")
        private Boolean isDefault;
        @Id
        @Column(name = "id_hirarchy", length = 50)
	private String idHirarchy;
        @Column(length = 100)
	private String description;

    //	Set<ArCustomer> arCustomerSet;
        
    public String getIdHirarchy() {
        return idHirarchy;
    }

    public void setIdHirarchy(String idHirarchy) {
        this.idHirarchy = idHirarchy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.idHirarchy);
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
        final CustomerHirarchy other = (CustomerHirarchy) obj;
        if (!Objects.equals(this.idHirarchy, other.idHirarchy)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idHirarchy + "  " + description;
    }

        
}