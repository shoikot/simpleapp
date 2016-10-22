/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaadin.demo.dashboard.data;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Aminul
 */
public abstract class AbstractFacade<T> {

    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public  void create(T entity) {
        try{
           getEntityManager().getTransaction().begin();
           getEntityManager().persist(entity);
           getEntityManager().getTransaction().commit(); 
        }finally {
            if (getEntityManager() != null) {
                getEntityManager().close();
            }
        }    
        

    }

    public synchronized void edit(T entity) {
        try{
            getEntityManager().getTransaction().begin();
            getEntityManager().merge(entity);
            getEntityManager().getTransaction().commit();
        }finally {
            if (getEntityManager() != null) {
                getEntityManager().close();
            }
        }  
    }

    public synchronized void remove(T entity) {
         try{
             getEntityManager().getTransaction().begin();
             getEntityManager().remove(getEntityManager().merge(entity));
             getEntityManager().getTransaction().commit();
          }finally {
            if (getEntityManager() != null) {
                getEntityManager().close();
          }
        } 
       
    }

    public  T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public  List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public  List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public synchronized int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

}
