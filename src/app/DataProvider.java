package app;

import java.util.Scanner;

public class DataProvider {

    public String getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input height (from 120 to 355 meters, inclusive): ");
        return sc.nextLine().trim();
    }
}
