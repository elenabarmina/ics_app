package com.pecen.ics_app.application.server.datasource.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by pechen on 05.12.2017.
 */
public interface IClientDAO <T, Id extends Serializable> {
    public void save(T entity);

    public void update(T entity);

    public T findById(Id id);

    public void delete(T entity);

    public List<T> findAll();
}
