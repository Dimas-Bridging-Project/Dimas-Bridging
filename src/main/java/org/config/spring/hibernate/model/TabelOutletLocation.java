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
@Table(name = "tabel_outlet_location")
public class TabelOutletLocation implements Serializable {
    @Id
    @Basic(optional = true)
    @Column(name = "kode_lokasi", length = 15, nullable = false)
    private String kodeLokasi;
    @Column(name = "nama_lokasi", length = 50)
    private String namaLokasi;

    public String getKodeLokasi() {
        return kodeLokasi;
    }

    public void setKodeLokasi(String kodeLokasi) {
        this.kodeLokasi = kodeLokasi;
    }

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.kodeLokasi);
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
        final TabelOutletLocation other = (TabelOutletLocation) obj;
        if (!Objects.equals(this.kodeLokasi, other.kodeLokasi)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return kodeLokasi + "  " + namaLokasi ;
    }
    
}
