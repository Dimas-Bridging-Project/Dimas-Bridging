/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Bagus Winarno
 */
@Entity
@Table(name = "t_classout")
public class TClassout implements Serializable {
    @Id
    @Column(name = "kode_class", length = 25)
    private String kodeClass;
    @Column(name = "nama_class", length = 50)
    private String namaClass;
    @Column(name = "kode_group", length = 25)
    private String kodeGroup;
    @Column(name = "nama_group", length = 50)
    private String namaGroup;
    @Column(name = "kode_sub_group", length = 25)
    private String kodeSubGroup;
    @Column(name = "nama_sub_group", length = 50)
    private String namaSubGroup;

    public String getKodeClass() {
        return kodeClass;
    }

    public void setKodeClass(String kodeClass) {
        this.kodeClass = kodeClass;
    }

    public String getNamaClass() {
        return namaClass;
    }

    public void setNamaClass(String namaClass) {
        this.namaClass = namaClass;
    }

    public String getKodeGroup() {
        return kodeGroup;
    }

    public void setKodeGroup(String kodeGroup) {
        this.kodeGroup = kodeGroup;
    }

    public String getNamaGroup() {
        return namaGroup;
    }

    public void setNamaGroup(String namaGroup) {
        this.namaGroup = namaGroup;
    }

    public String getKodeSubGroup() {
        return kodeSubGroup;
    }

    public void setKodeSubGroup(String kodeSubGroup) {
        this.kodeSubGroup = kodeSubGroup;
    }

    public String getNamaSubGroup() {
        return namaSubGroup;
    }

    public void setNamaSubGroup(String namaSubGroup) {
        this.namaSubGroup = namaSubGroup;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.kodeClass);
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
        final TClassout other = (TClassout) obj;
        if (!Objects.equals(this.kodeClass, other.kodeClass)) {
            return false;
        }
        return true;
    }
    
    
}
