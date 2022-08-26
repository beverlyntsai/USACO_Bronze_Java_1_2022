import java.util.*;
import java.io.*;



public class milk{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	Cow cow[]=new Cow[n];


	for(int i=0;i<n;i++){

		st=new StringTokenizer(in.readLine());
		cow[i]= new Cow();
		cow[i].arrivalTime=Integer.parseInt(st.nextToken());
		cow[i].duration=Integer.parseInt(st.nextToken());
	}


	Arrays.sort(cow, new comp());

	int answer=0;

	for(int i=0;i<n;i++){

		if(cow[i].arrivalTime>answer){
			
			answer=cow[i].arrivalTime+cow[i].duration;

		}else{

			answer+=cow[i].duration;
		}


	}

	System.out.println(answer);




        in.close();


    }

	static class Cow{
		int arrivalTime;
		int duration;
	}


	//Step-2: Implement Comparator Interface
	static class comp implements Comparator <Cow> { 
		public int compare(Cow c1, Cow c2) {//compare method will take two cows
			if (c1.arrivalTime< c2.arrivalTime)//it will sort the array by game in ascending order 
				return -1;
                        if (c1.arrivalTime > c2.arrivalTime) 
				return 1;
			return 0;
		}
	}

}
