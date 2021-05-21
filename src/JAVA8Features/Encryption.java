package JAVA8Features;

import java.util.Base64;

public class Encryption {
	    public static void main(String[] args) {   
	        Base64.Encoder encoder = Base64.getUrlEncoder();   
	        String eStr = encoder.encodeToString("sumanth".getBytes());  
	        System.out.println("Encoded URL: "+eStr); 
	        Base64.Decoder decoder = Base64.getUrlDecoder();  
	        String dStr = new String(decoder.decode(eStr));  
	        System.out.println("Decoded URL: "+dStr);  
	    }  
}
