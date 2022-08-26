import java.util.*;
import java.io.*;

/*
SAMPLE INPUT
7
3 5
1 7
5 2
3 3
6 2
9 2
7 6

SAMPLE OUTPUT

2 6
*/

public class danceparty{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int x[]=new int[n];
	int y[]=new int[n];
	double maxNum=0;
	int person1=1, person2=1;

	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		x[i]=Integer.parseInt(st.nextToken());
		y[i]=Integer.parseInt(st.nextToken());

	}

	double dist=0;

	for(int i=0; i<n;i++){

		for(int j=i+1; j<n;j++){

			dist=Math.abs(Math.pow(x[i]-x[j],2)+Math.pow(y[i]-y[j],2));
			if(dist>maxNum) {
				maxNum=dist;
				person1=i+1;
				person2=j+1;
			}

		}

	}



	System.out.println(person1+" "+person2);




        in.close();


    }



}
