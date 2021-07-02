package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {

	 private List <String> passengers;
	 private int maxpassanger;
	 private Date lastTimetookoff;
	 private Date lastTimelanded;
	
	 
	 public Plane (int maxpassanger)
	 {
		this.maxpassanger= maxpassanger;
		this.passengers =new ArrayList<>();
	 }
	 
public void onboard(String passanger)
{
	passengers.add(passanger);
	
	
	
}
	
public Date takeOff()
{
	return lastTimetookoff = new Date();
	
}
	
	
public Date land()
{
	lastTimelanded =new Date();
	return lastTimelanded;

}




public List<String> getpassangers()
{
	return passengers;
}

}
