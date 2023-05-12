package task3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {


        Scanner сonwert = new Scanner(System.in);
        System.out.println("Введите сумму в долларах");
        String euro = сonwert.nextLine();

        double result = sum1(Integer.parseInt(euro),1.09);
        System.out.print("Сумма в евро "+ result);

    }
    public static double sum1 (double a,double b){
    double c = a * b;
    return c;
    }
}
