package Activities;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <Integer,String> colours= new TreeMap<Integer,String>();
		colours.put(1,"red");
		colours.put(2,"green");
		colours.put(3,"black");
		colours.put(4,"purple");
		colours.put(5,"green");
		
		System.out.println("The colours are " + colours);
		colours.remove(3);
		System.out.println("The colours are " + colours);
		if(colours.containsValue("purple"))
		{System.out.println("The purple colour exists");}
		else
		{System.out.println("The purple colour does not exists");}
		
		System.out.println("The size of Map is " + colours.size());
		
	}

}
