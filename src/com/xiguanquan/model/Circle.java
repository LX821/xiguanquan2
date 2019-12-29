package com.xiguanquan.model;

import java.util.Date;

/**
 * Circle entity. @author MyEclipse Persistence Tools
 */

public class Circle implements java.io.Serializable {

	// Fields

	private Integer circleid;
	private String ctitle;
	private Integer creatorid;
	private String cword;
	private String cpicData;
	private Date creleaseTime;
	private Integer clikes;
	private String ccomments;

	// Constructors

	/** default constructor */
	public Circle() {
	}

	/** full constructor */
	public Circle(String ctitle, Integer creatorid, String cword, String cpicData, Date creleaseTime, Integer clikes,
			String ccomments) {
		this.ctitle = ctitle;
		this.creatorid = creatorid;
		this.cword = cword;
		this.cpicData = cpicData;
		this.creleaseTime = creleaseTime;
		this.clikes = clikes;
		this.ccomments = ccomments;
	}

	// Property accessors

	public Integer getCircleid() {
		return this.circleid;
	}

	public void setCircleid(Integer circleid) {
		this.circleid = circleid;
	}

	public String getCtitle() {
		return this.ctitle;
	}

	public void setCtitle(String ctitle) {
		this.ctitle = ctitle;
	}

	public Integer getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(Integer creatorid) {
		this.creatorid = creatorid;
	}

	public String getCword() {
		return this.cword;
	}

	public void setCword(String cword) {
		this.cword = cword;
	}

	public String getCpicData() {
		return this.cpicData;
	}

	public void setCpicData(String cpicData) {
		this.cpicData = cpicData;
	}

	public Date getCreleaseTime() {
		return this.creleaseTime;
	}

	public void setCreleaseTime(Date creleaseTime) {
		this.creleaseTime = creleaseTime;
	}

	public Integer getClikes() {
		return this.clikes;
	}

	public void setClikes(Integer clikes) {
		this.clikes = clikes;
	}

	public String getCcomments() {
		return this.ccomments;
	}

	public void setCcomments(String ccomments) {
		this.ccomments = ccomments;
	}

}