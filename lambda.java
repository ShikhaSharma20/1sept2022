package store.java;

public class lambda {

	
		public static void main(String[] args) {
	        lambdaTask tester = new lambdaTask();

	        //with type declaration
	        MathOperation addition = (int a, int b) -> a + b;

	        //without type declaration
	        MathOperation subtraction = (a, b) -> a - b;

	        //with return statement along with curly braces
	        MathOperation multiplication = (int a, int b) -> { return a * b; };

	        //without return statement and without curly braces
	        MathOperation division = (int a, int b) -> a / b;

	        System.out.println("66 + 8 = " + tester.operate (addition));
	        System.out.println("66 - 8 = " + tester.operate (subtraction));
	        System.out.println("66 x 8 = " + tester.operate (multiplication));
	        System.out.println("66 / 8 = " + tester.operate (division));


	    }

	    interface MathOperation {
	        int operation(int a, int b);
	    }


	    private int operate(MathOperation mathOperation) {
	        return mathOperation.operation(10, 5);
	    }
	