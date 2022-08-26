import java.util.*;
import java.io.*;

//SAMPLE INPUT

//5
//1 12 35
//1 5 41
//0 58 34
//1 45 23
//0 49 22

//SAMPLE OUTPUT

//0 49 22
//0 58 34
//1 5 41
//1 12 35
//1 45 23

public class derbyresults{
    public static void main(String[] args)throws Exception{

    	Scanner in = new Scanner(System.in);

    	PrintWriter out = new PrintWriter("derbyresults.out");
        int n = in.nextInt(); //how many

	int a[] = new int[n];

	int totalSeconds=0;
	//Read in all array values
	for(int i=0;i<n;i++){
		totalSeconds=0;
		for(int j=0;j<3;j++){
			totalSeconds=totalSeconds*60+in.nextInt();

		}
		a[i]=totalSeconds;

	}

	Arrays.sort(a);

	int hour=0;
	int minute=0;
	int second=0;
	for(int i=0;i<n;i++){
		hour=a[i]/3600;
		second=a[i]-hour*3600;
		minute=second/60;
		second=second%60;
		String line=hour+" "+minute+" "+second;	
		System.out.println(line);
	}





        in.close();
        out.close();

    }


}
