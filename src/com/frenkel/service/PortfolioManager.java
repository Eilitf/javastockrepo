package com.frenkel.service;

import java.util.Date;

import com.frenkel.Stock;
import com.frenkel.model.Portfolio;

public class PortfolioManager 
{
	public Portfolio getPortfolio()
	{
		Date stock1Date = new Date(2014,11,15);
		Stock stock1= new Stock("PIH",(float)13.1,(float)12.4,stock1Date,0,0 );
		
		Date stock2Date = new Date(2014,11,15);
		Stock stock2= new Stock("AAL",(float) 5.78,(float)5.5,stock2Date,0,0);
	
		Date stock3Date = new Date(2014,11,15);
		Stock stock3= new Stock("CAAS",(float) 32.2,(float)31.5,stock3Date,0,0);
	
		
		Stock stocksarr[]=null;
		
		Portfolio portfolio = new Portfolio("portfolio1",stocksarr,3);
		
		portfolio.addStock(stock1);
		portfolio.addStock(stock2);
		portfolio.addStock(stock3);

		return portfolio;
	}

}
