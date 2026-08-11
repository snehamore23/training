package Arrays;

public class Scond_half_max {
	    public static void main(String[] args) {

	        int b[] = {1, 2, 8, 6, 10, 12};

	       int max = b[b.length / 2];

	        for(int i = b.length/2; i < b.length; i++) {
	            if(b[i] > max) {
	            	
	                max = b[i];
	            }
	        }

	        System.out.println("Maximum: " + max);
	    }
	}

