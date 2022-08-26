import java.util.*;
import java.io.*;


public class layeringsod{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int x=0, y=0, n=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	x=Integer.parseInt(st.nextToken());
	y=Integer.parseInt(st.nextToken());
	n=Integer.parseInt(st.nextToken());

	int a[][]=new int[250][250];


	for(int i=0; i<250;i++){

		for(int j=0; j<250;j++){
			a[i][j]=0;
		}
	}


	for(int i=0; i<n;i++){ //Label 1 for each sod

		st = new StringTokenizer(in.readLine());

		int col_1=Integer.parseInt(st.nextToken());
		int row_1=Integer.parseInt(st.nextToken());
		int col_2=Integer.parseInt(st.nextToken());		
		int row_2=Integer.parseInt(st.nextToken());

		for(int r=row_1; r<=row_2;r++){
		
			for(int c=col_1; c<=col_2;c++){
				a[r][c]=1;

			}
		}
		
	}

	int counter=0;


	for(int i=0; i<250;i++){

		for(int j=0; j<250;j++){
			counter+=a[i][j];
		}
	}


	System.out.println(counter);

        in.close();


    }



}
