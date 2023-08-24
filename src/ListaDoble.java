public class ListaDoble {
    private Cancion cabeza;
    private Cancion cola;
    private String nombreDeLista;
    public ListaDoble(String nombreDeLista){
        System.out.println("Se ha creado una lista de reproducción de MP3!");
        this.setNombreDeLista(nombreDeLista);
        System.out.println("Nombre de lista: " + nombreDeLista);
    }


    /* Getters y Setters*/

    public Cancion getCabeza() {
        return cabeza;
    }

    public void setCabeza(Cancion cabeza) {
        this.cabeza = cabeza;
    }

    public Cancion getCola() {
        return cola;
    }

    public void setCola(Cancion cola) {
        this.cola = cola;
    }

    public String getNombreDeLista() {
        return nombreDeLista;
    }

    public void setNombreDeLista(String nombreDeLista) {
        this.nombreDeLista = nombreDeLista;
    }
}
