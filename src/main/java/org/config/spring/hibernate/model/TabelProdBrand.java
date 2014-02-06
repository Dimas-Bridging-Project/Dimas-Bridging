/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author yhawin
 */
@Entity
@Table(name = "tabel_prod_brand")
public class TabelProdBrand {
    @Id
    @Basic(optional = true)
    @Column(name = "brand_id", length = 15, nullable = false)
    private String brandId;
    @Column(name = "brand_nm", length = 50)
    private String brandNm;

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandNm() {
        return brandNm;
    }

    public void setBrandNm(String brandNm) {
        this.brandNm = brandNm;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.brandId);
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
        final TabelProdBrand other = (TabelProdBrand) obj;
        if (!Objects.equals(this.brandId, other.brandId)) {
            return false;
        }
        return true;
    }
    
     @Override
    public String toString() {
        return brandId + "  " + brandNm ;
    }
   
    
}
