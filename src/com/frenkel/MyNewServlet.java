package com.frenkel;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyNewServlet extends HttpServlet
{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		//Circle calculation
		
		int radius = 50;
		double area;
		
		area = java.lang.Math.pow(radius, 2)* Math.PI;
		
		String line1 = new String("calculation 1: Area of circle with radius " +radius+
				" is: "+area+" square-cm");
		
		//Triangle calculation
		
		int angleB = 30; //in degrees
		int hypotenuse_length= 50;  // in cm
		
		double converted_angleB_into_radians= (Math.PI /180) * angleB;
		double opposite_length;
		
	    double sin_angleB = java.lang.Math.sin(converted_angleB_into_radians);
		
	    opposite_length = sin_angleB * hypotenuse_length;
	    
	    String line2 = new String("calculation 2: Length of opposite where angle B is "
	    		+angleB+ " degrees and Hypotenuse lenght is " +hypotenuse_length+ " is: "+
	    		opposite_length + " cm");
		
		//Power calculation
		
		int base =20;
		int exp = 13;
		double res;
		
		res = java.lang.Math.pow(base, exp);
		
		String line3 = new String("calculation 3: Power of " +base+ " with exp of "+
				  exp+ " is: " +res);
		
		String resultStr = line1 + "<br>" + line2 + "<br>" + line3;
		
		resp.setContentType("text/html");
		resp.getWriter().println(resultStr);
		
	}
	
}
