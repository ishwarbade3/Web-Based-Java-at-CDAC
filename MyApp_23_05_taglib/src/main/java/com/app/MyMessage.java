package com.app;

import java.io.IOException;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class MyMessage extends SimpleTagSupport {
	
	public void doTag() throws IOException {
		JspWriter out = getJspContext().getOut();
		out.write("Hello Ishwar");
	}

}
