
public class exerciciofixacao1 {

	public static void main(String[] args) {

		String product1 = "computer";
		String product2 = "office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;

		// System.out.printf("computer, which price is " + price);
		System.out.printf("computer, which price is %.2f\n", price);

		System.out.printf("Measure with eight decimal places: %.6f\n", measure);
		System.out.printf("Rouded (three decimal places): %.3f\n", measure);

	}

}
