package com.pavan.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterDao {

	@Autowired
	SessionFactory factory;
	public RegisterDao() {
		// TODO Auto-generated constructor stub
	}
	
	public String register(RegBean bean)
	{
	
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(bean);
		tx.commit();
		session.close();
		return "Success";
	}

}
