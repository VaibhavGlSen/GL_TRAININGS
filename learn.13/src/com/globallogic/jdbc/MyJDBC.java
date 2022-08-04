package com.globallogic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJDBC {
	
	public static void main(String[] args) {
		
	
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String username = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/employee";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		//insert
		String insertQuery="insert into employee(id,name,fname,salary,deptid) values (10,'pooja','kumar',50000,1)";
		st.execute(insertQuery);
		String deleteQuery="delete from employee where id=3";
		//update
		st.executeUpdate(deleteQuery);
		String updateQuery="update employee set salary=50001 where id=3";
		st.executeUpdate(updateQuery);
		String query = "select * from employee";
		
		ResultSet rs = st.executeQuery(query);
while(rs.next())
{

System.out.println("id : "+" "+rs.getInt("id") +" name : "+rs.getString(2) +" fname :  "+rs.getString(3) +" salary : "+rs.getInt(4));

}
	}
	catch(Exception e){
		
		e.printStackTrace();
		
	}

}}
