package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.config.spring.hibernate.model.JHeader;
import org.config.spring.hibernate.model.Salesman;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "sp_employee")
public class SpEmployee implements Serializable {

        @Id
        @Basic(optional = true)
        @Column(name = "scy_employee_id", length = 15, nullable = false)
	private String scyEmployeeId;
        @Column(name = "sz_employee_id", length = 20)
	private String szEmployeeId;

        @Column(name = "scy_name", length = 50)
	private String scyName;
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
        @Column(name = "bonus")
        private Boolean bonus;
        
        
//        private String teamId;
//        @Column(name = "workplace", length = 20)
//        private String workplace;
        
//        @Column(name = "type_group", length = 20)
//        private String typeGroup;
//        @Column(name = "type_sales", length = 20)
//        private String typeSales;
//        @Column(name = "team_id", length = 20)

    //        GroupSales groupSales;
    //    	private WorkPlace workPlace;
    //        @ManyToOne(optional = true)
    //        @JoinColumn(name = "teamId", referencedColumnName = "team_id", updatable = false, insertable = false)
    //        private TeamSales teamSales;
    //	Set<SpEmployeeTargetItemDetail> spEmployeeTargetItemDetailSet;
    //	Set<CanDDeliveryOrder> canDDeliveryOrderSet;
    //	TypeSales typeSales;
        
    /**
     * INPUT FOR SALESMAN
     */    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "spEmployee")
    @Fetch(FetchMode.JOIN)
    private Set<Salesman> salesmanSet;

    public Set<Salesman> getSalesmanSet() {
        return salesmanSet;
    }
    public void setSalesmanSet(Set<Salesman> salesmanSet) {
        this.salesmanSet = salesmanSet;
    }       
        
    /**
     * JHEADER KEK
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "spEmployee")
    @Fetch(FetchMode.JOIN)
    private Set<JHeader> jHeaderSet;
    public Set<JHeader> getjHeaderSet() {
        return jHeaderSet;
    }
    public void setjHeaderSet(Set<JHeader> jHeaderSet) {
        this.jHeaderSet = jHeaderSet;
    }

    
    
    public String getScyEmployeeId() {
        return scyEmployeeId;
    }

    public void setScyEmployeeId(String scyEmployeeId) {
        this.scyEmployeeId = scyEmployeeId;
    }

    public String getScyName() {
        return scyName;
    }

    public void setScyName(String scyName) {
        this.scyName = scyName;
    }
        
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
        final SpEmployee other = (SpEmployee) obj;
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