package cn.ilovechina.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import cn.ilovechina.pojo.User;
import cn.ilovechina.tools.Constants;

public class SysInterceptor extends HandlerInterceptorAdapter {
	private Logger logger = Logger.getLogger(SysInterceptor.class);

	/**
	 * �ж��û��Ƿ�Ϊ�����Ϊ����·ת��404ҳ��
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.debug("--------------------�ж��û����Ƿ�Ϊ��--------------------");
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute(Constants.USER_SESSION);
		if (user == null) {
			response.sendRedirect(request.getContextPath() + "/statics/common/404.jsp");
			return false;
		}
		return true;
	}
}