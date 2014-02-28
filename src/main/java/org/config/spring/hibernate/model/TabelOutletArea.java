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
 * @author yhawin
 */
@Entity
@Table(name = "tabel_outlet_area")
public class TabelOutletArea implements Serializable {
    @Id
    @Basic(optional = true)
    @Column(name = "area_id", length = 15, nullable = false)
    private String areaId;
    @Column(name = "area_nm", length = 15)
    private String areaNm;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaNm() {
        return areaNm;
    }

    public void setAreaNm(String areaNm) {
        this.areaNm = areaNm;
    }

    @Override
    public String toString() {
        return areaId + "-" + areaNm ;
    }
    
    
}
