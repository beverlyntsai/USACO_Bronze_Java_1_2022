import java.util.*;
import java.io.*;


public class flower{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int t=0, n=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	t=Integer.parseInt(st.nextToken());
	n=Integer.parseInt(st.nextToken());


	int a[]=new int[n];



	for(int i=0; i<n;i++){

		
		a[i]=Integer.parseInt(in.readLine());



	}

	sortABSAscending(a);


	int count=1, time=Math.abs(a[0]);

	while(time<t){

		int newDuration=Math.abs(a[count]-a[count-1]);

		//System.out.println("newDuration="+newDuration);

		if(time+newDuration>t){

			System.out.println(count);
			break;

		}else{
			time+=Math.abs(a[count]-a[count-1]);

		}

		count++;

	}



        in.close();


    }

	//Modified by using Math.abs
	public static void sortABSAscending(final int[] arr) {
    		for (int i = 0; i < arr.length - 1; i++) {
       			int minElementIndex = i;
        		for (int j = i + 1; j < arr.length; j++) {
            			if (Math.abs(arr[minElementIndex])> Math.abs(arr[j])) { //change to compare absolute value
              	 			 minElementIndex = j;
           		 	}
       			 }//for

       			 if (minElementIndex != i) {
           		 	int temp = arr[i];
           	 		arr[i] = arr[minElementIndex];
           	 		arr[minElementIndex] = temp;
       		 	}
  		}//for
	}


}
