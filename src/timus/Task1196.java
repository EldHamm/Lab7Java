package timus;

import java.util.HashSet;
import java.util.Scanner;

public class Task1196 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        HashSet<Integer> dates = new HashSet<>();

        for (int i = 0; i < n; i++) {
            dates.add(in.nextInt());
        }

        int m = in.nextInt();
        int count = 0;

        for (int i = 0; i < m; i++) {
            int year = in.nextInt();

            if (dates.contains(year)) {
                count++;
            }
        }

        System.out.println(count);

        in.close();
    }
}