/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.domain.CaseAccountChange;
import com.vaadin.demo.dashboard.DashboardUI;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Saikot
 */
public class CashAccountChangeFacade extends AbstractFacade<CaseAccountChange>{
    final private EntityManager em = Persistence.createEntityManagerFactory(DashboardUI.PERSISTENCE_UNIT).createEntityManager();
    
    public CashAccountChangeFacade(Class<CaseAccountChange> entityClass) {
        super(entityClass);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public CashAccountChangeFacade(){
        super(CaseAccountChange.class);
    }
    
}
