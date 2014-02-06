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
public class TMasterOutletPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "mslsout_code", length = 25, nullable = false)
    private String mslsoutCode;
    @Basic(optional = false)
    @Column(name = "scy_out_code", length = 25, nullable = false)
    private String scyOutCode;

    public String getMslsoutCode() {
        return mslsoutCode;
    }

    public void setMslsoutCode(String mslsoutCode) {
        this.mslsoutCode = mslsoutCode;
    }

    public String getScyOutCode() {
        return scyOutCode;
    }

    public void setScyOutCode(String scyOutCode) {
        this.scyOutCode = scyOutCode;
    }

    @Override
    public String toString() {
        return "TOutletPK{" + "mslsoutCode=" + mslsoutCode + ", scyOutCode=" + scyOutCode + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.mslsoutCode);
        hash = 73 * hash + Objects.hashCode(this.scyOutCode);
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
        final TMasterOutletPK other = (TMasterOutletPK) obj;
        if (!Objects.equals(this.mslsoutCode, other.mslsoutCode)) {
            return false;
        }
        if (!Objects.equals(this.scyOutCode, other.scyOutCode)) {
            return false;
        }
        return true;
    }
    
    
    
}
