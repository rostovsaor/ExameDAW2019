/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.professorjasse.bigsoft.sige.app.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import com.professorjasse.bigsoft.sige.dao.ArticleDAO;
import com.professorjasse.bigsoft.sige.model.Article;
import javax.inject.Inject;

/**
 *
 * @author Admin
 */
@Controller
public class ArticleController {
    private final ArticleDAO articleDAO;
    
    @Inject
    public ArticleController(ArticleDAO articleDAO) {
        this.articleDAO = articleDAO;
    }

    public ArticleController() {
        this(null);
    }
    
    
    @Get
    public void newArticle() {
    
    }

    @Post
    public void create(Article article) {
        articleDAO.create(article);
    }
}
