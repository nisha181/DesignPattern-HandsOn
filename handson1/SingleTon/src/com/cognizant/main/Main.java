package com.cognizant.main;

import com.cognizant.DBConn.DBConn;

public class Main {

	public static void main(String[] args) {
		DBConn dbConn = DBConn.getInstance();
		dbConn.show();
	}
}
