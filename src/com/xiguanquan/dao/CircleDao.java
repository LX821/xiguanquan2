package com.xiguanquan.dao;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiguanquan.model.Circle;

@Service @Transactional
public class CircleDao {
	@Resource SessionFactory factory;
	
	public void AddCircle(Circle c) throws Exception{
		Session s=factory.getCurrentSession();
		s.save(c);
	}
	public void DeleteCircle(Integer circleid) throws Exception{
		Session s=factory.getCurrentSession();
		Object u= s.load(Circle.class, circleid);
		s.delete(u);
	}
	public void UpdateCircle(Circle c) throws Exception{
		Session s=factory.getCurrentSession();
		s.update(c);
	}
	public ArrayList<Circle> QueryAllCircle(){
		Session u=factory.getCurrentSession();
		String hql="From Circle";
		Query q =u.createQuery(hql);
		List circleList= q.list();
		return (ArrayList<Circle>) circleList;
	}
	public Circle GetCircleid(Integer circleid){
		Session s=factory.getCurrentSession();
		Circle circle=(Circle)s.get(Circle.class,circleid);
		return circle;
	}
	public ArrayList<Circle> QueryCircleInfo(String ctitle){
		Session u=factory.getCurrentSession();
		String hql="From Circle circle where 1=1";
		if(!ctitle.equals("")) hql=hql+"and circle.ctitle like '%"+ctitle+"%'";
		Query q=u.createQuery(hql);
		List<Circle> circleList =q.list();
		return (ArrayList<Circle>) circleList;
	}

}
