import java.util.*;
import java.io.*;



public class discow{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	String line = in.readLine();
	StringTokenizer st;

	int frequency[]=new int[26];
	int pos1=0, pos2=0, answer=0;

	for(char ch='A'; ch<='Z';ch++){

		for(int i=0;i<line.length();i++){

			if(line.charAt(i)==ch){
				pos1=i;
				break;
			}
		}	

		for(int i=line.length()-1;i>=0;i--){

			if(line.charAt(i)==ch){
				pos2=i;
				break;
			}
		}

		
		for(int i=0;i<26;i++){
			frequency[i]=0;
		}

		for(int i=pos1;i<=pos2;i++){

			frequency[line.charAt(i)-'A']++;

		}

		for(int i=0;i<26;i++){

			if(frequency[i]==1){
				answer++;
			}
		}
	}

	


	System.out.println(answer/2);




        in.close();


    }



}
