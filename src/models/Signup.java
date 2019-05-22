package models;

public class Signup {
	private String email;
	private String pass;
	private String name;
	private long mobile;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Signup(String email, String pass, String name, long mobile) {
		this.email = email;
		this.pass = pass;
		this.name = name;
		this.mobile = mobile;
	}
	public Signup(){
		
	}
	
} 
