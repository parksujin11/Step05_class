package test.mypac;

public class Car {
	//�Ϲ� �ɹ�(static�� �� ����) �ʵ� �����ϱ�(�ʵ�� ��ü �������� �����)
	//static �� �Ⱥ��� �Ϲ� �ɹ� �ʵ��  �������� . �� 
	public String name="�ҳ�Ÿ";
	//�Ϲ� �ɹ� �޼ҵ� �����ϱ�
	public void drive() {
		
		Car	a=this;
				
		System.out.println("�޷���~");
	}
	
	//�Ϲ� �ɹ� �޼ҵ� �����ϱ�
	//���� ��ü�� �Ǿ����� ���� �������� ����ų�� ���� ����� this 
	public void showInfo() {
		System.out.println("���� �̸�:"+this.name);
	}
}


