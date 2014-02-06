package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.Date;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "output_ar_customer")
public class OutputArCustomer implements Serializable {

	@Id
        @Column(name = "sz_customer_id", length = 20)
        private String szCustomerId;        
        @Column(name = "sz_name", length = 60)
	private String szName;
        
        @Column(name = "sz_address", length = 60)
	private String szAddress;
        @Column(name = "sz_zip_code", length = 30)
	private String szZipCode;
        @Column(name = "sz_state", length = 30)
	private String szState;
        @Column(name = "sz_city", length = 30)
	private String szCity;
        @Column(name = "sz_district", length = 50)
	private String szDistrict;
        @Column(name = "sz_phone1", length = 30)
	private String szPhone1;
        @Column(name = "sz_phone2", length = 30)        
	private String szPhone2;
        @Column(name = "sz_FAX", length = 30)        
	private String szFax;
        @Column(name = "sz_contract", length = 30)
	private String szContract;
        @Column(name = "sz_email", length = 60)
	private String szEmail;
        @Column(name = "sz_status", length = 30)
	private String szStatus;
        @Column(name = "sz_distr_channel_id", length = 20)
	private String szDistrChannelId;
	@Column(name = "b_allow_to_credit")
        private Boolean bAllowToCredit;
        @Column(name = "dec_limit_credit")
	private Double decLimitCredit;
        @Column(name = "sz_payment_term_id", length = 20)
	private String szPaymentTermId;
        @Column(name = "sz_hirarchy_id", length = 20)
	private String szHirarchyId;
        @Column(name = "sz_sales_territory_id", length = 20)
	private String szSalesTerritoryId;
        @Column(name = "sz_employee_id", length = 20)
	private String szEmployeeId;
        @Column(name = "sz_workplace_id", length = 20)
	private String szWorkplaceId;
        @Column(name = "sz_customer_group_id", length = 20)
	private String szCustomerGroupId;
        @Column(name = "sz_npwp", length = 50)
	private String szNPWP;
        
        @Column(name = "dtm_register_date")
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date dtmRegisterDate;
        
        /*
         * Kita pakai sebagia opsional karena kita tidak pernah memakainnya
         * pada output
         */ 
        @Column(name = "baru")
	private Boolean baru;
        @Column(name = "allow_transfer")
	private Boolean allowTransfer;
	private Boolean aktif;
        
        
    public String getSzWorkplaceId() {
        return szWorkplaceId;
    }

    public void setSzWorkplaceId(String szWorkplaceId) {
        this.szWorkplaceId = szWorkplaceId;
    }
        
        
        
    public String getSzCustomerId() {
        return szCustomerId;
    }

    public void setSzCustomerId(String szCustomerId) {
        this.szCustomerId = szCustomerId;
    }

    public String getSzName() {
        return szName;
    }

    public void setSzName(String szName) {
        this.szName = szName;
    }

    public String getSzAddress() {
        return szAddress;
    }

    public void setSzAddress(String szAddress) {
        this.szAddress = szAddress;
    }

    public String getSzZipCode() {
        return szZipCode;
    }

    public void setSzZipCode(String szZipCode) {
        this.szZipCode = szZipCode;
    }

    public String getSzState() {
        return szState;
    }

    public void setSzState(String szState) {
        this.szState = szState;
    }

    public String getSzCity() {
        return szCity;
    }

    public void setSzCity(String szCity) {
        this.szCity = szCity;
    }

    public String getSzDistrict() {
        return szDistrict;
    }

    public void setSzDistrict(String szDistrict) {
        this.szDistrict = szDistrict;
    }

    public String getSzPhone1() {
        return szPhone1;
    }

    public void setSzPhone1(String szPhone1) {
        this.szPhone1 = szPhone1;
    }

    public String getSzPhone2() {
        return szPhone2;
    }

    public void setSzPhone2(String szPhone2) {
        this.szPhone2 = szPhone2;
    }

    public String getSzFax() {
        return szFax;
    }

    public void setSzFax(String szFax) {
        this.szFax = szFax;
    }

    public String getSzContract() {
        return szContract;
    }

    public void setSzContract(String szContract) {
        this.szContract = szContract;
    }

    public String getSzEmail() {
        return szEmail;
    }

    public void setSzEmail(String szEmail) {
        this.szEmail = szEmail;
    }

    public String getSzStatus() {
        return szStatus;
    }

    public void setSzStatus(String szStatus) {
        this.szStatus = szStatus;
    }

    public String getSzDistrChannelId() {
        return szDistrChannelId;
    }

    public void setSzDistrChannelId(String szDistrChannelId) {
        this.szDistrChannelId = szDistrChannelId;
    }

    public Boolean getbAllowToCredit() {
        return bAllowToCredit;
    }

    public void setbAllowToCredit(Boolean bAllowToCredit) {
        this.bAllowToCredit = bAllowToCredit;
    }

    public Double getDecLimitCredit() {
        return decLimitCredit;
    }

    public void setDecLimitCredit(Double decLimitCredit) {
        this.decLimitCredit = decLimitCredit;
    }

    public String getSzPaymentTermId() {
        return szPaymentTermId;
    }

    public void setSzPaymentTermId(String szPaymentTermId) {
        this.szPaymentTermId = szPaymentTermId;
    }

    public String getSzNPWP() {
        return szNPWP;
    }

    public void setSzNPWP(String szNPWP) {
        this.szNPWP = szNPWP;
    }

    public Date getDtmRegisterDate() {
        return dtmRegisterDate;
    }

    public void setDtmRegisterDate(Date dtmRegisterDate) {
        this.dtmRegisterDate = dtmRegisterDate;
    }

    public String getSzHirarchyId() {
        return szHirarchyId;
    }

    public void setSzHirarchyId(String szHirarchyId) {
        this.szHirarchyId = szHirarchyId;
    }

    public String getSzSalesTerritoryId() {
        return szSalesTerritoryId;
    }

    public void setSzSalesTerritoryId(String szSalesTerritoryId) {
        this.szSalesTerritoryId = szSalesTerritoryId;
    }

    public String getSzEmployeeId() {
        return szEmployeeId;
    }

    public void setSzEmployeeId(String szEmployeeId) {
        this.szEmployeeId = szEmployeeId;
    }

    public String getSzCustomerGroupId() {
        return szCustomerGroupId;
    }

    public void setSzCustomerGroupId(String szCustomerGroupId) {
        this.szCustomerGroupId = szCustomerGroupId;
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
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.szCustomerId);
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
        final OutputArCustomer other = (OutputArCustomer) obj;
        if (!Objects.equals(this.szCustomerId, other.szCustomerId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return szCustomerId + "  " + szName;
    }

        
}