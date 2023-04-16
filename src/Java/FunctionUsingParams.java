package Java;

public class FunctionUsingParams {
	public static void calculateTotalMealPrice(double listedPrice, double taxRate, double tipRate) {
	double tip = tipRate * listedPrice;
	double tax = taxRate * listedPrice;
	double result = listedPrice + tip + tax;
	System.out.println("Your total meal price is :" + result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateTotalMealPrice(1, 10.80, 20.0);
	}

}
