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
@Table(name = "tabel_prod_sub_brand")
public class TabelProdSubBrand {
    @Id
    @Basic(optional = true)
    @Column(name = "sub_brand_id", length = 15, nullable = false)
    private String subBrandId;
    @Column(name = "sub_brand_nam", length = 50)
    private String subBrandNm;

    public String getSubBrandId() {
        return subBrandId;
    }

    public void setSubBrandId(String subBrandId) {
        this.subBrandId = subBrandId;
    }

    public String getSubBrandNm() {
        return subBrandNm;
    }

    public void setSubBrandNm(String subBrandNm) {
        this.subBrandNm = subBrandNm;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.subBrandId);
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
        final TabelProdSubBrand other = (TabelProdSubBrand) obj;
        if (!Objects.equals(this.subBrandId, other.subBrandId)) {
            return false;
        }
        return true;
    }
     @Override
    public String toString() {
        return subBrandId + "  " + subBrandNm ;
    }
   
    
}
