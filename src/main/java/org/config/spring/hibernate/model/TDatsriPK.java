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
public class TDatsriPK implements Serializable {
   @Basic(optional = false)
   @Column(name = "trans_no", length = 50)
   private String transNo;
   @Column(name = "item_code", length = 25)
   private String itemCode;
   

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.transNo);
        hash = 23 * hash + Objects.hashCode(this.itemCode);
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
        final TDatsriPK other = (TDatsriPK) obj;
        if (!Objects.equals(this.transNo, other.transNo)) {
            return false;
        }
        if (!Objects.equals(this.itemCode, other.itemCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return transNo + "-" + itemCode ;
    }


   
}
