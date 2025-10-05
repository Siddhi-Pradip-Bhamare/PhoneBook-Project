package project;

import java.util.LinkedHashSet;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
	public static void main(String[] args) {
		int i,j,count,mobcount;
		Long mobile;
		String name;
		Scanner scan=new Scanner(System.in);
		
TreeMap<String,LinkedHashSet<Long>> contact=new TreeMap<String, LinkedHashSet<Long>>();
            LinkedHashSet<Long>mobiles;
            
            System.out.println("*********Welcome to PhoneBook**************");
            System.out.println("how many no of contact you want to store");
            count=scan.nextInt();
            
            for(i=1;i<=count;i++)
            {
            	System.out.println("enter name");
            	name=scan.next();
            	
            	System.out.println("enter no of mobile no want to store");
            	mobcount=scan.nextInt();
            	
            	mobiles=new LinkedHashSet<Long>();
            	
            	 for(j=1;j<=mobcount;j++)
            	 {
            		 System.out.println("enter"+j+"mobile no");
            		 mobile=scan.nextLong();
            		 mobiles.add(mobile);
            	 }
            	contact.put(name, mobiles);
            	
            }
            for(Map.Entry<String, LinkedHashSet<Long>> me:contact.entrySet())
            {
            	 System.out.println("Name: "+me.getKey());
            	 System.out.println("mbiles: "+me.getValue());
            	 System.out.println("*****************");
            }
            
            
   }
}

