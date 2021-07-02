package Activities;

import java.util.Arrays;

public class Activity4 {
	
	
	static void func(int arry[])
	
	{
		 int size = arry.length, i;
	        
	        for (i = 1; i < size; i++) {
	            int key = arry[i];
	            int j = i - 1;
	            
	            while (j >= 0 && key < arry[j]) {
	                arry[j + 1] = arry[j];
	                --j;
	            }
	            arry[j + 1] = key;
	        }
				
		
		
		System.out.println(Arrays.toString(arry));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arry = {10,45,3,98,6,18};
		

		
	
		System.out.println(Arrays.toString(arry));
		func(arry);
		
	
			
			
			
		
		
	

}
}
