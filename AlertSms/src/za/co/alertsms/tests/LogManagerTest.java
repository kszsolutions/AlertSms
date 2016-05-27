package za.co.alertsms.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import za.co.alertsms.utils.LogManager;

public class LogManagerTest {

	@Test
	public void testLogging() {
		LogManager.info(this.getClass(), "Info log test");
		LogManager.debug(this.getClass(), "Debug log test");
		LogManager.warn(this.getClass(), "Warning log test");
		LogManager.error("Error no throw log test", this.getClass());
		LogManager.error("Error throw log test", getClass(), new Exception("Throwing test"));
	}

}
