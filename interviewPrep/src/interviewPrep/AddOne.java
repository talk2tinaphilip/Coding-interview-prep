package interviewPrep;


/*
[1,2,3,4] --> [1,2,3,5]
[9,9,9]   --> [1,0,0,0]
[1,2,9]   --> [1,3,0]
 */
public class AddOne {
    public static final int[] addOne(int[] digits) {
        int carry = 1;
        int[] result = new int[digits.length];
        for (int i = digits.length - 1; i >= 0; i--) {
            int val = digits[i] + carry;
            result[i] = val % 10;
            carry = val / 10;
        }
        if (carry == 1) {
            result = new int[digits.length + 1];
            result[0] = 1;
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] input = {1,2,3,4};

        int[] resultArray = addOne(input);

        for(int i = 0; i< resultArray.length; i++){
            System.out.print(resultArray[i]+ " ");
        }
    }
}
