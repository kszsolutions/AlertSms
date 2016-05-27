package za.co.alertsms.tests;

import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import za.co.alertsms.entity.residents.ResidentInfo;
import za.co.alertsms.services.ResidentService;

public class ResidentServiceTest {

	@Ignore
	@Test
	public void testCreateResident() {
		ResidentInfo resident = new ResidentInfo();
		int result = 0;
		resident.setFirstName("Sam");
		resident.setLastName("Keyser");
		resident.setMobileNumber("27726634949");
		resident.setiArea(4);
		ResidentService residentService = new ResidentService();
		result = residentService.createResident(resident);
		System.out.println("Result: " + result);
		assertNotEquals(0, result);
	}
//	@Ignore
	@Test
	public void testGetMobileNumbers(){
		ArrayList<String> list = null;
		ResidentService residentService = new ResidentService();
		list = residentService.getResidentBySuburb(4);
		for(String num: list)
		{
			System.out.println("Number: " + num);
		}
	}

}
