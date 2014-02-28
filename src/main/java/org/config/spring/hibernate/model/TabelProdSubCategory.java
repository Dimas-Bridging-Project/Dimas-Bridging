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
@Table(name = "tabel_prod_sub_category")
public class TabelProdSubCategory {
    @Id
    @Basic(optional = true)
    @Column(name = "sub_category_id", length = 15, nullable = false)
    private String subCategoryId;
    @Column(name = "sub_category_nam", length = 50)
    private String subCategoryNm;

    public String getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(String subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryNm() {
        return subCategoryNm;
    }

    public void setSubCategoryNm(String subCategoryNm) {
        this.subCategoryNm = subCategoryNm;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.subCategoryId);
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
        final TabelProdSubCategory other = (TabelProdSubCategory) obj;
        if (!Objects.equals(this.subCategoryId, other.subCategoryId)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return subCategoryId + "-" + subCategoryNm ;
    }
    
    
}
