import java.util.*;
import java.io.*;



public class arena{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int a[]=new int[n];


	int sum=0;
	int minNum=10000000;

	for(int i=0; i<n;i++){

		a[i] = Integer.parseInt(in.readLine());
	}


	for(int i=0;i<n;i++){ //Change gate to see the distance


		for(int k=1;k<n;k++){

			sum+=k*a[(i+k)%n];
		}

	
		if(minNum>sum) minNum=sum;	
	}



	System.out.println(minNum);




        in.close();


    }



}
