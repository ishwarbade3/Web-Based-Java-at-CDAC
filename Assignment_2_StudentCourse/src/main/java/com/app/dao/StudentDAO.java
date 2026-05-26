package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.bean.Student;

public class StudentDAO {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found!!!!!");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servaletDemo", "root", "Ishwar@2003");
		System.out.println("Connection Establish!!!!!");
		return con;
	}
	public static int add(Student s) {
		int i=0;
		
		try {
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement("insert into Student(prn,fName,lName,email,gender,dob,branch,semister) values(?,?,?,?,?,?,?,?)");
		    pst.setString(1, s.getPrn());
		    pst.setString(2, s.getfName());
		    pst.setString(3, s.getlName());
		    pst.setString(4, s.getEmail());
		    pst.setString(5, s.getGender());
		    pst.setString(6, s.getDob());
		    pst.setString(7, s.getBranch());
		    pst.setString(8, s.getSemister());
		    
		    i =pst.executeUpdate();
		    return i;
		
		}catch(Exception e){
			System.out.println(e);
			return i;
		}
	}

}
