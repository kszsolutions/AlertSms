package za.co.alertsms.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import za.co.alertsms.entity.residents.ResidentData;
import za.co.alertsms.entity.users.UserData;
import za.co.alertsms.entity.users.UserInfo;
import za.co.alertsms.utils.LogManager;

public class UserService {
	
	public int createUserRecord(UserInfo userInfo){
		
		Statement stmt = null;
		Connection conn = null;
		int rs = 0;
	try
		{
			String sqlInsert = UserData.getAction().getCreateUser().replace("${fName}",userInfo.getFirstName())
					.replace("${lName}",userInfo.getLastName()).replace("${userName}",userInfo.getUserName()).replace("${password}",userInfo.getPassword());
			conn = ResidentData.getAction().getResidentDs().getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeUpdate(sqlInsert);
		}
	catch(Exception ex)
		{
			LogManager.error("Failed to create user Reason: " + ex.getMessage() , this.getClass());
		}
	finally 
	{
		try
		{
			stmt.close();
			conn.close();
		}
		catch(Exception ex)
		{
			
		}
	}
	return rs;

	}
	
public UserInfo getUserByUsername(String username){
		
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
	    UserInfo uInfo = null;
	try
		{
			String sqlInsert = UserData.getAction().getGetUser().replace("${username}", username);
			conn = ResidentData.getAction().getResidentDs().getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sqlInsert);
			if(rs.next())
			{
				uInfo = new UserInfo();
				uInfo.setFirstName(rs.getString("firstName"));
				uInfo.setLastName(rs.getString("lastName"));
				uInfo.setUserName("userName");
				uInfo.setiUser(rs.getInt("iUser"));
			}
		}
	catch(Exception ex)
		{
			LogManager.error("Failed to get users details: " + username + " Reason: " + ex.getMessage() , this.getClass());
		}
	finally 
	{
		try
		{
			stmt.close();
			conn.close();
		}
		catch(Exception ex)
		{
			
		}
	}
	return uInfo;

	}
}
