import java.util.*;
import java.io.*;



public class acorn{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int guide[]=new int[n];
	int a[]=new int[n];
	int b[]=new int[n];
	int c[]=new int[n];
	int d[]=new int[n];


	st = new StringTokenizer(in.readLine());

	for(int i=0; i<n;i++){

		guide[i]=Integer.parseInt(st.nextToken());

	}

	st = new StringTokenizer(in.readLine());

	for(int i=0; i<n;i++){

		a[i]=Integer.parseInt(st.nextToken());

	}

	int pos=0;

	for(int i=0; i<n;i++){

		for(int j=0; j<n;j++){

			if((guide[j]-1)==i){
				pos=j;
			}

		}
		
		b[pos]=a[i];

	}


	for(int i=0; i<n;i++){

		for(int j=0; j<n;j++){

			if((guide[j]-1)==i){
				pos=j;
			}

		}
		
		c[pos]=b[i];

	}


	for(int i=0; i<n;i++){

		for(int j=0; j<n;j++){

			if((guide[j]-1)==i){
				pos=j;
			}

		}
		
		d[pos]=c[i];

	}

	


	for(int i=0; i<n;i++){
		
		System.out.println(d[i]);

	}




        in.close();


    }



}
