package test.mypac;

public class Car {
	//일반 맴버(static이 안 붙은) 필드 정의하기(필드는 객체 데이터의 저장소)
	//static 이 안붙은 일반 맴버 필드는  참조값에 . 찍어서 
	public String name="소나타";
	//일반 맴버 메소드 정의하기
	public void drive() {
		
		Car	a=this;
				
		System.out.println("달려요~");
	}
	
	//일반 맴버 메소드 정의하기
	//내가 객체가 되었을때 나의 참조값을 가리킬때 쓰는 예약어 this 
	public void showInfo() {
		System.out.println("차의 이름:"+this.name);
	}
}


