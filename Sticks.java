/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Sticks
{
	static int arr[];
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sticks solution = new Sticks();
        solution.n = in.nextInt();
        solution.arr = new int[n];
        int min=0;
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(n);
        min = solution.findMin();
//        System.out.println(min+" min");
        int count = solution.deleteMin(min);
        if(count>0){
            System.out.println(count);
            while(count>0){
                min = solution.findMin();
                count = solution.deleteMin(min);
                if(count!=-1){
                    System.out.println(count);
                }
            }
        }
        //System.out.println(arr.length);
    }
    
    static int findMin(){
        int min = 99999;
        for(int i=0;i<n;i++){
            if(arr[i]>0 && arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    
    static int deleteMin(int min){
    	int count = 0;
    	for(int i=0;i<n;i++){
    		arr[i] = arr[i]-min;
    		if(arr[i]>0){
    			count++;
    		}
    	}
    	if(count>0){
    		return count;
    	}
    	else{
    		return -1;
    	}
    }
}