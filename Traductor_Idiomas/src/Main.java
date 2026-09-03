import Implementacion.DiccionarioMultipleEstatico;
import Interface.DiccionarioMultipleTDA;

public class Main {
    public static void main(String[] args) {
        DiccionarioMultipleTDA traductor = new DiccionarioMultipleEstatico();

        traductor.InicializarDiccionario();

        traductor.Agregar("Bank", "Banco");
        traductor.Agregar("Bank", "Orilla");

        System.out.println("TRADUCTOR");
        String[] traducciones = traductor.Recuperar("Bank");

        System.out.print("Bank -> ");
        for (int i = 0; i < traducciones.length; i++) {
            System.out.print(traducciones[i]);

            if (i < traducciones.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
