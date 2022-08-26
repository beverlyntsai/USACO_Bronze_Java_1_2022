import java.util.*;
import java.io.*;


public class sod{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int temp1=0, temp2=0, n=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	temp1=Integer.parseInt(st.nextToken());
	temp2=Integer.parseInt(st.nextToken());
	n=Integer.parseInt(st.nextToken());
	int a[][]=new int[250][250];


	for(int i=0; i<250;i++){

		for(int j=0; j<250;j++){
			a[i][j]=0;
		}
	}

	int col_1=0, row_1=0, col_2=0, row_2=0;

	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());
		
		col_1=Integer.parseInt(st.nextToken());
		row_1=Integer.parseInt(st.nextToken());
		col_2=Integer.parseInt(st.nextToken());
		row_2=Integer.parseInt(st.nextToken());

		for(int r=row_1; r<=row_2;r++){

			for(int c=col_1;c<=col_2;c++){


				a[r][c]=1;
			}
		}
	}

	int count=0;

	for(int i=0;i<250;i++){

		for(int j=0;j<250;j++){



			if(a[i][j]==1){

				count++;
			}
		}
	}

	System.out.println(count);

        in.close();


    }



}
