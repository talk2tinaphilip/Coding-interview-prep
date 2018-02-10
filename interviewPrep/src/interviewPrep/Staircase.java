package interviewPrep;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Staircase {

    static void staircase(int n) {
        // Complete this function
        for(int i = 1; i<= n; i++){
            int space = n-i;
            for(int j = 0; j< space; j++)
                System.out.print(" ");
            for(int k = 0; k< i; k++)
                System.out.print("#");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}