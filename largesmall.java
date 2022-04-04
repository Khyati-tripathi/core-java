import java.util.*;

public class largesmall {
    public static void main(String[] args) {
        int n1, n2, n3;

        System.out.println("enter Three numbers");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        int largest = 0, smallest = 0;
        largest = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        smallest = n3 < (n1 < n2 ? n1 : n2) ? n3 : ((n1 < n2) ? n1 : n2);
        System.out.println("largest number is: " + largest);
        System.out.println("smallest number is: " + smallest);
    }

}
