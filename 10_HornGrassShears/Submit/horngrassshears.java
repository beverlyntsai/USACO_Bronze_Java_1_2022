import java.util.*;
import java.io.*;


public class horngrassshears{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;
	int winCase1=0, winCase2=0;

	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());

		if(a==1 && b==2) winCase1++;
		if(a==2 && b==3) winCase1++;
		if(a==3 && b==1) winCase1++;

		if(a==1 && b==3) winCase2++;
		if(a==3 && b==2) winCase2++;
		if(a==2 && b==1) winCase2++;

	}

	int answer=Math.max(winCase1, winCase2);


	System.out.println(answer);




        in.close();


    }



}
