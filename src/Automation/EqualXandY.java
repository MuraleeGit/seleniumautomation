package Automation;

public class EqualXandY {
	
	static int findIndex(int []arr, int X, 
						int Y, int n) 
	{ 
		
		int nx = 0, ny = 0; 

		int result = -1; 
		for (int i = 0; i < n; i++) 
		{ 
		
			if (arr[i] == X) 
				nx++; 

		
			if (arr[i] == Y) 
				ny++; 


			if ((nx != 0) && (nx == ny)) 
				result = i; 
		} 
		
		return result; 
	} 

		
		static public void main (String[] args) 
		{ 
		int []arr = {6, 42, 11, 7, 1, 42}; 
		int X = 7, Y = 42; 
		int n = arr.length; 
		System.out.println("Ending index of prefix is "
			+ findIndex(arr, X, Y, n)); 
		} 
	} 

