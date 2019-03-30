package com.Kamal.Spring.PropertyPlaceHolder;

public class MyDAO {

	private String dbServer;

	public MyDAO(String dbServer) {
		this.dbServer = dbServer;

	}
	
	@Override
	public String toString() {
	
		return "MyDAO[dbserver: "+dbServer+"]";
	}
}
