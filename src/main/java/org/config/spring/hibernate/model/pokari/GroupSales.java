package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group_sales")
public class GroupSales implements Serializable {
        @Column(name = "is_default")
        private Boolean isDefault;
        @Id
        @Column(name="type_group", length = 20)
	private String typeGroup;
        @Column(length = 50)
	private String name;

    //Set<SpEmployee> spEmployeeSet;
        
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
        
    public String getTypeGroup() {
        return typeGroup;
    }

    public void setTypeGroup(String typeGroup) {
        this.typeGroup = typeGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return typeGroup + "  " + name ;
    }


}