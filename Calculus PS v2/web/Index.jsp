
<%@page language="java" contentType="text/html" pageEncoding="ISO-8859-1"%>
<%
if(request.getParameter("botonRegistro") !=null){

%>
<jsp:forward page="JSP/Registro.jsp" />
<%
 return;
 }
else
if(request.getParameter("botonLogin")!=null){
%>
<jsp:forward page="JSP/Login.jsp" />
<% return;}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="index.jsp">
        <input type="submit"  name="botonRegistro" value="Registrar">
        <input type="submit"  name="botonLogin" value="Iniciar sesion">
        </form>
    </body>
</html>
