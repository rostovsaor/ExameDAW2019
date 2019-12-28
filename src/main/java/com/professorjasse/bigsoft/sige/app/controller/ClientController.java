/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.professorjasse.bigsoft.sige.app.controller;

import com.professorjasse.bigsoft.sige.dao.ClientDAO; //Acertar o nome do pacote dao
import com.professorjasse.bigsoft.sige.model.Client; //Acertar o nome do pacote modelo

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import javax.inject.Inject;

/**
 *
 * @author Salvador Rombe
 */
@Controller
public class ClientController {
    
    private Result result;
    private ClientDAO dao;
    private LoggedClient loggedClient;
    private Client ClientObj;

    @Inject
    public void ClientController(Result result, ClientDAO dao, LoggedClient loggedClient, Client ClientObj) {
        this.result = result;
        this.dao = dao;
        this.loggedClient = loggedClient;
        this.ClientObj = ClientObj;
    }
    
    public void ClientController() {
        
    }
    
    @Get
    public void index() {
        result.include("clients", dao.findAllClients());
    }
    
    @Get
    public void newClient() {
        
    }
    
    @Post
    public void create(Client client) {
        dao.create(client);
    }


    
}