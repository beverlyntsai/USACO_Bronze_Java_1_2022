import java.util.*;
import java.io.*;


public class triangle{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, s=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	s=Integer.parseInt(st.nextToken());


	int a[][]=new int[n][n];


	for(int c=0; c<n;c++){

		for(int r=0; r<n;r++){

			a[r][c]=0;

		}
	}

	int num=s;

	for(int c=0; c<n;c++){

		for(int r=0; r<=c;r++){

			a[r][c]=num;		

			num++;
			if(num==10){
				num=1;

			}
			
		}
	}


	for(int r=0; r<n;r++){


		for(int c=0; c<n;c++){
		
			if(a[r][c]==0){

				System.out.print("  ");
			}else{

				System.out.print(a[r][c]+" ");
			}
		}
		
		System.out.println();
	}



        in.close();


    }



}
