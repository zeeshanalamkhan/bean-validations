package com.zeeshan.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {

	@Size(max = 50, min = 3, message = "{user.name.empty}")
	@NotEmpty
	@Pattern(regexp = "^[a-zA-Z][a-zA-Z\\s]*$", message = "{user.name.special}")
	private String name;

	@Email(message = "{user.email.invalid}")
	@NotEmpty
	private String email;

	@Size(max = 10, min = 10, message = "{user.mobileNo.invalid}")
	@Pattern(regexp = "^(7|8|9)[0-9]{9}$", message = "{user.mobileNo.invalid.regEx}")
	@NotEmpty
	private String mobileNo;

	@NotEmpty
	@Pattern(regexp = "^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4}$", message = "{user.dob.invalid}")
	private String dob;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + ", dob=" + dob + "]";
	}

}
