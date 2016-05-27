package za.co.alertsms.services;

import java.sql.Connection;
import java.sql.Statement;

import za.co.alertsms.entity.alerts.AlertData;
import za.co.alertsms.entity.alerts.AlertInfo;
import za.co.alertsms.utils.LogManager;

public class AlertService {
	
public int createAlert(AlertInfo alertInfo){
		
		Statement stmt = null;
		Connection conn = null;
		int rs = 0;
	try
		{
			String sqlInsert = AlertData.getAction().getCreateAlert().replace("${alert}",alertInfo.getAlert()).replace("${iArea}", String.valueOf(alertInfo.getiArea())).replace("${iUser}", Integer.toString(alertInfo.getiUser()));
			conn = AlertData.getAction().getAlertDs().getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeUpdate(sqlInsert);
		}
	catch(Exception ex)
		{
			LogManager.error("Failed to create alert Reason: " + ex.getMessage() , this.getClass());
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

}
