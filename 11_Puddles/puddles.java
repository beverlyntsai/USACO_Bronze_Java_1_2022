import java.util.*;
import java.io.*;


public class puddles{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int r=0, c=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	r=Integer.parseInt(st.nextToken());
	c=Integer.parseInt(st.nextToken());


	char a[][]=new char[r][c];


	for(int i=0; i<r;i++){

		String line=in.readLine();

		for(int j=0; j<c;j++){
			a[i][j]=line.charAt(j);
		}
	}


	int count=0;

	for(int i=0; i<r;i++){

		String line=in.readLine();

		for(int j=0; j<c;j++){

			if(a[i][j]=='#'){

				count++;

				if(j+1<c && a[i][j+1]=='#'){
				
					a[i][j+1]='.';
				}

				if(i+1<r && a[i+1][j]=='#'){
				
					a[i+1][j]='.';
				}


			}
		}
	}



	System.out.println(count);


        in.close();


    }



}
