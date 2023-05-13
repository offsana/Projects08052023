package task3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner сonwert = new Scanner(System.in);
        System.out.println("Введите сумму в долларах");
        double euro = Integer.parseInt(сonwert.nextLine());
        double result = (euro * 1.09);
        System.out.print("Сумма в евро "+ result);

    }

}
