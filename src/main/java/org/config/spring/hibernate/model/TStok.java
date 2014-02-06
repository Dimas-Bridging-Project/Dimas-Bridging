/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Bagus Winarno
 */
@Entity
@Table(name = "t_stock")
public class TStok implements Serializable {
    @Id
    @Basic(optional = true)
    @Column(name = "item_code", length = 25)
    private String itemCode;
    @Column(name = "disti_code", length = 25)
    private String distiCode;
    @Column(name = "qty_in_transit")
    private Integer qtyInTransit;
    @Column(name = "qty_on_hand")
    private Integer qtyOnHand;
    @Column(name = "proc_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date procDate;

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDistiCode() {
        return distiCode;
    }

    public void setDistiCode(String distiCode) {
        this.distiCode = distiCode;
    }

    public Integer getQtyInTransit() {
        return qtyInTransit;
    }

    public void setQtyInTransit(Integer qtyInTransit) {
        this.qtyInTransit = qtyInTransit;
    }

    public Integer getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(Integer qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public Date getProcDate() {
        return procDate;
    }

    public void setProcDate(Date procDate) {
        this.procDate = procDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.itemCode);
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
        final TStok other = (TStok) obj;
        if (!Objects.equals(this.itemCode, other.itemCode)) {
            return false;
        }
        return true;
    }
    
}
