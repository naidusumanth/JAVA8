package JAVA8Features;

import java.util.StringJoiner;

public class StringjoinExample {
	 public static void main(String[] args) {  
	        StringJoiner join = new StringJoiner(",");    
	          
	         
	        join.add("Rahul");  
	        join.add("Raju");  
	        join.add("venkat");   
	                  
	        System.out.println(join);  
	    }  
}
