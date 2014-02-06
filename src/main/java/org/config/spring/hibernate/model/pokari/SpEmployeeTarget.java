package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author yhawin
 */
@Entity
@Table(name = "sp_employee_target")
public class SpEmployeeTarget implements Serializable {
        @EmbeddedId
        @Column(name = "sp_employee_target_pk")
        private SpEmployeeTargetPK spEmployeeTargetPK; 
        
        @Column(name = "sz_workplace_id", length = 20)
	private String szWorkPlaceId;
        @Column(name = "int_working_day")
	private Integer intWorkingDay;

    //        WorkPlace workPlace;
    public String getSzWorkPlaceId() {
        return szWorkPlaceId;
    }

    public void setSzWorkPlaceId(String szWorkPlaceId) {
        this.szWorkPlaceId = szWorkPlaceId;
    }

    public Integer getIntWorkingDay() {
        return intWorkingDay;
    }

    public void setIntWorkingDay(Integer intWorkingDay) {
        this.intWorkingDay = intWorkingDay;
    }

    public SpEmployeeTargetPK getSpEmployeeTargetPK() {
        return spEmployeeTargetPK;
    }

    public void setSpEmployeeTargetPK(SpEmployeeTargetPK spEmployeeTargetPK) {
        this.spEmployeeTargetPK = spEmployeeTargetPK;
    }

    @Override
    public String toString() {
        return "SpEmployeeTarget{" + "spEmployeeTargetPK=" + spEmployeeTargetPK + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.spEmployeeTargetPK);
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
        final SpEmployeeTarget other = (SpEmployeeTarget) obj;
        if (!Objects.equals(this.spEmployeeTargetPK, other.spEmployeeTargetPK)) {
            return false;
        }
        return true;
    }

        

}