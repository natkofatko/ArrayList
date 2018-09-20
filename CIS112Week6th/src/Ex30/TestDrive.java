package Ex30;

public class TestDrive {
	public static void main(String[] args) {

		LinkedCollection<String> test = new LinkedCollection<String>();

		System.out.println(test.isEmpty());
		System.out.println(test.toString());

		System.out.println(test.count("Orange"));
		test.removeAll("Orange");

		test.add("Apple");
		test.add("Banana");
		test.add("Kiwi");
		test.add("Pineapple");
		test.add("Pear");
		test.add("Orange");
		test.add("Banana");
		test.add("Banana");
		test.add("Apple");

		System.out.println("You enetered " + test.numElements + " elements to the list ");
		System.out.println("Added Elements: " + test.toString());
		System.out.println(test.contains("Apple"));
		System.out.println(test.isEmpty());
		System.out.println(test.isFull());
		System.out.println(test.count("Banana"));
		System.out.println(test.count("Apple"));
		System.out.println(test.toString());
		test.removeAll("Banana");
		System.out.println(test.toString());
		System.out.println(test.count("banana"));

	}
}
