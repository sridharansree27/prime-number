package com.app.mod;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookies extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Cookie cookie=new Cookie("n", req.getParameter("n"));
		((HttpServletResponse)res).addCookie(cookie);

		((HttpServletResponse)res).sendRedirect("findPrime");
		}
	}