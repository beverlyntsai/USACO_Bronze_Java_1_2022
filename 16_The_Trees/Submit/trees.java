import java.util.*;
import java.io.*;


public class trees{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, b=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	b=Integer.parseInt(st.nextToken());


	int a[]=new int[n];


	for(int i=0; i<n;i++){
		
		a[i]=Integer.parseInt(in.readLine());
		

	}

	sortDescending(a);


	int count=0;
	int sum=0;

	for(int i=0; i<n;i++){
		
		sum+=a[i];
		if(sum>=b){
			System.out.println(i+1);
			break;
		}

	}



        in.close();


    }




	//Selection sort in descending order(big to small)
	public static void sortDescending(final int[] arr) {
   		for (int i = 0; i < arr.length - 1; i++) {
      	 	int maxElementIndex = i;
       		for (int j = i + 1; j < arr.length; j++) {
          	  	if (arr[maxElementIndex] < arr[j]) {
             	 	  maxElementIndex = j;
           		 }
       	 	}

       	 	if (maxElementIndex != i) {
          		  int temp = arr[i];
           		  arr[i] = arr[maxElementIndex];
           	 	  arr[maxElementIndex] = temp;
        		}
   	 	}
	}


}
