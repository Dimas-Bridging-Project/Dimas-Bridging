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
@Table(name = "tabel_outlet_group")
public class TabelOutletGroup implements Serializable {
    @Id
    @Basic(optional = false)
    @Column(name = "group_id", length = 15, nullable = false)
    private String groupId;
    @Column(name = "group_nm", length = 50)
    private String groupNm;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupNm() {
        return groupNm;
    }

    public void setGroupNm(String groupNm) {
        this.groupNm = groupNm;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.groupId);
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
        final TabelOutletGroup other = (TabelOutletGroup) obj;
        if (!Objects.equals(this.groupId, other.groupId)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return groupId + "  " + groupNm ;
    }
    
}
