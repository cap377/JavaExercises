package com.siriuscom.training;

// returns the transpose of a square array

public class Transpose {
	
	public static void main(String[] args) {
		int[][] matrix = { {1,2,3},
						   {4,5,6},
						   {7,8,9}};
		int n = matrix.length;
		int[][] newMatrix = new int[n][n];
		int col = 0;
		int row = 0;
		for (row = 0; row < n; row++) {
			for (col = 0; col < n; col++) {
				newMatrix[row][col] = matrix[col][row];
			}
		}
		for (row = 0; row < n; row++) {
			for (col = 0; col < n; col++) {
				System.out.print(newMatrix[row][col]);
			}
			System.out.println();
		}
	}
}
