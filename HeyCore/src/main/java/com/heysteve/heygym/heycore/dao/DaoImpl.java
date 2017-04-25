package com.heysteve.heygym.heycore.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by martinh on 26/3/2017.
 */
public class DaoImpl extends HibernateDaoSupport implements Dao {

    public void save(Object object) {
        getHibernateTemplate().save(object);
    }

    public void update(Object object) {
        getHibernateTemplate().update(object);
    }

    public void delete(Object object) {
        getHibernateTemplate().delete(object);
    }

    public Object findById(String id) {
        return null;
    }

}
