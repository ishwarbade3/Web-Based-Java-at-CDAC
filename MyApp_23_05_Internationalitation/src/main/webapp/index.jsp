<%@page import="jakarta.servlet.descriptor.TaglibDescriptor"%>

<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<%@ taglib uri="jakarta.tags.fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Internationalization</title>

<c:set var="theLocale"
    value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}" />

<fmt:setLocale value="${theLocale}" />
<fmt:setBundle basename="com.app.mylabels" />

</head>

<body>

    <a href="index.jsp?theLocale=en_US">English (US)</a> |
    <a href="index.jsp?theLocale=de_DE">German (DE)</a> |
    <a href="index.jsp?theLocale=mr_IN">Marathi (India)</a> |
    <a href="index.jsp?theLocale=hi_IN">Hindi (India)</a>

    <br><br>

    <hr>

    <fmt:message key="label.greeting"/>
    <br>

    <fmt:message key="label.firstname"/>
    <i>Ishwar</i>
    <br>

    <fmt:message key="label.lastname"/>
    <i>Bade</i>
    <br>

    <fmt:message key="label.welcome"/>

    <hr>

    Selected Locale: ${theLocale}

</body>
</html>