package com.rak.dao;

import java.lang.reflect.ParameterizedType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAO
{
    private final Class persistentClass;

    @SuppressWarnings("unchecked")
    public <T> AbstractDAO()
    {
        this.persistentClass =
            (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }

    public <T> void presist(T entity)
    {
        getSession().persist(entity);
    }
}
