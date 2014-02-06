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
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Bagus Winarno
 */
@Entity
@Table(name = "t_dastri")
public class TDatsri implements Serializable {
    @EmbeddedId
    protected TDatsriPK tdatsriPK;

    @Column(name = "distri_code", length = 25)
    private String distiCode;
    @Column(name = "trans_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date transDate;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "uom1",length = 15)
    private String uom1;
    @Column(name = "uom2",length = 15)
    private String uom2;
    @Column(name = "uom3",length = 15)
    private String uom3;
    @Column(name = "unit_price")
    private Integer unitPrice;
    @Column(name = "sku_qty")
    private Integer skuQty;
    @Column(name = "nppm_amt")
    private Integer nppnAmt;
    @Column(name = "total_sales")
    private Integer totalSales;

    public TDatsriPK getTdatsriPK() {
        return tdatsriPK;
    }

    public void setTdatsriPK(TDatsriPK tdatsriPK) {
        this.tdatsriPK = tdatsriPK;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUom1() {
        return uom1;
    }

    public void setUom1(String uom1) {
        this.uom1 = uom1;
    }

    public String getUom2() {
        return uom2;
    }

    public void setUom2(String uom2) {
        this.uom2 = uom2;
    }

    public String getUom3() {
        return uom3;
    }

    public void setUom3(String uom3) {
        this.uom3 = uom3;
    }


    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getSkuQty() {
        return skuQty;
    }

    public void setSkuQty(Integer skuQty) {
        this.skuQty = skuQty;
    }

    public Integer getNppnAmt() {
        return nppnAmt;
    }

    public void setNppnAmt(Integer nppnAmt) {
        this.nppnAmt = nppnAmt;
    }

    public Integer getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Integer totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return "TDatsri{" + "tdatsriPK=" + tdatsriPK + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.tdatsriPK);
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
        final TDatsri other = (TDatsri) obj;
        if (!Objects.equals(this.tdatsriPK, other.tdatsriPK)) {
            return false;
        }
        return true;
    }

    
    
}
