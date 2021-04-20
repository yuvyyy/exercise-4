package AeroplaneSetGetScanner;

public class Main {

	public static void main(String[] args) {
		
		Aeroplane X= new Aeroplane(165, 14567, 154678, 1345678);
		System.out.println("-------------------------------Boeing737----------------------------------");
		System.out.println("Aeroplane Details  " + X.getcapasity()+ " Passengers. "+ X.getmaxheight()+" ft. "+ X.weight()+" KG.  RM" + X.price());
		
		System.out.println();
		
		Boeing737 A = new Boeing737(334, 16546, 164734, 1564876);
		System.out.println("-------------------------------Boeing737----------------------------------");
		System.out.println("Aeroplane Details  " + A.getcapasity()+ " Passengers. "+ A.getmaxheight()+" ft. "+ A.weight()+" KG.  RM" + A.price());
		
		
		System.out.println();
		
		Boeing747 B = new Boeing747(345, 17443, 17683, 1987879);
		System.out.println("-------------------------------Boeing747-----------------------------");
		System.out.println("Aeroplane Details  " + B.getcapasity()+ " Passengers. "+ B.getmaxheight()+" ft. "+ B.weight()+" KG.  RM" + B.price());
		

	}

}