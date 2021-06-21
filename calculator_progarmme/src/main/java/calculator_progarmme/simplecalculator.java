package calculator_progarmme;

public class simplecalculator {

	private static final String Assert = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		calculator11 cal= new calculator11();
		int result=cal.add(10,20);
		System.out.println("result is"+ result);
		
		
		calculator11 call= new calculator11();
		int result1=call.subtract(20,10);
		System.out.println("result is"+result1);
		
		
		calculator11 calc= new calculator11();
		int result2=calc.multiply(5,10);
		System.out.println("result is"+result2);
		
		calculator11 calm= new calculator11();
		int result3=calm.divide(10,2);
		System.out.println("result is"+result3);
	}

}
