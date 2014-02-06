/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.dao.pokari;

import java.io.Serializable;
import java.util.List;
import org.config.spring.hibernate.dao.generic.GenericDaoImpl;
import org.config.spring.hibernate.model.pokari.ArCustomer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author yhawin
 */
public class ArCustomerDaoImpl extends GenericDaoImpl<ArCustomer, Serializable> implements ArCustomerDao{

    @Override
    public List<ArCustomer> findById(String idScylla, String outletId, String outletName, Boolean semua, Boolean baruSaja, 
        Boolean dikirimSaja, Boolean aktifSaja) throws HibernateException {
        
        DetachedCriteria detCrit = DetachedCriteria.forClass(getDomainClass());
        if (semua==true) {
            detCrit.add(Restrictions.and(Restrictions.like("scyCustomerId", idScylla, MatchMode.ANYWHERE), 
                    Restrictions.and(Restrictions.like("szCustomerId", outletId, MatchMode.ANYWHERE), 
                    Restrictions.like("szName", outletName, MatchMode.ANYWHERE))));
        } else {
            detCrit.add(Restrictions.and(Restrictions.like("scyCustomerId", idScylla, MatchMode.ANYWHERE), 
                    Restrictions.and(Restrictions.like("szCustomerId", outletId, MatchMode.ANYWHERE),
                    Restrictions.and(Restrictions.like("szName", outletName, MatchMode.ANYWHERE), 
                    Restrictions.and(Restrictions.eq("baru", baruSaja), 
                    Restrictions.and(Restrictions.eq("allowTransfer", dikirimSaja), 
                    Restrictions.eq("aktif", aktifSaja)))))));
        }

        detCrit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return getHibernateTemplate().findByCriteria(detCrit);
    }
    
}
