package com.xiguanquan.model;

/**
 * Acircle entity. @author MyEclipse Persistence Tools
 */

public class Acircle implements java.io.Serializable {

	// Fields

	private Integer aid;
	private Integer circleid;
	private Integer usernid;
	private String ctitle;

	// Constructors

	/** default constructor */
	public Acircle() {
	}

	/** full constructor */
	public Acircle(Integer circleid, Integer usernid, String ctitle) {
		this.circleid = circleid;
		this.usernid = usernid;
		this.ctitle = ctitle;
	}

	// Property accessors

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Integer getCircleid() {
		return this.circleid;
	}

	public void setCircleid(Integer circleid) {
		this.circleid = circleid;
	}

	public Integer getUsernid() {
		return this.usernid;
	}

	public void setUsernid(Integer usernid) {
		this.usernid = usernid;
	}

	public String getCtitle() {
		return this.ctitle;
	}

	public void setCtitle(String ctitle) {
		this.ctitle = ctitle;
	}

}