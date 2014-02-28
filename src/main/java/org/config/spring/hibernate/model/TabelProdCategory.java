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
@Table(name = "tabel_prod_category")
public class TabelProdCategory implements Serializable {
    @Id
    @Basic(optional = true)
    @Column(name = "category_id", length = 15, nullable = false)
    private String categoryId;
    @Column(name = "category_nm", length = 50)
    private String categoryNm;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryNm() {
        return categoryNm;
    }

    public void setCategoryNm(String categoryNm) {
        this.categoryNm = categoryNm;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.categoryId);
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
        final TabelProdCategory other = (TabelProdCategory) obj;
        if (!Objects.equals(this.categoryId, other.categoryId)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return categoryId + "-" + categoryNm ;
    }
    
}
