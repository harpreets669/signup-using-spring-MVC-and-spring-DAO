package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import daos.SignupDaoImpl;
import models.Signup;

@Controller
public class GlobalController {
	
	
	
	@RequestMapping("/")
	public String home(){
		return "home";
	}
	
	@RequestMapping("/signup_request")
	public Signup emptyObjSignup(){
		return new Signup();
	}
	
	@Autowired
	SignupDaoImpl dao;
	
	@RequestMapping("/do_signup")
	public String doSignup(@ModelAttribute("signup") Signup sign){
		System.out.println(sign.getName());
		dao.saveData(sign);
		return "redirect:/";
	}
}
