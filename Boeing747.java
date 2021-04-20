package AeroplaneSetGetScanner;

public class Boeing747 extends Aeroplane {

	Boeing747(double capasity, double maxheight, double weight, double price) {
		super(capasity, maxheight, weight, price);
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

