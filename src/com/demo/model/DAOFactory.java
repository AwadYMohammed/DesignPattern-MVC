package com.demo.model;

public class DAOFactory {
	public static MySQLPersonDAO getPersonDAO() {
		return new MySQLPersonDAO();
	}
	
	public static MySQLLogDAO getLogDAO() {
		return new MySQLLogDAO();
	}
}
