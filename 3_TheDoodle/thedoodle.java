import java.util.*;
import java.io.*;


public class thedoodle{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int a=0, b=0, c=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	a=Integer.parseInt(st.nextToken()); //row
	b=Integer.parseInt(st.nextToken()); //col
	c=Integer.parseInt(st.nextToken());


	String arr[][]=new String[a][b];
	String arr1[][]=new String[c*a][c*b];


	for(int i=0; i<a;i++){ //row

		String line=in.readLine();

		for(int j=0; j<b;j++){ //col
			arr[i][j]=line.substring(j,j+1);
		}
	}

	String lineStr="";
	for(int i=0; i<a;i++){ //row
			lineStr="";
		for(int j=0;j<b;j++){

			String str=arr[i][j];


			for(int k=0; k<c;k++){ //repeat times, enlarge size
				lineStr+=str;
			}

		}

		for(int l=0;l<c;l++){

			System.out.println(lineStr);
		}
		

	}




        in.close();


    }



}
