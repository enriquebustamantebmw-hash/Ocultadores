public class PilaArreglo implements Pila {

    private int[] datos;
    private int tope;

    public PilaArreglo() {
        datos = new int[10];
        tope = 0;
    }

    @Override
    public void InicializarPila() {
        tope = 0;
    }

    @Override
    public void Apilar(int dato) {
        if (tope < datos.length) {
            datos[tope] = dato;
            tope++;
        }
    }

    @Override
    public int Desapilar() {
        if (!PilaVacia()) {
            tope--;
            return datos[tope];
        }

        return -1;
    }

    @Override
    public int Tope() {
        if (!PilaVacia()) {
            return datos[tope - 1];
        }

        return -1;
    }

    @Override
    public boolean PilaVacia() {
        return tope == 0;
    }
}