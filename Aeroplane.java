package AeroplaneSetGetScanner;
import java.util.Scanner;

public class Aeroplane {
	Scanner scan = new Scanner(System.in);
	
    private double capasity, maxheight, weight, price;
	
	

	//Constructor
	Aeroplane(double capasity, double maxheight,double weight,double price){
		System.out.print("Enter the capasity of passengers : ");
		this.capasity = scan.nextDouble(); 
		System.out.print("Enter the Maximum Fly height : ");
		this.maxheight = scan.nextDouble(); 
		System.out.print("Enter the weight : ");
		this.weight = scan.nextDouble(); 
		System.out.print("Enter the price : ");
		this.price = scan.nextDouble();
		
	}
	
	
	//Getter method
	public double getcapasity() {
		return this.capasity;
	}
	
	public double getmaxheight() {
		return this.maxheight;
	}
	
	public double weight() {
		return weight;
	}
	
	public double price() {
		return price;
	}
	

}

