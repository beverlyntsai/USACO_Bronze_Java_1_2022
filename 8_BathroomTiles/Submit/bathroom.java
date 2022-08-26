import java.util.*;
import java.io.*;



public class bathroom{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;
	
	//int a=0, b=0,c=0,d=0;
	int answer=0;



	for(int a=0; a<=Math.sqrt(n);a++){ //eqaul is important

		for(int b=0; b<=Math.sqrt(n);b++){

			for(int c=0; c<=Math.sqrt(n);c++){
				
				/*
				int d=(int)Math.sqrt(n-(a*a+b*b+c*c));

				if(a*a+b*b+c*c+d*d==n){
					answer++;
				}
				*/
				

				double sum=Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2);
				int d=(int)Math.sqrt(n-sum);
			
				if( n==Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)+Math.pow(d,2)){
					
					answer++;


				}
				
			}

		}
	}



	System.out.println(answer);




        in.close();


    }



}
