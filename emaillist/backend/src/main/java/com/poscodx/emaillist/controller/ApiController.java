package com.poscodx.emaillist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poscodx.emaillist.dto.JsonResult;

@RestController
public class ApiController {
	@GetMapping("/api")
	public JsonResult read() {
		return JsonResult.success("hello world");
	}
}
