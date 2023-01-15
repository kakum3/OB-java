package EjercicioTema789.ArrayBidimensional;

public class ArrayBidimensional {
    public static void main(String[] args) {
       Integer[][] numbers = {
                {5, 30, 45},
                {20, 30, 60}
        };
       for (int i = 0; i < numbers.length; i++) {
           for (int j = 0; j <numbers[i].length; j++) {
               System.out.println ("Fila: " + (i + 1)+ " | Columna: " + (j + 1) + "\nEl valor es: " + numbers[i][j] + " \n");

           }
       }
    }
}
