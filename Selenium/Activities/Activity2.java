package Activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] arry = {10,77,10,54,-11,10};
 
 int searchitem=10;
 int totalsum=0;

 
 
for (int i:arry)
 {
	if(i==searchitem)
			{
		totalsum+=i;
	
			}
 }
	

	if (totalsum==30)
		System.out.println("Value is equal to 30");
	else
		System.out.println("Value is not equal to 30");	
}
}
