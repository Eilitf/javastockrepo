package com.frenkel.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.frenkel.Stock;
import com.frenkel.model.Portfolio;
import com.frenkel.service.PortfolioManager;
import com.sun.net.httpserver.HttpServer;
import com.sun.security.ntlm.Server;

public class PortfolioServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		
			PortfolioManager portfolioManager = new PortfolioManager();
			Portfolio portfolio1 = portfolioManager.getPortfolio();
			
			Portfolio portfolio2 = new Portfolio(portfolio1); //copy portfolio1 to portfolio2
			
			portfolio2.setTitle("2"); // change portfolio2 title
			
			resp.setContentType("text/html");
			
			String resultStr = portfolio1.getHtmlString(); //print portfolio1
			resp.getWriter().println(resultStr);
			
			resultStr = portfolio2.getHtmlString(); //print portfolio2
			resp.getWriter().println(resultStr);
			
			portfolio1.stocks[0].setSymbol("2"); //remove first stock
			
			resultStr = portfolio1.getHtmlString(); //print portfolio1
			resp.getWriter().println(resultStr);
			
			resultStr = portfolio2.getHtmlString(); //print portfolio2
			resp.getWriter().println(resultStr);
			
			portfolio2.stocks[4].setBid((float)55.55); // change last stock's bid value of portfolio2 to 55.55

			resultStr = portfolio1.getHtmlString(); //print portfolio1
			resp.getWriter().println(resultStr);
			
			resultStr = portfolio2.getHtmlString(); //print portfolio2
			resp.getWriter().println(resultStr);

	
	}

}
