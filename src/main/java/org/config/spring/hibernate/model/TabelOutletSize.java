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
@Table(name = "tabel_outlet_size")
public class TabelOutletSize implements Serializable {
    @Id
    @Basic(optional = true)
    @Column(name = "kode_size", length = 15, nullable = false)
    private String kodeSize;
    @Column(name = "nama_size", length = 50)
    private String namaSize;

    public String getNamaSize() {
        return namaSize;
    }

    public void setNamaSize(String namaSize) {
        this.namaSize = namaSize;
    }

    public String getKodeSize() {
        return kodeSize;
    }

    public void setKodeSize(String kodeSize) {
        this.kodeSize = kodeSize;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.kodeSize);
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
        final TabelOutletSize other = (TabelOutletSize) obj;
        if (!Objects.equals(this.kodeSize, other.kodeSize)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return kodeSize + "  " + namaSize ;
    }
    
}
