package academy.learnprogramming.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

	// http:localhost:8080/todo-list/hello
	@ResponseBody
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@GetMapping("welcome")
	public String welcome() {
		return "welcome";
	}
}
