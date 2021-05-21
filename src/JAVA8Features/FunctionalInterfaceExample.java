package JAVA8Features;

@FunctionalInterface  
interface addable{  
    void add(String msg);  
}  
public class FunctionalInterfaceExample implements addable{  
    public void add(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        fie.add("Hello");  
    }  
}  

