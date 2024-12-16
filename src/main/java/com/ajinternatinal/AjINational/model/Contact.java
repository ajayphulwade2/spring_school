package com.ajinternatinal.AjINational.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

//@Data
public class Contact {

	
	@NotBlank(message = "Please enter the name")
	@Size(min = 3, message = "Please give correct name")
	private String name;
	
	@NotBlank(message = "Please enter the mobile number")
	@Pattern(regexp = "([0-9]{10})")
	private String mobileNum;
	
	@Email(message = "Provide correct email")
	@NotBlank
	private String email;
	
	@NotBlank(message ="Give subject" )
	@Size(min = 5, message = "Give at least 5 characters of subject")
	private String subject;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", mobileNum=" + mobileNum + ", email=" + email + ", subject=" + subject
				+ ", getName()=" + getName() + ", getMobileNum()=" + getMobileNum() + ", getEmail()=" + getEmail()
				+ ", getSubject()=" + getSubject() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	/*
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public String getMobileNum() { return mobileNum; } public
	 * void setMobileNum(String mobileNum) { this.mobileNum = mobileNum; } public
	 * String getEmail() { return email; } public void setEmail(String email) {
	 * this.email = email; } public String getSubject() { return subject; } public
	 * void setSubject(String subject) { this.subject = subject; }
	 * 
	 * @Override public String toString() { return "Contact [name=" + name +
	 * ", mobileNum=" + mobileNum + ", email=" + email + ", subject=" + subject +
	 * "]"; }
	 */

}
