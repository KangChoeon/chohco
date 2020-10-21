package work;

public class JavaStart_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("안녕");
/*		
		int i = 1;
		
		if(i>0) { 
			System.out.println("i능 양수");
		} else if (i<0) {
			System.out.println("i능 음수");
		} else if (i==0) {
			System.out.println("i능 0");
		} else {
			System.out.println("i능 양수,음수,0 아님");
		}
*/		
		//5는 최우수 4는 우수 3은 보통 2,1,0은 불합격
		// ctrl+/ 주석 생성및 삭제
/*		
		int i=5;
		if(i==5) {
			System.out.println("최우스");
			
		}else if (i==4) {
			System.out.println("우스");
		}else if (i==3) {
			System.out.println("보통");
		}else {
			System.out.println("불합격");
		}
*/		
		//switch case문으로 변경해보자.
		//기본적으로 명확안 정수만 허용 
		///문자열 실수 허용하지 않음
		//최신프로그램언어나 자바에서 문장려이나 실수를 허용하기도함
		//swtich문은 범위 조회는 안된다.
		//미응시로 추가해보자. 미응시는 5 ~0 이외의 숫자가 들어오면 미응시로 표기한다.
/*
		int i=5;
		
		switch(i) {
		
		case 5 :
			System.out.println("최우스");
			break;
		case 4 :
			System.out.println("우스");
			break;
		case 3 :
			System.out.println("보통");
			break;
		default :
			System.out.println("불합격");
			break;	
		}
*/		

/*		
		int i=3;
		
		switch(i) {
		
		case 5 :
			System.out.println("최우스");
			break;
		case 4 :
			System.out.println("우스");
			break;
		case 3 :
			//System.out.println("복합격");
			//break;
		case 2 :
			//System.out.println("불합격");
			//break;
		case 1 :
			//System.out.println("불합격");
			//break;

		case 0 :
			System.out.println("불합격");
			break;
			
		default :
			System.out.println("미응시");
			break;	
		}	
		
*/
/*		
boolean isFlag1= true,isFlag2=true;

isFlag1=2>1; isFlag2=2>1;

if(isFlag1==true) {
	if(isFlag2==true) {
		System.out.println("1번 isFlag1은 true isFlag2는 true");
	} else {
		System.out.println("2번 isFlag1은 true isFlag2는 false");
	}
	
} else {
	if(isFlag2==true) {
		System.out.println("3번 isFlag1은 false isFlag2는 true");
	} else {
		System.out.println("4번 isFlag1은 false isFlag2는 false");
	}
}


//1~4번중 하나만 선택한다면
// 중복된 if문을 하나의 if문을 사용해서 다음과 같이 출력되도록 조건식을 만들어구해현해보자.
//1번만 출력되던지 아무것도 출력되지 않는다.
//2번만 울력되던지 아무것되


세수 중 하나만 100이 넘는 경우

		(a>100) && (b <100) || (c<100);

*/

		
		
/*		
		if(i>0) {
			System.out.println("1은양수");
		} else {
			if(i<0) {
				System.out.println("1은 음수");
			}else {
			if(i==0) {
				System.out.println("i은 0");
				
			} else {
				System.out.println("1은 양수, 음수, 0 아님");
			}
		}
		
		}	
*/		
		
	}

}
