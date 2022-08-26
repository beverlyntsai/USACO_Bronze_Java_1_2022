import java.util.*;
import java.io.*;



public class picture{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int fr1[]=new int[26];
	int fr2[]=new int[26];
	int ans[]=new int[26];


	for(int i=0; i<26;i++){

		fr1[i]=0;
		fr2[i]=0;
		ans[i]=0;	
	}

	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		String S1=st.nextToken();

		for(int j=0; j<S1.length();j++){

			fr1[S1.charAt(j)-'a']+=1;
		}

		String S2=st.nextToken();

		for(int k=0; k<S2.length();k++){

			fr2[S2.charAt(k)-'a']+=1;
		}

		for(int k=0; k<26;k++){

			ans[k]=Math.max(fr1[k],fr2[k]);
			fr1[k]=ans[k];
			fr2[k]=ans[k];
		}

	
	}

	

	for(int i=0; i<26;i++){

		System.out.println(ans[i]);
	}







        in.close();


    }



}
