import java.util.*;

public class rough {
    public static boolean isprime(int n) {
        if (n <= 1)
            return false;
        else {
            for (int j = 2; j <= n / 2; j++) {
                if (n % j == 0) {
                    return false;
                }

                return true;
            }

        }
        return true;
    }

    public static boolean armstrong(int n) {
        int number;
        number = n;
        int count = 0;
        int sum = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        number = n;
        while (number != 0) {
            int rem = number % 10;
            sum += (Math.pow(rem, count));
            number /= 10;

        }
        return (n == sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for range");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            if (isprime(i))
                System.out.println(i);
            else
                System.out.println(armstrong(i));
        }

    }
}
