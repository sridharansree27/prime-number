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

public class Prime extends GenericServlet {

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
        }

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int count = 0,number = 2,n=0;

		Cookie[] cookies=((HttpServletRequest)req).getCookies();
		for(Cookie cookie:cookies)
			if(cookie.getName().equals("n")) {
				n=Integer.parseInt(cookie.getValue());
				req.setAttribute("n", n);
			}

        while (true) {
            if (isPrime(number))
                count++;
            if (count == n)
                break;
            number++;
            }

        req.setAttribute("number", number);
    	req.getRequestDispatcher("display.jsp").forward(req, res);
    	}
	}