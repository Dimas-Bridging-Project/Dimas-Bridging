/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author yhawin
 */
@Entity
@Table(name = "tabel_prod_divisi")
public class TabelProdDivisi implements Serializable {
    @Id
    @Basic(optional = true)
    @Column(name = "divisi_id", length = 15, nullable = false)
    private String divisiId;
    @Column(name = "divisi_nm", length = 50)
    private String divisiNm;

    
    
    
    public String getDivisiId() {
        return divisiId;
    }

    public void setDivisiId(String divisiId) {
        this.divisiId = divisiId;
    }

    public String getDivisiNm() {
        return divisiNm;
    }

    public void setDivisiNm(String divisiNm) {
        this.divisiNm = divisiNm;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.divisiId);
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
        final TabelProdDivisi other = (TabelProdDivisi) obj;
        if (!Objects.equals(this.divisiId, other.divisiId)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return divisiId + "  " + divisiNm ;
    }

}
