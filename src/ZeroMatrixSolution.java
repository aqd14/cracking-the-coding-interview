// Problem: Given a matrix of size MxN. Write a method to, if an element is 0,
// set its row and column to 0

import java.util.Set;

public class ZeroMatrixSolution {

    // Store column and zero indexes of zero element into the 1st row and 1st column
    public static void setZeros(int[][] matrix) {
        if (matrix == null) return;

        int numRows = matrix.length;
        int numCols = matrix[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        for (int col = 0; col < numCols; col++) {
            if (matrix[0][col] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        for (int row = 0; row < numRows; row++) {
            if (matrix[row][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }

        for (int row = 1; row < numRows; row++) {
            for (int col = 1; col < numCols; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        // Turn all the elements with the same column to 0
        for (int col = 1; col < numCols; col++) {
            if (matrix[0][col] == 0) {
                for (int row = 0; row < numRows; row++) {
                    matrix[row][col] = 0;
                }
            }
        }

        // Turn all the elements with the same column to 0
        for (int row = 1; row < numRows; row++) {
            if (matrix[row][0] == 0) {
                for (int col = 0; col < numCols; col++) {
                    matrix[row][col] = 0;
                }
            }
        }

        if (firstRowHasZero) {
            for (int col = 0; col < numCols; col++) matrix[0][col] = 0;
        }

        if (firstColHasZero) {
            for (int row = 0; row < numRows; row++) matrix[row][0] = 0;
        }
    }

    private static void printMatrix(int[][] a) {
        if (a == null) return;
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,0,6},{7,8,9}};
        ZeroMatrixSolution.printMatrix(a);
        System.out.println();
        ZeroMatrixSolution.setZeros(a);
        ZeroMatrixSolution.printMatrix(a);

        System.out.println("---------------");
        int[][] b = {{1,2,0},{4,0,6},{7,8,9}};
        ZeroMatrixSolution.printMatrix(b);
        System.out.println();
        ZeroMatrixSolution.setZeros(b);
        ZeroMatrixSolution.printMatrix(b);
    }
}
