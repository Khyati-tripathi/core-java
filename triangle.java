import java.util.*;

public class triangle {
    public static void main(String[] args) {
        int x, y, z;

        System.out.println("enter Three sides");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if (x == y && y == z)
            System.out.println("Equilateral Triangle");
        else if (x == y || y == z || z == x)
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");
    }
}
