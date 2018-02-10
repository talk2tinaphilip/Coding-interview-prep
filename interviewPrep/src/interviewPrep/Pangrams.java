package interviewPrep;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Pangrams {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int alphabetArray[] = new int[26];
        boolean flag = false;
        char sChar[] = s.toLowerCase().toCharArray();
        for(int i= 0; i < sChar.length; i++) {
            if ((int)sChar[i] >= 'a' &&  (int)sChar[i] <= 'z'){
                alphabetArray[sChar[i] - 97] = 1;
            }
        }
        for(int j = 0; j < alphabetArray.length; j++){
            System.out.print(alphabetArray[j]);
            System.out.println();
            if(alphabetArray[j] <1){
                flag = true;
                break;}
        }
        if(flag == true)
            System.out.println("not pangram");
        else System.out.println("pangram");
    }
}