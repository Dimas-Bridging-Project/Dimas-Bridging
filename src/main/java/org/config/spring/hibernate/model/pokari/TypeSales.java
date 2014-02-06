package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "type_sales")
public class TypeSales implements Serializable {
        @Column(name = "is_default")
        private Boolean isDefault;
        @Id
        @Column(name = "type_sales", length = 20)
	private String typeSales;
        @Column(length = 50)
	private String name;

    //	Set<SpEmployee> spEmployeeSet;
        
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
        
    public String getTypeSales() {
        return typeSales;
    }

    public void setTypeSales(String typeSales) {
        this.typeSales = typeSales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.typeSales);
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
        final TypeSales other = (TypeSales) obj;
        if (!Objects.equals(this.typeSales, other.typeSales)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return typeSales + "\t" + name;
    }


        

}