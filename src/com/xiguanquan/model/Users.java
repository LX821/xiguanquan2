package com.xiguanquan.model;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private String usernid;
	private String userName;
	private String nickname;
	private String occupation;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(String usernid) {
		this.usernid = usernid;
	}

	/** full constructor */
	public Users(String usernid, String userName, String nickname, String occupation) {
		this.usernid = usernid;
		this.userName = userName;
		this.nickname = nickname;
		this.occupation = occupation;
	}

	// Property accessors

	public String getUsernid() {
		return this.usernid;
	}

	public void setUsernid(String usernid) {
		this.usernid = usernid;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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