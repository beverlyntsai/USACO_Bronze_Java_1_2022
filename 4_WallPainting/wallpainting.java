import java.util.*;
import java.io.*;


public class wallpainting{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, m=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	m=Integer.parseInt(st.nextToken());


	int answer=0,coefficient=1;


	while(n%2==1 && m%2==1){

		answer+=coefficient;
		coefficient=coefficient*4;
		n=n/2;
		m=m/2;
		

	}

	System.out.println(answer);

        in.close();


    }



}
