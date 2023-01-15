package EjercicioTema789.Vector;

import java.util.Vector;

public class EjercicioVector {
    public static void main(String[] args) {
        Vector vector = new Vector();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println (vector);

        vector.remove (2);
        vector.remove (1);

        System.out.println (vector);
    }
}
