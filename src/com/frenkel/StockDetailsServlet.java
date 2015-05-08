package com.frenkel;
import java.io.IOException;
import java.util.Date;

import com.frenkel.Stock;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StockDetailsServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		Date stock1Date = new Date(2014,11,15);
		Stock stock1= new Stock("PIH",(float)13.1,(float)12.4,stock1Date,0,0 );
		
		Date stock2Date = new Date(2014,11,15);
		Stock stock2= new Stock("AAL",(float) 5.78,(float)5.5,stock2Date,0,0);
	
		Date stock3Date = new Date(2014,11,15);
		Stock stock3= new Stock("CAAS",(float) 32.2,(float)31.5,stock3Date,0,0);
		
		String resultStr =  stock1.getHtmlDescription() + "<br>" +
				stock2.getHtmlDescription() + "<br>" + stock3.getHtmlDescription();
			
		resp.setContentType("text/html");
		resp.getWriter().println(resultStr);
	}
	

}
