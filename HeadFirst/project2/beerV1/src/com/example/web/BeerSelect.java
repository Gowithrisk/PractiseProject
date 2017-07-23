package com.example.web;

import com.example.model.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeerSelect extends HttpServlet
{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		
		String c = req.getParameter("color");
		BeerExpert bee = new BeerExpert();
		List result=bee.getBrands(c);
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("Beer select Advice<br>");
		String c = req.getParameter("color");
		out.println("<br>Got beer color" + c);
		
		Iterator iterator = result.iterator();
		while (it.hasNext())
		{
			out.print("<br>try: " + it.next());
		}
	}

}
