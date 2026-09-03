import Implementacion.DiccionarioSimpleEstatico;
import Interface.DiccionarioSimpleTDA;

public class Main {
    public static void main(String[] args) {
        DiccionarioSimpleTDA puntajes = new DiccionarioSimpleEstatico();

        puntajes.InicializarDiccionario();

        puntajes.Agregar("Player1", 1500);
        puntajes.Agregar("Player2", 2200);
        puntajes.Agregar("Player3", 1800);

        System.out.println("PUNTAJES DEL TORNEO");
        String[] usuarios = puntajes.Claves();

        for (int i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i] + " -> " + puntajes.Recuperar(usuarios[i]));
        }
    }
}
