package com.xiguanquan.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xiguanquan.dao.UserDao;
import com.xiguanquan.model.Users;

@Controller @Scope("prototype")
public class UserAction extends ActionSupport{
	@Resource UserDao userDAO;
	private Users users;
	//private Map<String,Object> session;
	public Users getUser(){
		return users;
	}
	public void setUser(Users users){
		this.users=users;
	}
	
	private List<Users> userList;
	public List<Users> getuserList(){
		return userList;
	}
	public void setuserList(List<Users> userList){
		this.userList=userList;
	}
	public String addUser() throws Exception{
		userDAO.AddUser(users); 
		return "success";
	}
	public String showcirclelist(){
		return "circlelist";
	}
	private String errMessage;
	
	public String getErrMessage() {
		return errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
	public String login() {
		ArrayList<Users> listUser = userDAO.QueryUsersInfo(users.getUserName());
		if(listUser.size()==0) { 
			this.errMessage = " 账号不存在 ";
			System.out.print(this.errMessage);
			return "input";
		} 
		else{
		    Users db_user = listUser.get(0);
			if(!db_user.getUpassword().equals(users.getUpassword())) {
				this.errMessage = " 密码不正确! ";
				System.out.print(this.errMessage);
				return "input";
		    }
				//session.put("user", db_user);
		}
		ActionContext.getContext().getSession().put("usernid", users.getUsernid());
		return "success";
	}
}