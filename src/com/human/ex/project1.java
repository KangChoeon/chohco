package com.human.ex;
import java.util.Random;
import java.util.Scanner;

public class project1 {

	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		/*������Ʈ ����

		   //369����-----------------------------------
	      /*for(int i=1;i<=100;i++) {
		   int x=i%10;
		   int y=i/10;
		   
		   if((x==3||x==6||x==9)&&(y==3||y==6||y==9)){
			   System.out.print("¦¦"+"("+i+")"+",");
		   }else if((x==3||x==6||x==9)||(y==3||y==6||y==9)) {
			   System.out.print("¦"+"("+i+")"+",");
		   }else {
			   System.out.print(i+",");
		   }
		   
		   if (i%10==0) {
			   System.out.println();
		   }		   
	   }*/
		
		
		
		/* Scanner s=new Scanner(System.in);	
		 System.out.println("������ �Է��Ͻÿ�>>");
		 int a=s.nextInt();
		 
		 if(a<=1000) {
			 System.out.println("���"+a);
		 }else{
			 System.out.println("�ٽ��Է��Ͻÿ�");
			 
		 }*/
		
		 //��Ģ�������-----------------------------------------------
		/*int a,b,c,d,e,f;
		Scanner s=new Scanner(System.in);	
        a=(int)(Math.random()*99)+1;
      
        b=(int)(Math.random()*99)+1;
		System.out.println(a+"+"+b+"�� ����?");
		
		c=s.nextInt();
		
		
		while(c!=(a+b)) {
			System.out.println("����Ф� �ٽ� Ǯ���ּ���");
			c=s.nextInt();
			
	  } 
			System.out.println("���� ���� �ܰ��");
			
			a=(int)(Math.random()*99)+1;
		      
	        b=(int)(Math.random()*99)+1;
	        
	        d=(int)(Math.random()*99)+1;
	        
			System.out.println(a+"+"+b+"-"+d+"�� ����?");
			
			c=s.nextInt();	
			
			while(c!=(a+b-d)) {
				System.out.println("����Ф� �ٽ� Ǯ���ּ���");
				
				c=s.nextInt();
				
			} 
			
					System.out.println("2�ܰ�");
				a=(int)(Math.random()*99)+1;
			      
		        b=(int)(Math.random()*99)+1;
		        
		        d=(int)(Math.random()*99)+1;
		        
		        e=(int)(Math.random()*99)+1;
		        
		        System.out.println(a+"+"+b+"-"+d+"*"+e+"�� ����?");
		        
		        while(c!=(a+b-d*e)) {
					System.out.println("����Ф� �ٽ� Ǯ���ּ���");
					c=s.nextInt();
					
				} 
					System.out.println("���� ���� �ܰ��");
					System.out.println("3�ܰ�");
					
					a=(int)(Math.random()*99)+1;
				      
			        b=(int)(Math.random()*99)+1;
			        
			        d=(int)(Math.random()*99)+1;
			        
			        e=(int)(Math.random()*99)+1;
			        
			        f=(int)(Math.random()*99)+1;
			        
			        System.out.println(a+"+"+b+"-"+d+"*"+e+"�� ����?");
			        
			        while(c!=(a+b-d*e/f)) {
						System.out.println("����Ф� �ٽ� Ǯ���ּ���");
						c=s.nextInt();
						
					} 
						System.out.println("�����ϼ̽��ϴ� ¦¦¦");
						
					*/
		
		
		//�̿�ǰ��---------------------------------------------------------------
	
	/*
	       
        System.out.println("-------����--------");
        System.out.println("1. �ְ���(1�ϱ�)     ");
        System.out.println("2. ���ı�(����3��~)   ");
        System.out.println("3. ���;߰���(����5��~)");
        System.out.println("4.  2�ϱ�                       ");
        System.out.println("-------------------");
        
        int man=0,student=0,weak=0,sum3=0,type1=0;
		for(;;) {
			
			String type=scanner.next();
			switch(type) {
			case "�ְ���":
				type1=1;
				break;
			case "���ı�":
				type1=2;
				break;
			case "���;߰���":
				type1=3;
				break;
			case "2�ϱ�":
				type1=4;
				break;
			default:
				System.out.println("����");
				break;
			}
			if(type1!=0) {
				break;
			}
		}  
        System.out.println("------����-------");
        System.out.println("1. ����  ");
        System.out.println("2. û�ҳ�   ");
        System.out.println("3. ����/���");
        System.out.println("-------------------");
        
        System.out.print("�ο� ��=>");
		int people=scanner.nextInt();
		for(;;) {
			if(sum3>people) {
				System.out.println("����");
			}else if(sum3==people) {
				break;
			}else {
				System.out.print("����=>");
				man=scanner.nextInt();
				System.out.print("û�ҳ�=>");
				student=scanner.nextInt();
				System.out.print("����/���=>");
				weak=scanner.nextInt();
				sum3=man+student+weak;
			}
		}
		switch(type1) {
		case 1:
			sum3=(man*46000)+(student*39000)+(weak*36000);
			break;
		case 2:
			sum3=(man*38000)+(student*32000)+(weak*29000);
			break;
		case 3:
			sum3=(man*20000)+(student*17000)+(weak*16000);
			break;
		default:
			sum3=(man*74000)+(student*62000)+(weak*58000);
			break;
		}
		System.out.println("������ =>"+sum3);

      */  
	



	//���ڸ��߱����-----------------------------------------------------------------------
		/*
		int low, high;
		int card; 
		Random r = new Random(); 
		Scanner scanner = new Scanner(System.in); 
		
		
		while(true) {
			int i=0; 
			low = 0; 
			high = 99; 			
			card = r.nextInt(100);
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
			
			while(true) {
				System.out.println(low +"-" + high);
				System.out.print(i+1+">>");
				int n=0;

				try {
					n= scanner.nextInt(); 
				} 
				catch(Exception e) { 
					System.out.println("������ �Է�");
					scanner.nextLine(); 
					continue; 
				}
				
				if(n>high || n<low)
					System.out.println("������ ������");
				else 
					if(n==card) {
						System.out.println("�����Դϴ�.");
						break;
					}
					else if(n>card){ 
						System.out.println("�� ����");
						high = n;					
					}
					else { 
						System.out.println("�� ����");
						low = n;									
					}
				}
				i++; 
			} 
		
		*/
		
        }
	}
        





	
			
		
	   
		







