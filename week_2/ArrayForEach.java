package week_2;

import java.util.*;

public class ArrayForEach {
	
	public static void main(String[] args) {
		
		int matrixA[][] = new int[2][2];
		int matrixB[][] = new int[2][2];
		int matrixC[][] = new int[2][2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<2 ;i++) {
			for(int j=0 ; j<2 ;j++) {
			
			System.out.println("Enter the value of matrix A :" );
			matrixA[i][j] = sc.nextInt();
			
			}
			
		}
		
		for(int i=0 ; i<2 ;i++) {
			for(int j=0 ; j<2 ;j++) {
			
			System.out.println("Enter the value of matrix B :" );
			matrixB[i][j] = sc.nextInt();
			
			}
			
		}
		
		for(int i=0 ; i<2 ;i++) {
			for(int j=0 ; j<2 ;j++) {
			matrixC[i][j] = matrixA[i][j]+ matrixB[i][j];
			}
			
		}
		
		for(int i=0 ; i<2 ;i++) {
			for(int j=0 ; j<2 ;j++) {
			System.out.print(matrixC[i][j] + " ");
			
			}
			System.out.println();
			
		}
		
		
}
}
