/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.professorjasse.bigsoft.sige.dao;

import com.professorjasse.bigsoft.sige.model.Category;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Salvador Rombe
 */
public class CategoryDAO {

    @Inject 
    private EntityManager manager;
    
//    public CategoryDAO(EntityManager manager) {
//        this.manager = manager;
//    }
//    public CategoryDAO() {
//        this(null);
//    }

    public CategoryDAO() {
    }
    

    
    public Category create(Category entity) {
        try {
            entity.setId(null);
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Category update(Category entity) {
        manager.merge(entity);
        return entity;
    }

    public Category find(Integer id) {
        return manager.find(Category.class, id);
    }

    public boolean delete(Category entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Category> findAllCategories() {
        try {
            List<Category> lista = manager.createQuery("from Category e order by e.id").getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Category> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Category u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Category> u = q.getResultList();
        return u;
    }
}
