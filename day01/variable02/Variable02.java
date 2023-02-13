package variable02;

public class Variable02 {

	public static void main(String[] args) {
		int x = 10;
		double pi = 3.141519;
		char ch = 'a';	// 반드시 1글자만, 외따옴표
		boolean bool = false;
		String str = "abcdefg";	// 안넣어도되고 1글자이상이어도됨
		
		System.out.println(x);
		System.out.println(pi);
		System.out.println(bool);
		System.out.println(str);
		System.out.println("------------------");
		
		bool = 50 > 40;
		System.out.println(bool);
		System.out.println("==================");
		
		// long형은 반드시 뒤에 L자를 붙여줌 안그러면 int로 인식
		long long1 = 1234567838293847389L;
		
		// float형은 뒤에 f를 붙여줌
		float fl = 45.372f;
	}
}
