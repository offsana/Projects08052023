package task3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner Conwert = new Scanner(System.in);
        System.out.println("Введите сумму в долларах");
        String euro = Conwert.nextLine();
        double result = (int) sum1(Integer.parseInt(euro),1.09);
        System.out.print(result);

    }
    public static double sum1 (double a,double b){
    double c = (a*b);
    return c;
    }
}
