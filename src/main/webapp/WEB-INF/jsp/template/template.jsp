<%@ include file="../include/importTags.jsp" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link type="text/css" href="<spring:url value='/css/style.css' />" rel="stylesheet">
	<title>Insert title here</title>
</head>
<body>
	<img src="<spring:url value='/images/localeFr.png'/>"/>
	<tiles:insertAttribute name="main-content"/>
</body>
</html>