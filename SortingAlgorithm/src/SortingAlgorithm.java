import java.util.Scanner;
import java.util.Arrays;
/**
 * 
 */

/**
 * @author Kesaven
 *
 */
public class SortingAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating scanner
		Scanner mykeyboard = new Scanner(System.in);
		 //declaring variables
		 int decision;
		 do {
	      
	      int choice;
		
		  int size, i, j, temp;
		  
		 // asking user to input array size
		  System.out.print("Enter Array Size : ");  
		  size = mykeyboard.nextInt();
		  
		  //array is stored in num
		  int num[] = new int[size];  
		   
		  
		   
		  // asking user to input array number that are to be sorted
		  System.out.print("Enter Array Elements : ");  
		  for(i=0; i<size; i++)  
		  {  
		      num[i] = mykeyboard.nextInt(); 
		       
		  }
		   
		  //allowing user to select type of sorting
		  System.out.println("Enter 1 for selection sort, 2 for insertion sort, 3 for bubble sort, 4 for quick sort");
		  choice = mykeyboard.nextInt();
		  
		  //selection sort
		  if (choice==1) {
			  System.out.println("Sorting Array using Selection Sort");
			  
			  //to check if index < size, increment index by 1
		       for(i=0; i<size; i++)  
		       {  
		    	   //incremented index is store in j, check if j < size and increment j by 1 
		           for(j=i+1; j<size; j++)  
		           {  
		        	   //check if index i < index j
		               if(num[i] > num[j])  
		               { 
		            	   //swapping index of number 
		                   temp = num[i];  
		                   num[i] = num[j];  
		                   num[j] = temp;  
		               }  
		           }  
		       }  
		         
		       System.out.println(" After Sorting, the array is");  
		       for(i=0; i<size; i++)  
		       {  
		           System.out.print(num[i]+ "  ");  
		       }  
		  }
		  
		  //allowing user to select type of sorting 
		  else if (choice == 2) {
			  System.out.println("Sorting array using insertion Sort"); 
			  
			  //using a loop
			  for(int k=1; k<size; k++)   
			    {  
			        temp = num[k];  
			        j= k-1;  
			        while(j>=0 && temp <= num[j])  
			        {  
			            num[j+1] = num[j];   
			            j = j-1;  
			        }  
			        num[j+1] = temp;  
			    }  
			    System.out.println("printing sorted elements ...");  
			    for(i=0;i<size;i++)  
			    {  
			        System.out.println(num[i] + " ");  
			    }  
		        
		  }
		  else if (choice==3) {
			  System.out.println("Sorting using bubble sort");
			  for (i=0; i < (size-1); i++ ) {
				  for (j=0; j< (size-1); j++) {
					  if (num[j] > num[j+1] ) {
						  temp = num[j];
						  num[j] = num[j+1];
						  num[j+1] = temp;
					  }
					  
				  }
			  }
			  System.out.println("Array after sorting");
			  for (i = 0; i<size; i++) {
				  //output
				  System.out.println(num[i] + " ");
			  }
		  }
		  
		
		
		  else if (choice == 4) {
			    // display output
				System.out.println("array for quick sort");
				
				
				
				//q s= quick sort
				SortingAlgorithm qs = new SortingAlgorithm();
				qs.quickSort(num, 0 ,num.length-1);
				qs.numberArray(num);
				}
				
				
		 
		  else;
		  System.out.println("Invalid choice");
		  
		 System.out.println("Press: 1 to continue,2 to exit");
		 decision = mykeyboard.nextInt();
		 }
		 
		 while (decision == 1);
		 System.out.println("You are exiting the program.");
		 
		 
	}
	
	
		
		int partition(int num[], int begin, int end) {
			// middle of array
			int pivot = num[(begin + end)/2]; 
	
	
		 while (begin <= end) {
			 while(num[begin] < pivot) {
				 begin++; 
			 } 
				
			 while(num[end] > pivot) {
				 end--; 
			 }
				
			 
			 if (begin <= end) {
				 int tmp = num[begin];
				 num[begin] = num[end];
				 num[end] = tmp;
				 
				 begin++;
				 end--; 
			 }
			 	 
		 }
	 
	 return begin;
	 }
	     void quickSort(int []num, int begin, int end)  
	    {
	    	 int part = partition(num, begin, end);
	    	 if(begin<part-1){
	    		 quickSort(num, begin, part-1);
	    	 }
	    	 if (part<end) {
	    		 quickSort(num, part, end);
	    	 }
	          

	    }
	     void numberArray(int[]num) {
	    	 for(int i:num) {
			System.out.println(i +" ");
	    	 }

	}

}
