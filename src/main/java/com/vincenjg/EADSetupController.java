package com.vincenjg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EADSetupController {
	
	@RequestMapping("/start")
	public String start() {
		return "start";
	}

}
