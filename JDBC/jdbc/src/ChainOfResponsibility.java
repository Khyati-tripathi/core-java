import java.util.Random;

class MyNumber {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyNumber [value=" + value + "]";
    }

    public boolean startsWith(String string) {
        return false;
    }

}

class Request {
    private MyNumber myNumber;

    Request(MyNumber myNumber) {
        this.myNumber = myNumber;
    }

    public MyNumber getNumber() {
        return myNumber;
    }
}

abstract class Handler {
    protected Handler nextHandler;

    Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}

class NegativeNumberHandler extends Handler {
    NegativeNumberHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        if (request.getNumber().getValue().matches("^-[1-9][0-9]*"))
            System.out.println("It's a negative Number");
        else
            super.handle(request);
    }
}

class ZeroHandler extends Handler {
    ZeroHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        if (request.getNumber().getValue().matches("0+"))
            System.out.println("It's Zero");
        else
            super.handle(request);
    }
}

class PositiveNumberHandler extends Handler {
    PositiveNumberHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        if (request.getNumber().getValue().matches("\\d+"))
            System.out.println("It's a positive Number");
        else
            super.handle(request);
    }
}

class NotAnIntegerHandler extends Handler {
    NotAnIntegerHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        if (request.getNumber().getValue().matches("^[+-]?[0-9]+"))
            super.handle(request);
        throw new NumberFormatException("Not a valid Integer");

    }

}

class Chain {
    Handler firstHandler;

    Chain() {
        buildChain();
    }

    private void buildChain() {
        this.firstHandler = new NegativeNumberHandler(
                new ZeroHandler(new PositiveNumberHandler(new NotAnIntegerHandler(null))));
    }

    public void initiateChain(Request request) {
        firstHandler.handle(request);
    }
}

public class ChainOfResponsibility {
    public static void main(String[] args) {
        MyNumber number = new MyNumber();
        number.setValue("ghgj");
        try {
            Request request = new Request(number);
            Chain numberChain = new Chain();
            numberChain.initiateChain(request);
            System.out.println(request.getNumber());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}