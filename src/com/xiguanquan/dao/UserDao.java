package com.xiguanquan.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiguanquan.model.Users;

@Service @Transactional
public class UserDao {
	@Resource SessionFactory factory;
	
	public void AddUser(Users u) throws Exception{
		Session s=factory.getCurrentSession();
		s.save(u);
	}
	public void DeleteUser(String usernid) throws Exception{
		Session s=factory.getCurrentSession();
		Object u= s.load(Users.class, usernid);
		s.delete(usernid);
	}
	public void UpdateUser(Users u) throws Exception{
		Session s=factory.getCurrentSession();
		s.update(u);
	}
	public ArrayList<Users> QueryAllUser(){
		Session u=factory.getCurrentSession();
		String hql="From Users";
		Query q =u.createQuery(hql);
		List userList= q.list();
		return (ArrayList<Users>) userList;
	}
	public Users GetUserid(String usernid){
		Session u=factory.getCurrentSession();
		Users user=(Users)u.get(Users.class,usernid);
		return user;
	}
	public ArrayList<Users> QueryUsersInfo(String userName){
		Session u=factory.getCurrentSession();
		String hql="From Users u where 1=1";
		if(!userName.equals("")) hql=hql+"and food.foodname like '%"+userName+"%'";
		Query q=u.createQuery(hql);
		List userList =q.list();
		return (ArrayList<Users>) userList;
	}

}
