package Activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Plane plane =new Plane(10);
		
		plane.onboard("Archana");
		plane.onboard("Pinki");
		plane.onboard("Rahul");
		plane.onboard("Aaira");
		
	System.out.println("Time take off"+ plane.takeOff());
	System.out.println("List of passanger"+ plane.getpassangers());
	Thread.sleep(5000);
	
	System.out.println("Time of landing"+ plane.land());
	
		
		
	}

}
