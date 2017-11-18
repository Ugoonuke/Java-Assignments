import java.util.*;
public class methodOverload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = new String("Square");
        String c = new String("Rectangle");
        String d = new String("Triangle");
        String e = new String("Circle");
        String f = new String("Ellipse");
        if(a.equals(b)) System.out.println("Area: " + area(sc.nextInt()));
        else if(a.equals(c)) System.out.println("Area: " + area(sc.nextInt(), sc.nextInt()));
        else if(a.equals(d)) System.out.println("Area: " + area(sc.nextDouble(), sc.nextInt()));
        else if(a.equals(e)) System.out.println("Area: " + area(sc.nextDouble()));
        else if(a.equals(f)) System.out.println("Area: " + area(sc.nextDouble(), sc.nextDouble()));
        else System.out.println("Not a valid shape!");
    }
    public static double area(int a) {
        double b = a*a;
        return b;
    }
    public static double area(int a, int b) {
        double c = a*b;
        return c;
    }
    public static double area(double a, int b) {
        double c = (0.5*a*b);
        return c;
    }
    public static double area(double a) {
        double c = (Math.PI*(Math.pow(a, 2)));
        return c;
    }
    public static double area(double a, double b) {
        double c = (Math.PI*(0.5*a)*(0.5*b));
        return c;
    }
}
