package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		//1. Car Type ��ü�� �����ϰ� �������� c1 �̶�� ������ ��ƺ�����.
		Car c1; //Car c1 = null;
		//ctrl space bar ������ import �ؾ���. ���� ��Ű���� �ִ°� �ƴϿ���
		c1= new Car();
		//2. ���� c1�� ����ִ� �������� �̿��ؼ� drive() �޼ҵ带 ȣ���� ������. 
		c1.drive();
		//3. ���� c1�� ��� �ִ� �������� �̿��ؼ� name �̶�� �ʵ忡 ����� ���ڿ��� �ܼ�â�� ����� ������.
		System.out.println(c1.name);
		
		//4. c1 �� ����Ű�� ��ü�� name �̶�� �ʵ忡 "�����̵�" ���Կ����ڸ� �̿��ؼ� ������ ������.
		c1.name="�����̵�";
		System.out.println(c1.name);
	}
}









