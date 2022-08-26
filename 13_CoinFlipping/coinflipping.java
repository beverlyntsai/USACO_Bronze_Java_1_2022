import java.util.*;
import java.io.*;


public class coinflipping{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int a[][]=new int[n][n];

	int count=0;

	for(int i=0; i<n;i++){

		String line=in.readLine();

		for(int j=0; j<n;j++){
			
			if(line.charAt(j)=='1'){
				a[i][j]=1;
			}else{
				a[i][j]=0;
			}
		}
	}

	//Scan from bottom to top
	//Scan from right to left
	for(int i=n-1; i>=0;i--){

		for(int j=n-1; j>=0;j--){
			
			if(a[i][j]==1){ //must flip if it is "1"
				count++;


				for(int r=0;r<=i;r++){ //Be careful, r is up to i

					for(int c=0;c<=j;c++){//Be careful, c is up to j

						a[r][c]=1-a[r][c]; //Purpose is to change value: 1->0, or 0->1
			
					}

				}
			}
		}
	}



	System.out.println(count);




        in.close();


    }



}
