package work;

import java.util.Scanner;

public class �ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*����1 while
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
		System.out.println("����");
		*/
/*����2 for
		
	for(int i=0;i<101;i++){
		 if(i%2==0) {
			 System.out.println(i);
		 }
	}*/
	/*����3
	    Scanner s=new Scanner(System.in);	
		System.out.println("�����");
		
		System.out.println("a>>");
		int a=s.nextInt();
		System.out.println("b>>");
		int b=s.nextInt();
		
		
		System.out.println("����� %s":"+b);*/
	
		
	    
/*����4

   Scanner s=new Scanner(System.in);
   int temp=0;
   
		System.out.println("�ִ�����");
		
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
		System.out.println("�ִ�����:"+b);
		*/
	

		
		
/*����5 �ٽ�
		  int a ;
	        int sum = 0;
	        boolean flag = true;
	        
	        System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���.");
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
	        System.out.println("�հ�� "+sum+"�Դϴ�.");
	        System.out.println("���α׷��� �����մϴ�.");
	        sc.close();
	        System.exit(0);
	        */
		
	//����6
		
	//����7
	
  
		/*����8
		  Scanner s=new Scanner(System.in);	
			System.out.println("���� ū���� ������");
			
			System.out.println("a>>");
			int a=s.nextInt();
			System.out.println("b>>");
			int b=s.nextInt();
			System.out.println("c>>");
			int c=s.nextInt();
			if((a>b)&&(a>c)) {
				System.out.println("���� ū ���� a:"+a);
			}
				else if((b>a)&&(b>c)) {
					System.out.println("���� ū ���� b:"+b);
					}
						else if((c>b)&&(c>a)) {
							System.out.println("���� ū ���� c:"+c);
						}
							
							if((a<b)&&(a<c)) {
								System.out.println("���� ���� ���� a:"+a);
							}
								else if((b<a)&&(a<c)) {
									System.out.println("���� ���� ���� b:"+b);
								}
									else if((c<b)&&(c<a)) {
										System.out.println("���� ���� ���� c:"+c);
								
									}*/
		
		/*����9�ٽ�
		for(;;) {
		Scanner s=new Scanner(System.in);	
		System.out.println("���� �����Է�(100���Ϸ� �����ʽÿ�)");
		
		System.out.println("a>>");
		int a=s.nextInt();
	
		
		
		if(a<60) {
			break;
		}
		
	}
	System.out.println("����");*/
		
		/*����12
		int sum=0;
		Scanner s=new Scanner(System.in);	
		System.out.println("�� �� ������ ���� ���մϴ�.");
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
		System.out.println("�� ����"+sum+"�Դϴ�");*/
		
		
		
	

		
	    }
		
	
	}


