package EjercicioTema789.Divide0;

import java.util.Scanner;

public  class DividePor0 {
    private static int Dividir (int a, int b) throws ArithmeticException{
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Indica números: ");
        System.out.println ("Número 1: ");
        int a = scanner.nextInt();
        System.out.println ("Número 2: ");
        int b = scanner.nextInt();
        try {
            System.out.println ("Resultado: " + Dividir (a, b));
        }catch (ArithmeticException e) {
            System.out.println ("Esto no se puede hacer");

        }finally {
            System.out.println ("Demo de codigo");
        }
    }
}
