import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class Main {
    public static void main(String[] args) {

        ConjuntoTDA blacklist = new ConjuntoEstatico();

        blacklist.InicializarConjunto();

        // 1 = Crypto
        // 2 = Ganá
        // 3 = Premio

        blacklist.Agregar(1);
        blacklist.Agregar(2);
        blacklist.Agregar(3);

        int palabra = 2;

        if (blacklist.Pertenece(palabra)) {
            System.out.println("La palabra está prohibida. El mail es spam.");
        } else {
            System.out.println("La palabra no está prohibida. El mail no es spam.");
        }
    }
}