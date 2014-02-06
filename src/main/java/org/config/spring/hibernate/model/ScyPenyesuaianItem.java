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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Bagus Winarno
 */
@Entity
@Table(name = "scy_penyesuaian_item")
public class ScyPenyesuaianItem implements Serializable {
    @EmbeddedId
    protected ScyPenyesuaianItemPK scyPenyesuaianItemPK;

    @Column(name = "kode_gudang", length = 15)
    private String kodeGudang;
    @Column(name = "nama_barang", length = 50)
    private String namaBarang;
    @Column(name="tanggal_penyesuaian")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggalPenyesuaian;
    
    @Column(name = "adj_brg_baik_str")
    private String adjBrgBaikStr;
    @Column(name = "adj_brg_baik_karton")
    private Integer adjBrgBaikKarton;
    @Column(name = "adj_brg_baik_pcs")
    private Integer adjBrgBaikPcs;
    @Column(name = "adj_brg_baik_rp")
    private Integer adjBrgBaikRp;
    
    @Column(name = "adj_brg_bs_str")
    private String adjBrgBsStr;    
    @Column(name = "adj_brg_bs_karton")
    private Integer adjBrgBsKarton;    
    @Column(name = "adj_brg_bs_pcs")
    private Integer adjBrgBsPcs;
    @Column(name = "adj_brg_bs_rp")
    private Integer AdjBrgbsRp;

    @Column(name="convfact1")
    private Integer Convfact1;
    @Column(name="convfact2")
    private Integer Convfact2;
    
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "pcode", referencedColumnName = "pcode_scylla", insertable = false, updatable = false)
    private TMasterProduct tMasterProduct;

    public TMasterProduct gettMasterProduct() {
        return tMasterProduct;
    }

    public void settMasterProduct(TMasterProduct tMasterProduct) {
        this.tMasterProduct = tMasterProduct;
    }

    public Integer getAdjBrgBaikKarton() {
        return adjBrgBaikKarton;
    }

    public void setAdjBrgBaikKarton(Integer adjBrgBaikKarton) {
        this.adjBrgBaikKarton = adjBrgBaikKarton;
    }

    public Integer getAdjBrgBsKarton() {
        return adjBrgBsKarton;
    }

    public void setAdjBrgBsKarton(Integer adjBrgBsKarton) {
        this.adjBrgBsKarton = adjBrgBsKarton;
    }
    
    public ScyPenyesuaianItemPK getScyPenyesuaianItemPK() {
        return scyPenyesuaianItemPK;
    }

    public void setScyPenyesuaianItemPK(ScyPenyesuaianItemPK scyPenyesuaianItemPK) {
        this.scyPenyesuaianItemPK = scyPenyesuaianItemPK;
    }

    public String getKodeGudang() {
        return kodeGudang;
    }

    public void setKodeGudang(String kodeGudang) {
        this.kodeGudang = kodeGudang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public Integer getAdjBrgBaikRp() {
        return adjBrgBaikRp;
    }

    public void setAdjBrgBaikRp(Integer adjBrgBaikRp) {
        this.adjBrgBaikRp = adjBrgBaikRp;
    }

    public Integer getAdjBrgbsRp() {
        return AdjBrgbsRp;
    }

    public void setAdjBrgbsRp(Integer AdjBrgbsRp) {
        this.AdjBrgbsRp = AdjBrgbsRp;
    }


    public String getAdjBrgBaikStr() {
        return adjBrgBaikStr;
    }

    public void setAdjBrgBaikStr(String adjBrgBaikStr) {
        this.adjBrgBaikStr = adjBrgBaikStr;
    }

    public String getAdjBrgBsStr() {
        return adjBrgBsStr;
    }

    public void setAdjBrgBsStr(String adjBrgBsStr) {
        this.adjBrgBsStr = adjBrgBsStr;
    }

    public Integer getAdjBrgBaikPcs() {
        return adjBrgBaikPcs;
    }

    public void setAdjBrgBaikPcs(Integer adjBrgBaikPcs) {
        this.adjBrgBaikPcs = adjBrgBaikPcs;
    }

    public Integer getAdjBrgBsPcs() {
        return adjBrgBsPcs;
    }

    public void setAdjBrgBsPcs(Integer adjBrgBsPcs) {
        this.adjBrgBsPcs = adjBrgBsPcs;
    }

    public Date getTanggalPenyesuaian() {
        return tanggalPenyesuaian;
    }

    public void setTanggalPenyesuaian(Date tanggalPenyesuaian) {
        this.tanggalPenyesuaian = tanggalPenyesuaian;
    }

    public Integer getConvfact1() {
        return Convfact1;
    }

    public void setConvfact1(Integer Convfact1) {
        this.Convfact1 = Convfact1;
    }

    public Integer getConvfact2() {
        return Convfact2;
    }

    public void setConvfact2(Integer Convfact2) {
        this.Convfact2 = Convfact2;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.scyPenyesuaianItemPK);
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
        final ScyPenyesuaianItem other = (ScyPenyesuaianItem) obj;
        if (!Objects.equals(this.scyPenyesuaianItemPK, other.scyPenyesuaianItemPK)) {
            return false;
        }
        return true;
    }
    
 
}
