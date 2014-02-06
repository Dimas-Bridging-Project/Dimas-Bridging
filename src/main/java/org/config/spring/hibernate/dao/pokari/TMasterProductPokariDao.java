/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.dao.pokari;

import org.config.spring.hibernate.dao.*;
import java.io.Serializable;
import java.util.List;
import org.config.spring.hibernate.dao.generic.GenericDaoInter;
import org.config.spring.hibernate.model.TMasterProduct;
import org.config.spring.hibernate.model.pokari.TMasterProductPokari;
import org.hibernate.HibernateException;

/**
 *
 * @author Bagus Winarno
 */
public interface TMasterProductPokariDao extends GenericDaoInter<TMasterProductPokari, Serializable>{
    List<TMasterProduct> findById(String idScylla, String idSap, String descSap, Boolean semua, Boolean baruSaja, 
    Boolean dikirimSaja, Boolean bonusSaja, Boolean aktifSaja) throws HibernateException;
    
}
