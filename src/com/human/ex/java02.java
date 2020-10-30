package com.human.ex;

import com.human.dto.Car2;
import com.human.dto.Tire;

public class java02 {

	public static void main(String[] args) {
     //클래스 안에 클래스를 기술할수있다
     Car2 car=new Car2();
     car.color="빨강";
     car.company="현대";
     car.maxSpeed=200;
     car.model="소나타";
     car.tire.company="금호타이어";
     car.tire.mileage=20;
     car.tire.price=500000;
     
     Car2 newCar=new Car2();
     //newCar=car;
     newCar.color=car.color;
     newCar.company=car.company;
     newCar.maxSpeed=car.maxSpeed;
     newCar.model=car.model;
	 newCar.tire.company=car.tire.company;
	 newCar.tire.mileage=car.tire.mileage;
	 newCar.tire.price=car.tire.price;
	 
	 System.out.println(car.color);
	 System.out.println(car.company);
	 System.out.println(car.maxSpeed);
	 System.out.println(car.model);
	 System.out.println(car.tire.company);
	 System.out.println(car.tire.mileage);
	 System.out.println(car.tire.price);
	 
	 System.out.println(newCar.color);
	 System.out.println(newCar.company);
	 System.out.println(newCar.maxSpeed);
	 System.out.println(newCar.model);
	 System.out.println(newCar.tire.company);
	 System.out.println(newCar.tire.mileage);
	 System.out.println(newCar.tire.price);
}
}