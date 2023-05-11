package lesson1;

//import org.example.Main;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner main1 = new Scanner(System.in);

        System.out.println("Введите первое слово");
        String word1 = main1.nextLine();

        System.out.println("Введите второе слово");
        String word2 = main1.nextLine();

        //--System.out.println(word1.substring(0,3));
        //--System.out.println(word2.substring(0,2));
        System.out.println (word1.substring(0,3).concat(word2.substring(0,2)));


    }


}
