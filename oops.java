//Learning OOPS

public class oops { 
	
	static String Employee_name; 
	static float Employee_salary; 

	static void set(String n, float p) { 
		Employee_name = n; 
		Employee_salary = p; 
	} 

	static void get() { 
		System.out.println("Employee name is: " +Employee_name ); 
		System.out.println("Employee CTC is: " + Employee_salary); 
	} 

	public static void main(String args[]) { 
		GFG.set("Rathod Avinash", 10000.0f); 
		GFG.get(); 
	} 
} 


//// Java program to Illustrate Creation of Object
// Using new Instance

// Main class
class opps {

	// Declaring and initializing string
	String name = "Hello";

	// Main driver method
	public static void main(String[] args)
	{
		// Try block to check for exceptions
		try {
			Class cls = Class.forName("GFG");
			// Creating object of main class
			// using instance method
			GFG obj = (opps)cls.newInstance();
			// Print and display
			System.out.println(obj.name);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (InstantiationException e) {

			e.printStackTrace();
		}
		catch (IllegalAccessException e) {

			e.printStackTrace();
		}
	}
}
//Error is there in this code :
import java.util.*;
class Rectangle{
    int length;
    int width;
    Rectangle(double length,double width){
	this.width=width;
        this.length=length;
    }
    double calculateArea(){
        return length*width;
    } 
}
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(system.in);
	    double length = sc.nextDouble();
	    double width = sc.nextDouble();
	    Rectangle rectangle = new Rectangle(length,width);
        double area= rectangle.calculateArea();
        System.out.println("Area of Rectangle is : "+area);
    }
}
