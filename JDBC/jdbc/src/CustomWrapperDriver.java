import java.util.Scanner;

interface MyWrapper {
    void printType();
}

class MyInteger implements MyWrapper {
    String str;

    public MyInteger(String str) {
        this.str = str;
    }

    public void printType() {
        System.out.println("The input is of type Integer and value is: " + str);
    }
}

class MyDouble implements MyWrapper {
    String str;

    public MyDouble(String str) {
        this.str = str;
    }

    public void printType() {
        System.out.println("The input is of type Double and value is: " + str);
    }
}

class MyCharacter implements MyWrapper {
    String str;

    public MyCharacter(String str) {
        this.str = str;
    }

    public void printType() {
        System.out.println("The input is of type Character and value is: " + str);
    }
}

class MyBoolean implements MyWrapper {
    String str;

    public MyBoolean(String str) {
        this.str = str;
    }

    public void printType() {
        System.out.println("The input is of type Boolean and value is: " + str);
    }
}

class MyWrapperFactory {
    public MyWrapper createMyWrapper(String input) {
        if (input == null || input.length() == 0)
            return null;
        else if (input.matches("\\d+"))
            return new MyInteger(input);
        else if (input.matches("[+-]?(\\d*[.])?\\d+"))
            return new MyDouble(input);
        else if (input.equals("true") || input.equals("false"))
            return new MyBoolean(input);
        else if (input.matches("[a-zA-Z]"))
            return new MyCharacter(input);
        else
            throw new IllegalArgumentException("Not a valid input type");
    }
}

public class CustomWrapperDriver {
    public static void main(String[] args) {
        MyWrapperFactory obj = new MyWrapperFactory();
        System.out.println("Enter a value: ");
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        MyWrapper w = obj.createMyWrapper(value);
        if (w != null)
            w.printType();
        else
            System.out.println("Empty input");

    }

}
