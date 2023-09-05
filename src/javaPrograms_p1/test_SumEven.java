package javaPrograms_p1;

public class test_SumEven {
	
	public static void main(String[] args) {
		int count = 0;
		for(int i=1; i<=5; i++) {
			if(i%2==0) {
				count = count + i;
			}
		}
		System.out.println(count);
	}
}
