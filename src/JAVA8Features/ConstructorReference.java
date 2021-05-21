package JAVA8Features;

	interface Dataaddable{  
	    Data getMessage(String adding);  
	}  
	class Data{  
	    Data(String data){  
	        System.out.print(data);  
	    }  
	}  
	public class ConstructorReference {  
	    public static void main(String[] args) {  
	        Dataaddable hello = Data::new;  
	        hello.getMessage("Hello");  
	    }  
	}  

