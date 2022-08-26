import java.util.*;
import java.io.*;



public class secret{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	String name = in.readLine();
	String code = in.readLine();

	int result1=1, result2=1;

	for(int i=0;i<name.length();i++){

		result1=result1*(name.charAt(i)-'A'+1);
		result1=result1 % 47; //prevend 26^10(overflow)
	}
	//out.println("result1="+result1);
	//result1=result1 % 47; 
	//out.println("After %47 result1="+result1);

	for(int i=0;i<code.length();i++){

		result2=result2*(code.charAt(i)-'A'+1);
		result2=result2 % 47; //prevend 26^10(overflow)
	}

	//out.println("result2="+result2);

	//result2=result2 % 47; 
	//out.println("After %47 result2="+result2);


	if(result1==result2){
		System.out.println("GO");

	}else{
		System.out.println("STAY");
	}







        in.close();


    }



}
