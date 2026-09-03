import Implementacion.DiccionarioSimpleEstatico;
import Interface.DiccionarioSimpleTDA;

public class Main {
    public static void main(String[] args) {
        DiccionarioSimpleTDA dns = new DiccionarioSimpleEstatico();

        dns.InicializarDiccionario();

        dns.Agregar("google.com", "142.250.190.46");

        System.out.println("DNS");
        System.out.println("google.com -> " + dns.Recuperar("google.com"));
    }
}
