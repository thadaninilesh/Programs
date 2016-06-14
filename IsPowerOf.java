import java.util.*;
import java.io.*;

class IsPowerOf{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		IsPowerOf isPowerOf = new IsPowerOf();
		for(int x=0;x<t;x++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(isPowerOf.isPower(a,b));
		}
	}

	int isPower(int a, int b){
		int power = 1;
		if(a==1){
			return 1;
		}
		while(b>power){
			power = power * a;
		}
		if(power==b){
			return 1;
		}
		else{
			return 0;
		}
	}
}