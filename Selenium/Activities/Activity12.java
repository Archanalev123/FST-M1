package Activities;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Addable ad1 = (a, b) -> (a + b);
	        System.out.println(ad1.add(60, 70));
	 
	        // Lambda expression with return keyword.
	        Addable ad2 = (int a, int b) -> {
	            return (a + b);
	        };
	        System.out.println(ad2.add(400, 500));
	    }
	}

