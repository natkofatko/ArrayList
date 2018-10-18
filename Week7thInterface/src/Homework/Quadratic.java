package Homework;

import java.lang.*;
import java.text.Format;
import java.text.NumberFormat;
import java.util.ArrayList;

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.complex.ComplexFormat;

/**
 * 
 * @author natalia
 *
 */
public class Quadratic implements Comparable<Quadratic> {

	private double a;
	private double b;
	private double c;

	
	/**
	 * Default constructor which makes parabole y=x^2;
	 */
	public Quadratic() {
		this.a = 1;
		this.b = 0;
		this.c = 0;
	}

	/**
	 * Constructor accepting @param a @param b @param c
	 */
	public Quadratic(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	/**
	 * get the a value
	 * 
	 * @return the a
	 */
	public double getA() {
		return a;
	}

	/**
	 * @param a
	 *            Set the a value
	 */
	public void setA(double a) {
		this.a = a;
	}

	/**
	 * Get the b value
	 * 
	 * @return the b
	 */
	public double getB() {
		return b;
	}

	/**
	 * @param b
	 *            Set the b value
	 */
	public void setB(double b) {
		this.b = b;
	}

	/**
	 * Get the c value
	 * 
	 * @return the c
	 * 
	 */
	public double getC() {
		return c;
	}

	/**
	 * @param c
	 *            Set the c value
	 */
	public void setC(double c) {
		this.c = c;
	}

	public String toString() {
		return "\nf(x) = " + this.a + "x^2 + " + this.b + "x + " + this.c;
	}

	/**
	 * Compute the discriminant value
	 * 
	 * @return discriminant
	 */
	public double getDiscriminant() {
		double discriminant = Math.pow(this.b, 2) - (4 * this.a * this.c);
		return discriminant;
	}

	/**
	 * Check if equation has real roots
	 * 
	 * @return true or false
	 */
	public boolean hasRealRoots() {

		if (getDiscriminant() > 0) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Check if equation has complex roots
	 * 
	 * @return true or false
	 */
	public boolean hasComplexRoots() {

		if (getDiscriminant() > 0) {
			return false;
		} else {
			return true;
		}

	}

	/**
	 * Compute the value of real roots
	 * 
	 * @return [] value of real root1 and root2
	 */
	public double[] calculatesRealRoots() {

		double root1 = (-b - Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / 2.0 * this.a;
		double root2 = (-b + Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / 2.0 * this.a;

		return new double[] { root1, root2 };

	}

	/**
	 * *compute the value of the first derivative of the quadratic at any
	 * specific point x
	 * 
	 * @param x
	 * @return derivative
	 */
	public double slopeAtX(double x) {
		double derivitive = 2 * this.a * x + this.b;
		return derivitive;
	}

	// Calculate one root if discriminant ==0
	public double calculateOneRoot() {
		double root = -b / (2 * a);
		return root;
	}

	/**
	 * If discriminant is a negative number then the quadratic equation will
	 * have no Real solutions. Instead there will be two Complex number of the
	 * form a + bi. In order to get complex number we need to divide formula for
	 * computing roots into two parts: real part and imaginaryPart.
	 */
	public ArrayList<String> calculateComplexRoots() {
		double discriminant = Math.pow(this.b, 2) - (4 * this.a * this.c);
		double realPart = -b / (2 * this.a);
		double imaginaryPart = Math.sqrt(-discriminant) / (2 * this.a);

		// using printf method to get a specified standard format of complex
		// numbers
		/// String root1 = ("root1 = %.4f+%.3fi", realPart, imaginaryPart);
		System.out.println(" ");
		System.out.printf("root2 = %.4f-%.3fi", realPart, imaginaryPart);
		System.out.println(" ");

		return null;

	}

	/**
	 * 
	 * @return c1 and c2
	 */
	public Complex[] CalculateComplexNumbersUsingApacheCommons() {
		double discriminant = Math.pow(this.b, 2) - (4 * this.a * this.c);
		double realPart = -b / (2 * this.a);
		double imaginaryPart = Math.sqrt(-discriminant) / (2 * this.a);

		Complex c1 = new Complex(realPart, -imaginaryPart);

		Complex c2 = new Complex(realPart, imaginaryPart);
		return new Complex[] { c1, c2 };

	}

	/**
	 * Calculate the vertex of the parabola (x1,y1)
	 * 
	 * @return [] vertex
	 */
	public double[] getVertex() {

		double x1 = -b / 2 * this.a;
		double y1 = this.a * Math.pow(x1, 2) + this.b * x1 + this.c;

		return new double[] { x1, y1 };

	}

	/**
	 * 
	 * @param (x,y)
	 * @return
	 */
	public double[] evaluatePolonymialAtX(double x) {

		double[] xy = { x, this.a * Math.pow(x, 2) + this.b * x + this.c };
		//System.out.println("x: " + xy[0] + "  " + "y:" + xy[1]);
		return xy;  
	}

	@Override
	public int compareTo(Quadratic o) {

		if(this.a>o.getA())
			return 1;
		else if(this.a<o.getA())
		{
			return -1;
		}
		return 0;
	}

}
