package variable02;

public class Variable04 {

	public static void main(String[] args) {
		System.out.printf("%d\n", 5);
		int num = 10;
		System.out.printf("%d\n", num);
		
		System.out.printf("%f\n", 3.0);
		System.out.printf("%c\n", 'b');
		System.out.printf("%s\n", "abckdls");
		System.out.println("---------------------");
		
		System.out.format("%d\n", 5);
		num = 10;
		System.out.format("%d\n", num);
		
		System.out.format("%f\n", 3.0);
		System.out.format("%c\n", 'b');
		System.out.format("%s\n", "abckdls");
		System.out.println("====================");
		
		// 약간 사용하는 문법
		// 8진수로 출력
		System.out.printf("%o\n", 9);
		
		// 16진수로 출력
		System.out.printf("%x\n", 15);
		System.out.printf("%X\n", 15);
		
		
		System.out.printf("%6.4f\n", 1.234567);
		System.out.printf("%7.4f\n", 12.34567);
		
		// 가장 많이 사용하는 문법
		System.out.printf("%.3f", 1435.345678);
		System.out.format("%.3f", 1435.345678);
	}
}
