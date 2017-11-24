package com.pavan.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@Autowired
	RegService service;

	public HomeController() {
		// TODO Auto-generated constructor stub
	}
    @RequestMapping("/openRegisterView")
	public String showRegister(Model model)
	{
		
		System.out.println("HomeController --> inside showhome()");
		
		RegBean reg=new RegBean();
		model.addAttribute("bean",reg);
		
		return "Register";
		
	}
	
	
	@RequestMapping("/")
	public String showHome()
	{
		
		System.out.println("HomeController --> inside showhome()");
		
		return "Home";
		
	}
	
	@RequestMapping("/register")
	public String register(@ModelAttribute("bean") @Valid RegBean reg,BindingResult result,Model model)
	{
		System.out.println("reg() bean="+reg);
		if(result.hasErrors())
		{
			
			return "Register";
		}
		else
		{
			String res=service.register(reg);
			if(res.equals("Success"))
			{
				model.addAttribute("msg", "Regestration is sucessfully completed");
				return "Success";
			}
			else
			{
				model.addAttribute("errmsg", "Regestration failed");
				return "Register";
			}
		}
	}
	
}
