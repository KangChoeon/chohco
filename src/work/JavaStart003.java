package work;

public class JavaStart003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
	//	1.사용자에게 양수 5  혹은 음수 5를 입력 받아 절대값을 출력하는 프로그램을 만들어 보자.
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("(양수5 또는 음수5) 입력 받아 절대값을 출력:");
		Double i = Double.parseDouble(scanner.nextLine());
		//int i = Integer.parseInt(scanner.nextLine());
		
		System.out.println (Math.abs(i));
*/			
		
		
	//2.두수를 입력받아 같은지 아니면 큰지 작은지 기술해 보자.
/*		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("사용자 수입력1 >>");
		int k = Integer.parseInt(scanner.nextLine());
		System.out.println("사용자 수입력2 >>");
		int j = Integer.parseInt(scanner.nextLine());
		
		if(k==j)	{
			System.out.println("두수가 같다 ");
		} else if(k>j) {
			System.out.println("두수 중 첫번째수 더 크다 ");
		} else{ 
			System.out.println("두수 중  두번째수 더 크다 ");
			
		}
*/
		
		
	//3.어떤 수가 나누어 떨어지는 다른 수를 약수라고 한다. 100을 2로 나누면 0이된다.
	//	따라서, 2는 100의 약수이다. 사용자에게 숫자를 하나 입력받아 126의 약수인지 아닌지 기술해 보자.
/*	
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("사용자 수입력1 >>");
		int k = Integer.parseInt(scanner.nextLine());
		
		if((k%126)==0)	{
			System.out.println("126의 약수다. ");
		
		} else{ 
			System.out.println("126의 약수가 아니다. ");
			
		}
*/		
					
	//4.국영수과목의 점수를 입력받아 평균이 80이상이면 합격 이하면 불합격을 출력해 보자.
/*
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("국어점수 >>");
		int kor = Integer.parseInt(scanner.nextLine());
		System.out.println("영어점수 >>");
		int eng = Integer.parseInt(scanner.nextLine());
		System.out.println("수학점수 >>");
		int mat = Integer.parseInt(scanner.nextLine());
		
		int sum=0;
		int avg=0;
		
		sum = kor+ eng + mat;
		
		if((sum/3) >= 80) {
			
			System.out.println("합격. ");
		} else {
			System.out.println("불합격. ");
		}
		
*/	
/*		
	//5.사용자에게 입력받은수가 5이하이면 x+15 초과 이면 x+5 한값이 출력되는 프로그램을 만들어 보자.	
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("사용자수 입력 >>");
		int m = Integer.parseInt(scanner.nextLine());
		
		
		if((m <5) || (m > 15)) {
			System.out.printf ("x+5 = %d \n",5+m);
		} else {
			System.out.println(" ") ; 
		}
*/
	//1.입력받은 수가 3의 배수 이거나 7의 배수이면 ‘3또는 7의 배수’가 출력되고,
	//2의 배수도 되고 5의 배수도 되면 ‘2와 5의 배수’를 출력하고 두가지 경우 다 만족하면 2가지다
	//출력하는 프로그램을 만들어 보자.
/*
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("사용자수 입력 >>");
		int nn = Integer.parseInt(scanner.nextLine());
				
		if( ((nn%3)==0)|| ((nn%7)==0) && ((nn%2)==0) && ((nn%5)==0)) {
			System.out.printf("%d 두가지 경우 만족 [3또는 7] [2와5] 배수",nn);
		} else if (((nn%2)==0) && ((nn%5)==0)) {
			System.out.printf("%d 입력ㅂ다은 수가 2 와 5의 배수",nn);
		} else if(((nn%3)==0)||((nn%7)==0)) {
			System.out.printf("%d 입력ㅂ다은 수가 3 또는 7의 배수",nn);
		} else {
			System.out.println("........만족하지 앟는다! ") ;
		}
*/		
	//.버스요금계산하는 프로그램을 구현해보자. 15세 이하는 1300원 초과는 1600원이고  버스카드로 결제하면 100원 할인해 준다	
		
	//15세미만 현금 1300, 카드 1200 [100훤할인]
	//15세이상 현금 1600, 카드 1500 [100월할인]

/*		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("1.현금 또는 0.카드 >>");
		int mm = Integer.parseInt(scanner.nextLine());
		System.out.println("1.15세미만  0.15세이상 >>");
		int pp = Integer.parseInt(scanner.nextLine());
		int dc=100;
		int price=1600;
		
		switch(pp) {
		
		case 0 :
				price = 1600;
				System.out.println(".15세이상") ;
				break;
			
		case 1 :
				price = 1300;
				System.out.println(".15세미만 ") ;
				break;
		default :
				System.out.println("........오동작 ") ;
				break;
		}
							
		if(mm==1) {
			System.out.println("현금 >>"+price);
		} else {
			System.out.println("카드할인 >>"+(price-dc));
		}
		
		
		//비만도 산출식
		//(체중/((키-100)*0.9))*100
		
		System.out.print("키 (cm) : ");

		double height=Double.parseDouble(scanner.nextLine());

		System.out.print("체중 (kg) : ");

		double weight=Double.parseDouble(scanner.nextLine());

		System.out.print("나이  : ");

		int age1=Integer.parseInt(scanner.nextLine());

		double bmi=weight*100/((height-100)*0.9);
		
		switch (age1) {

		case 0:case 1:case 2:case 3:

		case 4:case 5:case 6:case 7:

		System.out.println("나이가 너무 어립니다(8살이상)");

		break;
		

		case 8:case 9:case 10:case 11:

		case 12:case 13:case 14:case 15:

		case 16:case 17:case 18:case 19:

		if(bmi<95) {

		System.out.println("체중 미달");

		}else if(bmi>=95 && bmi<120) {

		System.out.println("정상");

		}else if(bmi>=120 && bmi<130) {

		System.out.println("경도비만");

		}else if(bmi>=130 && bmi<150) {

		System.out.println("중도비만");

		}else{

		System.out.println("고도비만");

		}

		break;

		default:

		if(bmi<100) {

		System.out.println("체중 미달");

		}else if(bmi>=100 && bmi<110) {

		System.out.println("정상");

		}else if(bmi>=110 && bmi<120) {

		System.out.println("과체중");

		}else if(bmi>=120 && bmi<150) {

		System.out.println("비만");

		}else{ 

		System.out.println("고도비만");

		}

		break;

		}
		
*/


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}




