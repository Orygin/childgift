<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="include/importTags.jsp" %>
<form:form id="form"
			method="POST"
			action="/childgift/welcome/send"
			modelAttribute="magicKeyForm">
	Magic Key :
	<form:input path="magicKey"/>
	<form:button/>
</form:form>