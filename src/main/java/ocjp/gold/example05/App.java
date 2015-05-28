package ocjp.gold.example05;

public class App {
	public static void main(String[] args) {

		String fruit = "apples";
		fruit = fruit.replace(fruit, "oranges");

		System.out.printf("I have %2$d %s and %d bananas.%n", fruit, 1 + 3, 5);
		System.out.printf("I have %3$d %s and %d bananas.%n", fruit, 4, 2 + 3);

	}
}
