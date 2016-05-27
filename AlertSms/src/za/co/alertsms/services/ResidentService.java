package za.co.alertsms.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import za.co.alertsms.entity.residents.ResidentData;
import za.co.alertsms.entity.residents.ResidentInfo;
import za.co.alertsms.utils.LogManager;

public class ResidentService {
	
	public int createResident(ResidentInfo residentInfo){
		
		Statement stmt = null;
		Connection conn = null;
		int rs = 0;
	try
		{
			String sqlInsert = ResidentData.getAction().getCreateResident().replace("${fName}",residentInfo.getFirstName())
					.replace("${lName}",residentInfo.getLastName())
				    .replace("${mobileNumber}", residentInfo.getMobileNumber())
				    .replace("${iArea}", String.valueOf(residentInfo.getiArea()));
			conn = ResidentData.getAction().getResidentDs().getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeUpdate(sqlInsert);
		}
	catch(Exception ex)
		{
			LogManager.error("Failed to create resident Reason: " + ex.getMessage() , this.getClass());
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
	
public ArrayList<String> getResidentBySuburb(int iArea){
		
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		ArrayList<String> mobileNumbers = new ArrayList<>();
	try
		{
			String sqlInsert = ResidentData.getAction().getSearchResidentBySuburb().replace("${iArea}", String.valueOf(iArea));
			conn = ResidentData.getAction().getResidentDs().getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sqlInsert);
			while(rs.next())
			{
				mobileNumbers.add(rs.getString("mobileNumber"));
			}
		}
	catch(Exception ex)
		{
			LogManager.error("Failed to get mobile numbers for iArea: " + iArea + " Reason: " + ex.getMessage() , this.getClass());
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
	return mobileNumbers;

	}
}
