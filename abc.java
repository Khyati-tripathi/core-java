import java.util.*;
public class abc {
    boolean a;
    byte f;
    short g;
    int d;
    long e;
    float c;
    double b;
    char h;
    void Display() {
        System.out.println("Default values:");
        System.out.println("boolean = " + a);
        System.out.println("double = " + b);
        System.out.println("float= " + c);
        System.out.println("int = " + d);
        System.out.println("long = " + e);
        System.out.println("byte = " + f);
        System.out.println("short = " + g);
        System.out.println("char= " + h);
       a=true;
       b=5.0;
       c=8.0f;
       d=9;
       e=7l;
       f=2;
       g=3;
       h='h';
       System.out.println("After initialization:");
       System.out.println("boolean = " + a);
       System.out.println("double = " + b);
       System.out.println("float= " + c);
       System.out.println("int = " + d);
       System.out.println("long = " + e);
       System.out.println("byte = " + f);
       System.out.println("short = " + g);
       System.out.println("char= " + h);
 
    }
    public static void main(String[] args) {
       abc d = new abc();
       d.Display();
    }
 }

       
 