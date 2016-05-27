package za.co.alertsms.services;

import java.sql.Connection;
import java.sql.Statement;

import za.co.alertsms.entity.areas.AreaData;
import za.co.alertsms.entity.areas.AreasInfo;
import za.co.alertsms.utils.LogManager;

public class AreasService {
	
	public int createArea(AreasInfo aInfo){
		int result = 0;
		Statement stmt = null;
		Connection conn;
		try
		{
			String sqlInsert = AreaData.getAction().getCreateArea().replace("${iArea}", String.valueOf(aInfo.getiArea())).replace("${area}", aInfo.getArea()).replace("${areaDescription}", aInfo.getAreaDescription());
			conn = AreaData.getAction().getAreaDs().getConnection();
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sqlInsert);
		}
		catch(Exception ex)
		{
			LogManager.error("Failed to create area info " + ex.getMessage(), getClass());
		}
		return result;
		
	}

}
