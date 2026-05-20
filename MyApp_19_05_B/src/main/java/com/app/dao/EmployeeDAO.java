package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.model.Employee;

public class EmployeeDAO {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found!!!");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Ishwar@2003" );
		System.out.println("Connection Done!!!");
		return con;		
	}
	
	public static int employeeReg(Employee e)throws ClassNotFoundException,SQLException {
		
		try {
			System.out.println("Emp = "+e);
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement("insert into Empl(fName,password1,email,gender,age) values(?,?,?,?,?)");
			pst.setString(1, e.getFName());
			pst.setString(2, e.getPass());
			pst.setString(3, e.getEmail());
			pst.setString(4, e.getGender());
			pst.setString(5, e.getAge());
			
			int i  = pst.executeUpdate();
			return i;
		} catch (Exception e2) {
			return 0;
		}
	}
	public static boolean validateEmployee(Employee e) throws ClassNotFoundException,SQLException {
		
		Connection con = getConnection();
		
		PreparedStatement pst  =con.prepareStatement("select * from empl where email = ? and password1=?");
		
		pst.setString(1, e.getEmail());
		pst.setString(2, e.getPass());
		
		ResultSet rs = pst.executeQuery();
		boolean ans=rs.next();
		return ans;
	}
	

}
