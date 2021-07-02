package Activities;

public class MountainBike extends Bicycle

{
	int seatheight;
	MountainBike(int gears, int currentSpeed,int startheight) {
		super(gears, currentSpeed);
		// TODO Auto-generated constructor stub
		seatheight=startheight;
	}
	
	
	public void setHeight(int newvalue)
	
	{
		
		seatheight = newvalue;
	}

	@Override 
public void bicycleDesc()
	
	{
	
		System.out.println("The seat height of bicycle"+seatheight);
		
	}
}
