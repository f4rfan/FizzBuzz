
public class FizzBuzz {	public static String x = "";
	
	public static String Resultado(int i) {
		boolean fb = false;
		if (i % 3 == 0) {
			x = x+"Fizz";
			fb = true;
    	}
        	
        if (i % 5 == 0) {
        	x = x+"Buzz";
        	fb = true;
        }
        
        if (fb == true) {
        	return x;
        }
        
        else {
        	return String.valueOf(i);
        }
             
	}
	
}