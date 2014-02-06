/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.dao;

import java.io.Serializable;
import java.util.List;
import org.config.spring.hibernate.dao.generic.GenericDaoInter;
import org.config.spring.hibernate.model.TMasterOutlet;
import org.hibernate.HibernateException;

/**
 *
 * @author Bagus Winarno
 */
public interface TMasterOutletDaoInter extends GenericDaoInter<TMasterOutlet, Serializable> {
    List<TMasterOutlet> findById(String idScylla, String idSap, String descSap, Boolean semua, Boolean baruSaja, 
            Boolean dikirimSaja, Boolean aktifSaja) throws HibernateException;
}
