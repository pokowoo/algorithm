package hello12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ14501 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[16];
		
		Quest[] qstArr = new Quest[16];
		
		for (int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int T =Integer.parseInt(st.nextToken());
			int P =Integer.parseInt(st.nextToken());
			Quest qst = new Quest (T,P);
			qstArr[i]=qst;
			dp[i]=0;
		}
		
		
		
		for (int i=0;i<N;i++) {
			for(int j=i+qstArr[i].doingDay;j<N+1;j++) {
				if(dp[j]<dp[i]+qstArr[i].value) {
					dp[j]=dp[i]+qstArr[i].value;
				}
			}
		}
		System.out.print(dp[N]);
		
	}
}
class Quest {
	static int count=1;
	int startDay;
	int doingDay;
	int value;
	public Quest (int doingDay,int value){
		this.doingDay=doingDay;
		this.value=value;
		startDay=count++;
	}	
	
}
