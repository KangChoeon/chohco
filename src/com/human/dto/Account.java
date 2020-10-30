package com.human.dto;


import java.util.Scanner;

class Account {
	public static int totalCount=0;
	public int money=0;
	public int accountNum=0;
	public int password=0;
 
  public void display(){
	System.out.println("계좌번호"+this.accountNum);
	System.out.println("잔고"+this.money);
  }
//생성자
    public Account() {
	Account.totalCount++;
}
    public Account(int accountNum,int password,int money) {
    this();
    this.accountNum=accountNum;
    this.password=password;
    this.money=money;
    }
    }

class Bank{
	public static java.util.Scanner sc=new java.util.Scanner(System.in);
	public int arrIndex=0;
	public Account[]arrAccount=new Account[10];
	
	public Bank() {
	}
	public void registerAccount(Account a) {
		arrAccount[arrIndex++]=a;
	}
	public void registerAccount() {
		System.out.println("계좌 가입 페이지");
		System.out.println("희망계좌번호>>");
		int accountNum=sc.nextInt();
		System.out.println("희망비밀번호>>");
		int password=sc.nextInt();
		System.out.println("입금금액>>");
		int money=sc.nextInt();
		boolean check=true;
		for(int i=0;i<arrIndex;i++) {
			if(arrAccount[i].accountNum==accountNum) {
				check=false;
				break;
				
			}
		}
		if(check) {
			arrAccount[arrIndex++]=new Account(accountNum,password,money);
		}else{
			System.out.println("이미 존재하는 계좌번호입니다.");
		}
	}
	//4.계좌검색
	
	public Account searchAccount(int accountNum) {
		Account account=null;
		for(int i=0;i<arrIndex;i++) {
			if(arrAccount[i].accountNum==accountNum) {
				account=arrAccount[i];
				break;
			}
		}
		return account;
			}
	//입금
	public void diposit() {
		System.out.print("입금계좌입력>>");
		int accountNum=sc.nextInt();
		
		Account p=searchAccount(accountNum);
		if(p==null) {
			System.out.println("없는 계좌입니다.다시확인해주세요,종료합니다");
			return;
			
		}
		System.out.print("입금금액입력");
		int money=sc.nextInt();
		p.money+=money;
		
		p.display();
	} 

		int accountNum=sc.nextInt();
		
		Account p=searchAccount(accountNum);
		if(p==null) {
			System.out.println("없는 계좌입니다.다 시확인해주세요,종료합니다.");
			return;
			
		}
		System.out.print("비밀번호>>");
		int password=sc.nextInt();
		if(p.password!=password) {
			System.out.print("비밀번호가 틀립니다 ,다시 확인해주세요,종료합니다.");
			return;
		}
		
		System.out.print("출금할 금액 입력>>");
		int money=sc.nextInt();
		if(p.money-money<0) {
			System.out.print("계좌에 금액이 부족합니다 다시 확인해주세요.");
		}else{
	    p.money-=money;
		}
		p.display();
	}
	public void checkMyAccount() {
		System.out.println("조회하실 계좌번호를 입력해주세요");
	    int accountNum=sc.nextInt();
	    
	    Account p=searchAccount(accountNum);
	    if(p==null) {
	    	System.out.println("없는 계좌입니다.다 시확인해주세요,종료합니다.");
	    	return;
	    }
	    System.out.print("비밀번호>>");
		int password=sc.nextInt();
		if(p.password!=password) {
			System.out.print("비밀번호가 틀립니다 ,다시 확인해주세요,종료합니다.");
			return;
	    }
		p.display();
	}
	
	
	public void Start() {
		System.out.println("안녕하세요,무엇을 도와드릴까요?");
		System.out.println("1.계좌등록 2.입금 3.출금 4.계좌조회 5.종료");
		int num=sc.nextInt();
		
		switch(num){
		case 1:
			registerAccount();
		break;
		case 2:
			diposit();
		break;
		case 3:
			widthraw();
		break;
		case 4:
			checkMyAccount();
		break;
		case 5:
			System.out.println("종료합니다.");
			return;
			default:
				System.out.println("잘못된 입력입니다");
		}
	}
}
		 
