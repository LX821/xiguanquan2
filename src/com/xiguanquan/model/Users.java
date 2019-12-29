package com.xiguanquan.model;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private static Integer usernid;
	private String userName;
	private String upassword;
	private String nickname;
	private String occupation;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String userName, String upassword, String nickname, String occupation) {
		this.userName = userName;
		this.upassword = upassword;
		this.nickname = nickname;
		this.occupation = occupation;
	}

	// Property accessors

	public Integer getUsernid() {
		return this.usernid;
	}

	public void setUsernid(Integer usernid) {
		this.usernid = usernid;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUpassword() {
		return this.upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

}