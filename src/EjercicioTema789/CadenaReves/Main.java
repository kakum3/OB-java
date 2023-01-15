package EjercicioTema789.CadenaReves;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println ("Hello World!");

        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.println ("Introduce un texto");
        text = scanner.nextLine();

        StringBuilder reves = new StringBuilder(text);
        text = reves.reverse ().toString();
        System.out.println (text);
    }
}
