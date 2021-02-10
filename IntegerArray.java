package test;
import java.util.Scanner;

public class IntegerArray {
	
	public static void main(String[] args) {
		
		int a;
		  int child=0;
		  int adult = 0;
		  int senior=0;
		  Scanner sc = new Scanner(System.in);
		  System.out.println(" age elements you need :");
		  
		  a=sc.nextInt();
		  int age[] = new int[a];
		  System.out.println("Age of  Persons:");
		  for(int i=0;i<a;i++) {
		   age[i]=sc.nextInt();

		  }
		  for(int j=0;j<age.length;j++) {

		   if(age[j]<=18) {
		    
		    child++;

		   }

		   else if(age[j]>18 && age[j]<=54) {
		    
		    adult++;

		   }
		   else { 
		    
		    senior++;
		   }

		  }
		  System.out.println("Childrens:"+child);
		  System.out.println("Adults:"+adult);
		  System.out.println("seniorCitizens:"+senior);

		 }

		}



