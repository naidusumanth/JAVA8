package JAVA8Features;
interface DoubleParameter{  
	 int add(int a,int b);
}  
public class LambdaExpressionsDoubleParameters {
	public static void main(String []args)
	{
	DoubleParameter ad1=(a,b)->(a+b);  
    System.out.println(ad1.add(10,20));  
      
 
    DoubleParameter ad2=(int a,int b)->(a+b);  
    System.out.println(ad2.add(100,200));  
}  
}  


