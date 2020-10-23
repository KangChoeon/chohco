package work;

public class new111 {

	public static void main(String[] args) {
		//for(int i=0; i<10;i++) {
		//System.out.println(i);
		//}
		
		//for(int i=0; i<10;i++) {
			//if(5) {
			//	continue;
			//}
			//System.out.println(i);
			//}
		
		//사용자가 1004를 입력할때까지 반복해보자.
		for(;;) {
			
			System.out.println(">>");
			int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
			if(a==1004) {
				break;
			}
			
		}
		System.out.println("종료");
		
		
		
    /*  while(true) {
			
			System.out.println(">>");
			int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
			if(a==1004) {
				break;
			}
		}*/
		
	}

}
