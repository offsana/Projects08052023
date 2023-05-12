package lesson2;



public class Main2 {
    public static void main(String[] args) {

        int result = addition(10,2);
        int result2 = subtraction(15,5);
        int result3 = multiplication(3,3);
        int result4 = division(15,3);

        System.out.println("Выводим результат (+) " + result);
        System.out.println("Выводим результат (-) " + result2);
        System.out.println("Выводим результат (*) " + result3);
        System.out.println("Выводим результат (/) " + result4);

    }

    public static int addition ( int a, int b) {
        int c =a+b;
        return c;
    }
    public static int subtraction (int a,int b) {
        int d =a-b;
        return d;
    }
    public static int multiplication (int a,int b) {
        int e =a*b;
        return e;
    }
    public static int division (int a,int b) {
        int g =a/b;
        return g;
    }
}

