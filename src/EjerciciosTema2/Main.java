package EjerciciosTema2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Introduce un número: ");

        int numero = scanner.nextInt ()
;
    double iva = numero * 0.21;
    double suma = numero +iva ;
        System.out.println ("El resultado con iva es: "+suma);
    }
}
