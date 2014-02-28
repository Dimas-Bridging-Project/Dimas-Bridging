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
@Table(name = "tabel_prod_variance")
public class TabelProdVariance implements Serializable {
    @Id
    @Basic(optional = true)
    @Column(name = "variance_id", length = 15, nullable = false)
    private String varianceId;
    @Column(name = "variance_nm", length = 50)
    private String varianceNm;

    public String getVarianceId() {
        return varianceId;
    }

    public void setVarianceId(String varianceId) {
        this.varianceId = varianceId;
    }

    public String getVarianceNm() {
        return varianceNm;
    }

    public void setVarianceNm(String varianceNm) {
        this.varianceNm = varianceNm;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.varianceId);
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
        final TabelProdVariance other = (TabelProdVariance) obj;
        if (!Objects.equals(this.varianceId, other.varianceId)) {
            return false;
        }
        return true;
    }
 
    @Override
    public String toString() {
        return varianceId + "-" + varianceNm ;
    }
    
    
}
