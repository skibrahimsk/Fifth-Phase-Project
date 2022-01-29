package com.example.JenkinsDeploy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class User {

	@ResponseBody
	@RequestMapping("User")
public String  init ()
	{
		
		return "This is Shaik Ibrahim spring boot app";
		
	}

}

