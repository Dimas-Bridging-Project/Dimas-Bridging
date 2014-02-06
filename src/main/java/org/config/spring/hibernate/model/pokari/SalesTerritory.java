package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sales_territory")
public class SalesTerritory implements Serializable {
        @Column(name = "is_default")
        private Boolean isDefault;
        @Id
        @Column(name = "id_territory", length = 20)
	private String idTerritory;
        @Column(length = 50)
	private String description;

    //	Set<ArCustomer> arCustomerSet;
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
        
    public String getIdTerritory() {
        return idTerritory;
    }

    public void setIdTerritory(String idTerritory) {
        this.idTerritory = idTerritory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.idTerritory);
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
        final SalesTerritory other = (SalesTerritory) obj;
        if (!Objects.equals(this.idTerritory, other.idTerritory)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  idTerritory + "  " + description;
    }


        

}