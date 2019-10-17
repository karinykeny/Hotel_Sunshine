<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Controllers Spring</title>
</head>
<body>
     <jsp:include page="/templates/clientes.jsp" />
 
     <h1>Form</h1>
     
    <p>Pagina chamada a partir do mapping em FormController</p>
     
    <form:form id="clientes" action="" method="post" modelAttribute="clientes">
        <div>
            <form:label path="nome" cssStyle="width:80px; text-align:right;display:inline-block">Nome:</form:label>
            <form:input path="nome"/>
        </div>
        <div>
            <form:label path="cpf" cssStyle="width:80px; text-align:right;display:inline-block">CPF:</form:label>
            <form:input path="sobrenome"/>
        </div>
         
        <form:button>Enviar</form:button>
    </form:form>
     
    <%= (request.getAttribute("msg") != null) ? request.getAttribute("msg") : "" %>
     
</body>
</html>