import java.util.*;
import java.io.*;



public class math{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int a[][]=new int[7][2];


	for(int i=0; i<7;i++){

		for(int j=0; j<2;j++){
			a[i][j]=0;
		}
	}


	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		String letter=st.nextToken();
		int value=Integer.parseInt(st.nextToken());
		
		//boolean isEven=(value%2==0);
		boolean isEven=false;
		if(value%2==0){
			isEven=true;
		}else{
			isEven=false;
		}
		
		if(letter.equals("S")){
			if(isEven){
				a[0][0]++;
			}else{
				a[0][1]++;
			}
		}
		
		if(letter.equals("O")){
			if(isEven){
				a[1][0]++;
			}else{
				a[1][1]++;
			}
		}

		if(letter.equals("M")){
			if(isEven){
				a[2][0]++;
			}else{
				a[2][1]++;
			}
		}

		if(letter.equals("E")){
			if(isEven){
				a[3][0]++;
			}else{
				a[3][1]++;
			}
		}

		if(letter.equals("B")){
			if(isEven){
				a[4][0]++;
			}else{
				a[4][1]++;
			}
		}

		if(letter.equals("I")){
			if(isEven){
				a[5][0]++;
			}else{
				a[5][1]++;
			}
		}

		if(letter.equals("G")){
			if(isEven){
				a[6][0]++;
			}else{
				a[6][1]++;
			}
		}

	}

	int k=0;
	int answer=0;
	for(int S=0; S<2;S++){

		for(int O=0; O<2;O++){

			for(int M=0; M<2;M++){

				for(int E=0; E<2;E++){

					for(int B=0; B<2;B++){

						for(int I=0; I<2;I++){


							for(int G=0; G<2;G++){

								k=(O+M+O)*(S+I+S+B+E+E)*(E+G+O+S);
								if(k%2==0){
									answer+=a[0][S]*a[1][O]*a[2][M]*a[3][E]*a[4][B]*a[5][I]*a[6][G];
								}

							}

						}

					}


				}
				

			}


		}


	}


	System.out.println(answer);




        in.close();


    }



}
