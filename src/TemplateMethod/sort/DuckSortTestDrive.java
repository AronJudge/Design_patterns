package TemplateMethod.sort;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8 ),
                new Duck("Dewey", 2 ),
                new Duck("Margo", 3 ),
                new Duck("Louie", 5 ),
                new Duck("Honey", 7 ),
                new Duck("Dear", 8 ),
                new Duck("Beauty", 9 ),
        };
        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println("\n After sorting:");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
