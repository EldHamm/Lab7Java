package timus;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Double> numbers = new ArrayList<>();

        while (in.hasNextDouble()) {
            double number = in.nextDouble();
            numbers.add(Math.sqrt(number));
        }

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.printf("%.4f%n", numbers.get(i));
        }

        in.close();
    }
}