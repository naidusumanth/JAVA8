package JAVA8Features;

import java.lang.reflect.Method;

import org.omg.Dynamic.Parameter;

class Reflection {
	public class Calculate {  
	    int add(int a, int b){  
	        return (a+b);  
	    }  
	    int mul(int a, int b){  
	        return (b*a);  
	    }  
	} 
public static class ParameterReflection {  
public static void main(String[] args) {  
	          
	        Reflection calculate = new Reflection();  
	        
	        Class cls = calculate.getClass();  
	        
	        Method[] method = cls.getDeclaredMethods();  
	       
	        for (Method method2 : method) {  
	            System.out.print(method2.getName());     
	            
	            java.lang.reflect.Parameter[] parameter = method2.getParameters();  
	           
	            for (java.lang.reflect.Parameter parameter2 : parameter) {  
	                System.out.print(""+parameter2.getParameterizedType());
	                System.out.print(""+parameter2.getName());   
	            }  
	            System.out.println();  
}
	    }
}
}
