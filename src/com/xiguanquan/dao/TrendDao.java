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
import com.xiguanquan.model.Trend;

@Service @Transactional
public class TrendDao {
	@Resource SessionFactory factory;
	
	public void AddTrend(Trend t) throws Exception{
		Session s=factory.getCurrentSession();
		s.save(t);
	}
	public void DeleteTrend(Integer trendid) throws Exception{
		Session s=factory.getCurrentSession();
		Object u= s.load(Trend.class, trendid);
		s.delete(u);
	}
	public void UpdateTrend(Trend t) throws Exception{
		Session s=factory.getCurrentSession();
		s.update(t);
	}
	public ArrayList<Trend> QueryAllTrend(){
		Session u=factory.getCurrentSession();
		String hql="From Trend";
		Query q =u.createQuery(hql);
		List trendList= q.list();
		return (ArrayList<Trend>) trendList;
	}
	public Trend GetTrendid(Integer trendid){
		Session s=factory.getCurrentSession();
		Trend trend=(Trend)s.get(Trend.class,trendid);
		return trend;
	}
	public ArrayList<Trend> QueryTrendInfo(String tword){
		Session u=factory.getCurrentSession();
		String hql="From Trend trend where 1=1";
		if(!tword.equals("")) hql=hql+"and trend.tword like '%"+tword+"%'";
		Query q=u.createQuery(hql);
		List<Trend> trendList =q.list();
		return (ArrayList<Trend>) trendList;
	}

}
