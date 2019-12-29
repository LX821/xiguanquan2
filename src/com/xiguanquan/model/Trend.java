package com.xiguanquan.model;

import java.util.Date;


/**
 * Trend entity. @author MyEclipse Persistence Tools
 */

public class Trend  implements java.io.Serializable {


    // Fields    

     private Integer trendid;
     private Integer usernid;
     private String tword;
     private String tpicData;
     private Date treleaseTime;
     private Integer tlikes;
     private String tcomments;


    // Constructors

    /** default constructor */
    public Trend() {
    }

    
    /** full constructor */
    public Trend(Integer usernid, String tword, String tpicData, Date treleaseTime, Integer tlikes, String tcomments) {
        this.usernid = usernid;
        this.tword = tword;
        this.tpicData = tpicData;
        this.treleaseTime = treleaseTime;
        this.tlikes = tlikes;
        this.tcomments = tcomments;
    }

   
    // Property accessors

    public Integer getTrendid() {
        return this.trendid;
    }
    
    public void setTrendid(Integer trendid) {
        this.trendid = trendid;
    }

    public Integer getUsernid() {
        return this.usernid;
    }
    
    public void setUsernid(Integer usernid) {
        this.usernid = usernid;
    }

    public String getTword() {
        return this.tword;
    }
    
    public void setTword(String tword) {
        this.tword = tword;
    }

    public String getTpicData() {
        return this.tpicData;
    }
    
    public void setTpicData(String tpicData) {
        this.tpicData = tpicData;
    }

    public Date getTreleaseTime() {
        return this.treleaseTime;
    }
    
    public void setTreleaseTime(Date treleaseTime) {
        this.treleaseTime = treleaseTime;
    }

    public Integer getTlikes() {
        return this.tlikes;
    }
    
    public void setTlikes(Integer tlikes) {
        this.tlikes = tlikes;
    }

    public String getTcomments() {
        return this.tcomments;
    }
    
    public void setTcomments(String tcomments) {
        this.tcomments = tcomments;
    }
   








}