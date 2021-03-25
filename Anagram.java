package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter two strings =");
		Scanner sc=new Scanner (System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		anagram(s1,s2);
		
	}
	
	public static void anagram(String a1,String a2)
	{
		boolean flag;
		if(a1.length()!=a2.length())
		{
			System.out.println("Lengths are not matching strings cannot be anagram!!");
		}
		
		char arr1[]=a1.toLowerCase().toCharArray();
		char arr2[]=a2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		flag=Arrays.equals(arr1, arr2);
		
		if(flag)
		{
			System.out.println("Strings are Anagram");
		}
		else
		{
			System.out.println("String are not Anagram strings!!");
		}
		
	}	
	
	
	/*public static void sorting(String s)
	{
		
	}*/

}
