package pl.kru;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Who ara you? ");
        String name = scan.nextLine();
        //System.out.println("Hail my lord " +name);

        if (!name.isEmpty() && !name.equals("Cesar") && (!name.endsWith("a") || name.equals("Barnaba") || name.equals("Kuba"))) {
            System.out.println("Hail! " + name + " my Lord");
        } else if(!name.isEmpty() && name.endsWith("a")) {
            System.out.println("Hail! " +name+  " my Lady");
        } else if (name.equals("Cesar")){
            System.out.printf("Ave Caesar morituri te salutant");
        } else {
            System.out.println("Hello Nameless, I haven't seen you for a long time");
        }

        Scanner scan2 = new Scanner(System.in);

        System.out.println("\nHow old are you? ");
        int age = scan2.nextInt();

        if (age >= 55 && name.equals("Cesar")) {
            System.out.println("Beware of Brutus");
        } else if (age >= 18) {
            System.out.println("You are of legal age");
        } else {
            System.out.println("You are underage");
        }
    }
}
