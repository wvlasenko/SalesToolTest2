package ua.test.saletool;

public class SaleToolRun {

	public static void main(String[] args) {
		SaleToolData data = new SaleToolData();
		displayGreeting();
		data.display();

	}

	private static void displayGreeting() {
		System.out.println("Hello happy sales people !");
		System.out.println("This app shows sales data");
		System.out.println("Test 1");
	}

}
