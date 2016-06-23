import java.util.*;
import java.io.*;
class BubbleSort{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		int arr2[] = new int [n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		arr2 = arr;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		//	for(int g:arr){
		//		System.out.print("--"+g+" ");
		//	}
		}
		System.out.print("--------------------");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}