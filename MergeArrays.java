import java.util.*;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array 1");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter elements of array 1");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter length of array 2");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter elements of array 2");

        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        int i = 0, j = 0, k = 0;
        int[] result = new int[n1 + n2];

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                i++;
                k++;
            } else
                result[k++] = b[j++];

        }
        // remaining elements
        while (i < n1)
            result[k++] = a[i++];
        while (j < n2)
            result[k++] = b[j++];
        for (int ele : result) {
            System.out.print(ele + " ");
        }

    }

}
