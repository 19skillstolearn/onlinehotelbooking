package com.SkillsToLearn.onlinehotel.formbean;

public class UserFormBean {

	private String id;
	private String userName;
	private String firstName;
	private String lastName;
	private boolean enabled;
	private String gender;
	private String email;
	private String password;
	private String confirmPassword;
	
	public UserFormBean() {

	}

	public UserFormBean(String id, String userName, String firstName, String lastName, boolean enabled,
			String gender, String email,String password, String confirmPassword) {
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.enabled = enabled;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	
}
