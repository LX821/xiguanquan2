package com.xiguanquan.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.xiguanquan.dao.UserDao;
import com.xiguanquan.model.Users;

@Controller @Scope("prototype")
public class UserAction extends ActionSupport{
	@Resource UserDao userDAO;
	private Users user;
	public Users getUser(){
		return user;
	}
	public void setUser(Users user){
		this.user=user;
	}
	
	private List<Users> userList;
	public List<Users> getuserList(){
		return userList;
	}
	public void setuserList(){
		this.userList=userList;
	}
	public String addUser() throws Exception{
		userDAO.AddUser(user);
		return "message";
	}
	public String showUser(){
		userList = userDAO.QueryAllUser();
		return "show_view";
	}

}
