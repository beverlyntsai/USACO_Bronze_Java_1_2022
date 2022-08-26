import java.util.*;
import java.io.*;


public class color{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, m=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	m=Integer.parseInt(st.nextToken());


	char black[][]=new char[n][m];
	char brown[][]=new char[n][m];


	for(int i=0; i<n;i++){

		String line = in.readLine();


		for(int j=0; j<line.length();j++){

			black[i][j]=line.charAt(j);
		}
	
	}

	for(int i=0; i<n;i++){

		String line = in.readLine();


		for(int j=0; j<line.length();j++){

			brown[i][j]=line.charAt(j);
		}
	
	}

	boolean isGood=true;
	int answer=0;

	for(int pos=0; pos<m;pos++){

		isGood=true;

		for(int i=0; i<n;i++){

			char ch=black[i][pos];

			for(int j=0; j<n;j++){

				if(ch==brown[j][pos]){
					isGood=false;
				}
			}
		}

		if(isGood==true) answer++;
	
	}

	System.out.println(answer);


        in.close();


    }



}
