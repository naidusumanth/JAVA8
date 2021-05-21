/**
 * 
 */
package JAVA8Features;

import java.util.Arrays;

/**
 * @author Administrator
 *
 */
public class ParallelArraySorting {
	public static void main(String[] args) {  
        
        int[] arr1 = {3,22,1,4,6,9};  
        // Iterating array elements  
        for (int i : arr1) {  
            System.out.print(i+" ");  
        }  
    
        Arrays.parallelSort(arr1);  
        System.out.println("Array elements after sorting");  
  
        for (int i : arr1) {  
            System.out.print(i+" ");  
        }  
}
}