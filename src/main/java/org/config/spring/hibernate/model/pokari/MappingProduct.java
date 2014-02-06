package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.config.spring.hibernate.model.JPcode;
import org.config.spring.hibernate.model.JTprb;
import org.config.spring.hibernate.model.Produk;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "mapping_product")
public class MappingProduct implements Serializable {
    @Id
    @Basic(optional = true)
    @Column(name = "pcode_scylla", length = 15, nullable = false)
    private String pcodeScylla;
        
        @Column(name = "sz_product_id", length = 20)
	private String szProductId;
	@Column(name = "pname_scylla", length = 60)
        private String pnameScylla;
        @Column(name = "sz_product_name", length = 60)
	private String szProductName;
        
        @Column(name = "sz_brand_id", length = 20)
        private String szBrandId;

        @Column(name = "baru")
        private Boolean baru;
        @Column(name = "allow_transfer")
	private Boolean allowTransfer;
        @Column(name = "aktif")
	private Boolean aktif;
        @Column(name = "bonus")
        private Boolean bonus;
        
    /**
     * FOR PRODUCT INPUT RETRIEVE FROM SCYLLA
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mappingProduct")
    @Fetch(FetchMode.JOIN)
    private Set<Produk> productSet;

    public Set<Produk> getProductSet() {
        return productSet;
    }
    public void setProductSet(Set<Produk> productSet) {
        this.productSet = productSet;
    }

    /**
     * JPCODE, JTPRB : KEK 
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mappingProduct")
    @Fetch(FetchMode.JOIN)
    private Set<JPcode> jPCodeSet;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mappingProduct")
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
        
        
    
        
    public String getPcodeScylla() {
        return pcodeScylla;
    }

    public void setPcodeScylla(String pcodeScylla) {
        this.pcodeScylla = pcodeScylla;
    }

    public String getSzProductId() {
        return szProductId;
    }

    public void setSzProductId(String szProductId) {
        this.szProductId = szProductId;
    }

    public String getPnameScylla() {
        return pnameScylla;
    }

    public void setPnameScylla(String pnameScylla) {
        this.pnameScylla = pnameScylla;
    }

    public String getSzProductName() {
        return szProductName;
    }

    public void setSzProductName(String szProductName) {
        this.szProductName = szProductName;
    }

    public String getSzBrandId() {
        return szBrandId;
    }

    public void setSzBrandId(String szBrandId) {
        this.szBrandId = szBrandId;
    }

    public Boolean getBaru() {
        return baru;
    }

    public void setBaru(Boolean baru) {
        this.baru = baru;
    }

    public Boolean getAllowTransfer() {
        return allowTransfer;
    }

    public void setAllowTransfer(Boolean allowTransfer) {
        this.allowTransfer = allowTransfer;
    }

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }

    public Boolean getBonus() {
        return bonus;
    }

    public void setBonus(Boolean bonus) {
        this.bonus = bonus;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.pcodeScylla);
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
        final MappingProduct other = (MappingProduct) obj;
        if (!Objects.equals(this.pcodeScylla, other.pcodeScylla)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MappingProduct{" + "pcodeScylla=" + pcodeScylla + '}';
    }

        

}