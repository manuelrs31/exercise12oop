package com.exercise12oop.model;
import java.lang.Math;
public class triangle extends shape
{
	private double base;
	private double altura;
	public double area;
	private  double perimetro;
	protected String name;
	
	
	
	
	public triangle()
	{
		
	}
	
	public triangle ( double base, double altura)
	{
		this.base = base;
		this.altura = altura;
	}
	
	
	public double area( double base, double altura)
	{
		return (base*altura)/2;
	}
	public double perimetro()
	{
		this.perimetro =Math.sqrt(Math.pow(base,2)+Math.pow(altura, 2));
		this.name="default"; 
		return 0;
	}
	public double perimetro ( double base, double perimetro, double hipotenusa)
	{
		return Math.sqrt(Math.pow(base,2)+Math.pow(altura, 2));
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

	@Override
	public void Dosomething() {
		// TODO Auto-generated method stub
		
	}

}
