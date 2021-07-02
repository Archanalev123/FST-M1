package Activities;

public class Bicycle implements BicycleParts,BicycleOperations

{
	int gears;
	int currentSpeed;
	
	Bicycle(int gears,int currentSpeed)
	{
		this.gears=gears;
		this.currentSpeed=currentSpeed;
		
	}

	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		
		currentSpeed-=decrement;
		System.out.println("The currentSpeed is"+currentSpeed);
			
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
	

		currentSpeed+=increment;
		System.out.println("The currentSpeed is"+currentSpeed);
			
	}

	public void bicycleDesc()
	
	{
		System.out.println("The gears is"+gears);	
		System.out.println("The currentSpeed of bicycle"+currentSpeed);
		
	}
	
	
	
}
