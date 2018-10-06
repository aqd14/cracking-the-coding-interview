// Problem: Given a square matrix of size N.
// Write a method to rotate the image 90 degree.
// Do this in place

import java.util.Scanner;

public class MatrixRotation {

    public static void rotateMatrix(int[][] matrix) {
        if (matrix == null) return;
        if (matrix.length != matrix[0].length) return; // not a squared matrix
        
        reverse(matrix);
        
        for (int r = 0; r < matrix.length; r++) {
            for (int c = r + 1; c < matrix.length; c++) {
                swap(matrix, r, c, c, r);
            }
        }
    }
    
    private static void reverse(int[][] matrix) {
        for (int r = 0; r < matrix.length / 2; r++) {
            for (int c = 0; c < matrix.length; c++) {
                swap(matrix, r, c, matrix.length - r - 1, c);
            }
        }
    }

    private static void swap(int[][] matrix, int row1, int col1, int row2, int col2) {
        // skip checking validity of indexes
        int temp = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = temp;
    }

    public static int[][] makeMatrix(int N) {
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
        int[][] matrix = MatrixRotation.makeMatrix(N);
        System.out.println("Original matrix...");
        MatrixRotation.printMatrix(matrix);
        MatrixRotation.rotateMatrix(matrix);
        System.out.println();
        System.out.println("Rotated matrix...");
        MatrixRotation.printMatrix(matrix);
    }
}
