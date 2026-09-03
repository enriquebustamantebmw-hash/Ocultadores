import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class Main6 {
    public static void main(String[] args) {

        ConjuntoTDA conjunto = new ConjuntoEstatico();

        conjunto.InicializarConjunto();

        conjunto.Agregar(10);
        conjunto.Agregar(20);
        conjunto.Agregar(30);

        int elemento1 = conjunto.Elegir();
        int elemento2 = conjunto.Elegir();

        System.out.println("Primer Elegir: " + elemento1);
        System.out.println("Segundo Elegir: " + elemento2);
        System.out.println("¿Devuelve el mismo elemento?: " + (elemento1 == elemento2));
    }
}