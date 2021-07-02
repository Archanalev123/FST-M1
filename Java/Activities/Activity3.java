package Activities;

public class Activity3 {

	public static void main(String[] args) {
		double seconds= 1000000000;
		double earth=31557600;
		double Mercury=0.2408467;
		double venus=0.61519726;
		double Mars=1.8808158;
		double Jupiter=11.862615;
		double Satarn=29.447498;
		double uranus=84.016846;
		double Nepturn=164.79132;
		System.out.println("Age of Murkery:"+ seconds/earth/Mercury);
		System.out.println("Age of venus:"+ seconds/earth/venus);
		System.out.println("Age of Mars:"+ seconds/earth/Mars);
		System.out.println("Age of Jupiter:"+ seconds/earth/Jupiter);
		System.out.println("Age of Satarn:"+ seconds/earth/Satarn);
		System.out.println("Age of uranus:"+ seconds/earth/uranus);
		System.out.println("Age of Nepturn:"+ seconds/earth/Nepturn);
		System.out.println("Age of Earth:"+ seconds/earth);
	
		

	}

}
