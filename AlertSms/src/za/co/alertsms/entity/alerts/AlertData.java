package za.co.alertsms.entity.alerts;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import za.co.alertsms.entity.interfaces.SpringConfigsInterface;

public class AlertData implements SpringConfigsInterface {

	
	private static AlertData ACTION = null;
	
	public static AlertData getAction(){
		if(ACTION == null){
			ApplicationContext context = new ClassPathXmlApplicationContext(SPRING_CONFIGS);
			ACTION = (AlertData) context.getBean("AlertData");
		}
		return ACTION;
	}
	
	
	
	
	private DataSource alertDs;
	private String createAlert;

	public DataSource getAlertDs() {
		return alertDs;
	}
	public void setAlertDs(DataSource alertDs) {
		this.alertDs = alertDs;
	}
	public String getCreateAlert() {
		return createAlert;
	}
	public void setCreateAlert(String createAlert) {
		this.createAlert = createAlert;
	}
	
	
}
