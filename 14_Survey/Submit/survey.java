import java.util.*;
import java.io.*;


public class survey{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, nq=0, p=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	nq=Integer.parseInt(st.nextToken());
	p=Integer.parseInt(st.nextToken());


	int a[][]=new int[n][nq];
	boolean b[]=new boolean[n];


	for(int i=0; i<n;i++){

		b[i]=true;

	}


	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		for(int j=0; j<nq;j++){
		
			a[i][j]=Integer.parseInt(st.nextToken());
		}
		

	}

	for(int i=0; i<p;i++){ //to how many persons(2 lines in the example)

		st = new StringTokenizer(in.readLine());
		int q=Integer.parseInt(st.nextToken());
		int answer=Integer.parseInt(st.nextToken());
		q=q-1;//question 1 is index 0

		for(int j=0; j<n;j++){ //scan all persons

			if(a[j][q]!=answer){ // j is data's person, q is this person's answer in data
				b[j]=false;

			}
		}
	}

	int counter=0;

	for(int i=0; i<n;i++){

		
		if(b[i]==true){
		
			counter++;

		}	

	}

	System.out.println(counter);


        in.close();


    }



}
