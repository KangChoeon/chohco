package com.human.ex;

import java.util.Arrays;

import com.human.dto.*;
import com.human.dto.Human;

public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*int a[]= {0,1,2,3};
      int b[];
      b=a;
      b[1]=10;
      System.out.println(a[1]);//10
     //a 0,10,2,3
     //c 0,10,2,3
    
      //공유되서 10이 나온다.
      //a 0,1,2,3
      //c 0,=0,10,2,3
      int c[]=new int[4];
      for(int i=0;i<a.length;i++) {
    	  c[i]=a[i];
    	  
      }
      
      c[1]=20;
      System.out.println(a[1]);//10*/
		
		Human arr1[]=new Human[2];
		arr1[0]=new Human("홍길동",10,155.5);
		arr1[1]=new Human("홍길남",10,155.5);
	   Human arr2[]=arr1;
	   Human arr3[]=new Human[2];
	   for(int i=0;i<arr3.length;i++) {
		arr3[i]=arr1[i];
	   }
	   //홍길남 나이 10을 20으로 바꾸자.
	   	arr1[1].age=20;
		System.out.println(arr1[1].age);//20
		System.out.println(arr2[1].age);//20
		System.out.println(arr3[1].age);//20
	
	}

}
