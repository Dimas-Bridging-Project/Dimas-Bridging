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
@Table(name = "tabel_outlet_chain")
public class TabelOutletChain implements Serializable {
    @Id
    @Basic(optional = true)
    @Column(name = "kode_chain", length = 15, nullable = false)
    private String kodeChain;
    @Column(name = "nama_chain", length = 50)
    private String namaChain;

    public String getKodeChain() {
        return kodeChain;
    }

    public void setKodeChain(String kodeChain) {
        this.kodeChain = kodeChain;
    }

    public String getNamaChain() {
        return namaChain;
    }

    public void setNamaChain(String namaChain) {
        this.namaChain = namaChain;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.kodeChain);
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
        final TabelOutletChain other = (TabelOutletChain) obj;
        if (!Objects.equals(this.kodeChain, other.kodeChain)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return kodeChain + "  " + namaChain ;
    }    
    
    
}
