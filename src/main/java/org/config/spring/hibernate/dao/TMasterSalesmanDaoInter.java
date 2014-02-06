/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.dao;

import java.io.Serializable;
import java.util.List;
import org.config.spring.hibernate.dao.generic.GenericDaoInter;
import org.config.spring.hibernate.model.TMasterSalesman;
import org.config.spring.hibernate.model.TSalesman;
import org.hibernate.HibernateException;

/**
 *
 * @author Bagus Winarno
 */
public interface TMasterSalesmanDaoInter extends GenericDaoInter<TMasterSalesman, Serializable> {
    
}
