package task4;

public class Main4 {
    public static void main(String[] args) {

     double square = pizza1 (24);
     double square2 = pizza2 (28);

     double difference = square2 - square;
     double calories = difference * 40;

        System.out.println(calories);


    }

    public static double pizza1 (double i) {

        double square  = Math.PI / 4 * (i * i);
        return square;
    }
    public static double pizza2 (double b) {

        double square2  = Math.PI / 4 * (b * b);
        return square2;
    }

    }




