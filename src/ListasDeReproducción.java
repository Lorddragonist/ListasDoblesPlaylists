public class ListasDeReproducción {
    private ListaDoble cabeza;
    private ListaDoble cola;

    private static int cantidad = 0;

    public ListasDeReproducción(){

    }
    public static void setCantidad() {
        ListasDeReproducción.cantidad = ListasDeReproducción.cantidad + 1;
    }
}
