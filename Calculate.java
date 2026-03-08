import java.util.Scanner;

public class Calculate {

    // Enum representing tax brackets
    enum TaxBracket {
        LOW(0.10),
        MEDIUM(0.15),
        HIGH(0.20),
        VERY_HIGH(0.30);

        private final double rate;

        TaxBracket(double rate) {
            this.rate = rate;
        }

        public double getRate() {
            return rate;
        }
    }

    public static void main(String[] args) {

        // attributes
        double income;
        double taxWithholding;
        TaxBracket bracket;

        Scanner input = new Scanner(System.in);

        // ask user for weekly income
        System.out.print("Please enter your weekly income: ");
        income = input.nextDouble();

        // determine bracket
        if (income < 500) {
            bracket = TaxBracket.LOW;
        } else if (income < 1500) {
            bracket = TaxBracket.MEDIUM;
        } else if (income < 2500) {
            bracket = TaxBracket.HIGH;
        } else {
            bracket = TaxBracket.VERY_HIGH;
        }

        // calculate withholding
        taxWithholding = income * bracket.getRate();

        // display result
        System.out.println("Your weekly tax withholding: " + taxWithholding);

        input.close();
    }
}