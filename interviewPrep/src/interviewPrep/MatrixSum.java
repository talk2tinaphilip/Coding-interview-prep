package interviewPrep;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class MatrixSum {

    static int diagonalDifference(int[][] a) {
        // Complete this function
        int d1 = 0, d2 = 0, result = 0, i = 0, j=0, k = a.length-1;
        while(i < a.length){
            d1 += a[i][i];
            i++;
        }
        System.out.println("d1: " + d1);
        while(j < a.length && k >= 0) {
            d2 += a[j][k];
            j++; k--;
        }
        System.out.println("d2: " + d2);
        if(d1 > d2) result = d1 - d2;
        else result = d2-d1;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
