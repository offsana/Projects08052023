package lesson2;



public class Main2 {
    public static void main(String[] args) {

        int result = sum1(10,2);
        int result2 = sum2(15,5);
        int result3 = sum3(3,3);
        int result4 = sum4(15,3);

        System.out.println("Выводим результат (+) " + result);
        System.out.println("Выводим результат (-) " + result2);
        System.out.println("Выводим результат (*) " + result3);
        System.out.println("Выводим результат (/) " + result4);

    }

    public static int sum1 (int a,int b) {
        int c =(a+b);
        return c;
    }
    public static int sum2 (int a,int b) {
        int d =(a-b);
        return d;
    }
    public static int sum3 (int a,int b) {
        int e =(a*b);
        return e;
    }
    public static int sum4 (int a,int b) {
        int g =(a/b);
        return g;
    }
}

