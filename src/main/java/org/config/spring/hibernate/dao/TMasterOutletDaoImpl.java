/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.dao;

import java.io.Serializable;
import java.util.List;
import org.config.spring.hibernate.dao.generic.GenericDaoImpl;
import org.config.spring.hibernate.model.TMasterOutlet;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Bagus Winarno
 */
public class TMasterOutletDaoImpl extends GenericDaoImpl<TMasterOutlet, Serializable> implements TMasterOutletDaoInter{

    @Override
    public List<TMasterOutlet> findById(String idScylla, String idOutlet, String namaOutlet, Boolean semua, Boolean baruSaja, 
    Boolean dikirimSaja, Boolean aktifSaja) throws HibernateException {
        DetachedCriteria detCrit = DetachedCriteria.forClass(getDomainClass());
        
        if (semua==true) {
            detCrit.add(Restrictions.and(Restrictions.like("scyOutCode", idScylla, MatchMode.ANYWHERE), 
                    Restrictions.and(Restrictions.like("mslsoutCode", idOutlet, MatchMode.ANYWHERE), 
                    Restrictions.like("mslsoutDesc", namaOutlet, MatchMode.ANYWHERE))));
        } else {
            detCrit.add(Restrictions.and(Restrictions.like("scyOutCode", idScylla, MatchMode.ANYWHERE), 
                    Restrictions.and(Restrictions.like("mslsoutCode", idOutlet, MatchMode.ANYWHERE),
                    Restrictions.and(Restrictions.like("mslsoutDesc", namaOutlet, MatchMode.ANYWHERE), 
                    Restrictions.and(Restrictions.eq("baru", baruSaja), 
                    Restrictions.and(Restrictions.eq("allowTransfer", dikirimSaja), 
                    Restrictions.eq("aktif", aktifSaja)))))));
        }
        
        detCrit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return getHibernateTemplate().findByCriteria(detCrit);
    }
    
}
