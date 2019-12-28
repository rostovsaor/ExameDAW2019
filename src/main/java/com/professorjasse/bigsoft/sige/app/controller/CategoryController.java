/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.professorjasse.bigsoft.sige.app.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import com.professorjasse.bigsoft.sige.dao.CategoryDAO;
import com.professorjasse.bigsoft.sige.model.Category;
import javax.inject.Inject;

/**
 *
 * @author Salvador Rombe
 */
@Controller
public class CategoryController {
    private final CategoryDAO categoryDAO;

    @Inject
    public CategoryController(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    public CategoryController() {
        this(null);
    }
    
    
    @Get
    public void newCategory() {
        
    }
    
    @Post
    public void create(Category category) {
        categoryDAO.create(category);
    }
}
