
package Polymorphism;

public class MethodOverloading {
    public static double sum(double a, double b){
        return a+b;
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static String sum(String a, String b){
        return a+b;
    }
    public static void main(String[] args) {
        double s = sum(10.12, 13.22);
        
        System.out.println("The float sum is = " + s);
    }
}
