package com.xiguanquan.dao;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiguanquan.model.Acircle;
import com.xiguanquan.model.Users;

@Service @Transactional
public class AcircleDao {
	@Resource SessionFactory factory;
	
	public void Addattend(Acircle c) throws Exception{
		Session s=factory.getCurrentSession();
		s.save(c);
	}
	public ArrayList<Acircle> QueryAllAcircle(Integer usernid){
		Session u=factory.getCurrentSession();
		String hql="From Acircle acircle where acircle.usernid= "+usernid;
		Query q =u.createQuery(hql);
		List AcircleList= q.list();
		return (ArrayList<Acircle>) AcircleList;
	}
	public Acircle GetUserid(String usernid){
		Session s=factory.getCurrentSession();
		Acircle acircle=(Acircle)s.get(Acircle.class,usernid);
		return acircle;
	}
	public ArrayList<Acircle> QueryAcircleInfo(Integer usernid){
		Session u=factory.getCurrentSession();
		List<Acircle> acircleList;
		
		String hql="From Acircle acircle where 1=1";
		if(!usernid.equals("")) {
			hql=hql+"and acircle.usernid like '%"+usernid+"%'";
			Query q=u.createQuery(hql);
			acircleList =q.list();
		}else{
			acircleList = null;
		}
		return (ArrayList<Acircle>) acircleList;
	}

}
