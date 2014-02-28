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
@Table(name = "tabel_outlet_sub_group")
public class TabelOutletSubGroup implements Serializable {
    @Id
    @Basic(optional = false)
    @Column(name = "sub_group_id", length = 15, nullable = false)
    private String subGroupId;
    @Column(name = "sub_group_name", length = 50)
    private String subGroupNm;

    public String getSubGroupId() {
        return subGroupId;
    }

    public void setSubGroupId(String subGroupId) {
        this.subGroupId = subGroupId;
    }

    public String getSubGroupNm() {
        return subGroupNm;
    }

    public void setSubGroupNm(String subGroupNm) {
        this.subGroupNm = subGroupNm;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.subGroupId);
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
        final TabelOutletSubGroup other = (TabelOutletSubGroup) obj;
        if (!Objects.equals(this.subGroupId, other.subGroupId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return subGroupId + "-" + subGroupNm ;
    }
   
}
