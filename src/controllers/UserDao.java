package controllers;

import models.User;
import service.ConnectDB;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
public class UserDao {
	public static User getUser(User user) {
		String s = "select id, username, password "
				 + "from userlist "
			   	 + "where (username='"+user.getName()
				 +"')and(password='"+user.getPassword()+"');";
		Connection conn = ConnectDB.getXAMPPConnection();
		if(conn==null) return null;
		try {
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(s);
		int id=0;
		String name=null;
		String password=null;
		if(rs.next()) {
			id = rs.getInt("id");
			name = rs.getString("username");
			password = rs.getString("password");
			return new User(id,name,password);
		}
		return new User();
		}catch(Exception ex) {
			System.out.println("đăng nhập thất bại");
			return null;
		}
	}
	public static int checkUserName(String name) {
		String s = "select * "
				 + "from userlist "
			   	 + "where (username='"+name+"');";
		return ConnectDB.excuteQueryCheck(s);
	}
	public static int addUser(User user) {
		String s = "insert into userlist(username,password)"
				+" values('"+user.getName()+"','"+user.getPassword()+"');";
		return ConnectDB.excuteCheck(s);
	}
}
