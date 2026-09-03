import Implementacion.DiccionarioMultipleEstatico;
import Interface.DiccionarioMultipleTDA;

public class Main {
    public static void main(String[] args) {
        DiccionarioMultipleTDA inscripciones = new DiccionarioMultipleEstatico();

        inscripciones.InicializarDiccionario();

        inscripciones.Agregar(12345, "Programacion II");
        inscripciones.Agregar(12345, "Base de Datos");
        inscripciones.Agregar(12345, "POO");

        System.out.println("INSCRIPCIONES DEL ALUMNO");
        String[] materias = inscripciones.Recuperar(12345);

        System.out.print("Legajo 12345 -> ");
        for (int i = 0; i < materias.length; i++) {
            System.out.print(materias[i]);

            if (i < materias.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
