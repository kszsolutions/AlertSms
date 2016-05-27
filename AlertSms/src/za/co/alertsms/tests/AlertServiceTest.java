package za.co.alertsms.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import za.co.alertsms.entity.alerts.AlertInfo;
import za.co.alertsms.services.AlertService;

public class AlertServiceTest {

	@Test
	public void testCreateAlert() {
		
		AlertInfo info = new AlertInfo();
		info.setAlert("Kid missing blue shirt");
		info.setiArea(4);
		info.setiUser(3);
		int result = new AlertService().createAlert(info);
		assertNotEquals(0, result);
	}

}
