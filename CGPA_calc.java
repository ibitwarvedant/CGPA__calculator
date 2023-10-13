//package practice;

import java.util.Scanner;

public class CGPA_calc 
{
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total courses registered");
		int n=sc.nextInt();
		float total_credits=0;
		float total_creditsXgrade=0;
		float total_grades=0;
		int[] g=new int[n];
		int[] c=new int[n];
		double[] cXg=new double[n];
		for(int i=0;i<n;i++) 
		{
			System.out.println("enter credits and grade points earned for subject : "+(i+1));
			int credits=sc.nextInt();
			int grade_points = sc.nextInt();
			total_grades=total_grades+grade_points;
			total_creditsXgrade=total_creditsXgrade+(credits*grade_points);
			g[i]=grade_points;
			c[i]=credits;
			cXg[i]=total_creditsXgrade;
//			System.out.println((i+1)+"->Total creditsXgrades: "+credits+"*"+grade_points+"="+total_creditsXgrade);
			total_credits=total_credits+credits;
//			System.out.println((i+1)+"->Total credits: "+total_credits);
			System.out.println("_______________________________________________________");
		}
		float CGPA=total_creditsXgrade/total_credits;
		System.out.println("-------------------------------------------------------");
		System.out.println("\t credits \t grades \t creditXgrade");
		System.out.println("-------------------------------------------------------");
		for(int i=0;i<n;i++) {
			System.out.println("\t "+c[i]+" \t \t "+g[i]+" \t \t "+c[i]*g[i]);
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("Total\t "+total_credits+" \t \t "+total_grades+" \t \t "+total_creditsXgrade);
		System.out.println("-------------------------------------------------------");

		System.out.println("->Total Credits: "+total_credits);
		System.out.println("->Total Grades: "+total_grades);

		System.out.println("->Total creditsXgrades: "+total_creditsXgrade);

		System.out.println("->CGPA = sum of (credit*grade)/ sum of (grades)");
		System.out.println("->CGPA: "+total_creditsXgrade+"/"+total_grades+"="+CGPA);
		sc.close();
	}
}
