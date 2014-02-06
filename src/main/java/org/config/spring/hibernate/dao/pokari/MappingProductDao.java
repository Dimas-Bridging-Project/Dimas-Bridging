/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.dao.pokari;

import java.io.Serializable;
import java.util.List;
import org.config.spring.hibernate.dao.generic.GenericDaoInter;
import org.config.spring.hibernate.model.TMasterProduct;
import org.config.spring.hibernate.model.pokari.MappingProduct;
import org.hibernate.HibernateException;

/**
 *
 * @author yhawin
 */
public interface MappingProductDao extends GenericDaoInter<MappingProduct, Serializable>{
    List<MappingProduct> findById(String idScylla, String productId, String ProductName, Boolean semua, Boolean baruSaja, 
    Boolean dikirimSaja, Boolean aktifSaja) throws HibernateException;
    
}
