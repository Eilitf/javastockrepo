package com.frenkel.model;
import com.frenkel.Stock;

public class Portfolio
{
	String title;
	final int  MAX_PORTFOLIO_SIZE = 5;
	Stock[] stocks;
	int portfolioSize =0 ;
	
	
	public void setStock()
	{
		stocks = new Stock[MAX_PORTFOLIO_SIZE];
		
	}
	
	public void addStock(Stock stock)
	{
		stocks[portfolioSize]= stock;
		portfolioSize ++;
	}
	
	public Stock[] getStocks()
	{
		return stocks;	
	}

	public String getHtmlString()
	{
		String resultStr = new String ("<h1>portfolio title</h1><br>");
		
		for(int i=0; i<portfolioSize; i++)
		{
			resultStr += stocks[portfolioSize].getHtmlDescription();
			resultStr += "<br>";
		}
		
		return resultStr;
	}
	
	
	
}
