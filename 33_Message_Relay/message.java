import java.util.*;
import java.io.*;


public class message{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int a[]=new int[n];

	st = new StringTokenizer(in.readLine());

	for(int i=0; i<n;i++){


		a[i]=Integer.parseInt(st.nextToken());
		

	}

	Arrays.sort(a);

	//Identify true or false
	boolean dir[]=new boolean[n];

	dir[0]=true;
	dir[n-1]=false;


	for(int i=1; i<=n-2;i++){
		int distanceRight=a[i+1]-a[i];
		int distanceLeft=a[i]-a[i-1];

		if(distanceRight<distanceLeft){
			dir[i]=true;
		}else{
			dir[i]=false; //if same distance, throw left
		}
	}

	int fr[]=new int[n];

	for(int i=0; i<n;i++){

		fr[i]=0;

	}

	for(int i=1;i<=n-2;i++){
		if(dir[i-1]==true){ //if left cow throw to right(me)
			fr[i]++;
		}

		if(dir[i+1]==false){ //if right cow throw to left(me)
			fr[i]++;
		}
	}


	int answer=0;
	if(dir[1]==false) fr[0]=1;
	if(dir[n-2]==true) fr[n-1]=1;

	//Case 1: no one send message
	for(int i=0; i<n;i++){

		if(fr[i]==0) answer++;

	}

	//Case 2: endless loop
	for(int i=0; i<n-1;i++){

		if(fr[i+1]==1 && fr[i]==1 && dir[i+1]==false && dir[i]==true){

			 answer++;
		}

	}


	System.out.println(answer);




        in.close();


    }



}
