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
		Stock stock1= new Stock();
		stock1.setSymbol("PIH");
		stock1.setAsk((float) 13.1);
		Date stock1Date = new Date(2014,11,15);
		stock1.setDate(stock1Date);
		stock1.setBid((float)12.4);
		
		
		Stock stock2= new Stock();
		stock2.setSymbol("AAL");
		stock2.setAsk((float) 5.78);
		Date stock2Date = new Date(2014,11,15);
		stock2.setDate(stock2Date);
		stock2.setBid((float)5.5);
		
		Stock stock3= new Stock();
		stock3.setSymbol("CAAS");
		stock3.setAsk((float) 32.2);
		Date stock3Date = new Date(2014,11,15);
		stock3.setDate(stock2Date);
		stock3.setBid((float)31.5);
		
		String resultStr =  stock1.getHtmlDescription() + "<br>" +
				stock2.getHtmlDescription() + "<br>" + stock3.getHtmlDescription();
			
		resp.setContentType("text/html");
		resp.getWriter().println(resultStr);
	}
	

}
