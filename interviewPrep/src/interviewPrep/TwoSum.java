package interviewPrep;

public class TwoSum {
    public static int[]twoSum(int numbers[], int target){
        int j = numbers.length-1;
        int i = 0;
        while(i < j){
            if(numbers[j] == (target -numbers[i])) {
                return new int[]{i + 1, j + 1};
            }else if(numbers[j] > (target -numbers[i])) {
                j--;

            }
            else if(numbers[j] < (target -numbers[i])){
                i++;
            }

        }
        throw new IllegalArgumentException("No args found!");
    }
    public static void main(String[] args){
        int numbers[] = {2,3,5,7,10};
        int target = 10;int[] index = twoSum(numbers, target);
        for(int i = 0; i< index.length; i++)
            System.out.println(index[i]);twoSum(numbers, target);
    }
}
