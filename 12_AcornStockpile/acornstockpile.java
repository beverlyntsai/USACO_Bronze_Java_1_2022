import java.util.*;
import java.io.*;


public class acornstockpile{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, x=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	x=Integer.parseInt(st.nextToken());


	int a[]=new int[n];


	for(int i=0; i<n;i++){

		a[i]=Integer.parseInt(in.readLine());

	}

	Arrays.sort(a);

	int count=0, answer=0;


	for(int i=0; i<n;i++){ //must be smallest because it has been sorted

		count=0;

		for(int j=i j<n;j++){//careful, j should start from i, not from i+1

			if(a[j]-a[i]<=x){ //for sure a[j]>a[i]

				count++;
			}

		}

		answer=Math.max(count,answer);

	}

	System.out.println(answer);


        in.close();


    }



}
