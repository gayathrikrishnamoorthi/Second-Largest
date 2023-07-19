package sample;

import java.util.Scanner;

public class Secondlargest {
	

		public static void main(String[] args) {
			
							 Scanner sc=new Scanner(System.in);
							    int n=sc.nextInt();
						       
						        
						        int[] A = new int[n];
						        for(int i=0;i<n;i++) {
						        
						        	A[i]=sc.nextInt();
						        	
						        }
					        
					        int secondLargest = findSecondLargest(A);
					        
					        if (secondLargest != -1) {
					            System.out.println("Second largest element: " + secondLargest);
					        } else {
					            System.out.println("No such element exists.");
					        }
					    }
					    
					    public static int findSecondLargest(int[] A) {
					        int n = A.length;
					        
					        if (n < 2) {
					            return -1; 
					        }
					        
					        int largest = Integer.MIN_VALUE;
					        int secondLargest = Integer.MIN_VALUE;
					        
					        for (int i = 0; i < n; i++) {
					            if (A[i] > largest) {
					                largest = A[i];
					            }
					        }
					        
					        
					        for (int i = 0; i < n; i++) {
					            if (A[i] < largest && A[i] > secondLargest) {
					                secondLargest = A[i];
					            }
					        }
					        
					        if (secondLargest == Integer.MIN_VALUE) {
					            return -1;
					        }
					        
					        return secondLargest;
					    
		

		}

	}


