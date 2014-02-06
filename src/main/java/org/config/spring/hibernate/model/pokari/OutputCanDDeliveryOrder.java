package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "output_can_ddelivery")
public class OutputCanDDeliveryOrder implements Serializable {
        @Id
        @Column(name = "sz_doc_id", length = 20)
	private String szDocId;
        
        @Column(name = "sz_employee_id", length = 20)
	private String szEmployeeId;
        @Column(name = "sz_vehicle_id", length = 20)
	private String szVehicleId;
        @Column(name = "sz_order_type_id", length = 20)
	private String szOrderTypeId;
        
        @Column(name = "dtm_doc")
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date dtmDoc;
        @Column(name = "dtm_created")
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date dtmCreated;
        @Column(name = "dtm_last_updated")
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date dtmLastUpdated;
        @Column(name = "sz_workplace_id", length = 20)
	private String szWorkPlaceId;
        @Column(name = "sz_manual_id", length = 50)
	private String szManualId;
    	@Column(name = "sz_sales_id", length = 20)
        private String szSalesId;
        
    public String getSzDocId() {
        return szDocId;
    }

    public void setSzDocId(String szDocId) {
        this.szDocId = szDocId;
    }

    public String getSzEmployeeId() {
        return szEmployeeId;
    }

    public void setSzEmployeeId(String szEmployeeId) {
        this.szEmployeeId = szEmployeeId;
    }

    public String getSzVehicleId() {
        return szVehicleId;
    }

    public void setSzVehicleId(String szVehicleId) {
        this.szVehicleId = szVehicleId;
    }

    public String getSzOrderTypeId() {
        return szOrderTypeId;
    }

    public void setSzOrderTypeId(String szOrderTypeId) {
        this.szOrderTypeId = szOrderTypeId;
    }

    public Date getDtmDoc() {
        return dtmDoc;
    }

    public void setDtmDoc(Date dtmDoc) {
        this.dtmDoc = dtmDoc;
    }

    public Date getDtmCreated() {
        return dtmCreated;
    }

    public void setDtmCreated(Date dtmCreated) {
        this.dtmCreated = dtmCreated;
    }

    public Date getDtmLastUpdated() {
        return dtmLastUpdated;
    }

    public void setDtmLastUpdated(Date dtmLastUpdated) {
        this.dtmLastUpdated = dtmLastUpdated;
    }

    public String getSzWorkPlaceId() {
        return szWorkPlaceId;
    }

    public void setSzWorkPlaceId(String szWorkPlaceId) {
        this.szWorkPlaceId = szWorkPlaceId;
    }

    public String getSzManualId() {
        return szManualId;
    }

    public void setSzManualId(String szManualId) {
        this.szManualId = szManualId;
    }

    public String getSzSalesId() {
        return szSalesId;
    }

    public void setSzSalesId(String szSalesId) {
        this.szSalesId = szSalesId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.szDocId);
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
        final OutputCanDDeliveryOrder other = (OutputCanDDeliveryOrder) obj;
        if (!Objects.equals(this.szDocId, other.szDocId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CanDDeliveryOrder{" + "szDocId=" + szDocId + '}';
    }
        
        
        
}