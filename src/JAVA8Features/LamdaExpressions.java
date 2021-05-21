package JAVA8Features;
interface SingleParameter{  
    public String ask(String name); 
}  
  
public class LamdaExpressions {
	 public static void main(String[] args) {  
	       
	        SingleParameter s1=(name)->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s1.ask("areyou"));  
	            
	        SingleParameter s2= name ->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s2.ask("areyou"));  
	 }
	
}
