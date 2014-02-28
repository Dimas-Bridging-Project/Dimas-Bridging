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
@Table(name = "tabel_key_account")
public class TabelKeyAccount implements Serializable {
    @Id
    @Basic(optional = true)
    @Column(name = "kode_ka", length = 15, nullable = false)
    private String kodeKa;

    @Column(name = "nama_ka", length = 50)
    private String namaKa;
    
    @Column(name = "keterangan", length = 100)
    private String keterangan;
    
    public String getKodeKa() {
        return kodeKa;
    }

    public void setKodeKa(String kodeKa) {
        this.kodeKa = kodeKa;
    }

    public String getNamaKa() {
        return namaKa;
    }

    public void setNamaKa(String namaKa) {
        this.namaKa = namaKa;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.kodeKa);
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
        final TabelKeyAccount other = (TabelKeyAccount) obj;
        if (!Objects.equals(this.kodeKa, other.kodeKa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return kodeKa + "-" + namaKa ;
    }

    
}
