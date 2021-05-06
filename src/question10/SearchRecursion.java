/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author S542263
 */
public class SearchRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = new int[10];
        for(int i =0 ;i < arr.length-1 ;i++){
            arr[i] = i*2;
        }
        for(int i =0 ;i < arr.length-1 ;i++){
            System.out.println(arr[i]);
        }
        Scanner scan = new Scanner(System.in);
                System.out.print("Enter element to be searched ");

        int num = scan.nextInt();
        int status = searchElement(arr, 0, arr.length-1, num);
        if(status == 0){
            System.out.println("Element is not present in the list");
        }
        else
            System.out.println("Element is found at position "+status);
        
    }
    public static int searchElement(int[] arr,int start,int end,int num){
      
        if(start > end)
            return 0;
        if(arr[start] ==  num)
            return start;
        return searchElement(arr, start+1, end, num);
    }
    
}
