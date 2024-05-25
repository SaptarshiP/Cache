package com.psja.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.psja.service.CustomMessageService;

@RestController
public class ApplicationController {

	@Autowired
	private CustomMessageService customMessageService;
	
	@RequestMapping(value="/getCache")
	public String getData() {
		customMessageService.getMessage("obx-td-service-custom");
		return "PSJACacheHey";
	}
}
