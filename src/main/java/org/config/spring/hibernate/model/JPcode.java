/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;
import org.config.spring.hibernate.model.pokari.MappingProduct;

/**
 *
 * @author yhawin
 */
@Entity
@Table(name="jpcode")
public class JPcode implements Serializable {
 private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "jpcode_pk")
    protected JPcodePK jpcodePK;    
    @Column(name="qty_in_fib", length = 17)
    private String QtyInFib;
    @Column(name="qty_in_sat")
    private Integer QtyInSat;
    @Column(name="hrg_jual_karton_no_ppn")
    private Integer HrgJualKartonNoPpn;
    @Column(name="hrg_jual_lsn_no_ppn")
    private Integer HrgJualLsnNoPpn;
    @Column(name="harga_no_ppn")
    private Integer HargaNoPpn;
    @Column(name="jenis")
    private String Jenis;
    @Column(name="tipe_faktur_retur")
    private String TipeFakturRetur;

    @ManyToOne(optional = true)
    @JoinColumn(name = "pcode", referencedColumnName = "pcode", insertable = false, updatable = false)
    private Produk produk;
    
    @ManyToOne(optional = true)
    @JoinColumn(name = "id_order", referencedColumnName = "id_order", nullable = true,  insertable = false, updatable = false)
    private JHeader jheader;

    /**
     * KEK
     */
    @ManyToOne(optional = false)
    @JoinColumn(name = "pcode", referencedColumnName = "pcode_scylla", insertable = false, updatable = false)
    private TMasterProduct tMasterProduct;

    public TMasterProduct gettMasterProduct() {
        return tMasterProduct;
    }
    public void settMasterProduct(TMasterProduct tMasterProduct) {
        this.tMasterProduct = tMasterProduct;
    }

    
    /**
     * POKARI
     */
    @ManyToOne(optional = false)
    @JoinColumn(name = "pcode", referencedColumnName = "pcode_scylla", insertable = false, updatable = false)
    private MappingProduct mappingProduct;

    public MappingProduct getMappingProduct() {
        return mappingProduct;
    }
    public void setMappingProduct(MappingProduct mappingProduct) {
        this.mappingProduct = mappingProduct;
    }


    
    
    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public JHeader getJheader() {
        return jheader;
    }

    public void setJheader(JHeader jheader) {
        this.jheader = jheader;
    }
    
    
    
    
    
    
    public JPcodePK getJpcodePK() {
        return jpcodePK;
    }

    public void setJpcodePK(JPcodePK jpcodePK) {
        this.jpcodePK = jpcodePK;
    }

    public String getQtyInFib() {
        return QtyInFib;
    }

    public void setQtyInFib(String QtyInFib) {
        this.QtyInFib = QtyInFib;
    }


    public Integer getQtyInSat() {
        return QtyInSat;
    }

    public void setQtyInSat(Integer QtyInSat) {
        this.QtyInSat = QtyInSat;
    }

    public Integer getHrgJualKartonNoPpn() {
        return HrgJualKartonNoPpn;
    }

    public void setHrgJualKartonNoPpn(Integer HrgJualKartonNoPpn) {
        this.HrgJualKartonNoPpn = HrgJualKartonNoPpn;
    }

    public Integer getHrgJualLsnNoPpn() {
        return HrgJualLsnNoPpn;
    }

    public void setHrgJualLsnNoPpn(Integer HrgJualLsnNoPpn) {
        this.HrgJualLsnNoPpn = HrgJualLsnNoPpn;
    }

    public Integer getHargaNoPpn() {
        return HargaNoPpn;
    }

    public void setHargaNoPpn(Integer HargaNoPpn) {
        this.HargaNoPpn = HargaNoPpn;
    }

  

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public String getTipeFakturRetur() {
        return TipeFakturRetur;
    }

    public void setTipeFakturRetur(String TipeFakturRetur) {
        this.TipeFakturRetur = TipeFakturRetur;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.jpcodePK);
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
        final JPcode other = (JPcode) obj;
        if (!Objects.equals(this.jpcodePK, other.jpcodePK)) {
            return false;
        }
        return true;
    }

   
    
}
