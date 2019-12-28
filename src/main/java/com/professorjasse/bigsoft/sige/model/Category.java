/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.professorjasse.bigsoft.sige.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 *
 * @author Admin
 */
@Entity
public class Category implements Serializable{
    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    
    @OneToMany(mappedBy = "category")
    private Set<Article> article;

    public Category() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Article> getArticle() {
        return article;
    }

    public void setArticle(Set<Article> article) {
        this.article = article;
    }
    
    
}
