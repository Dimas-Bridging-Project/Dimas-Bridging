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
@Table(name = "tabel_outlet_class")
public class TabelOutletClass implements Serializable {
    @Id
    @Basic(optional = false)
    @Column(name = "class_id", length = 15, nullable = false)
    private String classId;
    @Column(name = "class_nm", length = 50)
    private String classNm;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassNm() {
        return classNm;
    }

    public void setClassNm(String classNm) {
        this.classNm = classNm;
    }

  

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.classId);
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
        final TabelOutletClass other = (TabelOutletClass) obj;
        if (!Objects.equals(this.classId, other.classId)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return classId + "  " + classNm ;
    }
    
}
