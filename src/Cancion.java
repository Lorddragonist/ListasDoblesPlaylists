public class Cancion {
    private Cancion anterior;
    private Cancion siguiente;
    private String contenido;

    /* Método constructor */
    public Cancion(String contenido){
        System.out.println("\nHas encontrado una nueva canción!");
        System.out.println("Reproduciendo: " + contenido);
        this.setContenido(contenido);
        this.menuCancion();
    }

    /* Getters y Setters*/

    public Cancion getAnterior() {
        return anterior;
    }

    public void setAnterior(Cancion anterior) {
        this.anterior = anterior;
    }

    public Cancion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cancion siguiente) {
        this.siguiente = siguiente;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /* Menú de canción */

    public void menuCancion(){
        System.out.println("""
                ¿Quieres agregar esta canción a alguna de tus listas?
                1- Sí.
                2- No.
                """);
    }

}
