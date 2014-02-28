/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Bagus Winarno
 */
@Embeddable
public class ScyBDItemPK implements Serializable {
    @Basic(optional = true)
    @Column(name = "no_dokumen", length = 15)
    private String noDokumen;
    @Column(name = "pcode", length = 15)
    private String pcode;

    public String getNoDokumen() {
        return noDokumen;
    }

    public void setNoDokumen(String noDokumen) {
        this.noDokumen = noDokumen;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    @Override
    public String toString() {
        return noDokumen + "-" + pcode ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.noDokumen);
        hash = 59 * hash + Objects.hashCode(this.pcode);
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
        final ScyBDItemPK other = (ScyBDItemPK) obj;
        if (!Objects.equals(this.noDokumen, other.noDokumen)) {
            return false;
        }
        if (!Objects.equals(this.pcode, other.pcode)) {
            return false;
        }
        return true;
    }

    
    
}
