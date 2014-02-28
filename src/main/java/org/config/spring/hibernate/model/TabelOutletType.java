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
 * @author Bagus Winarno
 */
@Entity
@Table(name = "tabel_outlet_type")
public class TabelOutletType implements Serializable {
    @Id
    @Basic(optional = true)
    @Column(name = "kode_type", length = 15, nullable = false)
    private String kodeType;
    @Column(name = "nama_type", length = 50)
    private String namaType;

    public String getKodeType() {
        return kodeType;
    }

    public void setKodeType(String kodeType) {
        this.kodeType = kodeType;
    }

    public String getNamaType() {
        return namaType;
    }

    public void setNamaType(String namaType) {
        this.namaType = namaType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.kodeType);
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
        final TabelOutletType other = (TabelOutletType) obj;
        if (!Objects.equals(this.kodeType, other.kodeType)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return kodeType + "-" + namaType ;
    }
    
}
