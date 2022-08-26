import java.io.*;
import java.util.*;



public class picturegame{


    public static void main(String[] args)throws Exception{

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

     int n = Integer.parseInt(in.readLine());

	int letter1[] = new int[26];
	int letter2[] = new int[26];
	int letter3[] = new int[26];
	Arrays.fill(letter1, 0);//initialize to 0
	Arrays.fill(letter2, 0);//initialize to 0
	Arrays.fill(letter3, 0);//initialize to 0

	int index=0;
	for(int i=0;i<n;i++){

        StringTokenizer st = new StringTokenizer(in.readLine());
		String word1=st.nextToken(); //read up to space
		String word2=st.nextToken(); //read up to space

		for(int j=0;j<word1.length();j++){
			index=word1.charAt(j)-'a';
			letter1[index]++;
		}


		for(int k=0;k<word2.length();k++){
			index=word2.charAt(k)-'a';
			letter2[index]++;
		}

		for(int m=0;m<26;m++){
	
			if(letter1[m]>=letter2[m]){
				letter3[m]=letter1[m];
			}else{
				letter3[m]=letter2[m];
			}

			letter1[m]=letter3[m];
			letter2[m]=letter3[m];
		}

		//String line=word1+" "+word2;	
		//out.println(line);
	}


	for(int m=0;m<26;m++){

		System.out.println(letter3[m]);

	}



    }



}