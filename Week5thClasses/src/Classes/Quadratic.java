package Classes;



public class Quadratic {
	
	private double a; 
	private double b; 
	private double c; 
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Quadratic [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	public Quadratic()
	{
		
	}
	public Quadratic(double a, double b, double c)
	{
		this.a=a;
		this.b=b;
		this.c=c; 
		
	}
	public double calculateDiscriminant()
	{
		double disc = b*b-(4*a*c); 
		return disc;
		}
	public double calculateFirstRoot()
	{
		double firstRoot= (-b-Math.sqrt(b*b-(4*a*c)))/2.0*a; 
		return firstRoot; 
	}
	public double calculateSecondRoot()
	{
		double secondRoot= (-b+Math.sqrt(b*b-(4*a*c)))/2.0*a; 
		return secondRoot; 
	}
	
	public boolean checkForRealRoot()
	{
		if(b*b-(4*a*c)<0)
		{return false;}
		else return true; 
			
		}
	/**
	 * @return the a
	 */
	public double getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(double a) {
		this.a = a;
	}
	/**
	 * @return the b
	 */
	public double getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(double b) {
		this.b = b;
	}
	/**
	 * @return the c
	 */
	public double getC() {
		return c;
	}
	/**
	 * @param c the c to set
	 */
	public void setC(double c) {
		this.c = c;
	}

	
	

}
