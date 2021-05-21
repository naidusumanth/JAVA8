package JAVA8Features;

import java.util.function.BiFunction;

class Arithmetic{  
public int add(int a, int b){  
return a+b;  
}  
}  
public class BIfunctionalinterface {  
public static void main(String[] args) {  
BiFunction<Integer, Integer, Integer>adder = new Arithmetic()::add;  
int result = adder.apply(60, 90);  
System.out.println(result);  
} 
}