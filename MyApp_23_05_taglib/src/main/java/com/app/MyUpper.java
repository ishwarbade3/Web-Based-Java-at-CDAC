package com.app;

import java.io.IOException;
import java.io.StringWriter;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class MyUpper  extends SimpleTagSupport{
	public void doTag()throws IOException, JspException {
		
		StringWriter sw = new StringWriter();
		
		getJspBody().invoke(sw);
		JspWriter out = getJspContext().getOut();
		out.write(sw.toString().toUpperCase());
		
	}

}
