package com.renu.web.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.renu.dao.UserDaoImp;

@Controller
public class HelloController {
	   @Autowired
	   UserDaoImp userdaoimp;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getData() {

		ModelAndView model = new ModelAndView("Home");
	
		return model;

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView getLogin() {

		ModelAndView model = new ModelAndView("login");
	
		return model;

	}
//	@RequestMapping(value = "/registration", method = RequestMethod.POST)
//	public ModelAndView getRegistration(@RequestParam("email") String email,@RequestParam("pass") String password @RequestParam())throws SQLException  {
//
//		ModelAndView model = new ModelAndView("registration");
//	
//		return model;
//
//	}
	
	@RequestMapping(value = "/kgf", method = RequestMethod.GET)
	public ModelAndView getKGF() {

		ModelAndView model = new ModelAndView("kgf");
	
		return model;

	}
	@RequestMapping(value = "validate", method = RequestMethod.POST)
	public ModelAndView getLogin1(@RequestParam("user") String email,@RequestParam("pass") String password) throws SQLException {

		
		boolean status= userdaoimp.validation(email, password);
	if(status)
	{
		ModelAndView model = new ModelAndView("Home");
		return model;
	}
	else {
		
		ModelAndView model2 = new ModelAndView("login");
		return model2;
	}
	
		
	}

}