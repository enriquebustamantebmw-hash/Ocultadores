public class Main {

    public static void main(String[] args) {

        Pila pila = new PilaArreglo();

        pila.InicializarPila();

        System.out.println("¿La pila esta vacia? " + pila.PilaVacia());

        pila.Apilar(10);
        pila.Apilar(20);
        pila.Apilar(30);

        System.out.println("Tope: " + pila.Tope());

        System.out.println("Desapilar: " + pila.Desapilar());

        System.out.println("Tope: " + pila.Tope());

        System.out.println("Desapilar: " + pila.Desapilar());

        System.out.println("Desapilar: " + pila.Desapilar());

        System.out.println("¿La pila esta vacia? " + pila.PilaVacia());
    }
}