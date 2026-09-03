package Implementacion;

import Interface.DiccionarioMultipleTDA;

public class DiccionarioMultipleEstatico implements DiccionarioMultipleTDA {

    private static final int MAX = 100;

    private static class Elemento {
        String clave;
        String[] valores;
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

    private int Valor2Indice(Elemento elemento, String valor) {
        int i = 0;

        while (i < elemento.cantidadValores && !elemento.valores[i].equals(valor)) {
            i++;
        }

        if (i < elemento.cantidadValores) {
            return i;
        }

        return -1;
    }

    @Override
    public void Agregar(String clave, String valor) {
        int posClave = Clave2Indice(clave);

        if (posClave == -1 && cantidadClaves < MAX) {
            posClave = cantidadClaves;
            elementos[posClave] = new Elemento();
            elementos[posClave].clave = clave;
            elementos[posClave].valores = new String[MAX];
            elementos[posClave].cantidadValores = 0;
            cantidadClaves++;
        }

        if (posClave != -1) {
            Elemento elemento = elementos[posClave];
            int posValor = Valor2Indice(elemento, valor);

            if (posValor == -1 && elemento.cantidadValores < MAX) {
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
    public void EliminarValor(String clave, String valor) {
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
    public String[] Recuperar(String clave) {
        int posClave = Clave2Indice(clave);

        if (posClave == -1) {
            return new String[0];
        }

        Elemento elemento = elementos[posClave];
        String[] aux = new String[elemento.cantidadValores];

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
