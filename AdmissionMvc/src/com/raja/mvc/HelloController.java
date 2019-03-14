package com.raja.mvc;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sun.misc.Contended;


@Controller
public class HelloController {
	private static final long serialVersionUID = 1L;
       
	@InitBinder
	public void initbinder(WebDataBinder w)
	{
		SimpleDateFormat s=new SimpleDateFormat("dd-mm-yyyy");
		w.registerCustomEditor(Date.class,"date",new CustomDateEditor(s, false));
		
		
	}
   @RequestMapping("/")
   public ModelAndView hello()
   {
	   ModelAndView m=new ModelAndView("Hello");
	
	return m;
	   
   }
   @RequestMapping(value="/display.html",method=RequestMethod.GET)
   public ModelAndView raja(@ModelAttribute("user")  User user,BindingResult br)
   {
	   if(br.hasErrors())
	   {
		   ModelAndView m=new ModelAndView("Hello");
			
			return m;
	   }
	   ModelAndView m1=new ModelAndView("display");
	  
	return m1;
	   
   }

}
