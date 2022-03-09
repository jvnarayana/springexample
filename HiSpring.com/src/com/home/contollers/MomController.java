package com.home.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MomController {
	@ResponseBody
	@GetMapping(path = "hello")
	public String hello()
	{
		return "hello";
	
	}
	
	

}
