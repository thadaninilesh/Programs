import java.util.*;
import java.io.*;
class RemoveSpaces{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = new char[str.length()];
		ch = str.toCharArray();
		char ans[] = new char[ch.length];
		int ind = 0, j=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=' '){
				ans[j++] = ch[i];
			}
		}
		System.out.println(ans);
	}
}