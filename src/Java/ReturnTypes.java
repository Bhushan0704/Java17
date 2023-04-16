package Java;
//We are making a Total Meal Bill with the overall tax and the tip which will be given
//Secondly we will return them by return type as of Line no 10
//Now we will Spilt the bill among the members
public class ReturnTypes {

	public static double calculateTotalMealPrice(double listedPrice, double taxRate, double tipRate) {
		double tip = tipRate * listedPrice;
		double tax = taxRate * listedPrice;
		double result = listedPrice + tip + tax;
		return result;
	}
	public static void main(String[] args) {
		double groupTotalMealCost = calculateTotalMealPrice(1, 10.80, 20.0);
		System.out.println("Total Meal Cost: " + groupTotalMealCost);
		
		double individualTotalMealCost = groupTotalMealCost/5;
		
		System.out.println("Total Individual Cost :" + individualTotalMealCost);
	}
}
