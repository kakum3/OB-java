package EjercicioTema789.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayString {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Juan");
        list.add("Jesús");
        list.add("Pepe");
        list.add("Ana");

        LinkedList<String> linkedList = new LinkedList<String>();

        for (int i = 0; i < list.size(); i++) {
            linkedList.add(i, list.get(i));
        }
        System.out.println ("Elementos del Array:");
        for (String element : list) {
            System.out.println (element + " ");

        }
        System.out.println ("\n\nElementos de la LinkedList:");
        for (String element : linkedList) {
            System.out.println (element + " ");
        }

    }
}
