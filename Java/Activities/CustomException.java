package Activities;

public class CustomException extends exception{

	 private String message = null;
	 
	    public CustomException(String message) {
	        this.message = message;
	    }
	 public String getMessage() {
	        return message;
	    }
}
