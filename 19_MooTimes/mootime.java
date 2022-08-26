import java.util.*;
import java.io.*;


public class mootime{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	Cow cow[]=new Cow[n];
	String winnder[]=new String[n];


	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());
		cow[i]= new Cow();
		cow[i].game=Integer.parseInt(st.nextToken());
		cow[i].name=st.nextToken();
		cow[i].change=Integer.parseInt(st.nextToken());

	}


	Arrays.sort(cow, new comp());



	int BScore=7;
	int EScore=7;
	int MScore=7;
	int winnerChangeCount=0;
	String preWinnerString="BessieElsieMildred";
	String newWinnerString="";


	for(int i=0; i<n;i++){

		if(cow[i].name.equals("Bessie")){
			BScore=BScore+cow[i].change;
		}

		if(cow[i].name.equals("Elsie")){
			EScore=EScore+cow[i].change;
		}

		if(cow[i].name.equals("Mildred")){
			MScore=MScore+cow[i].change;
		}

		if(BScore>EScore && BScore>MScore){
			newWinnerString="Bessie";
		}

		if(EScore>BScore && EScore>MScore){
			newWinnerString="Elsie";
		}

		if(MScore>BScore && MScore>EScore){
			newWinnerString="Mildred";
		}

		if(BScore==EScore && BScore>MScore){
			newWinnerString="BessieElsie";
		}

		if(BScore==MScore && BScore>EScore){
			newWinnerString="BessieMildred";
		}

		if(EScore==MScore && EScore>BScore){
			newWinnerString="ElsieMildred";
		}

		if(EScore==MScore && EScore==BScore){
			newWinnerString="BessieElsieMildred";
		}

		if(!newWinnerString.equals(preWinnerString)){

			winnerChangeCount++;

		}

		preWinnerString=newWinnerString;

	}


	System.out.println(winnerChangeCount);



        in.close();


    }

	static class Cow{
		int game;
		String name;
		int change;
	}


	//Step-2: Implement Comparator Interface
	static class comp implements Comparator <Cow> { 
		public int compare(Cow c1, Cow c2) {//compare method will take two cows
			if (c1.game< c2.game)//it will sort the array by game in ascending order 
				return -1;
                        if (c1.game > c2.game) 
				return 1;
			return 0;
		}
	}

}
