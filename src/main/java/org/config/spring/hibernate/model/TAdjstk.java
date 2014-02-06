/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Bagus Winarno
 */
@Entity
@Table(name = "t_adjustment")
public class TAdjstk implements Serializable  {
    @EmbeddedId
    protected TAdjstkPK tAdjstkPK;
    
    @Column(name = "disti_code", length = 25)
    private String distiCode;
    @Column(name = "trans_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date transDate;
    @Column(name = "qty_adj")
    private Integer qtyAdj;
    @Column(name = "sku_qty")
    private Integer skuQty;
    @Column(name = "reason", length = 150)
    private String reason;

    public TAdjstkPK gettAdjstkPK() {
        return tAdjstkPK;
    }

    public void settAdjstkPK(TAdjstkPK tAdjstkPK) {
        this.tAdjstkPK = tAdjstkPK;
    }


    public String getDistiCode() {
        return distiCode;
    }

    public void setDistiCode(String distiCode) {
        this.distiCode = distiCode;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Integer getQtyAdj() {
        return qtyAdj;
    }

    public void setQtyAdj(Integer qtyAdj) {
        this.qtyAdj = qtyAdj;
    }

    public Integer getSkuQty() {
        return skuQty;
    }

    public void setSkuQty(Integer skuQty) {
        this.skuQty = skuQty;
    }


    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.tAdjstkPK);
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
        final TAdjstk other = (TAdjstk) obj;
        if (!Objects.equals(this.tAdjstkPK, other.tAdjstkPK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TAdjstk{" + "tAdjstkPK=" + tAdjstkPK + '}';
    }

    
    
}
