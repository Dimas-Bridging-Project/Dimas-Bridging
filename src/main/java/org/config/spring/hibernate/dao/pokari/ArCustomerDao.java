/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.dao.pokari;

import java.io.Serializable;
import java.util.List;
import org.config.spring.hibernate.dao.generic.GenericDaoInter;
import org.config.spring.hibernate.model.pokari.ArCustomer;
import org.hibernate.HibernateException;

/**
 *
 * @author yhawin
 */
public interface ArCustomerDao extends GenericDaoInter<ArCustomer, Serializable>{
    List<ArCustomer> findById(String idScylla, String outletId, String outletName, Boolean semua, Boolean baruSaja, 
            Boolean dikirimSaja, Boolean aktifSaja) throws HibernateException;
    
}
