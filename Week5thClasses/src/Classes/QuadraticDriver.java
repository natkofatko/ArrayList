package Classes;

public class QuadraticDriver {

	public static void main(String[] args) {

		Quadratic quadratic = new Quadratic(1, -2, -8);
		double disc = quadratic.getDiscriminant();

		// condition for real and different roots
		if (disc > 0) {
			double rootResult[] = quadratic.calculatesRealRoots();
			System.out.println("root 1: " + rootResult[0] + " root 2: " + rootResult[1]);

			// Condition for real and only one root
		} else if (disc == 0) {
			System.out.println(quadratic.calculateOneRoot());
			// condition for complex number roots
		} else if (disc < 0) {
			quadratic.calculateComplexRoots();
		}

		double vextor[] = quadratic.getVertex();
		System.out.println("Vertex: " + vextor[0] + " :" + vextor[1]);

		System.out.println(quadratic.hasComplexRoots());

		System.out.println(quadratic.hasRealRoot());

		System.out.println(quadratic.slopeAtX(2));

		System.out.println(quadratic.evaluatePolonymialAtX(2));

	}
}
