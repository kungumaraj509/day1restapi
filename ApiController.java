package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class ApiController {
	@GetMapping("/")
	public String getMyFav()
	{
		String color ="green";
		return "My favorite color is"+color;
	}

}
