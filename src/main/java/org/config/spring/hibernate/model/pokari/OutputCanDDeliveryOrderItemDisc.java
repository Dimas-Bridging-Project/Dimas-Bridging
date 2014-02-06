package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "output_can_ddelivery_order_item_disc")
public class OutputCanDDeliveryOrderItemDisc implements Serializable {
    @EmbeddedId
    @Column(name = "canDDeliveryOrderItemDiscPK")
    private OutputCanDDeliveryOrderItemDiscPK outputCanDDeliveryOrderItemDiscPK; 
    
    @Column(name = "dec_disc")
    private Double decDisc;

    //	MappingProduct mappingProduct;
    public OutputCanDDeliveryOrderItemDiscPK getOutputCanDDeliveryOrderItemDiscPK() {
        return outputCanDDeliveryOrderItemDiscPK;
    }

    public void setOutputCanDDeliveryOrderItemDiscPK(OutputCanDDeliveryOrderItemDiscPK outputCanDDeliveryOrderItemDiscPK) {
        this.outputCanDDeliveryOrderItemDiscPK = outputCanDDeliveryOrderItemDiscPK;
    }

    public Double getDecDisc() {
        return decDisc;
    }

    public void setDecDisc(Double decDisc) {
        this.decDisc = decDisc;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.outputCanDDeliveryOrderItemDiscPK);
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
        final OutputCanDDeliveryOrderItemDisc other = (OutputCanDDeliveryOrderItemDisc) obj;
        if (!Objects.equals(this.outputCanDDeliveryOrderItemDiscPK, other.outputCanDDeliveryOrderItemDiscPK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OutputCanDDeliveryOrderItemDisc{" + "outputCanDDeliveryOrderItemDiscPK=" + outputCanDDeliveryOrderItemDiscPK + '}';
    }
 
}