package za.co.alertsms.entity.users;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import za.co.alertsms.entity.interfaces.SpringConfigsInterface;

public class UserData implements SpringConfigsInterface{
	
	private static UserData ACTION = null;
	
	public static UserData getAction(){
		if(ACTION == null){
			ApplicationContext context = new ClassPathXmlApplicationContext(SPRING_CONFIGS);
			ACTION = (UserData) context.getBean("UserData");
		}
		return ACTION;
	}
	
	private DataSource userDs;
	private String createUser;
	private String getUser;
	
	

	public String getGetUser() {
		return getUser;
	}
	public void setGetUser(String getUser) {
		this.getUser = getUser;
	}
	public DataSource getUserDs() {
		return userDs;
	}
	public void setUserDs(DataSource userDs) {
		this.userDs = userDs;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	

}
