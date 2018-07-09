package com.neuedu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.service.student.IstudentService;

@Controller
public class TestController {
	@Resource
	private IstudentService service;
	@RequestMapping("/test")
	public String test(){
		System.out.println(service.getStudents());
		return "abcd";
	}
}
