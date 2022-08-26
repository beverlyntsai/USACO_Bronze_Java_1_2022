import java.util.*;
import java.io.*;


public class derby{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int a[]=new int[n];


	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		int hour=Integer.parseInt(st.nextToken());

		int minute=Integer.parseInt(st.nextToken());

		int second=Integer.parseInt(st.nextToken());

		a[i]=3600*hour+60*minute+second;
		
	}

	Arrays.sort(a);

	for(int i=0; i<n;i++){

		int total=a[i];
		int hour=total/3600;
		int minute=(total-hour*3600)/60;
		int second=(total-hour*3600)%60;

		System.out.println(hour+" "+minute+" "+second);
		
	}








        in.close();


    }



}
