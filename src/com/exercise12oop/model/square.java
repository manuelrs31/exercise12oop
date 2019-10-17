package com.exercise12oop.model;

public class square extends shape
{
	
	private double base;
	private double altura;
	
	
	public square()
	{
		
	}
	
	public square (double base, double altura)
	{
		this.base = base;
		this.altura = altura;
	}
	
	public double area(double base, double altura)
	{
		return base*altura;
	}
	public double perimetro(double base)
	{
		return base*4;
	}
	
	
	// getters and setters 
	public double getBase()
	{
		return base;
	}
	public void setBase(double base)
	{
		this.base = base;
	}
	
	public double getAltura()
	{
		return altura;
	}
	
	public void setAltura(double altura)
	{
		this.altura = altura;
	}

}
