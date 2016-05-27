package za.co.alertsms.entity.areas;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import za.co.alertsms.entity.interfaces.SpringConfigsInterface;

public class AreaData implements SpringConfigsInterface {
	
	private static AreaData ACTION = null;
	
	public static AreaData getAction(){
		if(ACTION == null){
			ApplicationContext context = new ClassPathXmlApplicationContext(SPRING_CONFIGS);
			ACTION = (AreaData) context.getBean("AreaData");
		}
		return ACTION;
	}
	
	private DataSource areaDs;
	private String createArea;

	public DataSource getAreaDs() {
		return areaDs;
	}
	public void setAreaDs(DataSource areasDs) {
		this.areaDs = areasDs;
	}
	public String getCreateArea() {
		return createArea;
	}
	public void setCreateArea(String createArea) {
		this.createArea = createArea;
	}
	
	

}
