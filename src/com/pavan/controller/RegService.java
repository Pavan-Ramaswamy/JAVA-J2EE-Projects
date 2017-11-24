package com.pavan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegService {

	@Autowired
	RegisterDao dao;
	
	public RegService() {
		// TODO Auto-generated constructor stub
	}
	
	public String register(RegBean bean)
	{
		return dao.register(bean);
	}

}
