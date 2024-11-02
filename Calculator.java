public class Calculator {
    public static int calc(int a, int b) {
        if (a > b) {
            return a * 2;
        } else if (a == b) {
            return a + b;
        } else {
            return b - a;
        }
    }
    public static void main(String[] args) {
        System.out.println(calc(10, 5));
        System.out.println(calc(5, 5));
        System.out.println(calc(3, 7));
    }
}