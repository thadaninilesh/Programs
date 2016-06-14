import java.util.*;
import java.io.*;

class IsBleak{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		IsBleak isBleak = new IsBleak();
		if(isBleak.checkIfBleak(sc.nextInt()))
			System.out.println("Yes");
		else
			System.out.println("No");
		if(isBleak.checkIfBleak(sc.nextInt()))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	boolean checkIfBleak(int n){
		IsBleak isBleak = new IsBleak();
		for(int x=n-isBleak.ceilLog2(n);x<n;x++){
			if(x+isBleak.countSetBits(x)==n){
				return false;
			}
		}
		return true;
	}
	int ceilLog2(int n){
		int count = 0;
		n--;
		while(n>0){
			n = n>>1;
			count++;
		}
		return count;
	}

	int countSetBits(int x){
		int count = 0;
		while(x>0){
			x &= (x-1);
			count++;
		}
		return count++;
	}

}