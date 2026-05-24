package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.bean.Employee;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

public class EmployeeDAO {

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found!!!!!");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servaletDemo", "root", "Ishwar@2003");
		System.out.println("Connection Establish!!!!!");
		return con;
	}

	public static int save(Employee e) throws ClassNotFoundException, SQLException {
		int i = 0;
		try {
			System.out.println("e = " + e);
			Connection con = getConnection();
			PreparedStatement pstmt = con
					.prepareStatement("insert into Employee(fName,pass,email,gender,age) values(?,?,?,?,?)");
			pstmt.setString(1, e.getfName());
			pstmt.setString(2, e.getPass());
			pstmt.setString(3, e.getEmail());
			pstmt.setString(4, e.getGender());
			pstmt.setString(5, e.getAge());
			i = pstmt.executeUpdate();
			System.out.println("Employee Inserted Sucessfully");
			return i;
		} catch (Exception e1) {
			return i;
		}
	}

	public static List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		List<Employee> l = new ArrayList<Employee>();
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement("select *from Employee");
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Employee e = new Employee();
			e.setId(rs.getInt(1));
			e.setfName(rs.getString(2));
			e.setPass(rs.getString(3));
			e.setEmail(rs.getString(4));
			e.setGender(rs.getString(5));
			e.setAge(rs.getString(6));
			l.add(e);
		}
		return l;
	}

	public static Employee getEmployeeById(int id) throws SQLException, ClassNotFoundException {
		Employee e = null;
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement("select *from Employee where id = ?");
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			e = new Employee();
			e.setId(rs.getInt(1));
			e.setfName(rs.getString(2));
			e.setPass(rs.getString(3));
			e.setEmail(rs.getString(4));
			e.setGender(rs.getString(5));
			e.setAge(rs.getString(6));
			return e;
		}
		return e;
	}

	public static boolean update(Employee e) throws SQLException, ClassNotFoundException {
		Connection con = getConnection();
		PreparedStatement pstmt = con
				.prepareStatement("update Employee set fName=?,pass=?,email=?,gender=?,age=? where id=?");
		pstmt.setString(1, e.getfName());
		pstmt.setString(2, e.getPass());
		pstmt.setString(3, e.getEmail());
		pstmt.setString(4, e.getGender());
		pstmt.setString(5, e.getAge());
		pstmt.setInt(6, e.getId());
		int i = pstmt.executeUpdate();
		if (i == 1)
			return true;
		else
			return false;
	}

	public static boolean delete(int id) throws ClassNotFoundException, SQLException {

		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("delete from Employee where id =?");
		pst.setInt(1, id);

		int i = pst.executeUpdate();
		if (i == 1)
			return true;
		else
			return false;
	}

}
