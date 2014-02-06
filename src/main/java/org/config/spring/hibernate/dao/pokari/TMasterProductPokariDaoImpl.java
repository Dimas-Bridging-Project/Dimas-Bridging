/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.dao.pokari;

import org.config.spring.hibernate.dao.*;
import java.io.Serializable;
import java.util.List;
import org.config.spring.hibernate.dao.generic.GenericDaoImpl;
import org.config.spring.hibernate.model.TMasterProduct;
import org.config.spring.hibernate.model.pokari.TMasterProductPokari;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Bagus Winarno
 */
public class TMasterProductPokariDaoImpl extends GenericDaoImpl<TMasterProductPokari, Serializable> implements TMasterProductPokariDao{

    @Override
    public List<TMasterProduct> findById(String idScylla, String idSap, String descSap, Boolean semua, Boolean baruSaja, 
    Boolean dikirimSaja, Boolean bonusSaja, Boolean aktifSaja) throws HibernateException {
        DetachedCriteria detCrit = DetachedCriteria.forClass(getDomainClass());
        if (semua==true) {
            detCrit.add(Restrictions.and(Restrictions.like("pcodeScylla", idScylla, MatchMode.ANYWHERE), 
                    Restrictions.and(Restrictions.like("pcodeSap", idSap, MatchMode.ANYWHERE), 
                    Restrictions.like("pnameSap", descSap, MatchMode.ANYWHERE))));
        } else {
            detCrit.add(Restrictions.and(Restrictions.like("pcodeScylla", idScylla, MatchMode.ANYWHERE), 
                    Restrictions.and(Restrictions.like("pcodeSap", idSap, MatchMode.ANYWHERE), 
                    Restrictions.and(Restrictions.like("pnameSap", descSap, MatchMode.ANYWHERE), 
                    Restrictions.and(Restrictions.eq("baru", baruSaja), 
                    Restrictions.and(Restrictions.eq("allowTransfer", dikirimSaja), 
                    Restrictions.and(Restrictions.eq("bonus", bonusSaja) , 
                    Restrictions.eq("aktif", aktifSaja))))))));
            
        }
        detCrit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return getHibernateTemplate().findByCriteria(detCrit);
    }
    
}
