package test.main;

import test.mypac.Car;

public class MainClass03 {//public ������ �ٸ� ��Ű������ �ҷ��ͼ� �ᵵ �ȴ�.
	public static void main(String[] args) {
		//1. MyUtill Ŭ������ sendMessage() �޼ҵ带 ȣ���� ������.
		MyUtil.sendMessage();
		//2. MyUtill Ŭ������ version �̶�� �ʵ忡 ����� ���ڿ��� �ֿܼ� ����� ������.
		System.out.println(MyUtil.version);
		
		//3. Car Type ��ü�� �����ؼ� drive() �޼ҵ带 ȣ���� ������.
		Car c1 = new Car();
		c1.drive();
		
		//4. ������ ���� Car Type ��ü�� name �ʵ忡 ����� ���ڿ��� �ܼ�â�� ����غ�����.
		System.out.println(c1.name);
}
			
}
