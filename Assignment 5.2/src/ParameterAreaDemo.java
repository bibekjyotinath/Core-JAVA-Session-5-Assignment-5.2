import java.util.*;	//importing util class to use scanner method 

abstract class Figure{    //abstract class Figure
	double dim1;		//initialization of variable in double data type
	public abstract double Perimeter(double a, double b);		//abstract method Perimeter declaration 
	public abstract double Area(double ar, double ar1);		//abstract method Area declaration
}
class Circle extends Figure{			//creating a class Circle and extending Figure class 	
	public double Perimeter(double a, double b) {		//implementation of Perimeter abstract method
		return dim1 = 2 * 3.14 * a;			//performs the operation (formula for circle perimeter) and stores the value in dim1 and return the value to the calling method
	}
	public double Area(double ar, double ar1) {		//implementation of Area abstract method
		return dim1 = 3.14 * ar * ar;		//performs the operation (formula for circle area) and stores the value in dim1 and returns the value to the calling method
	}
}
class Rectangle extends Figure{     //creating a class Rectangle and extending Figure Class 
	public double Perimeter(double a, double b) {		//implementation of Perimeter abstract method
		double len, bre;			//decalration of variable in double data type
		len = a;					// assigning the value of a to len
		bre = b;					//assigning the value of b to bre
		dim1 = 2 * len * bre;	//performs the operation (formula for rectangle perimeter) and stores the value in dim1
		return dim1;				//returning the value of dim1 to the calling method
	}
	public double Area(double ar, double ar1) {			//implementation of Area abstract method
		double len, bre;		//declaration of variable in double data type
		len = ar;			//assigning the value of a to len
		bre = ar1;			//assigning the value of b to bre
		dim1 = len * bre;	//performs the operation (formula for rectangle area) and stores the value in dim1
		return dim1;			//returns the value of dim1 to the calling method
	}
}
class Triangle extends Figure{   //creating Triangle class and extending Figure class
	public double Perimeter(double a, double b) {  	//implementation of Perimeter abstract method
		dim1 = a + b + b;		//performs the operation (formula for triangle perimeter) and stores the value in dim1
		return dim1;				//returns the value of dim1 to the calling method 
	}
	public double Area(double ar, double ar1) {		//implementation of Area abstract method
		dim1 = 0.5 * ar * ar1;	//performs the operation (formula for rectangle perimeter) and stores the value in dim1
		return dim1;				//returns the value of dim1 to the calling method 
	}
}
public class ParameterAreaDemo {      //Main class 

	public static void main(String[] args) {		//main method of the program	
		
		double num, num1;		//declaration of variables in double data type
		
		Scanner sc = new Scanner(System.in);    //creating object of Scanner Class	
		
		Rectangle rec = new Rectangle();			//Creation of object of Rectangle class
		Triangle tri = new Triangle(); 			//Creation of object of Triangle class
		Circle cir = new Circle();				//Creation of object of Circle class
		System.out.println("Enter 1st value: ");		//Displaying of message on the console to get a number form user
		num = sc.nextDouble();		//storing the input from the user and storing it in num variable
		System.out.println("Enter 2nd value: ");    //Displaying of message on the console to get a number form user
		num1 = sc.nextDouble();		//storing the input from the user and storing it in num variable
		System.out.println("The Perimeter of Rectangle is: " +rec.Perimeter(num, num1));   //Displaying the output on console by calling the method of rectangle class using the object
		System.out.println("The Area of Rectangle is: " +rec.Area(num, num1));    //Displaying the output on console by calling the method of rectangle class using the object
		System.out.println("The Perimeter of Triangle is: " +tri.Perimeter(num, num1));   //Displaying the output on console by calling the method of triangle class using the object
		System.out.println("The Area of Triangle is: " +tri.Area(num, num1));    //Displaying the output on console by calling the method of triangle class using the object
		System.out.println("The Perimeter of Circle is: " +cir.Perimeter(num, num1));   //Displaying the output on console by calling the method of Circle class using the object
		System.out.println("The Area of Circle is: " +cir.Area(num, num1));    //Displaying the output on console by calling the method of Circle class using the object
		sc.close();    //closing the scanner class
	}

}
