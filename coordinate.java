import java.util.*;

public class coordinate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		if (a > 0 && b > 0)
			System.out.println("Ist Quadrant");
		else if (a < 0 && b > 0)
			System.out.println("2nd Quadrant");
		else if (a < 0 && b < 0)
			System.out.println("3rd Quadrant");
		else if (a > 0 && b < 0)
			System.out.println("4th Quadrant");
		else
			System.out.println("Origin");
	}

}
