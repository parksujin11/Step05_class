package test.main;

import test.mypac.Car;
import test.mypac.gura;

/*
 * 클래스의 역할
 * 
 * 1. static 멤버를 가지고 있는 역할
 * 2. 객체의 설계도 역할
 * 3. Data Type 역할
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//Car Type 객체의 참조값을 담을 지역변수 만들기
		Car car1=null;
		//Car 객체를 생성하고 참조값을 변수에 대입하기 
		car1=new Car();
	
		
		//Gura Type 객체의 참조값(키값)을 담을 지역 변수 만들기
		gura gura1=null;
		
		gura1=new gura();
		
		Car myCar;//myCar 라는 참조 변수 선언
		myCar = new Car(); // Car 라는 틀에 대한 객체 1 생성(myCar)
		
		Car yourCar = new Car();//Car라는 틀에 대한 객체2 생성(yourCar)
		// 클래스를  만들고 사용하기 위해서는 반드시 해당 클래스에 대한 객체를 생성해주어야 한다.
		//myCar와 yourCar 가 조금 다르지만 의미는 다르지 않다. 
		//다만, myCar 는 참조변수를 먼저 선언하고 객체를 생성한 것이지만
		//yourCar는 참조변수를 선언함과 동시에 개체를 생성하는것이다.
		
//		myCar.setCar("Red", 100, 4); //필드의 값을 가진다.
		/*myCar 가 참조하는 객체1의 setCar메소드 호출*/
		
	//객체는 저장소와 기능으로 나뉨->객체의 저장소 : 필드,  객체의 기능: 메소드 
		
	//new 로 새로운 객체를 계속 생성할 수 있다. 
	/*
	 * 클레스는 객체 들을 여러개 만들기 위한 하나의 틀이라고 생각하면 됨
	 * 붕어빵(객체)를 똑같이 굽는 기계가 클래스(class)가 되고
	 * 굽혀나오는 붕어빵이 객체가 되고 붕어빵속의 팥이나 슈크림은 필드가 된다.
	 * 붕어빵을 꺼내던가 속을 슈크림으로 채우던가 속을 조절하는 행위가 메소드가 된다.
	 * 이렇듯 클래스내에서는 여러가지의 필드와 메소드를 가진다.
	 * 	
	 */
		//객체의 필드 참조
		String a = car1.name;
		//객체의 메소드 호출 
		car1.drive();
	}

}
