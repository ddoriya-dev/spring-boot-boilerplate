package com.tistory.ddoriya.common.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IndexController {

	@RequestMapping("/")
	public String helloWorld() {
		return "index";
	}

}