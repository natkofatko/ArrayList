package Homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;




public class QuadraticDriver {

	public static void main(String[] args) {

		Quadratic q1 = new Quadratic(8, 4, 5);
		Quadratic q2 = new Quadratic(6, 4, 5);
		Quadratic q3 = new Quadratic(5, 4, 5);

		q1.compareTo(q2);
		q1.compareTo(q3);
		q3.compareTo(q2);

		ArrayList<Quadratic> list1 = new ArrayList<Quadratic>();
		list1.add(q1);
		list1.add(q2);
		list1.add(q3);

		Collections.sort(list1);
		System.out.println("List after sorting");
		for (Quadratic qList : list1)
			System.out.println(qList);

		Quadratic[] qArray = new Quadratic[] { q1, q2, q3 };
		Arrays.sort(qArray);
		for (Quadratic List2 : qArray)
			System.out.println(List2);

	}
}
