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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Bagus Winarno
 */
@Entity
@Table(name = "scy_retur_pabrik_item")
public class ScyReturPabrikItem implements Serializable {
    @EmbeddedId
    protected ScyReturPabrikItemPK scyReturPabrikItemPK;
    @Column(name = "no_retur", length = 15)
    private String noRetur;
    @Column(name="no_kirim", length = 15)
    private String noKirim;

    @Column(name = "tgl_retur")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglRetur;
    @Column(name = "tgl_jtempo")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglJTempo;
    @Column(name = "tgl_terima")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglTerima;
    @Column(name = "tgl_kirim")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglKirim;
    
    
    @Column(name = "nama_barang", length = 50)
    private String namaBarang;
    @Column(name = "hrg_beli")
    private Integer hrgBeli;
    @Column(name="jml_barang_str", length = 25)
    private String jmlBarangStr;
    @Column(name = "jml_barang")
    private Integer jmlBarang;
    @Column(name="jml_barang_pcs")
    private Integer jmlBarangPcs;
    @Column(name = "persen_disc")
    private Double persenDisc;
    @Column(name = "rp_disc")
    private Integer rpDisc;
    @Column(name = "jumlah_rupiah")
    private Integer jumlahRupiah;
    @Column(name = "uom")
    private String uom;

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

    public String getJmlBarangStr() {
        return jmlBarangStr;
    }

    public void setJmlBarangStr(String jmlBarangStr) {
        this.jmlBarangStr = jmlBarangStr;
    }
    
    
    public ScyReturPabrikItemPK getScyReturPabrikItemPK() {
        return scyReturPabrikItemPK;
    }

    public void setScyReturPabrikItemPK(ScyReturPabrikItemPK scyReturPabrikItemPK) {
        this.scyReturPabrikItemPK = scyReturPabrikItemPK;
    }

    public String getNoRetur() {
        return noRetur;
    }

    public void setNoRetur(String noRetur) {
        this.noRetur = noRetur;
    }

 
    public String getNoKirim() {
        return noKirim;
    }

    public void setNoKirim(String noKirim) {
        this.noKirim = noKirim;
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


    public Date getTglJTempo() {
        return tglJTempo;
    }

    public void setTglJTempo(Date tglJTempo) {
        this.tglJTempo = tglJTempo;
    }

    public Date getTglTerima() {
        return tglTerima;
    }

    public void setTglTerima(Date tglTerima) {
        this.tglTerima = tglTerima;
    }

    public Date getTglKirim() {
        return tglKirim;
    }

    public void setTglKirim(Date tglKirim) {
        this.tglKirim = tglKirim;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public Integer getHrgBeli() {
        return hrgBeli;
    }

    public void setHrgBeli(Integer hrgBeli) {
        this.hrgBeli = hrgBeli;
    }

    public Integer getJmlBarang() {
        return jmlBarang;
    }

    public void setJmlBarang(Integer jmlBarang) {
        this.jmlBarang = jmlBarang;
    }

    public Integer getJmlBarangPcs() {
        return jmlBarangPcs;
    }

    public void setJmlBarangPcs(Integer jmlBarangPcs) {
        this.jmlBarangPcs = jmlBarangPcs;
    }

    public Double getPersenDisc() {
        return persenDisc;
    }

    public void setPersenDisc(Double persenDisc) {
        this.persenDisc = persenDisc;
    }

    public Integer getRpDisc() {
        return rpDisc;
    }

    public void setRpDisc(Integer rpDisc) {
        this.rpDisc = rpDisc;
    }

    public Integer getJumlahRupiah() {
        return jumlahRupiah;
    }

    public void setJumlahRupiah(Integer jumlahRupiah) {
        this.jumlahRupiah = jumlahRupiah;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public Date getTglRetur() {
        return tglRetur;
    }

    public void setTglRetur(Date tglRetur) {
        this.tglRetur = tglRetur;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.scyReturPabrikItemPK);
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
        final ScyReturPabrikItem other = (ScyReturPabrikItem) obj;
        if (!Objects.equals(this.scyReturPabrikItemPK, other.scyReturPabrikItemPK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ScyReturPabrikItem{" + "scyReturPabrikItemPK=" + scyReturPabrikItemPK + '}';
    }

  
    
    
  
    
}
