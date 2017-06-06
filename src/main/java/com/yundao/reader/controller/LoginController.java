package com.yundao.reader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yundao.reader.model.Reader;
import com.yundao.reader.service.Impl.LoginServiceImpl;

@Controller
public class LoginController {
	@Autowired
	private LoginServiceImpl loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="toLogin",method=RequestMethod.POST)
	@ResponseBody
	public Reader toLogin(HttpServletRequest req){
		String barcode=req.getParameter("barcode");
		String password=req.getParameter("password");
		System.out.println(barcode+":"+password);
		Reader r=loginService.toLogin(barcode);
		
		return r;
	}
	
	
}
