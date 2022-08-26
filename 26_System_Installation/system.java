import java.util.*;
import java.io.*;


public class system{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, m=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	m=Integer.parseInt(st.nextToken());


	int a[][]=new int[n][m];


	for(int i=0; i<n;i++){

		for(int j=0; j<m;j++){
			a[i][j]=0;
		}
	}


	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		for(int j=0; j<m;j++){
		
			a[i][j]=Integer.parseInt(st.nextToken());
		}
		

	}

	int max=-1;
	int sum=0;
	int r=0,c=0;

	for(int i=0; i<n-2;i++){

		for(int j=0; j<m-2;j++){

			 sum=0;
			for(int k=i; k<i+3;k++){

				for(int l=j; l<j+3;l++){
			
					sum+=a[k][l];
				}

			}
		
			if(sum>max){
				max=sum;
				r=i;
				c=j;
			}
		}
		

	}

	System.out.println(max);
	System.out.println((r+1)+" "+(c+1));


        in.close();


    }



}
