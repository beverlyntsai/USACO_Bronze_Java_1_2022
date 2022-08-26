import java.util.*;
import java.io.*;


public class acornshopping{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	Acorn a[]=new Acorn[n];


	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());
		a[i]= new Acorn();
		a[i].index=i+1;
		a[i].delicious=Integer.parseInt(st.nextToken());
		a[i].price=Integer.parseInt(st.nextToken());
		a[i].ratio=(double)a[i].delicious/a[i].price;
	}


	Arrays.sort(a, new comp());

	int totalPrice=0;

	for(int i=0; i<3;i++){

		totalPrice+=a[i].price;
	}


	System.out.println(totalPrice);

	for(int i=0; i<3;i++){

		System.out.println(a[i].index);
	}


        in.close();


    }

	static class Acorn{
		int index;
		int delicious;
		int price;
		double ratio;
	}


	//Step-2: Implement Comparator Interface
	static class comp implements Comparator <Acorn> { 
		public int compare(Acorn c1, Acorn c2) {//compare method will take two acorns
			if (c1.ratio< c2.ratio)//it will sort the array by game in descending order 
				return 1;
                        if (c1.ratio > c2.ratio) 
				return -1;
			return 0;
		}
	}

}
