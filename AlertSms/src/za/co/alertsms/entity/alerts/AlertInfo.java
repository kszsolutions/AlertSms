package za.co.alertsms.entity.alerts;

import java.sql.Date;

public class AlertInfo {
	
	private int id;
	private String alert;
	private int iArea;
	private int iUser;
	private Date createdDate;
	
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getAlert() {
		return alert;
	}
	public void setAlert(String alert) {
		this.alert = alert;
	}
	
	public int getiArea() {
		return iArea;
	}
	public void setiArea(int iArea) {
		this.iArea = iArea;
	}
	public int getiUser() {
		return iUser;
	}
	public void setiUser(int iUser) {
		this.iUser = iUser;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	private void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
	

}
