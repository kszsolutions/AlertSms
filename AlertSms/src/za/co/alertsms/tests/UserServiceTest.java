package za.co.alertsms.tests;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

import za.co.alertsms.entity.users.UserInfo;
import za.co.alertsms.services.UserService;

public class UserServiceTest {

	@Ignore
	@Test
	public void testCreateUser() {
		UserInfo usr = new UserInfo();
		int result = 0;
		usr.setFirstName("Luke");
		usr.setLastName("Keyser");
		usr.setUserName("lkeyser");
		usr.setPassword("PassWord");
		UserService userService = new UserService();
		result = userService.createUserRecord(usr);
		System.out.println("Result: " + result);
		assertNotEquals(0, result);
	}

	@Test
	public void testGetUserDetails(){
		UserInfo uInfo = null;
		UserService uService = new UserService();
		uInfo = uService.getUserByUsername("lkeyser");
		System.out.println("iUser: " + uInfo.getiUser());
		assertNotNull(uInfo);
	}

}
