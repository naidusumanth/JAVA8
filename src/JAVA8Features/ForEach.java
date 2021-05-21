package JAVA8Features;

import java.awt.List;
import java.util.ArrayList;

public class ForEach {
	    public static void main(String[] args) {  
	       java.util.List<String> subject = new ArrayList<String>();  
	        subject.add("well");  
	        subject.add("score");  
	        subject.add("code");  
	        System.out.println("Iterate by pass lambda expression");  
	        subject.stream().forEachOrdered(games -> System.out.println(subject));  
	        System.out.println("Iterate by pass method reference");  
	        subject.stream().forEachOrdered(System.out::println);  
	    }  
}
