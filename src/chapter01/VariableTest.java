package chapter01;

public class VariableTest {

	public static void main(String[] args) {
		int i = 10;
		short s = 100;
		char c = 'A';
		long l = 90;
		byte b = 20;
		float f = 3.14f;
		//double�� �ν��� �� �ձ� ������ �������̶�� ���� ����ϱ� ����
		//�ڿ� ���ڸ� �ٿ���
		double d = 3.14;
		boolean boo = true;
		String str = "Hello World";
		//������ ���� �Ŵ� �⺻�ڷ�
		//String�� �����ڷ�
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(b);
		System.out.println(f);
		System.out.println(d);
		System.out.println(boo);
		System.out.println(str);
		System.out.println(s);
		System.out.println(c);
		
		//reference type(������)
		//Circle Ŭ������ radius area������ �����´�
		Circle circle = new Circle();
		//circle�� Circle������ �����Ѵٰ� �����.
		circle.radius = 10;
		circle.area = 5 * 5 * 3.14;
		System.out.println(circle.area);
		System.out.println("���̴� " + circle.area + " �̴�.");
		
		String string = new String("hello");
		System.out.println(string);
		
		String string1 = "Hello";
		System.out.println(string1);
	//String�� �Ѵ� �����ϰ� ���� (���Ǹ� ����)
		//������ ù��°ó�� �ؾ� �Ǵ�
		
		
		//Character �� 
		char ch1 = 'A';
		char ch2 = '1';		//char ch3 = 49; �� ����
		char ch3 = 49;
		char ch4 = 1;
		int i2 = 1;
		//char�� int�� ������ 1 ���� ���� �����ϱ�?
		//char�� �ڵ带 �����ϹǷ� 1�� ���ڷ� �ν��Ͽ��� ������ 16���� 49�� ������ �Ͱ� ����
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(i2);
		System.out.println(ch2 + ":" + ch3);

	}

}
