package za.co.alertsms.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.internal.runners.model.EachTestNotifier;

import za.co.alertsms.entity.alerts.AlertInfo;
import za.co.alertsms.services.AlertService;

public class AlertServiceTest {

	@Ignore
	@Test
	public void testCreateAlert() {
		
		AlertInfo info = new AlertInfo();
		info.setAlert("Kid missing blue shirt");
		info.setiArea(4);
		info.setiUser(3);
		int result = new AlertService().createAlert(info);
		assertNotEquals(0, result);
	}
	@Test
	public void testGetAlerts(){
		AlertService aService = new AlertService();
		ArrayList<String> alertArray = null;
		alertArray = aService.getAlerts();
		for(String alert: alertArray)
		{
			System.out.println("Alert: " + alert);
		}
		assertNotNull(alertArray);
	}

}
