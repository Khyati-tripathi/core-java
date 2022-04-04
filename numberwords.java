import java.util.*;

public class numberwords {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        String[] words = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
                "nine" };
        int n;
        n = sc.nextInt();
        System.out.println(words[n]);
    }

}
