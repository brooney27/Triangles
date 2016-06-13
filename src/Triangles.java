/*
 * Triangles.java
 * 
 * Brian Rooney June 13, 2016
 */

import java.util.Scanner;

public class Triangles {
	public static void main(String[] args){
		
		int[] side = new int[3];

		Scanner in = new Scanner(System.in);
		
		//read in parameters
		System.out.println("Enter the length of side 1 of the triangle: ");
		side[0] = in.nextInt();
		in.nextLine();
		
		System.out.println("Enter the length of side 2 of the triangle: ");
		side[1] = in.nextInt();
		in.nextLine();
		
		System.out.println("Enter the length of side 3 of the triangle: ");
		side[2] = in.nextInt();
		
		in.close();
		
		if(isEquilateral(side))System.out.println("This is an equilateral triangle");
		else{
			System.out.println("This is not an equilateral triangle");
			if(isRight(side))System.out.println("However it is a right triangle");
			else System.out.println("It is also not a right triangle");
		}
		
		//print result
		System.out.println();
	}
	
	private static boolean isEquilateral(int[] side){
		
		return(side[1] == side[2] && side[0] == side[1]);
		
	}
	
	private static boolean isRight(int[] side){
		
		if(side[1]*side[1] + side[2]*side[2] == side[0]*side[0])
			return true;
		if(side[1]*side[1] + side[0]*side[0] == side[2]*side[2])
			return true;
		if(side[0]*side[0] + side[2]*side[2] == side[1]*side[1])
			return true;
		return false;
	}
}

