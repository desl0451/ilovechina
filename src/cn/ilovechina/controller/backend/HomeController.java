package cn.ilovechina.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/backend")
public class HomeController {

	@RequestMapping("/index")
	public String homeIndex() {
		return "common/index";
	}
}
