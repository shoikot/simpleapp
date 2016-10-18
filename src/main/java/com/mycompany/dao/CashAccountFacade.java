/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.domain.CashAccount;
import com.mycompany.simpleapp.MainUI;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Saikot
 */
public class CashAccountFacade extends  AbstractFacade<CashAccount>{
    final private EntityManager em = Persistence.createEntityManagerFactory(MainUI.PERSISTENCE_UNIT).createEntityManager();


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    public CashAccountFacade(){
        super(CashAccount.class);
    }
}
