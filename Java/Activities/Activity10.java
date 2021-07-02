package Activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> hs= new HashSet<String>();
		hs.add("Archana");
		hs.add("Rahul");
		hs.add("Pinki");
		hs.add("Kiya");
		hs.add("rima");
		hs.add("erny");
		
		System.out.println("The elements in hashlist");
		for(String i:hs)
		{
			System.out.println(i);
		}
			
		System.out.println("The elements removed in hashlist " + hs.remove("Archana"));
		
		System.out.println("The elements removed  in hashlist " + hs.remove("Tinki"));
		
		System.out.println("The elements Erny present in hashlist " + hs.contains("erny"));
		
		System.out.println("The elements in hashlist");
		for(String i:hs)
		{
			System.out.println(i);
		}
	}

	

}
