/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.professorjasse.bigsoft.sige.app.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
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
    private Result result;
    
    @Inject
    public ArticleController(ArticleDAO articleDAO, Result result) {
        this.articleDAO = articleDAO;
        this.result = result;
    }

    public ArticleController() {
        this(null, null);
    }
    
    
    @Get
    public void article() {
        
    }

    @Post
    public void create(Article article) {
        articleDAO.create(article);
    }
}
