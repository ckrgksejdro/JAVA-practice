package chanung.practice.chapter05.reference;

public class Reference {

	public static void main(String[]args) {
		
		//1. JVM 실행시 Runtime Date Area 생성
		//2. JVM 구동과 동시에 메소드 영역과 heap영역이 자동적으로 생성
		//3. MemoryExample(클래스 바이트 코드)로딩 
		//4. 메소드 영역에 클래스에 대한 내용이 올라감 (메소드의 코드,필드의 내용) 클래스가 그대로 올라가는것이 아니라 클래스를 분석한 내용이 올라감
		//5. main 스레드 생성 (메인 메소드를 실행시키는 코드 흐름을 말함)
		//6. main 스레드를 생성함과 동시에 JVM스택 생성
		//7. main()메소드 호출
		//8. 메소드를 호출하게 되면 JVM STACK영역에 프레임이 하나 생성이 됨,
		/*9. public static void main(String[]args){ 메소드의 매개변수가 프레임 내부에 생성이 됨 
		    int sum=0; 
		 14. if(sum==0){ 
			int v2 = 10; //v2는 main()메소드 프레임에 생성이 되고 10값이 저장이 됨
			int v3 = 20; //v3는 main()메소드 프레임에 생성이 되고 20값이 저장이 됨
			sum = add(v2,v3); // add라는 메소드를 호출해 v2와 v3를 인자값으로 전달을 함 그리고 리턴값을 sum에 저장을 함
							  // 메소드를 호출했기 때문에 JVM STACK영역에 프레임이 생성이 됨
							  // add메소드의 a매개변수에 v2의 값, b매개변수에 v3라는 값이 저장이 되면서 프레임에 저장이 됨
							  // add메소드의 중괄호가 끝나면 프레임이 제거가 됨
							  // sum의 값에 add메소드의 리턴값이 저장이 됨 (if문이 true라면)
							  // 
							     
			} // if의 중괄호가 끝나게 되면 main()메소드 프레임에 들어있던 v2변수와 v3변수가 지워지게 됨
			System.out.println(sum);
		}  main()메소드가 끝나기 때문에 변수 sum도 main()프레임에서 사라지게 됨   
		   main()메소드가 끝나게 되면 Runtime Date Area도 사라지게 됨
		 */
		//public static int add(int a,int b){return a+b;} 
		//10. string 배열 객체는 heap영역에 생성이 되고 하나의 주소값을 가짐 
		//11. args는 heap영역의 주소값을 참조하고 있음.
		//12. 9번의 int sum은 main()메소드 프레임 내부에서 생성이 됨
		//13. sum은 따로 값을 참조받지 않고 직접 0이라는값을 받게 됨
		//15. JVM이 종료가 되면서 메모리 영역이 모두 사라지게 됨
	
	}
}
