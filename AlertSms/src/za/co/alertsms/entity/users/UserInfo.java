package za.co.alertsms.entity.users;

public class UserInfo {
	
	private int iUser;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	
	
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getiUser() {
		return iUser;
	}
	public void setiUser(int iUser) {
		this.iUser = iUser;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
