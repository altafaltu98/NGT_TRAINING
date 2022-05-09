package Assignments;

public class Assignment5 {

	public static void main(String[] args) {

		int rows = 2, columns = 3;
		int[][] matrix1= {{1, 2, 3}, {5, 6, 7}};
		int[][] matrix2= {{5, 6, 7}, {1, 2, 3}};

		int[][] sum = new int[rows][columns]; 

		for(int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum[i][j] =matrix1[i][j] +  matrix2[i][j]; 
			}
		}

			System.out.println("Sum of two matrices is: ");
			for(int[] row : sum) {
				for (int column : row) {
					System.out.print(column + "    ");
				}
				System.out.println();
			}
		}
	}

