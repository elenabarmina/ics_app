package com.pecen.ics_app.application.server.datasource.dao;

import com.pecen.ics_app.application.server.datasource.entities.TClientPOJO;
import org.hibernate.SessionFactory;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * Created by pechen on 05.12.2017.
 */
public class ClientDAOImpl implements IClientDAO {
    SessionFactory sessionFactory;

    @Override
    public void save(Object entity) {

    }

    @Override
    public void update(Object entity) {

    }

    @Override
    public Object findById(Serializable serializable) {
        return null;
    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public List findAll() {
        return sessionFactory.getCurrentSession().createCriteria(TClientPOJO.class).list();
    }
}
