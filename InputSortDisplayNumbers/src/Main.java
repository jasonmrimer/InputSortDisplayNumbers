//JasonRimerH3
//CMIS141 - Homework 3
//Programmer: Jason M. Rimer
//Date: 12MAR2012
/* Purpose:
 * The purpose of this program is to input 10 numbers
 * into an array then sort and display the numbers.
 */


import java.util.*;

public class Main 
{//startClass

	//Create class to input array
	public static double inputArray(double array[])
	{//startinputArray
		for (int i = 0 ; i < 10 ; i++)
		{//startFor
			
			//Create Scanner
			Scanner scan = new Scanner(System.in);
			
			//Get Number
			System.out.print("Number " + (i+1) + ": ");
			array[i] = scan.nextDouble();
			
		}//endFor
		
		return 0;
		
	}//endinputArray
	
	//Create class to sort array
	public static void sortArray(double array[])
	{//startsortArrayMethod
		java.util.Arrays.sort(array);
	}//endsortArrayMethod
	
	//Create class to display array
	public static void displayArray(double array[])
	{//startDisplayMethod
		for (double u: array)
		{
		System.out.println(u);
		}
	}//endDisplayMethod
	
	public static void main(String[] args) 
	{//startMain
		
		//Declare array
		double array[] = new double[10];
		
		//Introduction
		System.out.println("This program will input, sort, and display 10 numbers (of double primitive type).");
		
		//Invoke inputArray to input array
		inputArray(array);
		
		//Invoke sortArray to sort array
		sortArray(array);
	
		//Invoke displayArray to display array
		displayArray(array);
		
	}//endMain

}//endClass
