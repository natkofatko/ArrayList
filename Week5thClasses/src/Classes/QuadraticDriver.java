package Classes;

public class QuadraticDriver {

	public static void main(String[] args) {

		
		Quadratic calc = new Quadratic(1,4 , 4
				); 
		
		System.out.println(calc.calculateDiscriminant());
		System.out.println(calc.checkForRealRoot());
		System.out.println(calc.calculateSecondRoot());
		System.out.println(calc.calculateFirstRoot());
		
		
	}

}
