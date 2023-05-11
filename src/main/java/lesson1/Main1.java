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

        //делим два слова пополам и соединяем
        final int mid = word1.length() / 2;
        final int mid2 = word2.length() / 2; //get the middle of the String
        String[] parts = {word1.substring(0, mid),word2.substring(mid2)};
        //System.out.println(parts[0]); //first part
        //System.out.println(parts[1]);
        System.out.println ((parts[0])+(parts[1]));



    }


}
