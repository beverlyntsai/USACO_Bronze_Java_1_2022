import java.util.*;
import java.io.*;


public class spring{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, nline=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	nline=Integer.parseInt(st.nextToken());


	int start[]=new int[n];
	int answer[]=new int[n];
	int index=0,hour=0,minute=0, totalMinute=0;
	String keyword="";

	for(int i=0; i<nline;i++){

		st = new StringTokenizer(in.readLine());
		
		index=Integer.parseInt(st.nextToken())-1;

		keyword=st.nextToken();

		hour=Integer.parseInt(st.nextToken());

		minute=Integer.parseInt(st.nextToken());

		totalMinute=60*hour+minute;

		if(keyword.equals("START")){

			start[index]=totalMinute;

		}else{

			answer[index]+=totalMinute-start[index];
		}


		

	}

	for(int i=0; i<n;i++){

		int time=answer[i];

		int h=time/60;

		int m=time%60;

		System.out.println(h+" "+m);
	}


        in.close();


    }



}
