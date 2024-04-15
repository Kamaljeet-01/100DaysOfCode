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


Class:

In Java, a class is a blueprint or a template for creating objects.
It defines the properties (attributes) and behaviors (methods) that objects of that type will have.
Classes encapsulate data for the object and define the operations that can be performed on that data.
Object:

An object is an instance of a class.
It is a tangible entity that represents a specific instance of the class, with its own unique state and behavior.
Objects are created using the new keyword followed by the class name and may have their own distinct values for the class's properties.
Instance:

In the context of Java, an instance typically refers to a specific occurrence or realization of a class.
An instance is essentially a concrete manifestation of a class, representing one specific example of that class.
Each time you create a new object using a class constructor, you are creating an instance of that class.


public class Car {
    // Properties
    String make;
    String model;
    int year;
    
    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Method
    public void drive() {
        System.out.println("The " + year + " " + make + " " + model + " is driving.");
    }
}

// And creating objects (instances) of that class would look like this:
Car myCar = new Car("Toyota", "Camry", 2022);
Car anotherCar = new Car("Honda", "Accord", 2023);

// Calling method on objects
myCar.drive();
anotherCar.drive();
