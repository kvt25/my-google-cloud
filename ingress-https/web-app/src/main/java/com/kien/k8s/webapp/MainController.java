package com.kien.k8s.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping(value = "/")
	public String getDefault() {
		return "OK";
	}

	@GetMapping(value = "/app")
	public String printHellString() {
		return "Hello from k8s cluster pods!!!";
	}

}
