import java.util.*;
import java.io.*;


public class cardselection{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, t=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	t=Integer.parseInt(st.nextToken());


	int card[]=new int[n];


	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());
		
		card[i]=Integer.parseInt(st.nextToken());
	}

	int max=-1;
	int index=-1;
	int split=0;
	int extra=0;
	for(int i=0; i<t;i++){

		max=findMax(card);
		index=findMaxIndex(card);

		System.out.println(index+1);

		split=max/n;
		extra=max%n;

		card[index]=0;
		for(int j=0;j<n;j++){

			if(j!=index){
				card[j]+=split;
			}

		}

		for(int j=0;j<extra;j++){

			if(j!=index){
				card[j]+=1;
			}

		}
		
	}



        in.close();


    }

	public static int findMax(int[] array){


		int max=-10000;

		for(int i=0; i<array.length;i++){


			if(array[i]>max) {
				max=array[i];

			}

		}

		return max;
	}

	public static int findMaxIndex(int[] array){


		int index=-1;
		int max=-10000;
		for(int i=0; i<array.length;i++){


			if(array[i]>max) {
				max=array[i];
				index=i;

			}

		}

		return index;
	}

}
