package AeroplaneSetGetScanner;

public class Boeing737 extends Aeroplane{
	
	Boeing737(double capasity, double maxheight, double weight, double price) {
		super(capasity, maxheight, weight, price);
		// TODO Auto-generated constructor stub
	}
	
	//getter
	
	public double capasity() {
		return this.getcapasity();
	}
			
	public double maxheight() {
		return super.getmaxheight();
	}
	
	public double weight() {
		return super.weight();
	}
			
	public double price() {
		return super.price();
	}
			
}
