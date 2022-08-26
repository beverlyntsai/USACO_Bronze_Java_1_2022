import java.util.*;
import java.io.*;


public class stone{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	char a[][]=new char[n][n];
	char a1[][]=new char[n][n];
	char b[][]=new char[n][n];
	

	for(int i=0; i<n;i++){

		String line = in.readLine();

		for(int j=0; j<n;j++){
	
			a[i][j]=line.charAt(j);
	
		}

	}

	for(int i=0; i<n;i++){

		String line = in.readLine();

		for(int j=0; j<n;j++){
	
			b[i][j]=line.charAt(j);
	
		}

	}

	
	int answer=7;//none of the above
	int count=0;
	int match=n*n;
	
	//(2)180 degree(check case 2 first)

	a1=degree180(a,n);
	
	count=getCount(a1,b,n);
	
	if(answer==7 && count==match){
		answer=2;
	}

	//(6) no change

	count=getCount(a,b,n);
	
	if(answer==7 && count==match){
		answer=6;
	}


	//(1)90 degree

	a1=degree90(a,n);
	
	count=getCount(a1,b,n);
	
	if(answer==7 && count==match){
		answer=1;
	}



	//(3)270 degree
	a1=degree270(a,n);

	count=getCount(a1,b,n);
	
	if(answer==7 && count==match){
		answer=3;
	}


	//(4) horizontal

	a1=horizontal(a,n);

	count=getCount(a1,b,n);
	
	if(answer==7 && count==match){
		answer=4;
	}


	//(5)horiztontal + case 1-3
	a1=horizontal_90degree(a,n);

	count=getCount(a1,b,n);

	if(answer==7 && count==match){
		answer=5;
	}

	a1=horizontal_270degree(a,n);
	count=getCount(a1,b,n);
	
	if(answer==7 && count==match){
		answer=5;
	}


	System.out.println(answer);

        in.close();

    }

	static int getCount(char[][] a1, char[][] b, int n){
		
		int count=0;
		for(int i=0; i<n;i++){

			for(int j=0; j<n;j++){
				if(a1[i][j]==b[i][j]){
					count++;
				}
			}
		}

		return count;
	}

	
	static char[][] degree90(char[][] a, int n){

		char b[][]=new char[n][n];

		for(int i=0; i<n;i++){
			for(int j=0; j<n;j++){
				b[i][j]=a[n-j-1][i];
				
			}
		}

		return b;
	}

	static char[][] degree180(char[][] a, int n){

		char b[][]=new char[n][n];

		for(int i=0; i<n;i++){
			for(int j=0; j<n;j++){
				b[i][j]=a[n-i-1][n-j-1];
				
			
			}
		}
		return b;
	}


	static char[][] degree270(char[][] a, int n){

		char b[][]=new char[n][n];

		for(int i=0; i<n;i++){
			for(int j=0; j<n;j++){
				b[i][j]=a[n-1-i][n-1-j];

			}
		}
		return b;
	}


	
	static char[][] horizontal(char[][] a, int n){

		char b[][]=new char[n][n];

		for(int i=0; i<n;i++){
			for(int j=0; j<n;j++){
				b[i][j]=a[i][n-j-1]; //changed to refected horizontally

			}
		}

		return b;
	}


	static char[][] horizontal_90degree(char[][] a, int n){

		char b[][]=new char[n][n];

		char b1[][]=new char[n][n];

		for(int i=0; i<n;i++){
			for(int j=0; j<n;j++){
				b[i][j]=a[i][n-j-1]; //changed to refected horizontally

			}
		}

		for(int i=0; i<n;i++){
			for(int j=0; j<n;j++){
				b1[i][j]=b[n-j-1][i];
				
			}
		}


		return b1;
	}


	static char[][] horizontal_270degree(char[][] a, int n){

		char b[][]=new char[n][n];

		char b1[][]=new char[n][n];

		for(int i=0; i<n;i++){
			for(int j=0; j<n;j++){
				b[i][j]=a[i][n-j-1]; //changed to refected horizontally

			}
		}

		for(int i=0; i<n;i++){
			for(int j=0; j<n;j++){
				b1[i][j]=b[n-1-i][n-1-j];
			}
		}



		return b1;
	}
}
