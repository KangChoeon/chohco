package work;

import java.util.Scanner;

public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*문제1 while
		int a=2;
		int b=1;
		b++;
		System.out.println(a);
		System.out.println(b);
		while(b<15) {
			a=a+1;
			b=b+a;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println("종료");
		*/
/*문제2 for
		
	for(int i=0;i<101;i++){
		 if(i%2==0) {
			 System.out.println(i);
		 }
	}*/
	/*문제3
	    Scanner s=new Scanner(System.in);	
		System.out.println("공약수");
		
		System.out.println("a>>");
		int a=s.nextInt();
		System.out.println("b>>");
		int b=s.nextInt();
		
		
		System.out.println("공약수 %s":"+b);*/
	
		
	    
/*문제4

   Scanner s=new Scanner(System.in);
   int temp=0;
   
		System.out.println("최대공약수");
		
		System.out.println("a>>");
		int a=s.nextInt();
		System.out.println("b>>");
		int b=s.nextInt();
		
		while(a!=0) {
			if(a<b) {
				temp=a;
				a=b;
				b=temp;
			}
			a=a-b;
		}
		System.out.println("최대공약수:"+b);
		*/
	

		
		
/*문제5 다시
		  int a ;
	        int sum = 0;
	        boolean flag = true;
	        
	        System.out.println("합계를 구할 숫자를 입력하세요.");
	        Scanner sc = new Scanner(System.in);
	        while(flag){
	            System.out.print(">>");
	            a = sc.nextInt();
	            
	            if(a!= sum+a){
	                sum += a;
	                		
	            }else{
	                flag = false;
	            }
	        }
	        System.out.println("합계는 "+sum+"입니다.");
	        System.out.println("프로그램을 종료합니다.");
	        sc.close();
	        System.exit(0);
	        */
		
	//문제6
		
	//문제7
	
  
		/*문제8
		  Scanner s=new Scanner(System.in);	
			System.out.println("가장 큰수와 작은수");
			
			System.out.println("a>>");
			int a=s.nextInt();
			System.out.println("b>>");
			int b=s.nextInt();
			System.out.println("c>>");
			int c=s.nextInt();
			if((a>b)&&(a>c)) {
				System.out.println("가장 큰 값은 a:"+a);
			}
				else if((b>a)&&(b>c)) {
					System.out.println("가장 큰 값은 b:"+b);
					}
						else if((c>b)&&(c>a)) {
							System.out.println("가장 큰 값은 c:"+c);
						}
							
							if((a<b)&&(a<c)) {
								System.out.println("가장 작은 값은 a:"+a);
							}
								else if((b<a)&&(a<c)) {
									System.out.println("가장 작은 값은 b:"+b);
								}
									else if((c<b)&&(c<a)) {
										System.out.println("가장 작은 값은 c:"+c);
								
									}*/
		
		/*문제9다시
		for(;;) {
		Scanner s=new Scanner(System.in);	
		System.out.println("수학 점수입력(100이하로 적으십시오)");
		
		System.out.println("a>>");
		int a=s.nextInt();
	
		
		
		if(a<60) {
			break;
		}
		
	}
	System.out.println("종료");*/
		
		/*문제12
		int sum=0;
		Scanner s=new Scanner(System.in);	
		System.out.println("두 수 사이의 값을 구합니다.");
		System.out.println("a>>");
		int a=s.nextInt();
		System.out.println("b>>");
		int b=s.nextInt();
		
		if(a>b) {
			int c=a;
			a=b;
			b=c;
		}
		for(int i=a;i<=b;i++) {
			sum=sum+i;
		}
		System.out.println("총 합은"+sum+"입니다");*/
		
		
		
	

		
	    }
		
	
	}


