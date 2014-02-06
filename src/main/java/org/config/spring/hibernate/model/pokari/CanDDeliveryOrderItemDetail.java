package org.config.spring.hibernate.model.pokari;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "can_ddelivery_order_item_detail")
public class CanDDeliveryOrderItemDetail {
    @EmbeddedId
    @Column(name = "canDDeliveryOrderItemDetailPK")
    private CanDDeliveryOrderItemDetailPK canDDeliveryOrderItemDetailPK; 
    
    @Column(name = "dec_qty")
    private Double decQty;
    @Column(name = "dec_price")
    private Double decPrice;

    //	MappingProduct mappingProduct;
    public CanDDeliveryOrderItemDetailPK getCanDDeliveryOrderItemDetailPK() {
        return canDDeliveryOrderItemDetailPK;
    }

    public void setCanDDeliveryOrderItemDetailPK(CanDDeliveryOrderItemDetailPK canDDeliveryOrderItemDetailPK) {
        this.canDDeliveryOrderItemDetailPK = canDDeliveryOrderItemDetailPK;
    }

    public Double getDecQty() {
        return decQty;
    }

    public void setDecQty(Double decQty) {
        this.decQty = decQty;
    }

    public Double getDecPrice() {
        return decPrice;
    }

    public void setDecPrice(Double decPrice) {
        this.decPrice = decPrice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.canDDeliveryOrderItemDetailPK);
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
        final CanDDeliveryOrderItemDetail other = (CanDDeliveryOrderItemDetail) obj;
        if (!Objects.equals(this.canDDeliveryOrderItemDetailPK, other.canDDeliveryOrderItemDetailPK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CanDDeliveryOrderItemDetail{" + "canDDeliveryOrderItemDetailPK=" + canDDeliveryOrderItemDetailPK + '}';
    }
        
        
}