package com.org.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	private static final long serialVersionUID = 1L;
	
  @RequestMapping("/welcome.html")
    public ModelAndView getAdmission() {
     ModelAndView model=new ModelAndView("AdmissionPage");
     model.addObject("message","hello everyone");
     return model;
    }

}
