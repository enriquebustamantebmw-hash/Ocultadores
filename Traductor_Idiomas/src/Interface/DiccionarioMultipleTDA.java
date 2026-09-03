package Interface;

public interface DiccionarioMultipleTDA {
    void InicializarDiccionario();
    void Agregar(String clave, String valor);
    void Eliminar(String clave);
    void EliminarValor(String clave, String valor);
    String[] Recuperar(String clave);
    String[] Claves();
}
