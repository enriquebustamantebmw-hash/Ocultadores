package Interface;

public interface DiccionarioMultipleTDA {
    void InicializarDiccionario();
    void Agregar(int clave, String valor);
    void Eliminar(int clave);
    void EliminarValor(int clave, String valor);
    String[] Recuperar(int clave);
    int[] Claves();
}
