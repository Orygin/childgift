
<%@ include file="include/importTags.jsp" %>
<form:form id="form"
			method="POST"
			action="/childgift/inscription/send"
			modelAttribute="currentUser">
Name <form:input path="name" />
Age <form:input path="age" />
<form:radiobutton path="male" value="true" label="Boy" />
<form:radiobutton path="male" value="false" label="Girl" />
<form:select path="hobby">
	<form:options items="${hobbies}" itemValue="id" itemLabel="name"/>
</form:select>
<form:button/>
</form:form>