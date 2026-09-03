import Implementacion.DiccionarioMultipleEstatico;
import Interface.DiccionarioMultipleTDA;

public class Main {
    public static void main(String[] args) {
        DiccionarioMultipleTDA indice = new DiccionarioMultipleEstatico();

        indice.InicializarDiccionario();

        indice.Agregar("Recursion", 12);
        indice.Agregar("Recursion", 45);
        indice.Agregar("Recursion", 88);

        System.out.println("INDICE DEL LIBRO");
        int[] paginas = indice.Recuperar("Recursion");

        System.out.print("Recursion -> ");
        for (int i = 0; i < paginas.length; i++) {
            System.out.print(paginas[i]);

            if (i < paginas.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
