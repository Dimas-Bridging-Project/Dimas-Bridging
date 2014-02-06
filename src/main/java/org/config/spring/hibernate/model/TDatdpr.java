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
@Table(name = "t_datdpr")
public class TDatdpr implements Serializable {
    @EmbeddedId
    protected TDatdprPK tdatdprPK;
    
    @Column(name = "disti_code", length = 25)
    private String distiCode;
    @Column(name = "trans_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date transDate;
    @Column(name = "dono", length = 50)
    private String dono;
    @Column(name = "do_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date doDate;
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
    @Column(name = "fbonus")
    private Boolean fbonus;
    @Column(name = "sku_qty")
    private Integer skuQty;

    public TDatdprPK getTdatdprPK() {
        return tdatdprPK;
    }

    public void setTdatdprPK(TDatdprPK tdatdprPK) {
        this.tdatdprPK = tdatdprPK;
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

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Date getDoDate() {
        return doDate;
    }

    public void setDoDate(Date doDate) {
        this.doDate = doDate;
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

    public Boolean getFbonus() {
        return fbonus;
    }

    public void setFbonus(Boolean fbonus) {
        this.fbonus = fbonus;
    }

    public Integer getSkuQty() {
        return skuQty;
    }

    public void setSkuQty(Integer skuQty) {
        this.skuQty = skuQty;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.tdatdprPK);
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
        final TDatdpr other = (TDatdpr) obj;
        if (!Objects.equals(this.tdatdprPK, other.tdatdprPK)) {
            return false;
        }
        return true;
    }
    
    
    
}
