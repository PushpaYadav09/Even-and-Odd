import java.util.*;
public class Array {
    static void evenoddArray(int A[], int n) {
        int count_even = 0;
        int count_odd = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                System.out.println(A[i] + " is even");
                count_even++;
            } else {
                System.out.println(A[i] + " is odd");
                count_odd++;
            }
        }
        System.out.println("Number of even elements :" + count_even);
        System.out.println("Number of even elements :" + count_odd);
    }
    public static void main(String args[]) {
        int[] A = {5,2,88,1,9,5};
        int n = A.length;
        for (int i = 0; i <n; i++) {
            System.out.println(A[i]);
        }
            evenoddArray(A, n);
    }
}
