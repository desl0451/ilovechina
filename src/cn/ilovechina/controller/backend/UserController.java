package cn.ilovechina.controller.backend;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.ilovechina.pojo.User;
import cn.ilovechina.service.user.UserService;
import cn.ilovechina.tools.Constants;

@Controller
@RequestMapping("/user")
public class UserController {
	private Logger logger = Logger.getLogger(UserController.class);

	@Resource
	private UserService userService;

	@RequestMapping(value = "/login.html")
	public String login() {
		logger.debug("===============UserController Welcome China ================");
		return "common/login";
	}

	@RequestMapping(value = "/dologin.html", method = RequestMethod.POST)
	public String doLogin(@RequestParam String userCode, @RequestParam String userPassword, HttpServletRequest request,
			HttpSession session) {
		logger.debug("===============doLogin================");
		// ����service����,�����û�ƥ��
		User user = userService.Login(userCode, userPassword);
		if (null != user) {// ��¼�ɹ�
			// ����session
			session.setAttribute(Constants.USER_SESSION, user);
			// ҳ����ת��frame.jsp��
			return "redirect:/user/main.html";
			// response.sendRedirect("jsp/frame.jsp");
		} else {
			// ҳ����ת��login.jsp��������ʾ��Ϣ--ת��
			request.setAttribute("error", "�û��������벻��ȷ");
			return "login";
		}
	}

	@RequestMapping(value = "/main.html")
	public String main(HttpSession session) {
		if (session.getAttribute(Constants.USER_SESSION) == null) {
			return "redirect:/user/login.html";
		}
		return "common/frame";
	}

	@RequestMapping(value = "/logout.html")
	public String logout(HttpSession session) {
		// ���session
		session.removeAttribute(Constants.USER_SESSION);
		return "common/login";
	}

	// @RequestMapping(value = "exlogin.html", method = RequestMethod.GET)
	// public String exLogin(@RequestParam String userCode, @RequestParam String
	// userPassword) {
	// logger.debug("===============exLogin================");
	// // ����Service����,�����û�ƥ��
	// User user = userService.Login(userCode, userPassword);
	// if (null == user) {// ��¼ʧ��
	// throw new RuntimeException("�û����������벻��ȷ!");
	// }
	// return "redirect:/user/main.html";
	// }
	//
	// @ExceptionHandler(value = { RuntimeException.class })
	// public String handlerException(RuntimeException e, HttpServletRequest
	// req) {
	// req.setAttribute("e", e);
	// return "error";
	// }
	//
	// @RequestMapping(value = "/syserror.html")
	// return "syserror";
	// }
}
