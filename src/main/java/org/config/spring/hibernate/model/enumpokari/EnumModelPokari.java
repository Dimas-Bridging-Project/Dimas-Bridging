/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model.enumpokari;

import java.util.Objects;

/**
 *
 * @author yhawin
 */
public class EnumModelPokari {
    private int intCode;
    private String strCode;
    private String description;

    public int getIntCode() {
        return intCode;
    }

    public void setIntCode(int intCode) {
        this.intCode = intCode;
    }

    public String getStrCode() {
        return strCode;
    }

    public void setStrCode(String strCode) {
        this.strCode = strCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.strCode);
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
        final EnumModelPokari other = (EnumModelPokari) obj;
        if (!Objects.equals(this.strCode, other.strCode)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return strCode + " : " + description ;
    }
    
    
    
}
