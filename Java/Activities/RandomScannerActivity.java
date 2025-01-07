package hello;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList <Integer> list = new ArrayList<Integer>();
		Random indexGen = new Random();
		
		while(scan.hasNextInt()) {
		    list.add(scan.nextInt());
		}
		   
		    Integer nums[] = list.toArray(new Integer[0]);
		    int  Generatedindex = indexGen.nextInt(0, nums.length);
		    System.out.println(Generatedindex);
		    System.out.println(list.get(Generatedindex));
		    scan.close();    
		}

	

}
