package za.co.alertsms.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import za.co.alertsms.entity.areas.AreasInfo;
import za.co.alertsms.services.AreasService;

public class AreasServiceTest {

	@Test
	public void testCreateArea() {
		AreasInfo aInfo = new AreasInfo();
		aInfo.setArea("Durbanville");
		aInfo.setAreaDescription("Durbanville 30km for Cape Town");
		aInfo.setiArea(1);
		AreasService aService = new AreasService();
		int result = aService.createArea(aInfo);
		assertNotEquals(0, result);
	}

}
