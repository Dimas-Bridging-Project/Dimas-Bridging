/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.io.Serializable;
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
@Table(name = "tabel_prod_size")
public class TabelProdSize implements Serializable {
    @Id
    @Basic(optional = true)
    @Column(name = "size_id", length = 15, nullable = false)
    private String sizeId;
    @Column(name = "size_nm", length = 15)
    private String sizeNm;

    public String getSizeId() {
        return sizeId;
    }

    public void setSizeId(String sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeNm() {
        return sizeNm;
    }

    public void setSizeNm(String sizeNm) {
        this.sizeNm = sizeNm;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.sizeId);
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
        final TabelProdSize other = (TabelProdSize) obj;
        if (!Objects.equals(this.sizeId, other.sizeId)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return sizeId + "-" + sizeNm ;
    }
    
    
}
