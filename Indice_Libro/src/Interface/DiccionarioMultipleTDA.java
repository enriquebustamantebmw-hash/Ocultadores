package Interface;

public interface DiccionarioMultipleTDA {
    void InicializarDiccionario();
    void Agregar(String clave, int valor);
    void Eliminar(String clave);
    void EliminarValor(String clave, int valor);
    int[] Recuperar(String clave);
    String[] Claves();
}
