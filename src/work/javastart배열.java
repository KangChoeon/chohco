
package work;

import java.util.Arrays;

import com.human.dto.Human;

public class javastart¹è¿­ {

	//int arr1[]=new int[3];
	int arr1[]={1,2,3};
	arr1[1]=5;
	System.out.println(arr1[1]);
	//int arr2[]=new double[4];
	double arr2[]={1.1,2.1,3.1,4.1};
	arr2[0]=1.5;
	System.out.println(arr2[0]);
	
	String arr3[]= {"°­¾ÆÁö","°í¾çÀÌ","ºØ¾î"};
	arr3[2]="ÇÜ½ºÅÍ";
	System.out.println(arr3[0]);
	
	Human arr4[]=new Human[3];
	//arr4[0]=new Human();
	//arr4[0].name="È«±æµ¿";
	//arr4[0].age=26;
	//arr4[0].height=155.5;
	
	Human arr4[0]=new Human("È«±æµ¿",26,155.5);
	System.out.println(arr4[0]);

	arr4[1]=new Human();
	arr4[1].name="È«±æ³²";
	arr4[1].age=22;
	arr4[1].height=185.5;
	
	
	arr4[2]=arr4[0];
	
	
	System.out.println(arr1);
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr4));
	System.out.println(arr4[0]);
	
	arr4[1].name="È«±æ³²";
	arr4[1].age=22;
	arr4[1].height=185.5;
	
	System.out.println(arr4[0]==arr4[1]);
	System.out.println(arr4[0].equals(arr4[1]));
	
	Human arr4[0]=new Human("È«±æµ¿",26,155.5);