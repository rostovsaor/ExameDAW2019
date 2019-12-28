/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.professorjasse.bigsoft.sige.dao;

import com.professorjasse.bigsoft.sige.model.Client;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Salvador Rombe
 */
@RequestScoped
public class ClientDAO {

    @Inject 
    private EntityManager manager;
    
    public ClientDAO() {
    }

    
    public Client create(Client entity) {
        try {
            entity.setId(null);
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Client update(Client entity) {
        manager.merge(entity);
        return entity;
    }

    public Client find(Integer id) {
        return manager.find(Client.class, id);
    }

    public boolean delete(Client entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Client> findAllClients() {
        try {
            List<Client> list = manager.createQuery("from Client e order by e.id").getResultList();
            return list;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Client> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Client u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Client> u = q.getResultList();
        return u;
    }
}
