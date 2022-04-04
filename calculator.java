import java.util.*;
import java.lang.*;
class calculator {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int c, number1, number2, result = 0;
    while(true){
        System.out.println("Select an operation");
        System.out.println("1. Add \n2. Subtract \n3. Multiply \n4. Divide \n5. Modulus \n6.To exit");
        c = sc.nextInt();
        System.out.println("Enter number 1 ");
        number1 = sc.nextInt();
        System.out.println("Enter number 2 ");
         number2= sc.nextInt();

        switch (c) {
            case 1:
                result = number1+ number2 ;
                System.out.println("Sum is " + result);
                break;
            case 2:
                result = number1-number2;
                System.out.println("Difference is " + result);
                break;
            case 3:
                result = number1*number2;
                System.out.println("Multiplication is " + result);
                break;
            case 4:
                if ( number2!= 0) {
                    double res = number1/number2;
                    System.out.println("Division is " + res);
                } else
                    System.err.println("Cannot divide by zero");
                break;
            case 5:
                result = number1%number2;
                System.out.println("Remainder is " + result);
                break;
            case 6:
                System.exit(0);
            default:
                System.err.println("Wrong input");

        }
    }

}
}
