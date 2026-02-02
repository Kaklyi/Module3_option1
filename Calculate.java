import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {

		// attributes
		double income;
		double taxWithholding;
		double taxRate;

		Scanner input = new Scanner(System.in);

		// ask user for their weekly income

		System.out.print("Please enter your weekly income: ");
		income = input.nextDouble();

		// income less than 500 is going be a 10% tax
		if (income < 500) {
			taxRate = 0.10;
		}
		// income between 500 and 1500 is 15% tax
		else if (income >= 500 && income < 1500) {
			taxRate = 0.15;
		}
		// income between 1500 and 2500 is 20%
		else if (income >= 1500 && income < 2500) {
			taxRate = 0.20;
		}
		// any other is going to be income higher than 2500 is 30% tax rate
		else {
			taxRate = 0.30;
		}

		// multiply income with the percentage to get tax withholdings
		taxWithholding = income * taxRate;
		System.out.println("Weekly tax withholding: " + taxWithholding);

	}
}
