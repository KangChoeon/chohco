package com.human.ex;
import java.util.Random;
import java.util.Scanner;

public class project1 {

	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		/*프로젝트 문제

		   //369문제-----------------------------------
	      /*for(int i=1;i<=100;i++) {
		   int x=i%10;
		   int y=i/10;
		   
		   if((x==3||x==6||x==9)&&(y==3||y==6||y==9)){
			   System.out.print("짝짝"+"("+i+")"+",");
		   }else if((x==3||x==6||x==9)||(y==3||y==6||y==9)) {
			   System.out.print("짝"+"("+i+")"+",");
		   }else {
			   System.out.print(i+",");
		   }
		   
		   if (i%10==0) {
			   System.out.println();
		   }		   
	   }*/
		
		
		
		/* Scanner s=new Scanner(System.in);	
		 System.out.println("점수를 입력하시오>>");
		 int a=s.nextInt();
		 
		 if(a<=1000) {
			 System.out.println("출력"+a);
		 }else{
			 System.out.println("다시입력하시오");
			 
		 }*/
		
		 //사칙연산게임-----------------------------------------------
		/*int a,b,c,d,e,f;
		Scanner s=new Scanner(System.in);	
        a=(int)(Math.random()*99)+1;
      
        b=(int)(Math.random()*99)+1;
		System.out.println(a+"+"+b+"의 답은?");
		
		c=s.nextInt();
		
		
		while(c!=(a+b)) {
			System.out.println("오답ㅠㅠ 다시 풀어주세요");
			c=s.nextInt();
			
	  } 
			System.out.println("정답 다음 단계로");
			
			a=(int)(Math.random()*99)+1;
		      
	        b=(int)(Math.random()*99)+1;
	        
	        d=(int)(Math.random()*99)+1;
	        
			System.out.println(a+"+"+b+"-"+d+"의 답은?");
			
			c=s.nextInt();	
			
			while(c!=(a+b-d)) {
				System.out.println("오답ㅠㅠ 다시 풀어주세요");
				
				c=s.nextInt();
				
			} 
			
					System.out.println("2단계");
				a=(int)(Math.random()*99)+1;
			      
		        b=(int)(Math.random()*99)+1;
		        
		        d=(int)(Math.random()*99)+1;
		        
		        e=(int)(Math.random()*99)+1;
		        
		        System.out.println(a+"+"+b+"-"+d+"*"+e+"의 답은?");
		        
		        while(c!=(a+b-d*e)) {
					System.out.println("오답ㅠㅠ 다시 풀어주세요");
					c=s.nextInt();
					
				} 
					System.out.println("정답 다음 단계로");
					System.out.println("3단계");
					
					a=(int)(Math.random()*99)+1;
				      
			        b=(int)(Math.random()*99)+1;
			        
			        d=(int)(Math.random()*99)+1;
			        
			        e=(int)(Math.random()*99)+1;
			        
			        f=(int)(Math.random()*99)+1;
			        
			        System.out.println(a+"+"+b+"-"+d+"*"+e+"의 답은?");
			        
			        while(c!=(a+b-d*e/f)) {
						System.out.println("오답ㅠㅠ 다시 풀어주세요");
						c=s.nextInt();
						
					} 
						System.out.println("수고하셨습니다 짝짝짝");
						
					*/
		
		
		//이용권계산---------------------------------------------------------------
	
	/*
	       
        System.out.println("-------종류--------");
        System.out.println("1. 주간권(1일권)     ");
        System.out.println("2. 오후권(오후3시~)   ");
        System.out.println("3. 윈터야간권(오후5시~)");
        System.out.println("4.  2일권                       ");
        System.out.println("-------------------");
        
        int man=0,student=0,weak=0,sum3=0,type1=0;
		for(;;) {
			
			String type=scanner.next();
			switch(type) {
			case "주간권":
				type1=1;
				break;
			case "오후권":
				type1=2;
				break;
			case "윈터야간권":
				type1=3;
				break;
			case "2일권":
				type1=4;
				break;
			default:
				System.out.println("오류");
				break;
			}
			if(type1!=0) {
				break;
			}
		}  
        System.out.println("------연령-------");
        System.out.println("1. 대인  ");
        System.out.println("2. 청소년   ");
        System.out.println("3. 소인/경로");
        System.out.println("-------------------");
        
        System.out.print("인원 수=>");
		int people=scanner.nextInt();
		for(;;) {
			if(sum3>people) {
				System.out.println("오류");
			}else if(sum3==people) {
				break;
			}else {
				System.out.print("대인=>");
				man=scanner.nextInt();
				System.out.print("청소년=>");
				student=scanner.nextInt();
				System.out.print("소인/경로=>");
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
		System.out.println("가격은 =>"+sum3);

      */  
	



	//숫자맞추기게임-----------------------------------------------------------------------
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
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			
			while(true) {
				System.out.println(low +"-" + high);
				System.out.print(i+1+">>");
				int n=0;

				try {
					n= scanner.nextInt(); 
				} 
				catch(Exception e) { 
					System.out.println("정수만 입력");
					scanner.nextLine(); 
					continue; 
				}
				
				if(n>high || n<low)
					System.out.println("범위를 벗어났어요");
				else 
					if(n==card) {
						System.out.println("정답입니다.");
						break;
					}
					else if(n>card){ 
						System.out.println("더 낮게");
						high = n;					
					}
					else { 
						System.out.println("더 높게");
						low = n;									
					}
				}
				i++; 
			} 
		
		*/
		
        }
	}
        





	
			
		
	   
		







