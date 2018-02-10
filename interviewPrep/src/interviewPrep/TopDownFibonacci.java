package interviewPrep;

public class TopDownFibonacci {
    private static long[] f = new long[92];

    public static long fibonacci(int n) {
        if (n <= 1) return n;

        // return cached value (if previously computed)
        if (f[n] > 0) return f[n];

        // compute and cache value
        f[n] = fibonacci(n-1) + fibonacci(n-2);
        return f[n];
    }

    public static void main(String[] args) {
        int n =10;
        for (int i = 0; i < n; i++)
            System.out.println(fibonacci(i));
    }
}
