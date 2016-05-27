package za.co.alertsms.tasks;

import java.util.ArrayList;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import za.co.alertsms.services.AlertService;

public class AlertTask implements Job{

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		AlertService aService = new AlertService();
		ArrayList<String> alertArray = null;
		alertArray = aService.getAlerts();
		for(String alert: alertArray)
		{
			System.out.println("Alert: " + alert);
			System.out.println("Sending sms now");
		}
		
	}
	
	

}
