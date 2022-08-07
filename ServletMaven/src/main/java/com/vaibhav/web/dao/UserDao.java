package com.vaibhav.web.dao;
import java.io.IOException;
import java.sql.*;
import com.vaibhav.web.model.User;

public class UserDao 
{
	public User getUser(int id) throws IOException
	{
		User a=new User();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from user where id="+id);
			if(rs.next())
			{
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setTech(rs.getString(3));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return a;
	}

}
