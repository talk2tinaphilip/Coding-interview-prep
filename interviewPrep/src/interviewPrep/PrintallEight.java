package interviewPrep;

public class PrintallEight {
    public static void main(String args[]) {
        for (int i = 1; i < 101; i++) {
            int j = i;
            if (j % 10 == 8)
                System.out.println(j);
            else if(j >79 && j < 90)
                System.out.println(j);
            j /= 10;
        }
    }
}
