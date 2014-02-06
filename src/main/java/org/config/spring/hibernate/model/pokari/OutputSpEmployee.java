package org.config.spring.hibernate.model.pokari;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "output_sp_employee")
public class OutputSpEmployee {

        @Id
        @Column(name = "sz_employee_id", length = 20)
	private String szEmployeeId;
        @Column(name = "sz_name", length = 50)
	private String szName;
        
        @Column(name = "sz_workplace_id", length = 20)
    	private String szWorkplaceId;
        @Column(name = "sz_Sales_Type", length = 20)
    	private String szSalesType;
        @Column(name = "sz_sales_group", length = 20)
    	private String szSalesGroup;
        @Column(name = "sz_team_id", length = 20)
    	private String szTeamId;
        @Column(name = "sz_vehicle_id", length = 20)
    	private String szVehicleId;
        @Column(name = "sz_vehicle_name", length = 60)
    	private String szVehicleName;
        @Column(name = "sz_police_no", length = 50)
    	private String szPoliceNo;
                
        @Column(name = "baru")
	private Boolean baru;
        @Column(name = "allow_transfer")
	private Boolean allowTransfer;
        @Column(name = "aktif")
	private Boolean aktif;
        
        
        
    public String getSzEmployeeId() {
        return szEmployeeId;
    }

    public void setSzEmployeeId(String szEmployeeId) {
        this.szEmployeeId = szEmployeeId;
    }

    public String getSzName() {
        return szName;
    }

    public void setSzName(String szName) {
        this.szName = szName;
    }

    public String getSzWorkplaceId() {
        return szWorkplaceId;
    }

    public void setSzWorkplaceId(String szWorkplaceId) {
        this.szWorkplaceId = szWorkplaceId;
    }

    public String getSzSalesType() {
        return szSalesType;
    }

    public void setSzSalesType(String szSalesType) {
        this.szSalesType = szSalesType;
    }

    public String getSzSalesGroup() {
        return szSalesGroup;
    }

    public void setSzSalesGroup(String szSalesGroup) {
        this.szSalesGroup = szSalesGroup;
    }

    public String getSzTeamId() {
        return szTeamId;
    }

    public void setSzTeamId(String szTeamId) {
        this.szTeamId = szTeamId;
    }

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

    public Boolean getBaru() {
        return baru;
    }

    public void setBaru(Boolean baru) {
        this.baru = baru;
    }

    public Boolean getAllowTransfer() {
        return allowTransfer;
    }

    public void setAllowTransfer(Boolean allowTransfer) {
        this.allowTransfer = allowTransfer;
    }

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.szEmployeeId);
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
        final OutputSpEmployee other = (OutputSpEmployee) obj;
        if (!Objects.equals(this.szEmployeeId, other.szEmployeeId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return szEmployeeId + "  " + szName;
    }

 
        
}