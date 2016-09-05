package chapter01;

public class ConstantTest {

	public static void main(String[] args) {
		
		int number = 10;
		System.out.println( number );
		
		number = 20;
		System.out.println( number );
		//이게 변수 number의 값이 변하니까
		
		final int constNumber = 10;
		//constNumber = 20;
		//이렇게 값을 못바꾼다(다시 값 대입이 안됨)
		//이게 상수!
		System.out.println(constNumber);
		//상수는 변수와 구별하기 위해 첫자를 대문자로 써주고 _사용한다
		
		final int Const_Number = 10;
		System.out.println(Const_Number);
		System.out.println(Const_Number);
		System.out.println(Const_Number);
		System.out.println(Const_Number);
		System.out.println(Const_Number);
		System.out.println(Const_Number);
		System.out.println(Const_Number);
		System.out.println(Const_Number);
		System.out.println(Const_Number);
		System.out.println(Const_Number);
		System.out.println(Const_Number);
		System.out.println(Const_Number);
		System.out.println(Const_Number);
		System.out.println(Const_Number);
		System.out.println(Const_Number);
		System.out.println(Const_Number);	

//		double PI =3.1418;
//		double a1 = PI * r1* r1;
//		double a2 = PI * r2* r2;
//		double a3 = PI * r3* r3;
//		double a4 = PI * r4* r4;
		
		
	}

}
