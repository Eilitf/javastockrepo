package com.frenkel.service;

import java.util.Date;

import com.frenkel.Stock;
import com.frenkel.model.Portfolio;

public class PortfolioManager 
{
	public Portfolio getPortfolio()
	{
		Portfolio portfolio = new Portfolio();
		
		Stock stock1= new Stock();
		stock1.setSymbol("PIH");
		stock1.setAsk((float) 13.1);
		Date stock1Date = new Date(2014,11,15);
		stock1.setDate(stock1Date);
		stock1.setBid((float)12.4);
		
		portfolio.addStock(stock1);
		
		Stock stock2= new Stock();
		stock2.setSymbol("AAL");
		stock2.setAsk((float) 5.78);
		Date stock2Date = new Date(2014,11,15);
		stock2.setDate(stock2Date);
		stock2.setBid((float)5.5);
		
		portfolio.addStock(stock2);
		
		Stock stock3= new Stock();
		stock3.setSymbol("CAAS");
		stock3.setAsk((float) 32.2);
		Date stock3Date = new Date(2014,11,15);
		stock3.setDate(stock2Date);
		stock3.setBid((float)31.5);
		
		portfolio.addStock(stock3);

		return portfolio;
	}

}
