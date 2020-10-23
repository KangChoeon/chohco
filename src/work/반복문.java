package work;

import java.util.Scanner;

public class 반복문 {

	public static void main(String[]args) {
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
	

		
		
/*문제5 
		
	        int sum = 0;
	        while(sum<=100) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("합계를 구할 숫자를 입력하세요.");
	        int a = sc.nextInt();
	        sum+=a;
	        if(sum>100) {
	        	System.out.println("합계는 "+sum+"입니다.");	
	        }
	        }1
	        System.out.println("프로그램을 종료합니다.");*/
	       
	        
		
	/*문제6
		System.out.print("숫자입력(1~10):");
		int a=0,b=0,c=0,d=0;
	    for(;;) {
	    Scanner s=new Scanner(System.in);
	    a=s.nextInt();
	    if(a>0&&a<=10) {
	    	b+=a;
	    	c++;
	    }else{
	    	d++;
		
			}
	    if(c==3){
	    	break;
	    }
			
		}
		System.out.println("제대로입력한횟수>>>"+c+"\n잘못입력한횟수>>"+d+"\n총합>>"+b);
		*/
		
	/*문제7
		System.out.print("숫자입력>>");
		Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    System.out.print("숫자입력>>");
	    int b=s.nextInt();
	    
	    int c,d=1,e=0;
	    for(c=1;c<=b;c++) {
	    	e=c*a;
	     for(d=1;d<=a;d++) {
	    	 if(e==(d*b)) {
	    	 break;
	    }
	    }
	    if(e==(d*b)){
	    	break;
	    }
	    }
	    System.out.println("최소공배수는"+e);
	    */
  
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
		
		/*문제9
		
		int fail=0;
		for(int a=1;a<6;a++) {
			System.out.println("수학 점수입력(100이하로 적으십시오)");
		    Scanner s=new Scanner(System.in);	
		    int score=s.nextInt();
		    if(score<=60) {
		    	fail++;
		    }
		}
		
		System.out.println(fail+"명 탈락");*/
		
		
		/*문제10
		
		int a,sum=0;
		for(a=1;;a++) {
			sum+=a;
			if(sum>=100) {
				break;
			}else{
				System.out.print(a+":"+sum+"");
			}
		}*/
		
		/*문제11
		System.out.println("메세지 입력");
		Scanner scanner=new Scanner(System.in);	
	    String a=scanner.nextLine();
		System.out.println("숫자입력");	
		int b=scanner.nextInt();
       for(int c=0;c<b;c++) {
    	   System.out.print(a);
       }
       System.out.println();*/
       
		
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
		
		
		/*문제13
	   System.out.print("숫자입력>>");
	   Scanner s=new Scanner(System.in);
	   int a=s.nextInt();
	   int b,c=0;
	   for(b=1;b<=a;b++) {
		   if(a%b==0) {
			   c++;
		   }
	   }
	   if(c==2) {
		   System.out.println(a+"는소수입니다");
	   }else{
		   System.out.println(a+"는소수가 아닙니다");
	   }*/
	   
		
		
		/*문제14
		
		Scanner s=new Scanner(System.in);

		System.out.println("첫번째수를 입력하시오.");
		int a=s.nextInt();
		System.out.println("두번째수를 입력하시오.");
		int b=s.nextInt();
		int c;
		
		for(c=a;c<=(a+b);c++);{
		
		System.out.println(c+"");
		}*/
	
        
		
		/*문제15
		
		Scanner s=new Scanner(System.in);
		System.out.println("구구단을 시작합니다.(2~9)");
	
		  System.out.println("값을 입력합니다");
		  int num=s.nextInt();
		  
		  for(int i=1;i<10;i++) {
			  System.out.println(num+"*"+i+"="+i*num);
			  
		  }
		  System.out.println("구구단 프로그램 종료");
		*/
		
		/*문제16

		System.out.print("숫자 입력(1~1000)=>");

		int a=Integer.parseInt(scanner.nextLine());

		int b,c=0;

		for(b=a;b<=1000;b++) {

		if(b%a==0) {

		c++;

		}

		}

		System.out.println(a+" 배수의 갯수는 "+c+"개");*/

		​

		/*17번

		System.out.print("행 입력=>");

		Scanner s=new Scanner(System.in);
	     int a=s.nextInt();
		 System.out.print("열 입력=>");
		 int b=s.nextInt();

		int c,d,e=1;

		if(a*b>100) {

		System.out.println("잘못 입력하셨습니다.");

		}else {

		for(c=0;c<a;c++) {

		for(d=0;d<b;d++) {

		System.out.print(e+"\t");

		e++;

		}

		System.out.println();

		}

		}
*/
		​

	/*	18번

		int a,b,c=1;

		for(a=0;a<5;a++) {

		if(a==0) {

		for(b=0;b<5;b++) {

		System.out.print(c+"\t");

		c++;

		}

		}else if(a%2==1) {

		c+=4;

		for(b=0;b<5;b++) {

		System.out.print(c+"\t");

		c--;

		}

		}else {

		c+=6;

		for(b=0;b<5;b++) {

		System.out.print(c+"\t");

		c++;

		}

		}

		System.out.println();

		}
*/
		​

		/*19.

		System.out.print("시작 요일 입력(일~토)=>");

		Scanner scanner=new Scanner(System.in);	
	    String a=scanner.nextLine();

		System.out.print("일수 입력=>");

		int b=scanner.nextInt();

		int c;

		System.out.println("일\t월\t화\t수\t목\t금\t토");

		switch(a) {

		case "일":

		for(c=1;c<=b;c++) {

		System.out.print(c+"\t");

		if(c%7==0) {

		System.out.println();

		}else {}

		}

		break;

		case "월":

		System.out.print("\t");

		for(c=1;c<=b;c++) {

		System.out.print(c+"\t");

		if((c+1)%7==0) {

		System.out.println();

		}else {}

		}

		break;

		case "화":

		System.out.print("\t\t");

		for(c=1;c<=b;c++) {

		System.out.print(c+"\t");

		if((c+2)%7==0) {

		System.out.println();

		}else {}

		}

		break;

		case "수":

		System.out.print("\t\t\t");

		for(c=1;c<=b;c++) {

		System.out.print(c+"\t");

		if((c+3)%7==0) {

		System.out.println();

		}else {}

		}

		break;

		case "목":

		System.out.print("\t\t\t\t");

		for(c=1;c<=b;c++) {

		System.out.print(c+"\t");

		if((c+4)%7==0) {

		System.out.println();

		}else {}

		}

		break;

		case "금":

		System.out.print("\t\t\t\t\t");

		for(c=1;c<=b;c++) {

		System.out.print(c+"\t");

		if((c+5)%7==0) {

		System.out.println();

		}else {}

		}

		break;

		default:

		System.out.print("\t\t\t\t\t\t");

		for(c=1;c<=b;c++) {
		System.out.print(c+"\t");

		if((c+6)%7==0) {

		System.out.println();

		}else {} 

		}

		break;

		}*/

		​

		/*20.

		System.out.print("게임 회수=>");

		Scanner s=new Scanner(System.in);
	     int b=s.nextInt();

		int sum=0,sum1=0;

		for(int c=0;c<b;c++) {

		System.out.print("동전 앞,뒤=>");

		String a=s.nextLine();

		if((int)(Math.random()*2)==0) {

		if(a=="앞") {

		sum++;

		}else {

		sum1++;

		}

		}else {

		if(a=="앞") {

		sum1++;

		}else {

		sum++;

		}

		}

		}

		System.out.println("게임 회수=>"+b+"맞춘 회수=>"+sum+"틀린 회수=>"+sum1);
		*/

		​

		/*21번

		System.out.print("게임 회수=>");

		Scanner s=new Scanner(System.in);
	    int b=s.nextInt();

		int sum=0,sum1=0;

		for(int c=0;c<b;c++) {

		System.out.print("주사위 숫자(1~6)=>");

		int a=Integer.parseInt(s.nextLine());

		if((int)(Math.random()*6)==(a-1)) {

		sum++;

		}else {

		sum1++;

		}

		}

		System.out.println("게임 회수=>"+b+"맞춘 회수=>"+sum+"틀린 회수=>"+sum1);*/

		​


		
		
		
		  
		
		
		
	

		
	    }
		
	
	}


