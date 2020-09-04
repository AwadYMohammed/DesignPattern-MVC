package com.demo.controller;

import java.sql.SQLException;

import com.demo.model.Model;
import com.demo.model.Person;
import com.demo.model.PersonDAO;
import com.demo.view.View;

public class Controller implements CreateUserListener {
	private View view;
	private Model model;
	
	private PersonDAO personDAO = DAOFactory.getPersonDAO();
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void userCreated(CreateUserEvent event) {
		System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());
		
		try {
			personDAO.addPerson(new Person(event.getName(), event.getPassword()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
