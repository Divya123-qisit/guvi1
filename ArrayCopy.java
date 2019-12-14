package com.lab.array_copy;
import java.util.Arrays;
import java.util.*;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] org = new int[] {1, 2 ,3}; 
		  
		        System.out.println("Original Array"); 
		        for (int i = 0; i < org.length; i++) 
		            System.out.print(org[i] + " "); 
		  
		        // copying array org to copy 
		        int[] copy = Arrays.copyOf(org, 5); 
		  
		        // Changing some elements of copy 
		        copy[3] = 11; 
		        copy[4] = 55; 
		  
		        System.out.println("\nNew array copy after modifications:"); 
		        for (int i = 0; i < copy.length; i++) 
		            System.out.print(copy[i] + " "); 
		    } 
		} 
