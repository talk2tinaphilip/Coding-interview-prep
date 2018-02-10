package interviewPrep;

import java.util.Scanner;

/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters
and ignoring cases.
For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
 */
public class ValidPalindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        boolean val = validPalindrome(s);
        if(val)
            System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }

    private static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
