package com.human.ex;

import java.util.Scanner;

public class BankClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int listCount=3;
		String id[]=new String[100];
		String pw[]=new String[100];
		double account[]=new double[100];
		
		id[0]="a1";id[1]="a2";id[2]="a3";
		pw[0]="a1";pw[1]="a2";pw[2]="a3";
		account[0]=1;account[1]=2;account[2]=3;
		
		String inputId=null;
		String inputPw=null;
		int indexCount=0;
		
		while(true) {
		System.out.println("아이디와 pw를 입력하시오");	
		System.out.println("아이디>>");	
		inputId=sc.nextLine();
		System.out.println("Pw>>");
		inputPw=sc.nextLine();
		
		
		if(inputId==null) {
		
		}else if(inputId.equals("exit")) {
			break;
		}else if(inputId.equals("admin")&&inputPw.equals("admin")) {
			boolean isAdminLogin=true;
		
			while(isAdminLogin) {
			System.out.println("관리자 계정");
			System.out.println("1.계정추가 2.계정삭제 3.모든사용자 정보확인"); 
			System.out.println("4.id로 특정 사용자 정보 확인5.종료");
			System.out.println("메뉴입력");
			int selectNum=Integer.parseInt(sc.nextLine());
			int i;
			switch(selectNum) {
			case 1:

				System.out.println("추가할 사용자 정보 입력");
				System.out.println("아이디>>");
				id[listCount]=sc.nextLine();
				System.out.println("pw>>");
				pw[listCount]=sc.nextLine();
			    account[listCount]=0;
				listCount++;
				System.out.println("사용자가 추가되었습니다");
			break;
			case 2:
				System.out.println("삭제할 사용자 정보 입력");
				System.out.println("아이디>>");
				String deleteId=sc.nextLine();
				int findIndex=-1;
				for(int i=0;i<listCount;i++) {
					if(id[i].equals(deleteId)) {
						findIndex=i;
						break;
					}
					
				}
				if(findIndex<0) {
					System.out.println("없는 아이디입니다.");
				}else{
					for(int i=findIndex;i<id.length-1;i++) {
						id[i]=id[i+1];
						pw[i]=pw[i+1];
						account[i]=account[i+1];
					}
					listCount--;
					System.out.println("삭제되었습니다.");
					
				}
				break;
			case 3:
				System.out.println("모든사용자 정보 출력:");
			 for(int i=0;i<listCount;i++)
				 System.out.println(i+"번---------------");
				 System.out.println("아이디>>"+id[i]);
						
						System.out.println("pw>>"+id[i]);
						System.out.println("account>>"+id[i]);
			}
			if(listCount==0) {
				System.out.println("데이터가없습니다");
			}
				break;
			case 4:
				System.out.println("찾을 아이디를 입력하세요");	
				System.out.println("아이디>>");	
				String findId=sc.nextLine();
				boolean isFind=false;
				
				 for(int i=0;i<listCount;i++) {
					 if(id[i].equals(findId)) {
					 System.out.println("아이디>>"+id[i]);
					 System.out.println("pw>>"+id[i]);
					 System.out.println("account>>"+id[i]);
				}
		}
		if(!isFind) {
			System.out.println("없는아이디입니다");
		}
		// int i=0;

		// for(;i<listCount;i++) {

		// if(id[i].equals(findId)) {

		// System.out.println("아이디>>"+id[i]);

		// System.out.println("pw>>"+id[i]);

		// System.out.println("account>>"+id[i]);

		// }

		// }

		// if(i==listCount) {

		// System.out.println("없는 아이디 입니다.");

		// }


				break;
			case 5:
				isAdminLogin=false;
				inputId=null;
				break;
			default:
				System.out.println("잘못된 아이디입니다");
		    }
			}//isAdminLogin종료
			
		
			
			
			
		}else{//일반 사용자 로그인
			//존재하는 사용자인가? 
			//존재하는 사람의indexCount는 무엇인가?
			boolean isLogin=false;
			for(int i=0;i<id.length;i++) {
				if(id[i]!=null&&id[i].equals(inputId)&&pw[i].equals(inputPw)) {
					//if(id[i].equals(inputId&&id[i]!=null){
				
					isLogin=true;
					indexCount=i;
					break;
				}
					
			}
			
			System.out.println(indexCount
					+":"+inputId+":"+id[indexCount]);
			
			
			if(isLogin) {
				//로그인 성공
				while(isLogin) {
					System.out.println(inputId+
							"님이 로그인 하였습니다.");
					System.out.println("1.입금 2.출금 3.확인 4.종료 >>");
					
				int selectNum1=Integer.parseInt(sc.nextLine());
				switch(selectNum1) {
				case 1:
			System.out.println("1.입금 , 입금할 금액을 입력>>");
			account[indexCount]
				+=Double.parseDouble(sc.nextLine());
			System.out.println(inputId
				+"님의 현재입금액:"+account[indexCount]);

				break;
				case 2:
			System.out.println("2.출금 , 출금할 금액을 입력>>");
			account[indexCount]
				-=Double.parseDouble(sc.nextLine());
			System.out.println(inputId
				+"님의 현재입금액:"+account[indexCount]);
				break;
				case 3:
			System.out.println(inputId
				+"님의 현재입금액:"+account[indexCount]);
				break;
				case 4:
			System.out.println("로그아웃 되었습니다.");
			inputId=null;
				isLogin=false;
				break;
				default:
			System.out.println("잘못된 입력입니다.");
				}
				}
				}else{
				inputId=null;
				}


				
			
			
			}
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
				//String loginId="";
				//String loginId=null;
				//loginId.equals(null)
				//loginId.equals("null")
				//loginId==null
		          		
				
				//System.out.println(loginId.toString());
}
}

			
			

