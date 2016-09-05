package chapter01;

public class VariableTest {

	public static void main(String[] args) {
		int i = 10;
		short s = 100;
		char c = 'A';
		long l = 90;
		byte b = 20;
		float f = 3.14f;
		//double로 인식할 수 잇기 때문에 작은값이라는 것을 명시하기 위해
		//뒤에 문자를 붙여줌
		double d = 3.14;
		boolean boo = true;
		String str = "Hello World";
		//빨갛게 변한 거는 기본자료
		//String은 참조자료
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(b);
		System.out.println(f);
		System.out.println(d);
		System.out.println(boo);
		System.out.println(str);
		System.out.println(s);
		System.out.println(c);
		
		//reference type(참조형)
		//Circle 클래스의 radius area변수를 가져온다
		Circle circle = new Circle();
		//circle이 Circle변수를 참조한다고 보면됨.
		circle.radius = 10;
		circle.area = 5 * 5 * 3.14;
		System.out.println(circle.area);
		System.out.println("넓이는 " + circle.area + " 이다.");
		
		String string = new String("hello");
		System.out.println(string);
		
		String string1 = "Hello";
		System.out.println(string1);
	//String은 둘다 가능하게 해줌 (편의를 봐줌)
		//원래는 첫번째처럼 해야 옳다
		
		
		//Character 형 
		char ch1 = 'A';
		char ch2 = '1';		//char ch3 = 49; 과 같다
		char ch3 = 49;
		char ch4 = 1;
		int i2 = 1;
		//char와 int에 저장한 1 들은 무슨 차이일까?
		//char은 코드를 저장하므로 1을 문자로 인식하였기 때문에 16진수 49를 저장한 것과 같다
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(i2);
		System.out.println(ch2 + ":" + ch3);

	}

}
