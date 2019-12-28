/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.professorjasse.bigsoft.sige.app.controller;

import com.professorjasse.bigsoft.sige.model.Client;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Salvador Rombe
 */
@SessionScoped
@Named
public class LoggedClient implements Serializable{
    	private Client client;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
