//Program to find duplicate element
package com.practice;

public class findDuplicate {

	public static void findRepeat(String []arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println("Duplicate element at "+i+" is:"+arr[i]);
				}
				
			}
		
	}
	}
	public static void main(String[] args) {
		
		String [] array= {"JSP","Java","Spring","Java","Hibernet","JSP","Servlet","MVC"};
		findRepeat(array);
	}

}
