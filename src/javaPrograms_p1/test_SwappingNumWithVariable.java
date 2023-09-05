package javaPrograms_p1;

public class test_SwappingNumWithVariable {

	public static void main(String[] args) {

		int a = 10, b = 20;
		System.out.println("Before Swapping: " + "a - " + a + " ; " + "b - " + b);

		int t = a;
		a = b;
		b = t;

		System.out.println("After Swapping: " + "a - " + a + " ; " + "b - " + b);

	}
}
