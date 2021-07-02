package Activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> myList=new ArrayList<String>();
myList.add("Archana");
myList.add("Rahul");
myList.add("Libby");
myList.add("kiya");
myList.add("somu");

System.out.println("The array list is");
for(String i:myList)
	
{
	System.out.println(i);
	
}

System.out.println("The second element in array list is "+ myList.get(2));
System.out.println("The element present in array list is "+ myList.contains("kiya"));
System.out.println("The size of array list is "+ myList.size());
System.out.println("The Removed element in array list is "+ myList.remove(2));

System.out.println("The array list is ");
for(String i:myList)
	
{
	System.out.println(i);
	
}


	}

}
