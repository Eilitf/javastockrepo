package com.frenkel.model;
import com.frenkel.Stock;

public class Portfolio
{
	private String title;
	private final int  MAX_PORTFOLIO_SIZE = 5;
	public Stock[] stocks;
	private int portfolioSize =0 ;
	
	public Portfolio(String title, Stock[] stocks, int portfolioSize)
	{
		this.title= title;
		this.portfolioSize = portfolioSize;	
		this.stocks = stocks;
		
	}
	
	
	public Portfolio (Portfolio other)
	{
		this(other.title, other.stocks , other.portfolioSize);
		for (int i=0; i<other.portfolioSize; i++)
		{
			this.stocks[i] = other.stocks[i];
		}
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setStock()
	{
		stocks = new Stock[MAX_PORTFOLIO_SIZE];
		
	}
	
	public void addStock(Stock stock)
	{
		stocks[portfolioSize] = new Stock(stock);
		portfolioSize ++;
	}
	
	public Stock[] getStocks()
	{
		return stocks;	
	}

	public String getHtmlString()
	{
		String resultStr = new String ("<h1>portfolio #" +this.title+"</h1><br>");
		
		for(int i=0; i<portfolioSize; i++)
		{
			resultStr += getStocks()[i].getHtmlDescription();
			resultStr += "<br>";
		}
		
		return resultStr;
	}
	
	
	
}
