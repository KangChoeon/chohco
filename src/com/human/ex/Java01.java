package com.human.ex;
import com.human.dto.*;
import com.human.dto.Car.Wheel;
public class Java01 {

	public static void main(String[] args) {
		com.human.dto.Car car1=new com.human.dto.Car();
		Car.Wheel Wheel1=car1.new Wheel();
		com.human.dto.Car car2=new com.human.dto.Car();
		Car.Wheel Wheel2=car2.new Wheel();
		com.human.dto.Car car3=new com.human.dto.Car();
		Car.Wheel Wheel3=car3.new Wheel();
		System.out.println("�̸�\t\t����\t����\t\t����\t\t�ִ뽺�ǵ�");
		
		car1.name="�ҳ�Ÿ";
		car1.color="�Ͼ��";
		car1.wheel.name="���";
		car1.price=00000;
		car1.maxspeed=00000;
		
		System.out.println(car1.name+"\t\t"+car1.color+"\t"+car1.wheel.name
				+"\t\t"+car1.price+"\t\t"+car1.maxspeed);
	
		car2.name="���׽ý�";
		car2.color="������";
		car2.wheel.name="���";
		car2.price=00000;
		car2.maxspeed=00000;
		
		System.out.println(car2.name+"\t\t"+car2.color+"\t"+car2.wheel.name
				+"\t\t"+car2.price+"\t\t"+car2.maxspeed);
		
		car3.name="���";
		car3.color="������";
		car3.wheel.name="���";
		car3.price=00000;
		car3.maxspeed=00000;
		
		System.out.println(car3.name+"\t\t"+car3.color+"\t"+car3.wheel.name
				+"\t\t"+car3.price+"\t\t"+car3.maxspeed);
		System.out.println();
		
		System.out.println("�����̸�\t\t������\t\t����");
		
		Wheel1.name="������";
		Wheel1.made="������";
		Wheel1.price=0000;
		System.out.println(Wheel1.name
				+"\t\t"+Wheel1.made+"\t\t"+Wheel1.price);
	
		Wheel2.name="������";
		Wheel2.made="������";
		Wheel2.price=0000;
		System.out.println(Wheel2.name
				+"\t\t"+Wheel2.made+"\t\t"+Wheel2.price);
		
		Wheel3.name="������";
		Wheel3.made="������";
		Wheel3.price=0000;
		System.out.println(Wheel3.name+"\t\t"
		+Wheel3.made+"\t\t"+Wheel3.price);
		
	}

}
