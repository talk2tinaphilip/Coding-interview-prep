package interviewPrep;

public class longestWord {
    static String getLongest(String s, String[] t) {
        int wordLength  = 0; String word = "";

        for(int l = 0; l < t.length; l++) {
            int j = 0, k = 0, counter =0;
            while (j < s.length() && k < t[l].length()) {
                if (s.charAt(j) != t[l].charAt(k))
                    j++;
                else {
                    j++;
                    k++;
                    counter++;
                }
            }
            if ((counter == t[l].length()) && (wordLength < t[l].length())) {
                wordLength = t[l].length();
                word = t[l];
                //System.out.println(word);
            }
        }
        return word;
    }

    public static void main(String[] args) {
        String s = "abbpppllee";
        String d[] = {"able", "ale", "apple", "bale", "kangaroo"};
        String longest;
        longest = getLongest(s, d);

        System.out.println(longest);
    }
}
