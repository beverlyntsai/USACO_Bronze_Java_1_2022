import java.util.*;
import java.io.*;


public class derbyrace{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int distTotal=0, horse=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	distTotal=Integer.parseInt(st.nextToken());
	horse=Integer.parseInt(st.nextToken());

	//No need to store in array
	//int[][] a=new int[horse][3];


	for(int i=0; i<horse;i++){

		st = new StringTokenizer(in.readLine());
	
		int S=Integer.parseInt(st.nextToken()); //speed(aka every 1 minute's distance)
		int T=Integer.parseInt(st.nextToken()); //time(minutes)
		int R=Integer.parseInt(st.nextToken()); //rest minutes

		int distAccumulate=0;
		int minutesTotal=0;
		int runTimeUse=0;

		while(true){


			if(distAccumulate>=distTotal){
				
				System.out.println(minutesTotal);
				break;
			}

			if(runTimeUse<T){
				minutesTotal+=1;
				distAccumulate+=S;
				runTimeUse+=1;					

			}

			if(distAccumulate>=distTotal){ //check before need to take a rest
				
				System.out.println(minutesTotal);
				break;
			}


			if(runTimeUse==T){
				minutesTotal+=R; //rest time can be added
				runTimeUse=0;	//need to reset				

			}
		}
	}



        in.close();


    }



}
