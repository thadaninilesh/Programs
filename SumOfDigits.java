import java.util.*;
import java.io.*;
class SumOfDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int temp, sum=0;
		for(int i=n1;i<=n2;i++){
			temp = i;
			while(temp!=0){
				sum = sum + temp%10;
				temp = temp/10;
			}
		}
		System.out.println("Sum="+sum);
	}
}