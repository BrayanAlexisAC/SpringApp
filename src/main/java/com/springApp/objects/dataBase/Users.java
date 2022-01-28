package com.springApp.objects.dataBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.springApp.beans.BaseBean;
import com.springApp.objects.dataBase.classId.UsersId;

@Entity(name="SEC_USERS")
@IdClass(UsersId.class)
public class Users extends BaseBean {
	@Id
	@Column(name = "USER_ID")
	private int userId;
	@Id
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "USER_PASS")
	private String userPass;
	@Column(name = "USER_DATELASTLOGIN")
	private Integer userDateLastLogin;
	@Column(name = "STATUS")
	private int status;
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPass() {
		return userPass;
	}
	
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	public Integer getUserDateLastLogin() {
		return userDateLastLogin;
	}
	
	public void setUserDateLastLogin(Integer userDateLastLogin) {
		this.userDateLastLogin = userDateLastLogin;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
}
