public class Loops {
    public static void main(String[] args) {

        int sum = 0;
        System.out.println("LOOP 1:");
        for (int i = 1; i < 11; i++) {
            sum += i;
            System.out.println(sum);

        }
        System.out.println();
        System.out.println("LOOP 2:");

        int sum1 = 0;
        int i = 1;

        while (sum1 >= 100) {
            sum1 += i;
            System.out.println(sum1);

            i++;

        }

    }
}
