package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "output_can_ddelivery_order_item_detail")
public class OutputCanDDeliveryOrderItemDetail implements Serializable {
    @EmbeddedId
    @Column(name = "canDDeliveryOrderItemDetailPK")
    private OutputCanDDeliveryOrderItemDetailPK outputCanDDeliveryOrderItemDetailPK; 
    
    @Column(name = "dec_qty")
    private Double decQty;
    @Column(name = "dec_price")
    private Double decPrice;

    //	MappingProduct mappingProduct;
    public OutputCanDDeliveryOrderItemDetailPK getOutputCanDDeliveryOrderItemDetailPK() {
        return outputCanDDeliveryOrderItemDetailPK;
    }

    public void setOutputCanDDeliveryOrderItemDetailPK(OutputCanDDeliveryOrderItemDetailPK outputCanDDeliveryOrderItemDetailPK) {
        this.outputCanDDeliveryOrderItemDetailPK = outputCanDDeliveryOrderItemDetailPK;
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
        hash = 17 * hash + Objects.hashCode(this.outputCanDDeliveryOrderItemDetailPK);
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
        final OutputCanDDeliveryOrderItemDetail other = (OutputCanDDeliveryOrderItemDetail) obj;
        if (!Objects.equals(this.outputCanDDeliveryOrderItemDetailPK, other.outputCanDDeliveryOrderItemDetailPK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OutputCanDDeliveryOrderItemDetail{" + "outputCanDDeliveryOrderItemDetailPK=" + outputCanDDeliveryOrderItemDetailPK + '}';
    }
        
        
}