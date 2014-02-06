/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.dao;

import java.io.Serializable;
import java.util.List;
import org.config.spring.hibernate.dao.generic.GenericDaoInter;
import org.config.spring.hibernate.model.TMasterOutlet;
import org.config.spring.hibernate.model.TOutlet;
import org.hibernate.HibernateException;

/**
 *
 * @author Bagus Winarno
 */
public interface TOutletDaoInter extends GenericDaoInter<TOutlet, Serializable> {
}
