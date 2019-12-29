package com.xiguanquan.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xiguanquan.dao.AcircleDao;
import com.xiguanquan.dao.CircleDao;
import com.xiguanquan.model.Acircle;
import com.xiguanquan.model.Circle;

@Controller @Scope("prototype")
public class circleAction extends ActionSupport{
	@Resource CircleDao circleDAO;
	@Resource AcircleDao acircleDAO;
	private Circle circle;
	private int circleid;
	private int usernid;
	private String ctitle;
	public String getCtitle() {
		return ctitle;
	}
	public void setCtitle(String ctitle) {
		this.ctitle = ctitle;
	}

	private Acircle acircle=new Acircle();
	public Acircle getAcircle() {
		return acircle;
	}
	public void setAcircle(Acircle acircle) {
		this.acircle = acircle;
	}
	
	public int getUsernid() {
		return usernid;
	}
	public void setUsernid(int usernid) {
		this.usernid = usernid;
	}
	
	public int getCircleid() {
		return circleid;
	}
	public void setCircleid(int circleid) {
		this.circleid = circleid;
	}
	
	public Circle getCircle(){
		return circle;
	}
	public void setCircle(Circle circle){
		this.circle=circle;
	}
	
	private String keyWords;
	public String getKeyWords(){
		return keyWords;
	}
	public void setKeyWords(String keyWords){
		this.keyWords=keyWords;
	}
	public String queryCircles() throws Exception{
		circleList=circleDAO.QueryCircleInfo(keyWords);
		ActionContext.getContext().getValueStack().set("circleList", circleList);
		return "circlelist";
	}
	
	private ArrayList<Acircle> acircleList;
	public ArrayList<Acircle> getAcircleList() {
		return acircleList;
	}
	public void setAcircleList(ArrayList<Acircle> acircleList) {
		this.acircleList = acircleList;
	}
	public String showAcircle(){
		acircleList = acircleDAO.QueryAllAcircle(usernid);
		ActionContext.getContext().getValueStack().set("acircleList", acircleList);
		return "acirclelist";
	}

	private ArrayList<Circle> circleList;
	public ArrayList<Circle> getcircleList(){
		return circleList;
	}
	public void setcircleList(ArrayList<Circle> circleList){
		this.circleList=circleList;
	}
	public String addCircle() throws Exception{
		circleDAO.AddCircle(circle);
		ActionContext.getContext().getSession().put("usernid", getUsernid());
		return "successaddc";
	}
	public String deleteCircle() throws Exception{
		circleDAO.DeleteCircle(circleid);
		return "delete";
	}
	public String showEdit() throws Exception{
		circle=circleDAO.GetCircleid(circleid);
		return "edit_view";
	}
	public String editCircle() throws Exception{
		circleDAO.UpdateCircle(circle);
		return "edit_message";
	}
	
	public String attend() throws Exception{
		acircle.setUsernid(usernid);
		acircle.setCircleid(circleid);
		acircle.setCtitle(ctitle);
		acircleDAO.Addattend(acircle);
		return "attended";
	}
	public String showCircle(){
		circleList = circleDAO.QueryAllCircle();
		ActionContext.getContext().getValueStack().set("circleList", circleList);
		return "circlelist";
	}
	public String showDetail(){
		circle=circleDAO.GetCircleid(circleid);
		return "detail";
	}

}
