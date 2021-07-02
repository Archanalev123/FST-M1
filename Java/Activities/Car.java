package Activities;

public class Car {

	String colour = "Black";
		String transmission="Automatic";
		int make=70;
		int tyers;
		int door;
		
		public Car()
		{
		this.tyers=4;
		this.door=4;
		}
		
		public void displayCharacteristics()
		{
			
			System.out.println("Colour=" +colour)	;
			System.out.println("transmission=" + transmission)	;
			System.out.println("make=" + make)	;
			System.out.println("tyers=" + tyers)	;
			System.out.println("door=" + door)	;
			
		}
		public void accelarate()
		{
			System.out.println("Car is moving forward.")	;
		}
		
		public void brake()
		{
			System.out.println("Car has stopped.")	;
			
		}
		
}
