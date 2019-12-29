package com.xiguanquan.action;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xiguanquan.dao.TrendDao;
import com.xiguanquan.model.Trend;
import com.xiguanquan.model.Users;

public class TrendAction extends ActionSupport{
	@Resource TrendDao trendDao;
	private Trend trend;
	private int usernid;
	private int trendid;
	public int getTrendid() {
		return trendid;
	}
	public void setTrendid(int trendid) {
		this.trendid = trendid;
	}
	public int getUsernid() {
		return usernid;
	}
	public void setUsernid(int usernid) {
		this.usernid = usernid;
	}
	public Trend getTrend() {
		return trend;
	}
	public void setTrend(Trend trend) {
		this.trend = trend;
	}
	private List<Trend> trendList;
	public List<Trend> gettrendList(){
		return trendList;
	}
	public void settrendList(List<Trend> trendList){
		this.trendList=trendList;
	}
	public String addTrend() throws Exception{
		System.out.print(usernid);
		trend.setUsernid(usernid);
		trendDao.AddTrend(trend); 
		ActionContext.getContext().getSession().put("usernid", getUsernid());
		return "successaddt";
	}
	public String deleteCircle() throws Exception{
		trendDao.DeleteTrend(trendid);
		return "delete";
	}
	public String showtrendlist(){
		return "trendlist";
	}
}
