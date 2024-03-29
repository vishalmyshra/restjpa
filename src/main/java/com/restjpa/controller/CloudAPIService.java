package com.restjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restjpa.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
	
	@GetMapping("{cloudVendorId}")
	public CloudVendor getCloudVendor(@PathVariable String cloudVendorId) {
		return new CloudVendor("C1","Vishal Mishra","9555512824","Sec 56, Noida");
	}
	
	@GetMapping("/hello")
	public String getCloudVendor() {
		return "Hello";
	}

}
