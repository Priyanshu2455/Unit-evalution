package com.masai;
import java.util.*;
public class Course {
	
	int courceId=101;
	String courceName="web dev";
	double courceFee=300000.0;
	
	void displayCourseDetails() {
		System.out.println("courceId: "+courceId);
		System.out.println("courceName: "+courceName);
		System.out.println("courceFee :"+"Rs. "+courceFee);
		
	}
	
	static void authenticate(String userName , String password) {
		String name="Admin";
		String pin="1234";
		Course obj=new Course();
		
		if(name.equals(userName)  && pin.equals(password)) {
			obj.displayCourseDetails();
			
		}
		else {
			System.out.println("Invalid Username or password");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Course obj=new Course();
		Scanner s1= new Scanner(System.in);
		
		String Username=s1.next();
	    String password=s1.next();
		
		authenticate(Username,password);
		
		

	}

}
