import java.util.*;
import java.io.*;


public class chores{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, l=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	l=Integer.parseInt(st.nextToken());

	int[] a=new int[n]; //cows 8
	int[] b=new int[l];//interval

	st = new StringTokenizer(in.readLine());
	
	for(int i=0; i<l;i++){
	
		b[i]=Integer.parseInt(st.nextToken());
	}


	for(int i=0; i<n;i++){
	
		a[i]=i+1;
	}

	int intervalNum=0;
	int intervalIndex=0;
	int cowPos=0;
	for(int i=0; i<n-1; i++){ //Need to remove n-1 cows

		intervalNum=b[intervalIndex];//Get rotated interalNum to remove cow

		//while loop
		//Use active intervalNum to set cow to 0
		while(true){

			if(a[cowPos]!=0){
				intervalNum--;
				
			}

			if(intervalNum==0){
				a[cowPos]=0;
				break;
			}
			cowPos++;
			cowPos=cowPos%n;
		}

		//cows
		cowPos++;
		cowPos=cowPos%n;


		//interval update
		intervalIndex++;
		intervalIndex=intervalIndex%l;


	}

	for(int i=0;i<n;i++){

		if(a[i]!=0){
			
			System.out.println(a[i]);
		}
	}


        in.close();


    }



}
