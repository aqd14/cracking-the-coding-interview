// Problem: Given a square matrix of size N.
// Write a method to rotate the image 90 degree.
// Do this in place

import java.lang.Math;
import java.util.Scanner;

public class MatrixRotationSolution {

    public static void rotateMatrix(int[][] matrix) {
        if (matrix == null) return;
        if (matrix.length != matrix[0].length) return; // not a squared matrix

        int N = matrix.length;
        int midRow = N / 2;

        for (int row = 0; row < midRow; row++) {
            for (int col = 0; col < N; col++) {
                swap(matrix, row, col, N-row-1, N-col-1);
            }
        }

        // rotate the middle row if number of rows is odd
        if (N % 2 != 0) {
            for (int col = 0; col < N/2; col++) {
                swap(matrix, midRow, col, midRow, N-col-1);
            }
        }
    }

    private static void swap(int[][] matrix, int row1, int col1, int row2, int col2) {
        // skip checking validity of indexes
        int temp = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = temp;
    }

    private static int[][] makeMatrix(int N) {
        int[][] matrix = new int[N][N];
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                matrix[row][col] = row*N + col + 1;
            }
        }
        return matrix;
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int N = scanner.nextInt();
        int[][] matrix = MatrixRotationSolution.makeMatrix(N);
        System.out.println("Original matrix...");
        MatrixRotationSolution.printMatrix(matrix);
        MatrixRotationSolution.rotateMatrix(matrix);
        System.out.println();
        System.out.println("Rotated matrix...");
        MatrixRotationSolution.printMatrix(matrix);
    }
}
