package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "can_ddelivery_order_item_disc")
public class CanDDeliveryOrderItemDisc implements Serializable {
    @EmbeddedId
    @Column(name = "canDDeliveryOrderItemDiscPK")
    private CanDDeliveryOrderItemDiscPK canDDeliveryOrderItemDiscPK; 
    
    @Column(name = "dec_disc")
    private Double decDisc;

    //	MappingProduct mappingProduct;
    public CanDDeliveryOrderItemDiscPK getCanDDeliveryOrderItemDiscPK() {
        return canDDeliveryOrderItemDiscPK;
    }

    public void setCanDDeliveryOrderItemDiscPK(CanDDeliveryOrderItemDiscPK canDDeliveryOrderItemDiscPK) {
        this.canDDeliveryOrderItemDiscPK = canDDeliveryOrderItemDiscPK;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.canDDeliveryOrderItemDiscPK);
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
        final CanDDeliveryOrderItemDisc other = (CanDDeliveryOrderItemDisc) obj;
        if (!Objects.equals(this.canDDeliveryOrderItemDiscPK, other.canDDeliveryOrderItemDiscPK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CanDDeliveryOrderItemDisc{" + "canDDeliveryOrderItemDiscPK=" + canDDeliveryOrderItemDiscPK + '}';
    }
      
        
}