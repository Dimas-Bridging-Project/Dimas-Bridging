package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "team_sales")
public class TeamSales implements Serializable {
        @Column(name = "is_default")
        private Boolean isDefault;
        @Id
        @Column(name = "team_id", length = 20)
	private String teamId;
        @Column(length = 50)
	private String name;

    //        @OneToMany(cascade = CascadeType.ALL, mappedBy = "teamSales")
    //        @Fetch(FetchMode.JOIN)
    //        Set<SpEmployee> spEmployeeSet;
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
    
        
    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.teamId);
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
        final TeamSales other = (TeamSales) obj;
        if (!Objects.equals(this.teamId, other.teamId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return teamId + "  " + name ;
    }

 
        

}