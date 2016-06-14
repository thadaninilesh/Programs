import java.util.*;
import java.io.*;

class SecondLargest{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		SecondLargest secondLargest = new SecondLargest();
		int t = sc.nextInt();
		int ans[] = new int[t];
		for(int x = 0; x < t; x++){
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			ans[x] = secondLargest.findSecondLargest(arr, n);
		}
		for(int i = 0; i<t;i++){
			System.out.println(ans[i]);
		}
	}

	int findSecondLargest(int arr[],int n){
		int max, max2;
		max=max2=arr[0];
		for(int i=1;i<n;i++){
			if(arr[i]>max){
				max2 = max;
				max = arr[i];
			}
		}
		return max2;
	}
}