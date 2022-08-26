import java.util.*;
import java.io.*;


public class luckycharms{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int L=0, C=0, N=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	L=Integer.parseInt(st.nextToken());
	C=Integer.parseInt(st.nextToken());
	N=Integer.parseInt(st.nextToken());


	int a[][]=new int[C][2];



	for(int i=0; i<C;i++){

		st = new StringTokenizer(in.readLine());

		a[i][0]=Integer.parseInt(st.nextToken()); //length
		a[i][1]=Integer.parseInt(st.nextToken()); //position
	}


	for(int i=0; i<C;i++){

		int dist=Math.abs(N-a[i][1])+a[i][0];
		System.out.println(dist);

	}

	


        in.close();


    }



}
