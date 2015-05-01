package com.frenkel.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.frenkel.Stock;
import com.frenkel.model.Portfolio;
import com.frenkel.service.PortfolioManager;

public class PortfolioServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{

			PortfolioManager portfolioManager = new PortfolioManager();
			Portfolio portfolio = portfolioManager.getPortfolio();
			resp.getWriter().println(portfolio.getHtmlString());
			
			String resultStr = portfolio.getHtmlString();
			resp.getWriter().println(resultStr);
			resp.setContentType("text/html");
	}

}
