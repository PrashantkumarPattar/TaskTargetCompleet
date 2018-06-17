import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClassRun {

public static void main(String[] args) {
		
	    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));	
		
	    int noOfTestCases = in.nextInt();

	    for(int i=0; i<noOfTestCases; i++) {
	    		
	    		int noOfElements = in.nextInt();
	
			int arr[] = new int[noOfElements]; 

	    		for(int j=0; j<noOfElements; j++) {
					arr[j] = in.nextInt();
				}
			
	    		TroubleSort(arr);
	    		

						
			
			int getStatus = Check(arr);
			if(getStatus == -1) {
				System.out.println("Case #" + (i+1) + ":" + " OK");
			}
			else {
				System.out.println("Case #" + (i+1) + ": " + getStatus);

			}		
	    }
	    
		in.close();
	}

	public static void TroubleSort(int a[]) { // L is a 0-indexed list of integers
		boolean done = false;
		while (!done) {
			done = true;

			for (int i = 0; i < (a.length - 2); i++) {
				if (a[i] > a[i + 2]) {
					done = false;
					
					int temp = a[i];
					a[i] = a[i + 2];
					a[i + 2] = temp;
				}
			}
		}
	}

	
	public static int Check(int a[]) {
		int index = -1;
		for(int i=0; i<a.length-1; i++) {
			if(a[i] > a[i+1]) {
				index = i;
				return index;
			}
		}
		return index;
	}
}
