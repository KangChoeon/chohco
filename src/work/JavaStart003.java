package work;

public class JavaStart003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
	//	1.����ڿ��� ��� 5  Ȥ�� ���� 5�� �Է� �޾� ���밪�� ����ϴ� ���α׷��� ����� ����.
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("(���5 �Ǵ� ����5) �Է� �޾� ���밪�� ���:");
		Double i = Double.parseDouble(scanner.nextLine());
		//int i = Integer.parseInt(scanner.nextLine());
		
		System.out.println (Math.abs(i));
*/			
		
		
	//2.�μ��� �Է¹޾� ������ �ƴϸ� ū�� ������ ����� ����.
/*		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("����� ���Է�1 >>");
		int k = Integer.parseInt(scanner.nextLine());
		System.out.println("����� ���Է�2 >>");
		int j = Integer.parseInt(scanner.nextLine());
		
		if(k==j)	{
			System.out.println("�μ��� ���� ");
		} else if(k>j) {
			System.out.println("�μ� �� ù��°�� �� ũ�� ");
		} else{ 
			System.out.println("�μ� ��  �ι�°�� �� ũ�� ");
			
		}
*/
		
		
	//3.� ���� ������ �������� �ٸ� ���� ������ �Ѵ�. 100�� 2�� ������ 0�̵ȴ�.
	//	����, 2�� 100�� ����̴�. ����ڿ��� ���ڸ� �ϳ� �Է¹޾� 126�� ������� �ƴ��� ����� ����.
/*	
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("����� ���Է�1 >>");
		int k = Integer.parseInt(scanner.nextLine());
		
		if((k%126)==0)	{
			System.out.println("126�� �����. ");
		
		} else{ 
			System.out.println("126�� ����� �ƴϴ�. ");
			
		}
*/		
					
	//4.������������ ������ �Է¹޾� ����� 80�̻��̸� �հ� ���ϸ� ���հ��� ����� ����.
/*
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("�������� >>");
		int kor = Integer.parseInt(scanner.nextLine());
		System.out.println("�������� >>");
		int eng = Integer.parseInt(scanner.nextLine());
		System.out.println("�������� >>");
		int mat = Integer.parseInt(scanner.nextLine());
		
		int sum=0;
		int avg=0;
		
		sum = kor+ eng + mat;
		
		if((sum/3) >= 80) {
			
			System.out.println("�հ�. ");
		} else {
			System.out.println("���հ�. ");
		}
		
*/	
/*		
	//5.����ڿ��� �Է¹������� 5�����̸� x+15 �ʰ� �̸� x+5 �Ѱ��� ��µǴ� ���α׷��� ����� ����.	
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("����ڼ� �Է� >>");
		int m = Integer.parseInt(scanner.nextLine());
		
		
		if((m <5) || (m > 15)) {
			System.out.printf ("x+5 = %d \n",5+m);
		} else {
			System.out.println(" ") ; 
		}
*/
	//1.�Է¹��� ���� 3�� ��� �̰ų� 7�� ����̸� ��3�Ǵ� 7�� ������� ��µǰ�,
	//2�� ����� �ǰ� 5�� ����� �Ǹ� ��2�� 5�� ������� ����ϰ� �ΰ��� ��� �� �����ϸ� 2������
	//����ϴ� ���α׷��� ����� ����.
/*
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("����ڼ� �Է� >>");
		int nn = Integer.parseInt(scanner.nextLine());
				
		if( ((nn%3)==0)|| ((nn%7)==0) && ((nn%2)==0) && ((nn%5)==0)) {
			System.out.printf("%d �ΰ��� ��� ���� [3�Ǵ� 7] [2��5] ���",nn);
		} else if (((nn%2)==0) && ((nn%5)==0)) {
			System.out.printf("%d �Է¤����� ���� 2 �� 5�� ���",nn);
		} else if(((nn%3)==0)||((nn%7)==0)) {
			System.out.printf("%d �Է¤����� ���� 3 �Ǵ� 7�� ���",nn);
		} else {
			System.out.println("........�������� �۴´�! ") ;
		}
*/		
	//.������ݰ���ϴ� ���α׷��� �����غ���. 15�� ���ϴ� 1300�� �ʰ��� 1600���̰�  ����ī��� �����ϸ� 100�� ������ �ش�	
		
	//15���̸� ���� 1300, ī�� 1200 [100������]
	//15���̻� ���� 1600, ī�� 1500 [100������]

/*		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("1.���� �Ǵ� 0.ī�� >>");
		int mm = Integer.parseInt(scanner.nextLine());
		System.out.println("1.15���̸�  0.15���̻� >>");
		int pp = Integer.parseInt(scanner.nextLine());
		int dc=100;
		int price=1600;
		
		switch(pp) {
		
		case 0 :
				price = 1600;
				System.out.println(".15���̻�") ;
				break;
			
		case 1 :
				price = 1300;
				System.out.println(".15���̸� ") ;
				break;
		default :
				System.out.println("........������ ") ;
				break;
		}
							
		if(mm==1) {
			System.out.println("���� >>"+price);
		} else {
			System.out.println("ī������ >>"+(price-dc));
		}
		
		
		//�񸸵� �����
		//(ü��/((Ű-100)*0.9))*100
		
		System.out.print("Ű (cm) : ");

		double height=Double.parseDouble(scanner.nextLine());

		System.out.print("ü�� (kg) : ");

		double weight=Double.parseDouble(scanner.nextLine());

		System.out.print("����  : ");

		int age1=Integer.parseInt(scanner.nextLine());

		double bmi=weight*100/((height-100)*0.9);
		
		switch (age1) {

		case 0:case 1:case 2:case 3:

		case 4:case 5:case 6:case 7:

		System.out.println("���̰� �ʹ� ��ϴ�(8���̻�)");

		break;
		

		case 8:case 9:case 10:case 11:

		case 12:case 13:case 14:case 15:

		case 16:case 17:case 18:case 19:

		if(bmi<95) {

		System.out.println("ü�� �̴�");

		}else if(bmi>=95 && bmi<120) {

		System.out.println("����");

		}else if(bmi>=120 && bmi<130) {

		System.out.println("�浵��");

		}else if(bmi>=130 && bmi<150) {

		System.out.println("�ߵ���");

		}else{

		System.out.println("����");

		}

		break;

		default:

		if(bmi<100) {

		System.out.println("ü�� �̴�");

		}else if(bmi>=100 && bmi<110) {

		System.out.println("����");

		}else if(bmi>=110 && bmi<120) {

		System.out.println("��ü��");

		}else if(bmi>=120 && bmi<150) {

		System.out.println("��");

		}else{ 

		System.out.println("����");

		}

		break;

		}
		
*/


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}




