package com.exercise12oop.model;
import java.lang.Math;
public class circle extends shape
{
	
	double PI=3.1416;
	
	private double radio;
	
	public circle ()
	{
		
	}
	public circle ( double radio)
	{
		this.radio = radio;
	}
	
	public double area( double radio)
	{
		return Math.PI*(Math.pow(radio, 2));
	}
	public double perimetro ( double radio)
	{
		return 2*Math.PI*radio;
	}
	
	public double getRadio()
	{
		return radio;
	}
	public void setRadio(double radio)
	{
		this.radio = radio;
	}
	

}
