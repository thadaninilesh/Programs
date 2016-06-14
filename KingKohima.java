import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KingKohima {

public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int M=Integer.parseInt(br.readLine());
    int countX[]=new int[M+1];
    int countY[]=new int[M+1];
    countX[0]=0; countY[0]=0;
    countX[1]=1; countY[1]=1;
    countX[2]=1; countY[2]=2;
    for(int i=3;i<=M;i++){
        countX[i]=countY[i-1];
        countY[i]=countX[i-1]+countY[i-1];
    }
    int finalCount=countX[M]+countY[M];
    System.out.println(finalCount*finalCount);
   }


}
