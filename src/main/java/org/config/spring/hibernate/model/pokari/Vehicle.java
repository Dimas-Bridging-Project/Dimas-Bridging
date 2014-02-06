package org.config.spring.hibernate.model.pokari;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "vehicle")
public class Vehicle {
        @Id
        @Column(name = "sz_vehicle_id", length = 20)
	private String szVehicleId;
        @Column(name = "sz_vechicle_name", length = 50)
	private String szVehicleName;
        @Column(name = "sz_police_no", length = 50)
	private String szPoliceNo;
        
//	Set<SpEmployee> spEmployeeSet;

    public String getSzVehicleId() {
        return szVehicleId;
    }

    public void setSzVehicleId(String szVehicleId) {
        this.szVehicleId = szVehicleId;
    }

    public String getSzVehicleName() {
        return szVehicleName;
    }

    public void setSzVehicleName(String szVehicleName) {
        this.szVehicleName = szVehicleName;
    }

    public String getSzPoliceNo() {
        return szPoliceNo;
    }

    public void setSzPoliceNo(String szPoliceNo) {
        this.szPoliceNo = szPoliceNo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.szVehicleId);
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
        final Vehicle other = (Vehicle) obj;
        if (!Objects.equals(this.szVehicleId, other.szVehicleId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return szVehicleId + "  " + szVehicleName;
    }

  

}