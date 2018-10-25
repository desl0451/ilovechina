package cn.ilovechina.controller.pre;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pre")
public class IndexController {
	private Logger logger = Logger.getLogger(IndexController.class);

	@RequestMapping("/index")
	public String index() {
		logger.info("Hello Index½øÀ´ÁË..");
		return "index";
	}
}
