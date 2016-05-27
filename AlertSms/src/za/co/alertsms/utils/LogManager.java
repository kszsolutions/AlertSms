package za.co.alertsms.utils;

import org.apache.log4j.Logger;


/**
 * This class is used to access log manager
 * @author lkeyse
 *
 */
public class LogManager
{
	 
	
	public static void debug(Class source, String message){
		Logger LOG = Logger.getLogger(source);
		LOG.debug(message);
	}
	public static void info(Class source, String message){
		Logger LOG = Logger.getLogger(source);
		LOG.info(message);
	}
	public static void error( String message, Class source, Throwable t){
		Logger LOG = Logger.getLogger(source);
		LOG.error(message, t);
	}
	public static void error( String message, Class source){
		Logger LOG = Logger.getLogger(source);
		LOG.error(message);
	}
	public static void warn(Class source, String message){
		Logger LOG = Logger.getLogger(source);
		LOG.warn(message);
	}
}
