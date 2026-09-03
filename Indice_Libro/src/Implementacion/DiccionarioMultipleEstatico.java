package Implementacion;

import Interface.DiccionarioMultipleTDA;

public class DiccionarioMultipleEstatico implements DiccionarioMultipleTDA {

    private static final int MAX = 100;

    private static class Elemento {
        String clave;
        int[] valores;
        int cantidadValores;
    }

    private Elemento[] elementos;
    private int cantidadClaves;

    @Override
    public void InicializarDiccionario() {
        elementos = new Elemento[MAX];
        cantidadClaves = 0;
    }

    private int Clave2Indice(String clave) {
        int i = 0;

        while (i < cantidadClaves && !elementos[i].clave.equals(clave)) {
            i++;
        }

        if (i < cantidadClaves) {
            return i;
        }

        return -1;
    }

    private int Valor2Indice(Elemento elemento, int valor) {
        int i = 0;

        while (i < elemento.cantidadValores && elemento.valores[i] != valor) {
            i++;
        }

        if (i < elemento.cantidadValores) {
            return i;
        }

        return -1;
    }

    @Override
    public void Agregar(String clave, int valor) {
        int posClave = Clave2Indice(clave);

        if (posClave == -1 && cantidadClaves < MAX) {
            posClave = cantidadClaves;
            elementos[posClave] = new Elemento();
            elementos[posClave].clave = clave;
            elementos[posClave].valores = new int[MAX];
            elementos[posClave].cantidadValores = 0;
            cantidadClaves++;
        }

        if (posClave != -1) {
            Elemento elemento = elementos[posClave];

            if (Valor2Indice(elemento, valor) == -1 && elemento.cantidadValores < MAX) {
                elemento.valores[elemento.cantidadValores] = valor;
                elemento.cantidadValores++;
            }
        }
    }

    @Override
    public void Eliminar(String clave) {
        int posClave = Clave2Indice(clave);

        if (posClave != -1) {
            elementos[posClave] = elementos[cantidadClaves - 1];
            cantidadClaves--;
        }
    }

    @Override
    public void EliminarValor(String clave, int valor) {
        int posClave = Clave2Indice(clave);

        if (posClave != -1) {
            Elemento elemento = elementos[posClave];
            int posValor = Valor2Indice(elemento, valor);

            if (posValor != -1) {
                elemento.valores[posValor] = elemento.valores[elemento.cantidadValores - 1];
                elemento.cantidadValores--;

                if (elemento.cantidadValores == 0) {
                    Eliminar(clave);
                }
            }
        }
    }

    @Override
    public int[] Recuperar(String clave) {
        int posClave = Clave2Indice(clave);

        if (posClave == -1) {
            return new int[0];
        }

        Elemento elemento = elementos[posClave];
        int[] aux = new int[elemento.cantidadValores];

        for (int i = 0; i < elemento.cantidadValores; i++) {
            aux[i] = elemento.valores[i];
        }

        return aux;
    }

    @Override
    public String[] Claves() {
        String[] aux = new String[cantidadClaves];

        for (int i = 0; i < cantidadClaves; i++) {
            aux[i] = elementos[i].clave;
        }

        return aux;
    }
}
