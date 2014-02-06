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
@Table(name = "t_datdsr")
public class TDatdsr implements Serializable {
    @EmbeddedId
    protected TDatdsrPK tdatdsrPK;
    
    @Column(name = "disti_code", length = 25)
    private String distiCode;
    @Column(name = "trans_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date transDate;

    @Column(name = "outlet_code", length = 25)
    private String outletCode;
    @Column(name = "salesman_code", length = 25)
    private String salesmanCode;
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
    @Column(name = "nppn_amt")
    private Integer nppnAmt;
    @Column(name = "total_sales")
    private Integer totalSales;
    @Column(name = "fbonus")
    private Boolean fbonus;

    public TDatdsrPK getTdatdsrPK() {
        return tdatdsrPK;
    }

    public void setTdatdsrPK(TDatdsrPK tdatdsrPK) {
        this.tdatdsrPK = tdatdsrPK;
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

    public String getOutletCode() {
        return outletCode;
    }

    public void setOutletCode(String outletCode) {
        this.outletCode = outletCode;
    }

    public String getSalesmanCode() {
        return salesmanCode;
    }

    public void setSalesmanCode(String salesmanCode) {
        this.salesmanCode = salesmanCode;
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

    public Boolean getFbonus() {
        return fbonus;
    }

    public void setFbonus(Boolean fbonus) {
        this.fbonus = fbonus;
    }

 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.tdatdsrPK);
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
        final TDatdsr other = (TDatdsr) obj;
        if (!Objects.equals(this.tdatdsrPK, other.tdatdsrPK)) {
            return false;
        }
        return true;
    }
    
   

   
}
