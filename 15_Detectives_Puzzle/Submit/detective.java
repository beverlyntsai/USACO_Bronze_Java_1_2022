import java.util.*;
import java.io.*;


public class detective{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, m=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	m=Integer.parseInt(st.nextToken());


	char a[][]=new char[n][m];


	for(int i=0; i<n;i++){

		String line=in.readLine();

		for(int j=0; j<m;j++){
		
			a[i][j]=line.charAt(j);
		}
		

	}

	int count=0;
	//Horizontal
	for(int i=0; i<n;i++){

		for(int j=0; j<m;j++){
		
			if(a[i][j]!='.') continue;

			if(j==0 || (j!=0 && a[i][j-1]=='#')){

				if(j+2<m){ //check boundary
					
					if(a[i][j+1]=='.' && a[i][j+2]=='.'){

						count++;
						a[i][j]='*';
					}
				}


			}
		}
		

	}

	//Vertical
	for(int i=0; i<n;i++){

		for(int j=0; j<m;j++){
		
			if(a[i][j]!='.') continue;

			if(i==0 || (i!=0 && a[i-1][j]=='#')){

				if(i+2<n){ //check boundary
					
					if(a[i+1][j]=='.' && a[i+2][j]=='.'){

						count++;
						a[i][j]='*';
					}
				}


			}
		}
		

	}

	System.out.println(count);
	for(int i=0; i<n;i++){

		for(int j=0; j<m;j++){
		
			if(a[i][j]=='*') {

				int x=i+1;
				int y=j+1;

				System.out.println(x+" "+y);

			}
		}
		

	}


        in.close();


    }



}
