package Samples;

import java.util.Scanner;

public class Mirrorinverseprogram {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		   System.out.println("Enter the number of rows");
		 
		 //read the number of rows in array
       int rowCount = reader.nextInt();
           System.out.println("Enter the number of columns");
           
         //read the number of columns in array
       int columnCount = reader.nextInt();
       
         //create array
       int[][] array = new int[rowCount][columnCount];
           System.out.println("Starting input of array elements...\n");
        //loop to read array elements
       for(int i = 0; i < rowCount; i++) {
       for(int j = 0; j < columnCount; j++) { 
    	  System.out.println("Enter the element of row " + (i + 1) + ", column " + (j + 1));
    	  
       //assign element to array
    		   array[i][j] = reader.nextInt();
    		 }
       }
        //closer reader
              reader.close ()  ;
         System.out.println("Entered array is : ");
         
       //display array elements
             displayArray(array);
             
       //Create a new array of same size as original array
    int[][] mirrorImage = new int[rowCount][columnCount];
    
       //Iterate over the rows of actual array
    for (int row =0; row < rowCount; row++) {
    	
      //initialize column for image array
    int imageColumn = 0;
    
      //Iterate over the columns of original array in reverse direction
    for (int column = columnCount -1; column >=0; column--) {
    	
      //get element at current row and column
    int element = array[row][column];
    
      //assign element to the image array
    	mirrorImage[row][imageColumn] = element;
    	
      //increment the image array column counter
    	imageColumn++;
      }	
    }
        System.out.println("Mirror image of array is : ");
    
      //display array image
       displayArray(mirrorImage);
    }

	static void displayArray(int[][] array) {
		// TODO Auto-generated method stub
		for(int i = 0; i < array.length; i++) {
			int[] row = array[i];
			for(int j = 0; j < row.length; j++) {
				int element = array[i][j];
		System.out.print(element + " ");
				}
			
		System.out.println();
	   }
	}
}
