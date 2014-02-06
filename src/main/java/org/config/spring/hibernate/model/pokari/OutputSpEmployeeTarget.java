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
@Table(name = "output_sp_employee_target")
public class OutputSpEmployeeTarget implements Serializable {
        @EmbeddedId
        @Column(name = "sp_employee_target_pk")
        private OutputSpEmployeeTargetPK outputSpEmployeeTargetPK; 
        
        @Column(name = "sz_workplace_id", length = 20)
	private String szWorkPlaceId;
        @Column(name = "int_working_day")
	private Integer intWorkingDay;

    //        WorkPlace workPlace;
    public OutputSpEmployeeTargetPK getOutputSpEmployeeTargetPK() {
        return outputSpEmployeeTargetPK;
    }

    public void setOutputSpEmployeeTargetPK(OutputSpEmployeeTargetPK outputSpEmployeeTargetPK) {
        this.outputSpEmployeeTargetPK = outputSpEmployeeTargetPK;
    }

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.outputSpEmployeeTargetPK);
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
        final OutputSpEmployeeTarget other = (OutputSpEmployeeTarget) obj;
        if (!Objects.equals(this.outputSpEmployeeTargetPK, other.outputSpEmployeeTargetPK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OutputSpEmployeeTarget{" + "outputSpEmployeeTargetPK=" + outputSpEmployeeTargetPK + '}';
    }
        
        
        
}