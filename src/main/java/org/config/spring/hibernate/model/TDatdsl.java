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
@Table(name = "t_datdsl")
public class TDatdsl implements Serializable {
  @EmbeddedId
  protected TDatdslPK tdatdslPK;
  
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
  @Column(name = "fbonus")
  private Boolean fbonus;
  @Column(name = "disc_amt1")
  private Integer discAmt1;
  @Column(name = "disc_amt2")
  private Integer discAmt2;
  @Column(name = "disc_amt3")
  private Integer discAmt3;
  @Column(name = "disc_amt4")
  private Integer discAmt4;
  @Column(name = "disc_amt5")
  private Integer discAmt5;
  @Column(name = "disc_amt6")
  private Integer discAmt6;
  @Column(name = "disc_item")
  private Integer discItem;
  @Column(name = "disc_item_pct")
  private Integer discItemPct;
  @Column(name = "disc_item_val")
  private Integer discItemVal;
  @Column(name = "sku_qty")
  private Integer skuQty;
  @Column(name = "nppn_amt")
  private Integer nppnAmt;
  @Column(name = "total_sales")
  private Integer totalSales;

    public TDatdslPK getTdatdslPK() {
        return tdatdslPK;
    }

    public void setTdatdslPK(TDatdslPK tdatdslPK) {
        this.tdatdslPK = tdatdslPK;
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

    public Boolean getFbonus() {
        return fbonus;
    }

    public void setFbonus(Boolean fbonus) {
        this.fbonus = fbonus;
    }

    public Integer getDiscAmt1() {
        return discAmt1;
    }

    public void setDiscAmt1(Integer discAmt1) {
        this.discAmt1 = discAmt1;
    }

    public Integer getDiscAmt2() {
        return discAmt2;
    }

    public void setDiscAmt2(Integer discAmt2) {
        this.discAmt2 = discAmt2;
    }

    public Integer getDiscAmt3() {
        return discAmt3;
    }

    public void setDiscAmt3(Integer discAmt3) {
        this.discAmt3 = discAmt3;
    }

    public Integer getDiscAmt4() {
        return discAmt4;
    }

    public void setDiscAmt4(Integer discAmt4) {
        this.discAmt4 = discAmt4;
    }

    public Integer getDiscAmt5() {
        return discAmt5;
    }

    public void setDiscAmt5(Integer discAmt5) {
        this.discAmt5 = discAmt5;
    }

    public Integer getDiscAmt6() {
        return discAmt6;
    }

    public void setDiscAmt6(Integer discAmt6) {
        this.discAmt6 = discAmt6;
    }

    public Integer getDiscItem() {
        return discItem;
    }

    public void setDiscItem(Integer discItem) {
        this.discItem = discItem;
    }

    public Integer getDiscItemPct() {
        return discItemPct;
    }

    public void setDiscItemPct(Integer discItemPct) {
        this.discItemPct = discItemPct;
    }

    public Integer getDiscItemVal() {
        return discItemVal;
    }

    public void setDiscItemVal(Integer discItemVal) {
        this.discItemVal = discItemVal;
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
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.tdatdslPK);
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
        final TDatdsl other = (TDatdsl) obj;
        if (!Objects.equals(this.tdatdslPK, other.tdatdslPK)) {
            return false;
        }
        return true;
    }
  
}
