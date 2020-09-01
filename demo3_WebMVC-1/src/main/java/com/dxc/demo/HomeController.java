package com.dxc.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showForm() {
		return "form1";
	}
	@RequestMapping("showName")
	public String showName(HttpServletRequest req, HttpServletResponse res) {
		String devname = req.getParameter("devname");
		System.out.println(devname);
		HttpSession session = req.getSession();
		session.setAttribute("name", devname);
		return "dispName";
	}
}
