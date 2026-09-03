import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class Main5 {
    public static void main(String[] args) {

        ConjuntoTDA legajos = new ConjuntoEstatico();

        legajos.InicializarConjunto();

        int legajo = 12345;

        legajos.Agregar(legajo);
        legajos.Agregar(legajo);

        System.out.println("¿El alumno pertenece al conjunto?: " + legajos.Pertenece(legajo));
        System.out.println("Si el alumno se anota a dos carreras, el legajo sigue siendo único.");
    }
}
