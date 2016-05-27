package za.co.alertsms.entity.residents;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import za.co.alertsms.entity.interfaces.SpringConfigsInterface;

public class ResidentData implements SpringConfigsInterface{
	
	private static ResidentData ACTION = null;
	
	public static ResidentData getAction(){
		if(ACTION == null){
			ApplicationContext context = new ClassPathXmlApplicationContext(SPRING_CONFIGS);
			ACTION = (ResidentData) context.getBean("ResidentData");
		}
		return ACTION;
	}
	
	
	
	
	private DataSource residentDs;
	private String createResident;
	private String searchResidentBySuburb;
	
	

	public String getSearchResidentBySuburb() {
		return searchResidentBySuburb;
	}
	public void setSearchResidentBySuburb(String searchResidentBySuburb) {
		this.searchResidentBySuburb = searchResidentBySuburb;
	}
	public DataSource getResidentDs() {
		return residentDs;
	}
	public void setResidentDs(DataSource residentDs) {
		this.residentDs = residentDs;
	}
	public String getCreateResident() {
		return createResident;
	}
	public void setCreateResident(String createResident) {
		this.createResident = createResident;
	}
	
	

}
