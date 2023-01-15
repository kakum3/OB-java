package EjercicioTema789.CopiarFichero;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CopFichero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el fichero origen: ");
        String fileIn = scanner.nextLine();
        System.out.println ("Introduce el fichero destino: ");
        String fileOut = scanner.nextLine();
        copiar(fileIn, fileOut);


    }

    private static void copiar(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream (fileIn);
            byte[] datos = in.readAllBytes ();
            in.close ();

            PrintStream out = new
                    PrintStream (fileOut);
            out.write(datos);
            out.close ();
        } catch (Exception e) {
            System.out.println ("Exception:" + e.getMessage ());
        }
    }
}
