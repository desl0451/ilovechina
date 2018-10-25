<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@include file="/WEB-INF/jsp/backend/common/head.jsp"%>
<div class="right">
	<img class="wColck"
		src="${pageContext.request.contextPath}/statics/backend/images/clock.jpg"
		alt="" />
	<div class="wFont">
		<h2>${userSession.userName }</h2>
		<p>欢迎来到历史英雄学习系统!</p>
		<p></p>
	</div>
</div>
</section>
<%@include file="/WEB-INF/jsp/backend/common/foot.jsp"%>
