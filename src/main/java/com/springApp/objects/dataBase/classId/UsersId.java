package com.springApp.objects.dataBase.classId;

import java.io.Serializable;

@SuppressWarnings("unused")
public class UsersId implements Serializable {
	private static final long serialVersionUID = 1L;
	private int userId;
	private String userName;
	
	public UsersId() {}
	
	public UsersId(int userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
}
