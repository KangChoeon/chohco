package com.human.dto;


import java.util.Scanner;

class Account {
	public static int totalCount=0;
	public int money=0;
	public int accountNum=0;
	public int password=0;
 
  public void display(){
	System.out.println("���¹�ȣ"+this.accountNum);
	System.out.println("�ܰ�"+this.money);
  }
//������
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
		System.out.println("���� ���� ������");
		System.out.println("������¹�ȣ>>");
		int accountNum=sc.nextInt();
		System.out.println("�����й�ȣ>>");
		int password=sc.nextInt();
		System.out.println("�Աݱݾ�>>");
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
			System.out.println("�̹� �����ϴ� ���¹�ȣ�Դϴ�.");
		}
	}
	//4.���°˻�
	
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
	//�Ա�
	public void diposit() {
		System.out.print("�Աݰ����Է�>>");
		int accountNum=sc.nextInt();
		
		Account p=searchAccount(accountNum);
		if(p==null) {
			System.out.println("���� �����Դϴ�.�ٽ�Ȯ�����ּ���,�����մϴ�");
			return;
			
		}
		System.out.print("�Աݱݾ��Է�");
		int money=sc.nextInt();
		p.money+=money;
		
		p.display();
	} 

		int accountNum=sc.nextInt();
		
		Account p=searchAccount(accountNum);
		if(p==null) {
			System.out.println("���� �����Դϴ�.�� ��Ȯ�����ּ���,�����մϴ�.");
			return;
			
		}
		System.out.print("��й�ȣ>>");
		int password=sc.nextInt();
		if(p.password!=password) {
			System.out.print("��й�ȣ�� Ʋ���ϴ� ,�ٽ� Ȯ�����ּ���,�����մϴ�.");
			return;
		}
		
		System.out.print("����� �ݾ� �Է�>>");
		int money=sc.nextInt();
		if(p.money-money<0) {
			System.out.print("���¿� �ݾ��� �����մϴ� �ٽ� Ȯ�����ּ���.");
		}else{
	    p.money-=money;
		}
		p.display();
	}
	public void checkMyAccount() {
		System.out.println("��ȸ�Ͻ� ���¹�ȣ�� �Է����ּ���");
	    int accountNum=sc.nextInt();
	    
	    Account p=searchAccount(accountNum);
	    if(p==null) {
	    	System.out.println("���� �����Դϴ�.�� ��Ȯ�����ּ���,�����մϴ�.");
	    	return;
	    }
	    System.out.print("��й�ȣ>>");
		int password=sc.nextInt();
		if(p.password!=password) {
			System.out.print("��й�ȣ�� Ʋ���ϴ� ,�ٽ� Ȯ�����ּ���,�����մϴ�.");
			return;
	    }
		p.display();
	}
	
	
	public void Start() {
		System.out.println("�ȳ��ϼ���,������ ���͵帱���?");
		System.out.println("1.���µ�� 2.�Ա� 3.��� 4.������ȸ 5.����");
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
			System.out.println("�����մϴ�.");
			return;
			default:
				System.out.println("�߸��� �Է��Դϴ�");
		}
	}
}
		 
