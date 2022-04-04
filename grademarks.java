import java.util.*;

public class grademarks {
    public static void main(String[] args) {
        double phy, chem, maths;

        System.out.println("enter Three numbers");
        Scanner sc = new Scanner(System.in);
        char grade = ' ';
        phy = sc.nextDouble();
        chem = sc.nextDouble();
        maths = sc.nextDouble();
        double marks = phy + chem + maths / 3;
        if (marks >= 85)
            grade = 'A';
        else if (marks >= 60 && marks < 85)
            grade = 'B';
        else
            grade = 'C';
        System.out.println("total marks= " + marks * 3);
        System.out.println("grades= " + grade);
    }

}
