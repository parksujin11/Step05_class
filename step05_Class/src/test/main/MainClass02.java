package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		//1. Car Type 객체를 생성하고 참조값을 c1 이라는 변수에 담아보세요.
		Car c1; //Car c1 = null;
		//ctrl space bar 눌러서 import 해야함. 같은 패키지게 있는게 아니여서
		c1= new Car();
		//2. 변수 c1에 담겨있는 참조값을 이용해서 drive() 메소드를 호출해 보세요. 
		c1.drive();
		//3. 변수 c1에 담겨 있는 참조값을 이용해서 name 이라는 필드에 저장된 문자열을 콘솔창에 출력해 보세요.
		System.out.println(c1.name);
		
		//4. c1 이 가리키는 객체의 name 이라는 필드에 "프라이드" 대입여산자를 이용해서 대입해 보세요.
		c1.name="프라이드";
		System.out.println(c1.name);
	}
}









