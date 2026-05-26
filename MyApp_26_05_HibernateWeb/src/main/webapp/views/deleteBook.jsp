<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.app.dao.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.app.entity.Book"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int id = Integer.parseInt(request.getParameter("id"));
    int i = BookDAO.delete(id);
    
    if(i == 1){
    	//request.getRequestDispatcher("../viewBookServlet").forward(request, response);
    	response.sendRedirect("../viewBookServlet");
    }
    else{
        out.write("NOt present !!!");
    	request.getRequestDispatcher("../viewBookServlet").forward(request, response);

    }
%>

</body>
</html>