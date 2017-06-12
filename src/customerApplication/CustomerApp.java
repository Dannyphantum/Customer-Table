package customerApplication;

import java.util.Scanner;

public class CustomerApp {

	public static void main(String[] args) {
		
		Customer cust = new Customer();
		DBConnection  connect = new DBConnection();
		
		
		print("Enter Customer Last Name.");
		
		connect.getData("customers", "LastName", "lname", "FirstName", "LastName");
		//connect.updateRecord ("customers", "FirstName", "City", "Oakland", "Oakland");
		//connect.addRecord("customers", "FullName", "Daniel Bonparte");
		

	}

	private static void print(String p){
		System.out.println(p);
	}
}
