import java.util.*;
import java.io.*;

//SAMPLE INPUT

//6
//16 Bessie +9
//2 Bessie +1
//7 Elsie +6
//12 Mildred -4
//3 Mildred +3
//10 Elsie -3
//SAMPLE OUTPUT

//6

public class mootimes{


    public static void main(String[] args)throws Exception{

    	Scanner in = new Scanner(System.in);

    	PrintWriter out = new PrintWriter("mootimes.out");
        int n = in.nextInt(); //how many

	Cow cowArray[] = new Cow[n];
	for(int i=0;i<n;i++){
		cowArray[i]= new Cow();
		String token=in.next(); //game
		cowArray[i].game=Integer.parseInt(token);

		cowArray[i].name= in.next();	//name

		token=in.next(); //change
		cowArray[i].change=Integer.parseInt(token);

		//String line=cowArray[i].game+" "+cowArray[i].name+" "+cowArray[i].change;	
		//out.println(line);
	}


	Arrays.sort(cowArray, new comp());


	//out.println("******** after sort");
	int BScore=7;
	int EScore=7;
	int MScore=7;
	int winnerChangeCount=0;
	String preWinnerString="BessieElsieMildred";
	String newWinnerString="";
	for(int i=0;i<n;i++){

		//out.println("preWinnerString="+preWinnerString);
		
		if(cowArray[i].name.equals("Bessie")){
			BScore=BScore+cowArray[i].change;
		}

		if(cowArray[i].name.equals("Elsie")){
			EScore=EScore+cowArray[i].change;
		}

		if(cowArray[i].name.equals("Mildred")){
			MScore=MScore+cowArray[i].change;
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

		//String line=cowArray[i].game+": B="+BScore+", E="+EScore+", M="+MScore;
		//out.println("newWinnerString="+newWinnerString);
		//out.println("winnerChangeCount="+winnerChangeCount);
		//out.println(line);
	}

	
	System.out.println(winnerChangeCount);




        in.close();
        out.close();

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
