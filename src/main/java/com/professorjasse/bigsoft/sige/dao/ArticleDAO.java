/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.professorjasse.bigsoft.sige.dao;

import com.professorjasse.bigsoft.sige.model.Article;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Admin
 */
@RequestScoped
public class ArticleDAO {
    
    @Inject 
    private EntityManager manager;
    
    public ArticleDAO() {
    }

    
    public Article create(Article entity) {
        try {
            entity.setId(null);
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Article update(Article entity) {
        manager.merge(entity);
        return entity;
    }

    public Article find(Integer id) {
        return manager.find(Article.class, id);
    }

    public boolean delete(Article entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Article> findAllArticles() {
        try {
            List<Article> list = manager.createQuery("from Article e order by e.id").getResultList();
            return list;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Article> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Article u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Article> u = q.getResultList();
        return u;
    }
}
