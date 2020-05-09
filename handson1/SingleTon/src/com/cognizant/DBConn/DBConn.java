package com.cognizant.DBConn;

public class DBConn {

	private static DBConn instance = new DBConn();

	private DBConn() {
	}

	public static DBConn getInstance() {
		return instance;
	}

	public void show() {
		System.out.println("Successful");
	}

}
