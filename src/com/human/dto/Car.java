package com.human.dto;

public class Car {
	public String name="";
	public String color="";
	public Wheel wheel=new Wheel();
	public int price=0;
	public int maxspeed=0;
	
	public class Wheel {
		public String name="";
		public String made="";
		public int price=0;

	}

}
