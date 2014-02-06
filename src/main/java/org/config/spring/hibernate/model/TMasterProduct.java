/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author Bagus Winarno
 */
@Entity
@Table(name = "t_master_product")
public class TMasterProduct implements Serializable {
    @Id
    @Basic(optional = true)
    @Column(name = "pcode_scylla", length = 15, nullable = true)
    private String pcodeScylla;

    @Column(name = "pcode_sap", length = 25)
    private String pcodeSap;
    @Column(name = "pname_sap", length = 50)
    private String pnameSap;

//PENANDA    
    //SEMENTARA BELUM DIGUNAKAN
    @Column(name = "baru")
    private Boolean baru;
    @Column(name = "allow_transfer")
    private Boolean allowTransfer;
    @Column(name = "bonus")
    private Boolean bonus;
    @Column(name = "aktif")
    private Boolean aktif;
    
    @Column(name = "area_id", length = 25)
    private String areaId;
    @Column(name = "area_nm", length = 50)
    private String areaNm;
    @Column(name = "dist_id", length = 25)
    private String distId;
    @Column(name = "dist_nm", length = 50)
    private String distNm;
    @Column(name = "kode_divisi", length = 15)
    private String kodeDivisi;
    @Column(name = "nama_divisi" , length = 35)
    private String namaDivisi;
    @Column(name = "kode_brand", length = 15)
    private String kodeBrand;
    @Column(name = "nama_brand", length = 35)
    private String namaBrand;
    @Column(name = "kode_sub_brand", length = 15)
    private String kodeSubBrand;
    @Column(name = "nama_sub_brand", length = 35)
    private String namaSubBrand;
    @Column(name = "kode_category", length = 15)
    private String kodeCategory;
    @Column(name = "nama_category", length = 35)
    private String namaCategory;
    @Column(name = "kode_sub_categery", length = 15)
    private String kodeSubCategory;
    @Column(name = "nama_sub_category", length = 35)
    private String namaSubCategory;
    @Column(name = "kode_variance", length = 15)
    private String kodeVariance;
    @Column(name = "nama_variance", length = 35)
    private String namaVariance;
    @Column(name = "kode_size", length = 15)
    private String kodeSize;
    @Column(name = "nama_size", length = 35)
    private String namaSize;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tMasterProduct")
    @Fetch(FetchMode.JOIN)
    private Set<ScyBDItem> scyBDItemSet;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tMasterProduct")
    @Fetch(FetchMode.JOIN)
    private Set<ScyReturPabrikItem> scyReturPabrikItemSet;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tMasterProduct")
    @Fetch(FetchMode.JOIN)
    private Set<ScyPenyesuaianItem> scyPenyesuaianItemSet;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tMasterProduct")
    @Fetch(FetchMode.JOIN)
    private Set<Stock> stockSet;

    /**
     * JPCODE, JTPRB : KEK 
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tMasterProduct")
    @Fetch(FetchMode.JOIN)
    private Set<JPcode> jPCodeSet;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tMasterProduct")
    @Fetch(FetchMode.JOIN)
    private Set<JTprb> jTprbSet;
    
    public Set<JTprb> getjTprbSet() {
        return jTprbSet;
    }
    public void setjTprbSet(Set<JTprb> jTprbSet) {
        this.jTprbSet = jTprbSet;
    }
    
    public Set<JPcode> getjPCodeSet() {
        return jPCodeSet;
    }
    public void setjPCodeSet(Set<JPcode> jPCodeSet) {
        this.jPCodeSet = jPCodeSet;
    }
    
    

    /**
     * INPUT MASTER PRODUCT
     */ 
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tMasterProduct")
    @Fetch(FetchMode.JOIN)
    private Set<Produk> productSet;
    
    public Set<Produk> getProductSet() {
        return productSet;
    }
    public void setProductSet(Set<Produk> productSet) {
        this.productSet = productSet;
    }

    
    
    
    
    public Set<ScyPenyesuaianItem> getScyPenyesuaianItemSet() {
        return scyPenyesuaianItemSet;
    }

    public void setScyPenyesuaianItemSet(Set<ScyPenyesuaianItem> scyPenyesuaianItemSet) {
        this.scyPenyesuaianItemSet = scyPenyesuaianItemSet;
    }
    

    public Set<ScyReturPabrikItem> getScyReturPabrikItemSet() {
        return scyReturPabrikItemSet;
    }

    public void setScyReturPabrikItemSet(Set<ScyReturPabrikItem> scyReturPabrikItemSet) {
        this.scyReturPabrikItemSet = scyReturPabrikItemSet;
    }


    public Boolean getBonus() {
        return bonus;
    }

    public void setBonus(Boolean bonus) {
        this.bonus = bonus;
    }

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }

       
    

    public Set<ScyBDItem> getScyBDItemSet() {
        return scyBDItemSet;
    }

    public void setScyBDItemSet(Set<ScyBDItem> scyBDItemSet) {
        this.scyBDItemSet = scyBDItemSet;
    }

    

    
    public Set<Stock> getStockSet() {
        return stockSet;
    }

    public void setStockSet(Set<Stock> stockSet) {
        this.stockSet = stockSet;
    }
    
 
    
    public String getPcodeSap() {
        return pcodeSap;
    }

    public void setPcodeSap(String pcodeSap) {
        this.pcodeSap = pcodeSap;
    }

    public String getPcodeScylla() {
        return pcodeScylla;
    }

    public void setPcodeScylla(String pcodeScylla) {
        this.pcodeScylla = pcodeScylla;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaNm() {
        return areaNm;
    }

    public void setAreaNm(String areaNm) {
        this.areaNm = areaNm;
    }

    public String getDistId() {
        return distId;
    }

    public void setDistId(String distId) {
        this.distId = distId;
    }

    public String getDistNm() {
        return distNm;
    }

    public void setDistNm(String distNm) {
        this.distNm = distNm;
    }

    public String getPnameSap() {
        return pnameSap;
    }

    public void setPnameSap(String pnameSap) {
        this.pnameSap = pnameSap;
    }

    public String getKodeDivisi() {
        return kodeDivisi;
    }

    public void setKodeDivisi(String kodeDivisi) {
        this.kodeDivisi = kodeDivisi;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public String getKodeBrand() {
        return kodeBrand;
    }

    public void setKodeBrand(String kodeBrand) {
        this.kodeBrand = kodeBrand;
    }

    public String getNamaBrand() {
        return namaBrand;
    }

    public void setNamaBrand(String namaBrand) {
        this.namaBrand = namaBrand;
    }

    public String getKodeSubBrand() {
        return kodeSubBrand;
    }

    public void setKodeSubBrand(String kodeSubBrand) {
        this.kodeSubBrand = kodeSubBrand;
    }

    public String getNamaSubBrand() {
        return namaSubBrand;
    }

    public void setNamaSubBrand(String namaSubBrand) {
        this.namaSubBrand = namaSubBrand;
    }

    public String getKodeCategory() {
        return kodeCategory;
    }

    public void setKodeCategory(String kodeCategory) {
        this.kodeCategory = kodeCategory;
    }

    public String getNamaCategory() {
        return namaCategory;
    }

    public void setNamaCategory(String namaCategory) {
        this.namaCategory = namaCategory;
    }

    public String getKodeSubCategory() {
        return kodeSubCategory;
    }

    public void setKodeSubCategory(String kodeSubCategory) {
        this.kodeSubCategory = kodeSubCategory;
    }

    public String getNamaSubCategory() {
        return namaSubCategory;
    }

    public void setNamaSubCategory(String namaSubCategory) {
        this.namaSubCategory = namaSubCategory;
    }

    public String getKodeVariance() {
        return kodeVariance;
    }

    public void setKodeVariance(String kodeVariance) {
        this.kodeVariance = kodeVariance;
    }

    public String getNamaVariance() {
        return namaVariance;
    }

    public void setNamaVariance(String namaVariance) {
        this.namaVariance = namaVariance;
    }

    public String getKodeSize() {
        return kodeSize;
    }

    public void setKodeSize(String kodeSize) {
        this.kodeSize = kodeSize;
    }

    public String getNamaSize() {
        return namaSize;
    }

    public void setNamaSize(String namaSize) {
        this.namaSize = namaSize;
    }

    public Boolean getAllowTransfer() {
        return allowTransfer;
    }

    public void setAllowTransfer(Boolean allowTransfer) {
        this.allowTransfer = allowTransfer;
    }


    public Boolean getBaru() {
        return baru;
    }

    public void setBaru(Boolean baru) {
        this.baru = baru;
    }

    @Override
    public String toString() {
        return pcodeSap + "  " + pnameSap;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.pcodeSap);
        hash = 17 * hash + Objects.hashCode(this.pcodeScylla);
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
        final TMasterProduct other = (TMasterProduct) obj;
        if (!Objects.equals(this.pcodeSap, other.pcodeSap)) {
            return false;
        }
        if (!Objects.equals(this.pcodeScylla, other.pcodeScylla)) {
            return false;
        }
        return true;
    }
    
}
