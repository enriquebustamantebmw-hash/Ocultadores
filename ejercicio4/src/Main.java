import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class Main {
    public static void main(String[] args) {

        ConjuntoTDA tags = new ConjuntoEstatico();

        tags.InicializarConjunto();

        // 1 = Programacion
        // 2 = Java
        // 3 = OOP

        tags.Agregar(1);
        tags.Agregar(2);
        tags.Agregar(3);

        System.out.println("Tags del post:");

        System.out.println("Programacion: " + tags.Pertenece(1));
        System.out.println("Java: " + tags.Pertenece(2));
        System.out.println("OOP: " + tags.Pertenece(3));
    }
}