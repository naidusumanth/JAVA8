package JAVA8Features;
interface Methodref{  
      void ask();
}  
public class MethodReference {
	 public static void good(){  
	        System.out.println("static method reference.");  
	    }  
	    public static void main(String[] args) {  
	        
	        Methodref methodref = MethodReference::good;  
	        
	        methodref.ask();  
	    }  
}
