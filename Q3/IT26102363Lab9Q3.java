public class IT26102363Lab9Q3 {
	
	public static int add(int num1, int num2){
		int sumAdd=num1+num2;
		return sumAdd;
	}
	
	public static int multiply(int num1, int num2){
		int sumMulti=num1*num2;
		return sumMulti;
	}
	
	public static int square(int num1){
		return multiply(num1, num1);
	}

    public static void main(String[] args) {
		int sum1=multiply(3, 4);
		int sum2=multiply(5, 7);
		int sum3=add(sum1, sum2);
		int sumFinal=square(sum3);
		
		int sum4=square(add(4, 7));
		int sum5=square(add(8, 3));
		int sumFinal2=add(sum4, sum5);
		
		System.out.println("Result of (3 ∗ 4 + 5 ∗ 7)^2\t:" + sumFinal);
		System.out.println("Result of (4 + 7)^2 + (8 + 3)^2\t:" + sumFinal2);
	}		
}