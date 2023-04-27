package Java;

public class Traingle {
		//Constructor in Java
		//creating a traingle
		//Constructor has a name same as a class name
		//Constructor may or maynot take inputs
		//Each param doesnt have same attribute
		//with params we have appropraite values
		static int nunOfSides = 3; 
		double base;
		double height;
		double sideLenOne;
		double sideLenTwo;
		double sideLenThree;
		
		//Constructor
		
		public Traingle(double base,double height,double sideLenOne,double sideLenTwo,double sideLenThree) {
			this.base = base;
			this.height = height;
			this.sideLenOne = sideLenOne;
			this.sideLenTwo = sideLenTwo;
			this.sideLenThree = sideLenThree;
		}
		//Area of a trainlge
		public double findArea() {
			return (this.base * this.height) / 2;
		}
		public static void main(String[] args) {
			Traingle traingleA = new Traingle(15, 8, 15, 8, 17);
			
			Traingle traingleB = new Traingle(3, 2.598, 3, 3, 3);
			
			//findArea is an instance method
			//instance methods are often reffered to as non-static methods
			double traingleAArea = traingleA.findArea();
			System.out.println(traingleAArea);
			//Instances variables
			System.out.println(traingleA.base);
			
			System.out.println(Traingle.nunOfSides);
		}
	}


